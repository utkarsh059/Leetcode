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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[]ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode prev=head;
        ListNode curr=head.next;
        int cnt=2;
        int minDis=Integer.MAX_VALUE;
        while(curr.next!=null){

            if(curr.val>prev.val && curr.val>curr.next.val || curr.val<prev.val && curr.val<curr.next.val ){
              arr.add(cnt);

            }
            cnt++;
            prev=prev.next;
            curr=prev.next;
        }
        if(arr.size()<2){
            return ans;
        }
        for(int i=0; i<arr.size()-1; i++){
           minDis=Math.min(arr.get(i+1)-arr.get(i),minDis) ;
           
        }
      ans[0]=minDis;
      ans[1]=arr.get(arr.size()-1)-arr.get(0);

      return ans;

        
    }
}