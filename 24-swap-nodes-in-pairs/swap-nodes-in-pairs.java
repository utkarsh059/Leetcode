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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        prev.next=curr.next;
        curr.next=prev;
        head=curr;
        while(prev.next!=null && prev.next.next!=null){
            ListNode first =prev.next;
            ListNode sec=first.next;
            prev.next=sec;
            first.next=sec.next;
            sec.next=first;
            prev=first;


        }
        
        return head;
    
        
    }
}