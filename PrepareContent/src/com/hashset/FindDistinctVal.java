package com.hashset;
import java.util.*;

public class FindDistinctVal {
    public static void printValues(Map<Integer,String> map){
        //Write your code here
       HashSet<String> string = new HashSet<>();
        Iterator hmIterator = map.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry place = (Map.Entry) hmIterator.next();
//            Integer num = (Integer) place.getKey();
            String str = (String) place.getValue();
            string.add(str);
        }

        Iterator<String> it = string.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
