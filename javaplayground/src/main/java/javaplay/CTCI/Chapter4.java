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

    public static void RouteToNode() {

    }
}