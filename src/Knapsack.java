import java.util.*;
public class Knapsack {
    public static void main(String[] args) {
        int W=60;
        int[] w={5,20,40,30,10};
        int[] v={30,40,70,90,20};
        FracknapSack(W,v,w);
    }
    static int count=0;
    static void FracknapSack(int W,int[] v,int[] w){
        int[] p=new int[v.length];
        int[] sol=new int[v.length];
        int[] item=new int[v.length];
        for(int i=0;i<v.length;i++){
            p[i]=v[i]/w[i];
        }
        int i=0;
        int profit=0;
        while(W>0){
            count++;
            int amount=Math.min(W,w[i]);
            count++;
            sol[i]=amount;
            count++;
            W=W-w[i];
            count++;
            profit = profit + ( p[i]*sol[i] ) ;
            count++;
            i++;
            count++;
        }
        count++;
        System.out.println("Solution: "+Arrays.toString(sol));
        System.out.println("Profit: "+profit);
        System.out.println("Count: "+count);
    }
}