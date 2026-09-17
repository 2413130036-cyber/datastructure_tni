import java.util.Scanner;
 
public class TreeApp4 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createTree6();
 
        System.out.println("-------------------------------");
        System.out.println("Binary Tree from createTree6()");
        System.out.println("-------------------------------");
        tree.printTree(tree.getRoot(), 0);
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
 
        Node found = tree.findNode(n);
 
        if (found == null) {
            System.out.println("Cannot found Node(data=" + n + ")");
        } else {
            if (found.left != null) {
                System.out.println(found.left.data);
            } else {
                System.out.println("No Left Child");
            }
 
            if (found.right != null) {
                System.out.println(found.right.data);
            } else {
                System.out.println("No Right Child");
            }
 
            if (found.left == null && found.right == null) {
                System.out.println(n + " is Leaf Node");
            } else {
                System.out.println(n + " is not Leaf Node");
            }
        }
 
        sc.close();
    }
}
 