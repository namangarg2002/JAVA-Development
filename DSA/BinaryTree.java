import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class BinaryTree {
    Node root;

    public void insert(int data){
       root = insertRec(root, data);

    }

    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        }else if(data < root.data){
            root.left = insertRec(root.left, data);
        }else{
            root.right = insertRec(root.right, data);
        }

        return root;

    }

    public void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root){
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int levelIndex = 0;

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for(int i=0; i<size; i++){
                Node frontNode = q.peek();
                q.poll();
                level.add(frontNode.data);

                if(frontNode.left != null){
                    q.offer(frontNode.left);
                }
                if(frontNode.right != null){
                    q.offer(frontNode.right);
                }
            }
            System.out.print("Level " + levelIndex + " : ");
            for(int n: level){
                System.out.print(n + " ");
            }

            levelIndex++;

            System.out.println();
        }
    }
}
