package br.com.guifr.hackerrank.preparationkit.threemonth.weekthirteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Contacts {
    public static List<Integer> process(List<List<String>> operations) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,List<String>> contacts = new HashMap<>();

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

    private static Integer find(Map<Integer, List<String>> contacts, String name) {
        AtomicInteger result = new AtomicInteger();
        contacts.entrySet().forEach(e ->{
            if (name.length() <= e.getKey()){
                e.getValue().forEach(c ->{
                    if(c.startsWith(name)) result.getAndIncrement();
                });
            }
        });
        return result.get();
    }

    private static void add(Map<Integer, List<String>> contacts, String name) {
        if(!contacts.containsKey(name.length())) contacts.put(name.length(),new ArrayList<>());
        contacts.get(name.length()).add(name);
    }
}
