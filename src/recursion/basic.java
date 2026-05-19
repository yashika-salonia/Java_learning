import java.util.Scanner;

class basic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        printName(1, N);
        printAsc(1, N);
        printDesc(N, 1);
    }

    static void printName(int i, int N){
        if(i>N){
            return;
        }
        System.out.println("Yashika");
        printName(i+1, N);
    }

    static void printAsc(int i,int N){
        if(i>N) return;
        System.out.println(i);
        printAsc(i+1, N);
    }
    
    static void printDesc(int N, int i){
        if(N<1) return;
        System.out.println(N);
        printDesc(N-1, i);
    }
}