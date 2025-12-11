import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        if(isInteger(c)){
            int C = Integer.parseInt(c) + 1;
            System.out.println(fb(C)); 
        }else if(isInteger(b)){
            int B = Integer.parseInt(b) + 2;
            System.out.println(fb(B));
        }else{
            int A = Integer.parseInt(a) + 3;
            System.out.println(fb(A));
        }
    }

    
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String fb(int i) {
        if(i%3 == 0 && i%5 == 0){
                return("FizzBuzz");
            }else if(i%3 == 0 && i%5 != 0){
                return("Fizz");
            }else if(i%3 != 0 && i%5 == 0){
                return("Buzz");
            }else{
                return Integer.toString(i);
            }
    }
}