public class Questions {
    public static void main(String[] args) {
//        System.out.println("enter no: ");
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        System.out.println(n+" is prime: "+isPrime(n));
//        ArmstrongNo(n);
        //all armstrong no
        for(int i=100;i<1000;i++){
            if(ArmstrongNo(i)){
                System.out.print(i+" "); //153 370 371 407
            }
        }
    }

    //1. prime no
    static boolean isPrime(int n){
        if(n<=1) {
            return false;
        }
//        old method
//        for(int i=2;i<n;i++){
//            if(n%i==0) {
//                return false;
//            }
//        }
//        return true;
        //time complex-O(n)
        //space complex-O(1)

//        optimised code - by calculating square and checking till underroot of n
        int c=2;
        for(int i=2;i<=c*c;i++){
            if(n%i==0)
                return false;
        }
        return true;
        //time complex-O(under root n)
        //space complex-O(1)

    }

    //2. Armstrong no
//    sum of cube of each digit of a 3 digit no is equal to the no
    static boolean ArmstrongNo(int n){
        int no=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
//            int cube=rem*rem*rem;
//            sum+=cube;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(no==sum)
//            System.out.println(no+" is an Armstrong no");
            return true;
//        else
//            System.out.println(no+" is not an Armstrong no");
        return false;
    }
}

