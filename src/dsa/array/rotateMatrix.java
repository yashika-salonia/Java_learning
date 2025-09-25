import java.util.Arrays;
public class rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotateBrute(matrix);
        // rotateOptimal(matrix);
    }

    static void rotateBrute(int[][] matrix){
        int n=matrix.length;
        int[][] dummy=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dummy[j][n-1-i]=matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(dummy));
    }

    static void rotateOptimal(int[][] matrix) {
        int n=matrix.length;
        
        // transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // reversing each row
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //     }
        // }

        System.out.println(Arrays.deepToString(matrix));
    }
}