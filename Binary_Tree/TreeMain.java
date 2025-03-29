public class TreeMain {
    public static void main(String[] args) {

        Create ct = new Create();
        ct.BinaryTree();
        ct.Display();
        System.out.println();
        System.out.println("Element is in tree:- " + ct.find(70));
        System.out.println();
        System.out.println("Number of nodes:- "+ct.nodes());
        System.out.println();
        System.out.println("Maximum Node value in tree:- " + ct.max());
        System.out.println();
        System.out.println("Height of tree:- " + ct.height());
        System.out.println();
        System.out.print("Level-Order:- ");
        ct.LevelOrder();
        System.out.println();
        System.out.print("Pre-Order Iterative:- ");
        ct.Pre_order();
        System.out.println();
        // 10 true 20 false true 30 false false true 40 false true 50 false false
    }
}
