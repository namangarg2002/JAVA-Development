public class BinaryTreeRunner {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.postOrderTraversal(tree.root);

        System.out.println();
        tree.levelOrderTraversal(tree.root);


    }
}
