import java.util.Scanner;

public class SolutionB {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int key = scanner.nextInt();
            int array[] = new int[size + 1]; // In one index array, to include the number of elements mentioned in size, A[size+1] is created
            for (int i = 1; i <= size; i++) {
                array[i] = scanner.nextInt();
            }
            if (checkValue(array, key) == -1) {
                System.out.println("NOT_FOUND");
            } else {
                System.out.print(checkValue(array, key));
            }
        } catch (Exception e) {
            System.out.println("Error in code" + e);
        }
    }

    public static int checkValue(int[] array, int search) {
        return checkValue(array, search, 1, 2); // giving upper and lower bound as 1 and 2 by default
    }

    public static int checkValue(int[] array, int searchVal, int start, int end) {
        int mid = (start + end) / 2;
        try {
            if (end <= start) // if end <= start then it is assumed that all the elements are searched and no value is found
                return -1;
            else if (array[mid] == searchVal) // if search value matches with array value then return index
                return mid;
            else if (array[mid] > searchVal) // In sorted array if mid value > search value then value should be present in start - mid array
                return checkValue(array, searchVal, start, mid);
            else
                return checkValue(array, searchVal, mid + 1, end * 2); // increasing the upper bound by end*2.
        } catch (ArrayIndexOutOfBoundsException e) {
            return checkValue(array, searchVal, start, mid); // after end*2 if A[mid] throws ArrayIndexOutOfBoundsException then run loop for start - mid again
        }
    }
}
