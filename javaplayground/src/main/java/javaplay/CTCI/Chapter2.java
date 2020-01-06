package javaplay.CTCI;
// linked List

public class Chapter2{

    public static Node deleteNode(Node head, int target) {

        if (head.val == target) return head.next;
        Node curr = head;

        while(curr.next != null){
            if (curr.val ==  target){
                curr.next = curr.next.next;
                return head;
            }
        }
        return head;
        
    }

    

}