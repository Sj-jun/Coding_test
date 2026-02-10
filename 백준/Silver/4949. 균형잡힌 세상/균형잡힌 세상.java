import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(true){
            
            boolean chk = true;
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            if(s.equals(".")) break;

            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '['){
                    stack.push(c);
                }else if(c == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        chk = false;
                        break;
                    }
                    else if(stack.peek() == '(') stack.pop();                
                }
                else if(c == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        chk = false;
                        break;
                    }
                    else if(stack.peek() == '[') stack.pop();
                }
            }
            if(!stack.isEmpty()) chk = false;

            if(chk) System.out.println("yes");
            else System.out.println("no");
        }
    }
}