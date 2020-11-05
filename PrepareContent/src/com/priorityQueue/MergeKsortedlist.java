import java.util.*;

//class representing Structure of node in the linked list
class Node {
    int data;
    Node next;
};

class Mergeksorted {

    //creates a new node with the given 'data' and returns that node
    Node newNode(int data) {

        Node newNode = new Node();

        newNode.data = data;
        newNode.next = null;

        return newNode;
    }

    // Driver program to test above
    public static void main(String args[]) {

        //array list whose each element is the head of each linked list
        ArrayList<Node> arr = new ArrayList<>();
        Mergeksorted obj = new Mergeksorted();

        Scanner in = new Scanner(System.in);

        // Number of linked lists
        int k = in.nextInt();

        // Number of elements in each linked list
        int n = in.nextInt();

        Node tmp = null;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {

                //head node of the linked list
                if (j == 0) {
                    int dt = in.nextInt();
                    arr.add(obj.newNode(dt));
                } else {
                    int dt = in.nextInt();
                    tmp = arr.get(i);
                    for (int m = 1; m < j; m++) {
                        tmp = tmp.next;
                    }
                    tmp.next = obj.newNode(dt);
                }
            }
        }

        System.out.println(arr.size());
        //write your code here
        Node merged = null;
        merged = arr.get(0);
        while(merged.next!=null){
            System.out.print(merged.data+" ");
            merged=merged.next;
        }

    }
}

