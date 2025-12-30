import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] arr = new String[T];

        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<T; i++){
            String V = br.readLine();
            arr[i] = V;

            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == '(')
                    count1++;
                if(arr[i].charAt(j) == ')')
                    count2++;
                if(count1 < count2){
                    break;
                }
            }
            if(count1 < count2){
                System.out.println("NO");
            }else if(count1 == count2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            count1 = 0;
            count2 = 0;
        }
    }
}