import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            int anos = 2015;
            int pasado = sc.nextInt();
            anos -= pasado;
            if(anos == 0){
                System.out.println(1 +" A.C.");
            }else if(anos > 0){
                System.out.println(anos +" D.C.");
            }else if(anos < 0){
                anos = Math.abs(anos) + 1;
                System.out.println(anos +" A.C.");
            }
            
        }

        sc.close();
    }
}
