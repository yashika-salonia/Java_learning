public class setMatrixZero {

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 2, 9, 7},
            {5, 1, 7, 8},
            {0, 2, 0, 1},
        };

        // int[][] matrix={{-1},{2},{3}};
        setZeroes(matrix);
    }

    // works for non negative matrix only
    public static void setZeroes(int[][] matrix) {
        // System.out.println("m: "+m);
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int i=0; i<m; i++){
            // System.out.println("n: "+n);
            for(int j=0; j<n; j++){

                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                    // markRow(n, i, matrix);
                    // markCol(m, j, matrix);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    // static void markRow(int n,int i, int[][] matrix){
    //     for(int j=0;j<n;j++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-1;
    //         }
    //     }
    // }
    // static void markCol(int m,int j, int[][] matrix){
    //     for(int i=0;i<m;i++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-1;
    //         }
    //     }
    // }
}