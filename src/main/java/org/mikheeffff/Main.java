package org.mikheeffff;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Phone ======================");
        Phone phone1 = new Phone("123", "Nothing Phone 1", 123);
        Phone phone2 = new Phone("456", "iPhone 12");
        Phone phone3 = new Phone();

        System.out.println("[PHONE 1] Number: " + phone1.getNumber() + ", model: " + phone1.getModel() + ", weight: " + phone1.getWeight());
        System.out.println("[PHONE 2] Number: " + phone2.getNumber() + ", model: " + phone2.getModel() + ", weight: " + phone2.getWeight());
        System.out.println("[PHONE 3] Number: " + phone3.getNumber() + ", model: " + phone3.getModel() + ", weight: " + phone3.getWeight());

        phone1.receiveCall("Denis");
        phone2.receiveCall("Alexander", "88005553535");
        phone3.sendMessage("333", "666", "999");

        System.out.println("2. Person ======================");
        Person person1 = new Person();
        Person person2 = new Person("Nikita Mikheev", 18);

        System.out.println("[PERSON 1] Full name: " + person1.getFullName() + ", age: " + person1.getAge());
        System.out.println("[PERSON 2] Full name: " + person2.getFullName() + ", age: " + person2.getAge());

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}