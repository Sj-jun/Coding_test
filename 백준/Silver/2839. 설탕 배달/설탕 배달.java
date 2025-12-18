import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean found = false;

        find:
        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                if((3*i + 5*j) == N){
                    System.out.println(i + j);
                    found = true;
                    break find;
                }
            }
        }

        if(!found){
            System.out.println("-1");
        }


    }
}