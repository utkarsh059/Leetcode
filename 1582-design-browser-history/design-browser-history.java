class BrowserHistory {
    Deque<String> CurrentHistory;
    Deque<String> ForwardHistory;

    public BrowserHistory(String homepage) {
       CurrentHistory= new ArrayDeque<>();
         ForwardHistory= new ArrayDeque<>();

         CurrentHistory.push(homepage);
        
    }
    
    public void visit(String url) {
        CurrentHistory.push(url);
        while(!ForwardHistory.isEmpty()){
            ForwardHistory.pop();
        }
        
        
    }
    
    public String back(int steps) {
        while(steps>0){
            if(CurrentHistory.size()>1){
                String BackTab=CurrentHistory.pop();
                ForwardHistory.push(BackTab);
            }
            else{
                break;
            }
            steps--;
        }
         return CurrentHistory.peek();
        
    }
    
    public String forward(int steps) {
        while(steps>0){
            if(ForwardHistory.size()>0){
                String forwardTab=ForwardHistory.pop();
                CurrentHistory.push(forwardTab);
            }
            else{
                break;
            }
            steps--;
        }
        return CurrentHistory.peek();
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */