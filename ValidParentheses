
class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        int length = s.length();
        
        for(int i =0;i< length;i++) {
            char temp = s.charAt(i);
            if(temp == '{' || temp == '(' || temp == '[') {
                stack.push(temp);
            }
            else if(temp == '}' && !stack.isEmpty() &&stack.peek() == '{' ){
                stack.pop();
            }
            else if(temp == ')' && !stack.isEmpty() && stack.peek() == '(' ){
                stack.pop();
            }
            else if(temp == ']' && !stack.isEmpty() && stack.peek() == '[' ){
                stack.pop();
            }
            else {
                stack.push(temp);
            }
        }
        
        return stack.isEmpty();
        
    }
}


// The usage of Stack class is not advisable, and Deque should be used instead of it. 
<---
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        
        for(int i =0;i< length;i++) {
            char temp = s.charAt(i);
            if(temp == '{' || temp == '(' || temp == '[') {
                stack.push(temp);
            }
            else if(temp == '}' && !stack.empty() &&stack.peek() == '{' ){
                stack.pop();
            }
            else if(temp == ')' && !stack.empty() && stack.peek() == '(' ){
                stack.pop();
            }
            else if(temp == ']' && !stack.empty() && stack.peek() == '[' ){
                stack.pop();
            }
            else {
                stack.push(temp);
            }
        }
        
        return stack.empty();
        
    }
}
--->
