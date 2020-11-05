import java.util.*;

public class SolutionA {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int array[] = new int[size + 1]; // In one index array, to include the number of elements mentioned in size, A[size+1] is created
            for (int i = 1; i <= size; i++) {
                array[i] = scanner.nextInt();
            }
            binarySearch(array);
        } catch (Exception e) {
            System.out.println("Error in code" + e);
        }
    }

    public static void binarySearch(int inputArr[]) {
        try {
            int start = 1;
            int end = inputArr.length - 1;
            int firstOccurence = -1; // storing the number as -1 by default
            while (start <= end) {
                int mid = (start + end) / 2;
                if (mid == inputArr[mid]) {
                    firstOccurence = inputArr[mid]; // storing the first number where A[number]=number
                }
                if (mid < inputArr[mid] || mid == inputArr[mid]) {
                    end = mid - 1; // continue to check for other number in the left side of array from start - mid-1
                } else {
                    start = mid + 1; // continue to check in right side of array when there is no number A[number]=number found
                }
            }
            if (firstOccurence == -1) {
                System.out.print("NOT_FOUND"); // print if no occurence of A[number]=number found
            } else {
                System.out.println(firstOccurence); // print the latest occurence of  A[number]=numbe
            }
        } catch (Exception e) {
            System.out.print("Error in code " + e);
        }
    }
}
