package com.binaryTree;

public class BST {
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);

        return node;
    }
//boolean search(Node node, int key) {
//    if (node == null)
//        return false;
//
//    if (key == node.data)
//        return true;
//
//    if (key < node.data)
//        return search(node.left, key);
//    else
//        return search(node.right, key);
//}
}
