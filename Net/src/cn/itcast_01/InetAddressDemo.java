package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //用主机名获得IP地址对象
        InetAddress inetAddress = InetAddress.getByName("yjh");
        //获得该对象的主机名
        String name = inetAddress.getHostName();
        //获得该对象的ip
        String ip = inetAddress.getHostAddress();
        System.out.println(name + "---" + ip);
    }
}
