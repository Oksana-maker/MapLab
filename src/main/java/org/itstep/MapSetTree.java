package org.itstep;

import javax.swing.text.html.parser.Entity;
import java.nio.channels.Channel;
import java.util.*;

public class MapSetTree {

    public static void main(String[] args) {
        Map<String,TreeSet <String>> networkMap = new HashMap<>();
       int sw;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name Program: ");
            String program = scanner.next();
            System.out.println("Enter name Channel: ");
            String channel = scanner.next();
            boolean creat = false;
            TreeSet<String> treeSet = new TreeSet<>();
            if (!networkMap.containsKey(channel)) {
                    treeSet.add(program);
                    networkMap.put(channel,treeSet);
                    System.out.println("Add new channel and program");
            }else {
                boolean b = networkMap.get(channel).add(program);
                if(b){
                    System.out.println("Add new program");
                }else {
                    System.out.println("The data is consistent with what is already available");
                }
            }
            System.out.println("[1] - Add new channel, program");
            System.out.println("[0] - Exit");
            sw = scanner.nextInt();
        }while (sw!=0);

        for (Map.Entry<String, TreeSet<String>>entry : networkMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}