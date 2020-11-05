package com.Hashtables;

//class Source {
//    public static void main(String[] args)
//    {
//        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};
//
//        String NewEmail="monica.geller@xyz.com";
//        int index=-1;
//        for(int i=0;i<emails.length;i++){
//        if(emails[i]==NewEmail){
//            index=i;
//        }
//    }
//        System.out.print(index);
//        // Write your code here
//    }
//}

import java.awt.*;
import java.util.*;

class Source {
    public static void main(String[] args)
    {
        Hashtable<String,Integer> emails= new Hashtable<String,Integer>();
        emails.put("chandler.bing@xyz.com",1);
        emails.put("ross.geller@xyz.com",2);
        emails.put("rachel.greene@xyz.com",3);
        emails.put("joey.tribbiani@xyz.com",4);
        emails.put("monica.geller@xyz.com",5);
        emails.put("phoebe.buffay@xyz.com",6);
        emails.put("sheldon.copper@xyz.com",7);
        emails.put("marie.george@xyz.com",8);

        String NewEmail = "monica.geller@xyz.com";

        if(emails.containsKey(NewEmail))
        {
            System.out.print(emails.get(NewEmail));
            //Complete here
        }
        else System.out.println("False");
        System.out.println(emails.entrySet());
        System.out.print(emails.keySet());
    }
}
