import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stack = new int[N];
        int top = 0;              

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack[top++] = x;
            } else if (cmd.equals("pop")) {
                if (top == 0) sb.append(-1).append('\n');
                else sb.append(stack[--top]).append('\n');
            } else if (cmd.equals("size")) {
                sb.append(top).append('\n');
            } else if (cmd.equals("empty")) {
                sb.append(top == 0 ? 1 : 0).append('\n');
            } else if (cmd.equals("top")) {
                if (top == 0) sb.append(-1).append('\n');
                else sb.append(stack[top - 1]).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
