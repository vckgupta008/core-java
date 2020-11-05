package com.hashset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class FindItinaryTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<String, String>();
        Map<String, String> revTickets = new HashMap<String, String>();
        // Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            String start = in.next();
            String destination = in.next();
            tickets.put(start, destination);
            revTickets.put(destination, start);
            in.nextLine();
        }
        String temp = "";
        System.out.println(tickets);
        System.out.println(revTickets);
        Iterator hmIterator = tickets.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry place = (Map.Entry) hmIterator.next();
            String place1 = (String) place.getKey();
            if (!revTickets.containsKey(place1)) {
                temp = place1;
            }
        }
        while(temp!=null){
            System.out.print(temp+" ");
            temp=tickets.get(temp);
        }
    }
}
