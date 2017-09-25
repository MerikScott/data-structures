package Tree;

import java.util.LinkedList;

public class Tree {
    Node root;
    Integer[] array;
    int arrayIndex = 0;


    public Tree() {

    }

    public Tree(Node root) {
        this.root = root;
    }

    public Tree(int[][] T) {
        Node[] nodes = new Node[T.length];

        for(int i = 0; i<nodes.length; i++) {
            nodes[i] = new Node(T[i][0]);
        }

        for (int i = 0; i<nodes.length; i++) {
            if (!(T[i][1]==0)) {
                nodes[i].left = nodes[T[i][1]];
            }
            if (!(T[i][2]==0)) {
                nodes[i].right = nodes[T[i][2]];
            }
        }
        root = nodes[0];

    }

    public void preorder() {
        makePreorder(root);
        System.out.println();
    }

    private static void makePreorder(Node node){

        if (node != null) {
            System.out.print(node.value + " ");
            makePreorder(node.left);
            makePreorder(node.right);
        }
    }

    public void inorder() {
        makeInorder(root);
        System.out.println();
    }

    private void makeInorder(Node node){

        if (node != null) {
            makeInorder(node.left);
            System.out.print(node.value + " ");
            makeInorder(node.right);
        }
    }


    public void postorder() {
        makePostorder(root);
        System.out.println();
    }

    private void makePostorder(Node node){

        if (node != null) {
            makePostorder(node.left);
            makePostorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void traversalBSF() {
        if (root == null) {
            System.out.println("Tree is empty, mate");
            return;
        }
        bfs(root);
    }

    public void bfs(Node root) {
        LinkedList<Node> nodeQueue = new LinkedList<Node>();
        nodeQueue.offer(root);

        while (!(nodeQueue.isEmpty())) {
            Node node = nodeQueue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) nodeQueue.offer(node.left);
            if (node.right != null) nodeQueue.offer(node.right);

        }
        System.out.println();
    }

    public Node searchBST(Integer value) {
        Node node = root;
        while ((node!=null) && (node.value != value)) {
            if ((value < node.value)) {
                node = node.left;
                //System.out.println("left chosen");
                //System.out.println(value);
            } else {
                node = node.right;
            }
                    //System.out.println("right chosen");
                    //System.out.println(value);
        }
        return node;
    }


    public void addBST(Integer value) {
        Node toInsert = new Node(value);
        Node node = root;

        // if there is no root, create one
        if (root == null) {
            Node root = new Node(value);
            //root.value = value;
            System.out.println("root added");
            return;
        }

        // find tree branch with null
         while (true) {
            // if node with this value already exists do nothing
            if (node.value == value) return;
            else {
                // if value of current node is higher than value
                if (value < node.value) {
                    // and there is no left node, insert new one
                    if (node.left == null) {
                        node.left = toInsert;
                        break;
                    } else {
                        // do the loop again with node.left
                        node = node.left;
                    }
                } else if (node.right == null) {
                    // if there is no right node, insert one
                    node.right = toInsert;
                    break;
                } else {
                    // do the loop again with node.right
                    node = node.right;
                }
            }
         }
    }



    public void removeBST(Integer value) {
        Node node;

        node = searchBST(value);
        if (node == null) return;

        if (node.right.left != null) {
            // istnieje lewy wnuk prawego syna
        } else if (node.left != null) {
            // istnieje lewy syn
        }
    }


    // sorting array with use of BST tree... not finished
    public Integer[] sortArrayBST(Integer[] array) {
       // ArrayList<Node> treeBST = new ArrayList<Node>();
        // add all elements of array to BST tree
        Node root = new Node(array[0]);
        Tree nextTree = new Tree(root);
        for (int i = 1; i<array.length; i++) {
            Node node = new Node(array[i]);
            addBST(array[i]);
        }
        inorder();
        return array;
    }

    public void inorderToArray() {
        makeInorderToArray(root);
    }

    private void makeInorderToArray(Node node){

        if (node != null) {
            makeInorderToArray(node.left);
            array[arrayIndex] = node.value;
            arrayIndex++;
            makeInorderToArray(node.right);
        }
    }
}
