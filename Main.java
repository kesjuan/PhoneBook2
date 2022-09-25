package com.zipcodewilmington.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phone = new PhoneBook();
        phone.add("Jared", "12344585");
        phone.add("gope","1234567");
        System.out.println(phone.toString());
        phone.addAll("Jerry", "434545545", "554545445", "466464646");
       // phone.remove("Jerry");
        System.out.println(phone.lookup("Jerry"));

        System.out.println(phone.hasEntry("Jerry"));
        System.out.println(phone.reverseLookup("12344585"));
        System.out.println(phone.reverseLookup("1234567"));
        System.out.println(phone.getAllContactNames());
        System.out.println(phone.toString());

    }

}
