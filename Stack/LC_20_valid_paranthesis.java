import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}'){
            return false;
        }
        for(char c: s.toCharArray()){
            
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else{if (st.isEmpty()) return false;
        else if(c==')'){
            if(st.peek()=='('){
                st.pop();
            }else{
                return false;
            }
        }else if(c=='}'){
            if(st.peek()=='{'){
                st.pop();
            }else{
                return false;
            }
        }else if(c==']'){
            if(st.peek()=='['){
                st.pop();
            }else return false;
        }
            }
        }if(st.empty()){
            return true;
        }
        return false;
    }
}