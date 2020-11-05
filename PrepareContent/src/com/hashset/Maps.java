package com.hashset;

import java.util.HashMap;
import java.util.Map;
class Maps {
    public static void main(String args[]) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            System.out.println((arr[i]*arr[i]*arr[i])%10);
        }
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("A", new Integer(1));
//        hashMap.put("B", new Integer(2));
//        hashMap.put("C", new Integer(3));
//        hashMap.put("A", new Integer(2));
//        hashMap.put("C", new Integer(2));
//        System.out.println(hashMap.entrySet());
    }
}
