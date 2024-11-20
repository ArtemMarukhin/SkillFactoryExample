package payer;

public class Payer {
    public static void main(String[] args) {
        Payer payer = new Payer("surname", "name", "address", "cardNumber");
        System.out.println(payer.toString());
    }

    String surname;
    String name;
    String address;
    String cardNumber;

    public Payer(String surName, String name, String address, String cardNumber) {
        this.surname = surName;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "{Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber + "}";
    }
}
