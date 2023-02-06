package org.mikheeffff;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {}

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправляется сообщение на номера: " + Arrays.toString(numbers));
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}


//public static void phone(String[] args) {
//    Phone phone1 = new Phone("123", "Nothing Phone 1", 123);
//    Phone phone2 = new Phone("456", "iPhone 12");
//    Phone phone3 = new Phone();
//
//    System.out.println("[PHONE 1] Number: " + phone1.getNumber() + ", model: " + phone1.getModel() + ", weight: " + phone1.getWeight());
//    System.out.println("[PHONE 2] Number: " + phone2.getNumber() + ", model: " + phone2.getModel() + ", weight: " + phone2.getWeight());
//    System.out.println("[PHONE 3] Number: " + phone3.getNumber() + ", model: " + phone3.getModel() + ", weight: " + phone3.getWeight());
//
//    phone1.receiveCall("Denis");
//    phone2.receiveCall("Alexander", "88005553535");
//    phone3.sendMessage("333", "666", "999");
//}
