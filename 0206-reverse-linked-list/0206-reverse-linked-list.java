/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        // is Linked list is empty
        if(head == null) return head;
        // push to stack stack is FILO
        while(head != null){
            stack.push(head);
            head = head.next;
        }

        // seting head
        ListNode res = stack.pop();
        ListNode newHead = res;
        
        while(!stack.isEmpty()){
            res.next = stack.pop(); 
            res = res.next;
        }
        // break the cycle
        res.next = null;
        
        return newHead;
    }
}