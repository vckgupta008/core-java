package com.SEARCH;

import java.util.*;
class Source1 {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int start = 0;
        int count=0;
        int end = inputArr.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key > inputArr[mid]) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[] ) throws Exception {
        Source1 bs = new Source1();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}

