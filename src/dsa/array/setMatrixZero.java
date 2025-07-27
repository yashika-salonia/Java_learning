public class setMatrixZero {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 0, 4},
            {5, 0, 7, 8},
            {0, 10, 11, 12},
        };

        // int[][] matrix={{-1},{2},{3}};
        setZeroes(matrix);
    }

    // works for non negative matrix only
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        // System.out.println("m: "+m);
        for(int i=0; i<m; i++){
            int n=matrix[i].length;
            // System.out.println("n: "+n);
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    markRow(n, i, matrix);
                    markCol(m, j, matrix);
                }
            }
        }
        for(int i=0; i<m; i++){
            int n=matrix[i].length;
            for(int j=0; j<n; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void markRow(int n,int i, int[][] matrix){
        for(int j=0;j<n;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    static void markCol(int m,int j, int[][] matrix){
        for(int i=0;i<m;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
}