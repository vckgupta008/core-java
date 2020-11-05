package com.binaryTree;
//
//class Node {
//    int data;
//    Node left, right;
//
//    Node(int val) {
//        data = val;
//        left = right = null;
//    }
//}
//
//class Tree {
//    Node root;
//
//    Tree() {
//        root = null;
//    }
//
//    void preOrderDfs(Node node){
//        if(node==null){
//            return;
//        }
//        System.out.print(node.data+" ");
//        preOrderDfs(node.left);
//        preOrderDfs(node.right);
//    }
//
//    void inOrderDfs(Node node){
//        if(node==null){
//            return;
//        }
//        inOrderDfs(node.left);
//        System.out.print(node.data+" ");
//        inOrderDfs(node.right);
//
//    }
//    void postOrderDfs(Node node){
//        if(node==null){
//            return;
//        }
//        postOrderDfs(node.left);
//        postOrderDfs(node.right);
//        System.out.print(node.data+" ");
//    }
//}

public class BinaryTree {
    public static void main(String args[]) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.print("\n preorder");
//        tree.preOrderDfs(tree.root);
//        System.out.print("\n inorder");
//        tree.inOrderDfs(tree.root);
//        System.out.print("\n postorder");
//        tree.postOrderDfs(tree.root);
//        System.out.println(tree.preOrderDfs());

    }
}
