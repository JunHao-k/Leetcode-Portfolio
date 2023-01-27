import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack =  new Stack<Character>();
        boolean valid = false;
        if((s.charAt(0) == ')') || (s.charAt(0) == '}') || (s.charAt(0) == ']')){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            // char current = charStack.peek();
            char next = s.charAt(i);
            if(charStack.empty()){
                if((next == '(') || (next == '{') || (next == '[')){
                    charStack.push(next);
                }
                else{
                    return false;
                }
            }
            else{
                char current = charStack.peek();
                if(current == '('){
                    if(next == ')'){
                        charStack.pop();
                    }
                    else if((next == '{') || (next == '[') || (next == '(')){
                        charStack.push(next);
                    }
                    else{
                        valid = false;
                        break;
                    }
                }
                else if(current == '{'){
                    if(next == '}'){
                        charStack.pop();
                    }
                    else if((next == '(') || (next == '[') || (next == '{')){
                        charStack.push(next);
                    }
                    else{
                        valid = false;
                        break;
                    }
                }
                else{
                    if(next == ']'){
                        charStack.pop();
                    }
                    else if((next == '(') || (next == '{') || (next == '[')){
                        charStack.push(next);
                    }
                    else{
                        valid = false;
                        break;
                    }
                }
            }
        }
        valid = charStack.empty();
        return valid;
    }
}