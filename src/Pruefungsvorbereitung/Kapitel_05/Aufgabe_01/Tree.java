package Pruefungsvorbereitung.Kapitel_05.Aufgabe_01;

public class Tree {
    class Node {
        private int key;
        private int data;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = this.data = key;
        }
    }

    private Node root = null;

    public boolean insert(int nr) {
        if (this.root == null) {
            this.root = new Node(nr);
            return true;
        } else {
            return this.insert(this.root, nr);
        }
    }

    private boolean insert(Node node, int nr) {
        if (node.key == nr) {
            return false;
        } else if (node.key > nr) {
            if (node.left == null) {
                node.left = new Node(nr);
            } else {
                return this.insert(node.left, nr);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(nr);
            } else {
                return this.insert(node.right, nr);
            }
        }

        return true;
    }

    public int member(int nr) {
        if (this.root == null) {
            return -1;
        } else {
            return this.member(this.root, nr);
        }
    }

    private int member(Node node, int nr) {
        if (node.key == nr) {
            return node.data;
        } else if (node.key > nr && node.left != null) {
            return this.member(node.left, nr);
        } else if (node.key < nr && node.right != null) {
            return this.member(node.right, nr);
        } else {
            return -1;
        }
    }

    public void print() {
        if (this.root == null) {
            System.out.println("Tree ist leer!");
        } else {
            this.print(this.root);
        }
    }

    private void print(Node node) {
        if (node.left != null) {
            this.print(node.left);
        }

        System.out.printf("%d - ", node.data);

        if (node.right != null) {
            this.print(node.right);
        }
    }

    public boolean delete(int nr) {
        if (this.root == null) {
            return false;
        } else if (this.root.key == nr) {
            this.root = this.deleteNode(this.root);
            return true;
        } else {
            return this.delete(this.root, nr);
        }
    }

    private boolean delete(Node node, int nr) {
        if (node.key > nr) {
            if (node.left != null) {
                if (node.left.key == nr) {
                    node.left = this.deleteNode(node.left);
                    return true;
                } else {
                    return delete(node.left, nr);
                }
            } else {
                return false;
            }
        } else {
            if (node.right != null) {
                if (node.right.key == nr) {
                    node.right = this.deleteNode(node.right);
                    return true;
                } else {
                    return delete(node.right, nr);
                }
            } else {
                return false;
            }
        }
    }

    private Node deleteNode(Node node) {
        if (node.left == null && node.right == null) {
            return null;
        } else if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        } else {
            Node parent = node;
            Node child = parent.right;

            while (child.left != null) {
                parent = child;
                child = child.left;
            }

            node.key = child.key;
            node.data = child.data;

            if (node != parent) {
                parent.left = child.right;
            } else {
                parent.right = child.right;
            }
        }

        return node;
    }
}
