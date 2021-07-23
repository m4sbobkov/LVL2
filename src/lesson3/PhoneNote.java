package lesson3;

import java.util.*;

public class PhoneNote {

    HashMap<String, String> phoneNumbers = new HashMap<>();

//    public void directory(){
//        phoneNumbers.put("Ivanov", "9998007654");
//        phoneNumbers.put("Petrov", "9948037624");
//        phoneNumbers.put("Sidorov", "9128447634");
//        phoneNumbers.put("Potter", "9178047345");
//        phoneNumbers.put("Ivanov", "9947537212");
//        phoneNumbers.put("Sidorov", "1238457633");
//    }

    public void addNote (String name, String number){
        phoneNumbers.put(name, number);

    }

    public void getNumber (String name){
//
//        for (Map.Entry value: phoneNumbers.entrySet())
//        {if (phoneNumbers.get(name).equals(value)){
            System.out.println(phoneNumbers.get(name));
        }

        }




