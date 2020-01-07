package javaplay.CTCI;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Chapter4 {

    public static void inOrder(TreeNode root) {

        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
        ///
    }

    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val);
        }
    }

    public static Boolean RouteToNode(String source, String destNode, HashMap<String, ArrayList<String>> graph) {
        /*
         * graph = { "A": ["B","D","A"] }
         */
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(source);
        queue.add(source);

        while (!queue.isEmpty()) {
            // dequeue
            String node = queue.poll();
            for (String neighbour : graph.get(node)) {
                if (destNode.equals(neighbour))
                    return true;
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        return false;
    }

    public void listDepth(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {

        if (root == null)
            return;
        LinkedList<TreeNode> list = null;
        if (lists.size() == level) {
            // not at level yet
            list = new LinkedList<TreeNode>();
            lists.add(list);

        } else {
            list = lists.get(level);
        }

        list.add(root);
        listDepth(root.left, lists, level+1);
        listDepth(root.right, lists, level+1);
    }
}