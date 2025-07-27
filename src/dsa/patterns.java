package dsa;

public class patterns {
    public static void main(String[] args) {

        // pattern1(5);
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // pattern2(5); 
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *

        // pattern3(5);
        //         1 
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        // pattern4(4);
        //      1 
        //    2 1 2
        //  3 2 1 2 3
        //4 3 2 1 2 3 4
        //  3 2 1 2 3
        //    2 1 2
        //      1

        // pattern5(4);
        // 0 0 0 0 0 0 0 0 0 
        // 0 1 1 1 1 1 1 1 0
        // 0 1 2 2 2 2 2 1 0
        // 0 1 2 3 3 3 2 1 0
        // 0 1 2 3 4 3 2 1 0
        // 0 1 2 3 3 3 2 1 0
        // 0 1 2 2 2 2 2 1 0
        // 0 1 1 1 1 1 1 1 0
        // 0 0 0 0 0 0 0 0 0

        pattern6(3);
        // 4 4 4 4 4 4 4 4 4
        // 4 3 3 3 3 3 3 3 4
        // 4 3 2 2 2 2 2 3 4
        // 4 3 2 1 1 1 2 3 4
        // 4 3 2 1 0 1 2 3 4
        // 4 3 2 1 1 1 2 3 4
        // 4 3 2 2 2 2 2 3 4
        // 4 3 3 3 3 3 3 3 4
        // 4 4 4 4 4 4 4 4 4
        
    }
    static void pattern1(int n){
        for (int row = 0; row < (n*2); row++) {
            // int totalcol;
            // if(row<n){
            //     totalcol=0;
            //     for (int j = 0; j <= row; j++) {
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
            // else{
            //     totalcol= 2*n-row-1;
            //     for (int col = 0; col < totalcol; col++) {
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }

            //in short
            int totalcol = row > n ? 2*n - row: row;
            for(int col=0; col<totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 0; row < (n*2); row++) {
            int totalcol = row > n ? 2*n - row: row;

            int noOfSpace = n - totalcol;

            for(int col=0; col<noOfSpace;col++){
                System.out.print(" ");
            }

            for(int col=0; col<totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1; row<=n;row++){

            //spaces loop
            for (int spaces = 0; spaces < n-row; spaces ++) {
                System.out.print("  ");
            }

            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }

            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1; row<2*n;row++){

            int totalNoOfCol = row>n? 2*n-row:row;

            //spaces loop
            for (int spaces = 0; spaces < n-totalNoOfCol; spaces ++) {
                System.out.print("  ");
            }

            for(int col = totalNoOfCol ; col >= 1 ; col--){
                System.out.print(col+" ");
            }

            for(int col=2; col <= totalNoOfCol; col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n){
        n=n*2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        int og=n;
        n=n*2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex=og-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
