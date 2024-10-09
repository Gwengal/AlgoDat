package Pruefungsvorbereitung.Kapitel_05.Aufgabe_02;

public class AVLTree {
    class Node {
        private int key;
        private char data;
        private Node left;
        private Node right;
        private int balance;

        public Node(int nr, char data) {
            this.key = nr;
            this.data = data;
            this.left = null;
            this.right = null;
            this.balance = 0;
        }
    }

    private Node root = null;
    private boolean rebalance = false;

    public void insert(int nr, char cr) {
        if (this.root == null) {
            this.root = new Node(nr, cr);
        } else {
            this.root = this.insert(this.root, nr, cr);
        }
    }

    private Node insert(Node node, int nr, char cr) {
        Node tmp;

        if (nr == node.key) {
            rebalance = false;
            return node;
        } else if (nr < node.key) {
            if (node.left == null) {
                node.left = new Node(nr, cr);
                this.rebalance = (--node.balance == -1);
                return node;
            } else {
                node.left = insert(node.left, nr, cr);
                if (this.rebalance) {
                    switch (node.balance) {
                        case -1:
                            if (node.left.balance == -1) {
                                System.out.println("Rechtsrotation bei " + node.key);
                                tmp = this.rotateRight(node);
                                tmp.right.balance = 0;
                            } else {
                                System.out.println("Links-Rechts-Rotation bei " + node.key);
                                int bal = node.left.right.balance;
                                node.left = rotateLeft(node.left);
                                tmp = rotateRight(node);
                                tmp.left.balance = (bal == 1 ? -1 : 0);
                                tmp.right.balance = (bal == -1 ? 1 : 0);
                            }
                            tmp.balance = 0;
                            rebalance = false;
                            return tmp;

                        case 0:
                            node.balance = -1;
                            rebalance = true;
                            return node;

                        case 1:
                            node.balance = 0;
                            rebalance = false;
                            return node;
                    }
                }
                return node;
            }
        } else {
            if (node.right == null) {
                node.right = new Node(nr, cr);
                this.rebalance = (++node.balance == 1);
                return node;
            } else {
                node.right = insert(node.right, nr, cr);
                if (this.rebalance) {
                    switch (node.balance) {
                        case 1:
                            if (node.right.balance == 1) {
                                System.out.println("Linksrotation bei " + node.key);
                                tmp = this.rotateLeft(node);
                                tmp.left.balance = 0;
                            } else {
                                System.out.println("Rechts-Links-Rotation bei " + node.key);
                                int bal = node.right.left.balance;
                                node.right = rotateRight(node.right);
                                tmp = rotateLeft(node);
                                tmp.left.balance = (bal == -1 ? 1 : 0);
                                tmp.right.balance = (bal == 1 ? -1 : 0);
                            }
                            tmp.balance = 0;
                            rebalance = false;
                            return tmp;

                        case 0:
                            node.balance = 1;
                            rebalance = true;
                            return node;

                        case -1:
                            node.balance = 0;
                            rebalance = false;
                            return node;
                    }
                }
                return node;
            }
        }
    }

    private Node rotateRight(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;
        return temp;
    }

    private Node rotateLeft(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;
        return temp;
    }
}
