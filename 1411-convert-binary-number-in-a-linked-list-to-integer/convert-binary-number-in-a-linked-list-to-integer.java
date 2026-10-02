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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> ans=new ArrayList<>();
        ListNode temp=head;
        int num=0;
        int n=0;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        for(int i=ans.size()-1; i>=0; i--){
            int mul=(int)(Math.pow(2,n));
            num=num+ans.get(i)*mul;
            n++;
        }
        return num;
        
    }
}