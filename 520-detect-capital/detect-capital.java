class Solution {
    public boolean detectCapitalUse(String word) {
        String s=word;
        char ch=s.charAt(0);
             if(s.equals(s.toUpperCase())){
            return true;
        }
        if(Character.isUpperCase(ch)){
        for(int i=1; i<s.length(); i++){
        if(!Character.isLowerCase(s.charAt(i))){
             return false;
        }
        }
        }
        if(Character.isLowerCase(ch)){
        for(int i=0; i<s.length(); i++){
           if(!Character.isLowerCase(s.charAt(i))){
            return false;
        }
        }
        }
        return true;
    }
}