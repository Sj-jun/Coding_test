import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            String k = st.nextToken();
            map.put(k, map.getOrDefault(k,0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            String q = st.nextToken();
            sb.append(map.getOrDefault(q,0)).append(' ');
        }

        System.out.println(sb.toString());
    }
}