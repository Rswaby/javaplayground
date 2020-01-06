package javaplay.CTCI;
// linked List

import java.util.HashSet;
import java.util.Set;

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

    public static Node removeDuplicates(Node head){

        Set<Integer> buff = new HashSet<>();
        Node curr = head;
        while(curr.next != null){
            if (buff.contains(curr.val)){
                curr.next = curr.next.next;
            }else{
                buff.add(curr.val);
            }
        }
        return head;

    }

    public static int KthtoLast(Node head, int k) {

        Node fast = head;
        Node slow = head;

        for (int _ = 0; _ < k+1; _++) {
            fast = fast.next;           
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;



        
    }



}