package javaplay.CTCI;

public class Chapter4 {

    public static void inOrder(TreeNode root) {

        if(root != null){
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
        ///
    }

    public static void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val);
        }
    }

    public static void RouteToNode() {

    }
}