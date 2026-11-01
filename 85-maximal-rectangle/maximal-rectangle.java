class Solution {
        public static void findPreviousSmallerIndex(int heights[],int prev[]){
        Deque<Integer> st= new ArrayDeque<>();
        //for prevSmaller we traverse left to right
        for(int i=0; i<heights.length; i++){
            int currIndex=i;
            while(!st.isEmpty()&& heights[st.peek()]>=heights[currIndex]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i]=-1;
            }
            else{
                prev[i]=st.peek();
            }
            st.push(currIndex);
        }

    }
      public static void findNextSmallestIndex(int heights[],int next[]){
        int n= heights.length;
        Deque<Integer> st= new ArrayDeque<>();
        //for nextSmaller we traverse left to right
        for(int i=heights.length-1; i>=0; i--){
            int currIndex=i;
            while(!st.isEmpty()&& heights[st.peek()]>=heights[currIndex]){
                st.pop();
            }
            if(st.isEmpty()){
                next[i]=n;
            }
            else{
                next[i]=st.peek();
            }
            st.push(currIndex);
        }
    }
    public int largestRectangleArea(int[] heights) {
        //these 2 arr will store index
        int prev[]= new int[heights.length];
        int next[]= new int[heights.length];

        findPreviousSmallerIndex(heights,prev);
        findNextSmallestIndex(heights,next);
        int maxArea=0;
        for(int i=0; i<heights.length; i++){
            int length=heights[i];
            int width=next[i]-prev[i]-1;
            int area=length*width;
            maxArea=Math.max(maxArea,area);
        }
       return maxArea; 
    }
    public int maximalRectangle(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int arr[]= new int[cols];
        int maxArea=-1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]=='1'){
                    arr[j]++;
                }
                else{
                    arr[j]=0;
                }
            }
        int area= largestRectangleArea(arr);
        maxArea=Math.max(maxArea,area);   
        }
        return maxArea;
    }
}