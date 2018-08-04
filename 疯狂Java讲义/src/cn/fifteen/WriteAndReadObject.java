package cn.fifteen;

import java.io.*;

public class WriteAndReadObject {

    public static void main(String[] args){
        try (
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                     new FileOutputStream("object.txt"));
             ObjectInputStream objectInputStream = new ObjectInputStream(
                     new FileInputStream("object.txt"))
        ) {
            Student student = new Student("杨佳豪", 19);
            objectOutputStream.writeObject(student);
            System.out.println(objectInputStream.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Serializable{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}