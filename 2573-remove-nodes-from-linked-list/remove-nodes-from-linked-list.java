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
    public ListNode removeNodes(ListNode head) {
        List<ListNode> valid= new ArrayList<>();
        ListNode ans =  new ListNode();
        ListNode temp=ans;
    Deque<ListNode> st= new ArrayDeque<>();
    int max=Integer.MIN_VALUE;

    ListNode currNode=head;
    while(currNode!=null){
        st.push(currNode);
        currNode=currNode.next;

    }
    while(!st.isEmpty() ){
       ListNode curr=st.pop();
       if(curr.val>=max){
        max=curr.val;
       valid.add(curr);
       }
   
    }
    for(int i=valid.size()-1;i>=0; i--){
        temp.next=valid.get(i);
        temp=temp.next;
        temp.next=null;
    }
       return ans.next;
    }
        
    }
