class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(stack.isEmpty()){
                if(c == '}' || c== ']' || c == ')'){
                return false;
                }
                stack.push(c);
            }
            else {
                if(c == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }
                    else return false;
                }
                else if(c == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }
                    else return false;
                }
                else if(c == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }
                    else return false;
                }
                else {
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
