package com.company;

/**
 * BFS
 *  1
 * / \
 * 2   3
 * / \
 * 4  5
 */

class Node {

    int  val;
    Node left;
    Node right;

    public Node(int val, Node left, Node right) {

        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Tree {

    public Node root;

    public Node getRoot() {

        return root;
    }

    public void setRoot(Node root) {

        this.root = root;
    }

    // 4,2,5,1,3
    public void inOrder(Node node) {

        if (node != null) {
            inOrder(node.left);
            System.out.print(node.val);
            inOrder(node.right);
        }
    }

    // 1,2,4,5,3
    public void preOrder(Node node) {

        if (node != null) {
            System.out.print(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // 4,5,2,3,1
    public void postOrder(Node node) {

        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.val);
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        Node node5 = new Node(5, null, null);
        Node node4 = new Node(4, null, null);
        Node node3 = new Node(3, null, null);
        Node node2 = new Node(2, node4, node5);
        Node node1 = new Node(1, node2, node3);

        tree.setRoot(node1);

        tree.inOrder(tree.root); //42513
        System.out.println("");
        tree.preOrder(tree.root); //12453
        System.out.println("");
        tree.postOrder(tree.root); //45231
    }
}
