
import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        while(x!=0){
            int digit =x%10;
            x=x/10;
            sum=sum+digit;
        }
            System.out.print(sum);
        }
}