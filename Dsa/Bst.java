class Node {
    int key;
    Node left, right;
    
    Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    
    
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        } else if (key <= root.key) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");
    }

    
    public static Node del(Node root, int key) {
        if (root == null) {
            return root; 
        }

        
        if (key < root.key) {
            root.left = del(root.left, key);
        } else if (key > root.key) {
            root.right = del(root.right, key);
        } else {
            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            
            Node minNode= findMin(root.right);
            root.key=minNode.key;
            
            root.right = del(root.right, minNode.key);
        }
        return root;
    }

    
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        
    
        root = insert(root, 230);
        root = insert(root, 20);
        root = insert(root, 2930);
        
        // Printing the traversals
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
        
        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
        
        
        int delkey = 20;
        root = del(root, delkey);
        
        
        System.out.print("Inorder after deletion: ");
        inorder(root);
        System.out.println();
    }
}
