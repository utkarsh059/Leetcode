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
    private int Gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
        int ans=Gcd(prev.val,curr.val);
        ListNode newNode= new ListNode(ans);

        prev.next=newNode;
        newNode.next=curr;

        prev=curr;
        curr=curr.next;

        }
       return temp;
    }
}