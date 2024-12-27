import java.util.Scanner;
public class DiffSumProd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;

        while(n!=0){
            int no=n;
            no=no%10;
            System.out.println(no);
            sum=sum+no;
            System.out.println(sum);
            prod=prod*no;
            System.out.println(prod);
            n=n/10;
            System.out.println(n);
        }
        return prod-sum;
    }
}
