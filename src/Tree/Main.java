package Tree;
import java.math.BigInteger;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        int[][] tab = new int[7][3];

/*        for (int i=6; i==0; i--) {
            tab[i][0] = i;
        }*/
/*        tab[0][0] = 3;
        tab[1][0] = 1;
        tab[2][0] = 5;
        tab[3][0] = 0;
        tab[4][0] = 2;
        tab[5][0] = 4;
        tab[6][0] = 8;

        tab[0][1] = 1;
        tab[0][2] = 2;

        tab[1][1] = 3;
        tab[1][2] = 4;

        tab[2][1] = 5;
        tab[2][2] = 6;

        Tree tree = new Tree(tab);

        Node root = tree.root;

        System.out.print("PREORDER ");
        tree.preorder();

        System.out.print("INORDER ");
        tree.inorder();

        System.out.print("POSTORDER ");
        tree.postorder();

        System.out.print("BFS ");
        tree.traversalBSF();

        System.out.println();*/

/*        System.out.println((tree.searchBST(5).value));
        System.out.println(" - - - - - ");
        System.out.println((tree.searchBST(6).value));
        System.out.println(" - - - - - ");
        System.out.println((tree.searchBST(2).value));
        System.out.println(" - - - - - ");
        System.out.println((tree.searchBST(0).value));*/

/*        System.out.println("------ ------");
        System.out.println("------ ------");

        System.out.println((tree.searchBST(10)));

        tree.inorder();
        tree.addBST(7);
        tree.addBST(7);
        System.out.println("My new BST");
        tree.inorder();

        System.out.println("------ ------");
        System.out.println("Array sorting with BST tree");
        System.out.println("------ ------");*/


        // declare new array
        Integer[] myArray = {15, 16, 25, 10,8,5,3,4,2,1,0,6,9,7};
        // print unsorted array
        System.out.println("Unsorted array");
        for (Integer integer : myArray) {
            System.out.print(integer + " ");
        }
        System.out.println();
        // declare new node - root with value of first element of array
        Node root = new Node(myArray[0]);
        // declare newtree :)
        Tree newtree = new Tree();
        newtree.root = root;
        // declare new array for newtree
        newtree.array = new Integer[myArray.length];
        // add all elements of array to BST tree - newtree
        for (int i = 1; i<myArray.length; i++) {
            newtree.addBST(myArray[i]);
        }

        // print newtree with inorder order :)
        System.out.println("New BST tree with array elements - inorder");
        newtree.inorder();

        // insert newtree values to array in inorder order
        newtree.inorderToArray();

        // print sorted array
        System.out.println("Sorted array");
        for (Integer integer : newtree.array) {
            System.out.print(integer + " ");
        }
       /* System.out.println("Root value " + root.value);
        System.out.println("Root left " + root.left);
        System.out.println("Root right " + root.right);


        Node myNodeL = new Node();

        myNodeL = root.left;
        System.out.printn("Root.left - value = " + myNodeL.value);

        Node myNodeR = new Node();
        myNodeR = root.right;
        System.out.println("Root.right - value = " + myNodeR.value);



        for (int i = 0; i<7; i++) {

        }
*/




    }




}
