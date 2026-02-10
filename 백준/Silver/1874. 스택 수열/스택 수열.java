
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] su = new int[n];
        for(int i=0; i<su.length; i++){
            su[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int next = 1;

        for(int i=0; i<n; i++){
            int target = su[i];

            while(next <= target){
                stack.push(next++);
                sb.append("+\n");
            }

            if(stack.peek() == target){
                stack.pop();
                sb.append("-\n");
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}