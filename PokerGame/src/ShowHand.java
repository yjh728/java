import java.util.*;

public class ShowHand {
    private final int PLAY_MAX = 5;
    private final String[] types = {"梅花", "黑桃", "红桃", "方片"};
    private final String[] values = {"2", "3", "4", "5", "6", "7", "8", "9",
            "10", "J", "Q", "K", "A"};
    private String[] players = new String[PLAY_MAX];
    private List<String> cards = new LinkedList<String>();
    private List<String>[] playerCards = new List[PLAY_MAX];

    public void initCards() {
        for (int i = 0; i < types.length; i++)
            for (int j = 0; j < values.length; j++)
                cards.add(types[i] + values[j]);
        cards.add("大王");
        cards.add("小王");
        Collections.shuffle(cards);
    }

    public void initPlayers(String... names) {
        if (names.length > 5 || names.length < 2) {
            System.out.println("玩家数量错误!");
            return;
        }
        for (int i = 0; i < names.length; i++)
            players[i] = names[i];
    }

    public void initPlayerCards() {
        for (int i = 0; i < players.length; i++)
            if (players[i] != null && !players[i].equals(""))
                playerCards[i] = new LinkedList<String>();
    }

    public void showAllCards() {
        for (String s : cards)
            System.out.println(s);
    }

    public void deliverCard(String first) {
        int firstPos = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i] == first) {
                firstPos = i;
                break;
            }
        }
        int x = 0;
        int t = cards.size();
        while (x < t) {
            for (int i = firstPos; i < players.length && x < t; i++) {
                if (players[i] != null) {
                    playerCards[i].add(cards.get(x));
                    //cards.remove(x);
                    x++;
                }
            }
            for (int i = 0; i < firstPos && x < t; i++) {
                if (players[i] != null) {
                    playerCards[i].add(cards.get(x));
                    //cards.remove(x);
                    x++;
                }
            }
        }
    }

    public void showPlayerCard() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.println(players[i] + ":");
                for (String s : playerCards[i]) {
                    System.out.print(s + "    ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        ShowHand sh = new ShowHand();
        sh.initPlayers("yjh", "zs", "lpd");
        sh.initCards();
        sh.initPlayerCards();
        sh.deliverCard("yjh");
        sh.showPlayerCard();
    }
}
