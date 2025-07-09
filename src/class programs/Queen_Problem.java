import java.util.*;
public class Queen_Problem {
    static int k=0;
    static int n=8;
    public static void main(String[] args) {
        nQueen(k,n);
    }
    static int count=1;
    static int[] x=new int[n];
    static void nQueen(int k,int n){
        for(int i=0;i<n;i++){
            if( place(k,i) ){
                x[k]=i;
                if(k==n-1){
                    System.out.println(count+". " +Arrays.toString(x));
                    count++;
                }else{
                    nQueen(k+1,n);
                }
            }
        }
    }

    static boolean place(int k,int i){
        for(int j=0;j<k;j++){
            if( x[j]==i || Math.abs( x[j]-i ) == Math.abs( j-k ) )
                return false;
        }
        return true;
    }
}