package com.binaryTree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node insertNode(int[] elementsArr, Node node, int i) {
        if(i < elementsArr.length){
            node = new Node(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to find the height of a binary tree
    public int findHeight(Node node) {
        // Write your code here
        if(node==null){
            return 0;
        }
        else{

                int left =findHeight(node.left);
                int right =findHeight(node.right);
                System.out.println("left "+left);
                System.out.println("right "+right);
                if (left > right)
                    return (left + 1);
                else
                    return (right + 1);
        }
    }
    void levelOrderOrBFS(Node root) {
        int h = findHeight(root);
        for (int i = 1; i <= h; i++)
            printNodesAtLevel(root, i, 1);
    }

    // Method to print nodes at the given level
    void printNodesAtLevel (Node root, int level, int currentLevel) {
        if (root == null)
            return;
        if (level == currentLevel)
            System.out.print(root.data + " ");
        else {
            printNodesAtLevel(root.left, level, currentLevel + 1);
            printNodesAtLevel(root.right, level, currentLevel + 1);
        }
    }
}



// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class findHeight {
    public static void main(String[] x) {
        Tree tree = new Tree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            System.out.println(tree.findHeight(tree.root));
            tree.levelOrderOrBFS(tree.root);
        }
    }
}
