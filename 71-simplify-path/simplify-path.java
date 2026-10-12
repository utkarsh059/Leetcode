class Solution {
    public String simplifyPath(String path) {
        Deque<String> st= new ArrayDeque<>();

        String[] parts=path.split("/");
        for(int i=0; i<parts.length; i++){
            String part=parts[i];

            if(part.isEmpty()){
                //ignore
                continue;

            }
            if(part.equals(".")){
                //ignore
                continue;
            }
            if(part.equals("..") && st.isEmpty()){
                //ignore
                continue;
            }
            if(part.equals("..")&& !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(part);
            }
        }
        
        if(st.isEmpty()){
            return "/";
        }
        else{
            StringBuilder str=new StringBuilder();
            while(!st.isEmpty()){
            str.append("/");
            str.append(st.removeLast());

        }
            return str.toString();
        }
    }
}