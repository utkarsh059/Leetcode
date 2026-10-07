class Solution {
    public String trafficSignal(int timer) {
        StringBuilder sb= new StringBuilder();
        if (timer == 0){
            String s="Green";
            sb.append(s);
            return sb.toString();
        }
        if (timer == 30){
            String s="Orange";
            sb.append(s);
            return sb.toString();
        }
         if(timer>30 && timer<=90){
            String s="Red";
            sb.append(s);
            return sb.toString();
         }
         String s="Invalid";
         sb.append(s);
         return sb.toString();
        
    }
}