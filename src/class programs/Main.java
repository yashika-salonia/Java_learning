public class Main {
    public static void main(String[] args) {
        char[] x={'b','c','a','d','b'};
        char[] y={'b','a','d','c','b'};
        LongestCommonSubsequence(x,y);
    }

    static void LongestCommonSubsequence(char[] x, char[] y){
        int m=x.length;
        int n=y.length;
        int count=0;
        int[][] C=new int[m+1][n+1];
        char[][] b=new char[m+1][n+1];
        for(int i=1;i<=m;i++){
            count++;
            for(int j=1;j<=n;j++){
                count++;
                if(x[i-1]==y[j-1]){
                    count++;
                    C[i][j]=C[i-1][j-1]+1;
                    count++;
                    b[i][j]='$'; // pointing to the diagonal
                    count++;
                }
                else{
                    count++;
                    if(C[i][j-1]>=C[i-1][j]){
                        count++;
                        C[i][j]=C[i][j-1];
                        count++;
                        b[i][j]='<'; // pointing to the left
                        count++;
                    }
                    else{
                        count++;
                        C[i][j]=C[i-1][j];
                        count++;
                        b[i][j]='^'; //pointing to the right
                        count++;
                    }
                    count++;
                }
                count++;
            }
            count++;
        }
        count++;

        //printing c
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print(b[i][j]+" "+C[i][j]+"  ");
            }
            System.out.println();
        }

        //printing answer
        System.out.print("Answer: ");
        PrintLCS(b,x,m,n);
        System.out.println();
        System.out.print("Count: "+count);
    }
    static void PrintLCS(char[][] b, char[] x, int i,int j){
        if(i==0 || j==0){
            return;
        }
        if(b[i][j]=='$'){
            PrintLCS(b,x,i-1,j-1);
            System.out.print(x[i-1]+" ");
        }
        else if(b[i][j]=='^'){
            PrintLCS(b,x,i-1,j);
        }
        else{
            PrintLCS(b,x,i,j-1);
        }
    }

}