package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Contacts2 {
    public static List<Integer> process(List<List<String>> operations) {
        List<Integer> result = new ArrayList<>();
        Map<String,Integer> contacts = new HashMap<>();

        operations.forEach(op ->{
            String action = op.get(0);
            String name = op.get(1);
            switch (action){
                case "add": add(contacts,name);break;
                case "find": result.add(find(contacts,name));break;
            }
        });


        return result;
    }

    private static Integer find(Map<String, Integer> contacts, String name) {
        Integer result = contacts.get(name);
        return result == null ? 0 : result;
    }

    private static void add(Map<String, Integer> contacts, String name) {
        while(name.length() > 0){
            Integer count = contacts.get(name);
            if(count == null) contacts.put(name,1);
            else contacts.put(name,count + 1);
            name = name.substring(0,name.length() - 1);
        }
    }
}
