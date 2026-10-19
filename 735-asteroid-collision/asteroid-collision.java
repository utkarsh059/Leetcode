class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Deque<Integer> st= new ArrayDeque<>();
        ArrayList<Integer> ans= new ArrayList<>();

        for(int i=0; i<n; i++){
            int j=Math.abs(asteroids[i]);
            while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0 && j>st.peek()){
                st.pop();
            }
            if(!st.isEmpty()&& asteroids[i]<0 && st.peek()==j && st.peek()>0){
                st.pop();
                continue;
            }
            if(!st.isEmpty() && asteroids[i]>0 && st.peek()>0 ){
                st.push(asteroids[i]);
            }

               if(!st.isEmpty() && asteroids[i]<0 && st.peek()<0 ){
                st.push(asteroids[i]);
            }

            if(!st.isEmpty() && asteroids[i]<0 &&st.peek()>0 && j<st.peek()){
                continue;
            }

            if(!st.isEmpty() && asteroids[i]>0 && st.peek()<0){
                st.push(asteroids[i]);
            }
            if(st.isEmpty() ){
            st.push(asteroids[i]);
        }
        }

        while(!st.isEmpty()){
            ans.add(st.peek());
            st.pop();
        }
        int res[]= new int[ans.size()];
       for(int i=ans.size()-1; i>=0; i--){
         res[ans.size()-1-i] = ans.get(i);
       }
       return res;
        
        
    }
}