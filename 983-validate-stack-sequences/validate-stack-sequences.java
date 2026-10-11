class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
      int n=popped.length;
        Deque<Integer> st1=new ArrayDeque<>();
        Deque<Integer> st2=new ArrayDeque<>();
        int j=0;
        for(int i=n-1; i>=0; i--){
            st1.push(popped[i]); 
        }
        
        for(int i=0; i<pushed.length; i++){
            st2.push(pushed[i]);
           while((!st1.isEmpty() && !st2.isEmpty())&&  st2.peek().equals(st1.peek()) ){
                st1.pop();
                st2.pop();
            }
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
        if(st1.peek()!=st2.peek()){
            return false;
        }
        else{
            st1.pop();
            st2.pop();
        }}
        return st1.isEmpty()&&st2.isEmpty();
    }
}
