package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

   // public PhoneBook(Map<String, ArrayList<String>> map) {
    //    this.phonebook = null;
   // }

   public PhoneBook() {
       // this(null);
    }


    public void add(String name, String phoneNumber) {
        ArrayList<String> phoneNumber1 = new ArrayList<>();
        phoneNumber1.add(phoneNumber);
        //System.out.println(2);
        phonebook.put(name, phoneNumber1);
        //System.out.println(1);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phonebook=" + phonebook +
                '}';
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> phoneNumber1 = new ArrayList<>();
        String results = Arrays.toString(phoneNumbers);
       // phoneNumber1.add(phoneNumbers);
        phoneNumber1.add(results);
        phonebook.put(name,phoneNumber1);
    }

    public void remove(String name) {
       phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
       boolean answer = true;
       for (String x : phonebook.keySet()){
           if (x.matches(name)){
               answer = true;
           }
           else {answer = false; }
       }

        return answer;
    }

    public List<String> lookup(String name) {
       ArrayList<String> result = new ArrayList<>();
       for (String x : phonebook.keySet()){
           if (x.matches(name)){
            //  String result = String.valueOf(phonebook.values());
              //String result =
                     result = phonebook.get(x);
               //System.out.println(phonebook.get(x));
           }
       }
        return result;
    }

    public String reverseLookup(String phoneNumber)  {
        String result = "";
        for (Map.Entry<String, ArrayList<String>> entry : phonebook.entrySet()) {
            // System.out.println(String.valueOf(phonebook.get(y)).toString());
            if (entry.getValue().contains(phoneNumber) ) {
                // System.out.println(String.valueOf(phonebook.get(y)));
                // if (phonebook.containsValue(phoneNumber)){
                //for (ArrayList<String> x : phonebook.values()) {
                //    if (x.contains(phoneNumber)) {
                        //x.indexOf(x);
                        //  String result = String.valueOf(phonebook.values());
                        //String result =
                        result = entry.getKey();
                        break;
                        //System.out.println(phonebook.get(x));
                    }
                }


        return result;
    }

    public List<String> getAllContactNames() {
       ArrayList<String> result = new ArrayList<>();
       for (String contacts: phonebook.keySet()) {
             //result = phonebook.get(contacts);
             result.add(contacts);
           //Arrays.asList(phonebook.keySet());

       }
        return result;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
