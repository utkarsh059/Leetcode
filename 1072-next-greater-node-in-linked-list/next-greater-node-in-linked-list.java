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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        Deque<Integer> st=new ArrayDeque<>();
     ListNode temp=head;
     while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
     }
      int ans[]=new int[arr.size()];
     for(int i=arr.size()-1; i>=0; i--){
        while(!st.isEmpty() && arr.get(i)>=st.peek()){
            st.pop();
            
        }
        if(st.isEmpty()){
            ans[i]=0;
            st.push(arr.get(i));
           

        }
        else{
            ans[i]=st.peek();
            st.push(arr.get(i));
            
        }
     }
     return ans;
        
        
    }
}