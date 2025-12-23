import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int[] nrr = new int[N]; 
        for(int i=0; i < N; i++){
            nrr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] mrr = new int[M];
        StringTokenizer stm = new StringTokenizer(br.readLine()); 

        for(int i=0; i < M; i++){
            mrr[i] = Integer.parseInt(stm.nextToken());
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i < N; i++){
            set.add(nrr[i]);
        }

        for(int i=0; i < M; i++){
            if (set.contains(mrr[i])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}