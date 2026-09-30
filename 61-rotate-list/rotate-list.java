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
    public ListNode rotateRight(ListNode head, int k) {
              if(head==null || head.next==null){
            return head;
        }

        ListNode first=head;
        ListNode prev=head;
        ListNode curr=head.next;
        int cnt=0;
       while(prev!=null){
        cnt++;
        prev=prev.next;
        
       }
       int len=k%cnt;
  
        for(int i=1; i<=len; i++){
             prev=first;
             curr=first.next;
        
        while(curr.next!=null){
            prev=prev.next;
            curr=curr.next;
        
        }
        
            prev.next=null;
            curr.next=first;
            first=curr;
        }
        return first;
        
    }
}