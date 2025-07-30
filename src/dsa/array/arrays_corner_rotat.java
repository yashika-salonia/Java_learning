public class arrays_corner_rotat {

    public static void rotateCorners(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Store top-left in temp
        char temp = matrix[0][0];

        // Move bottom-left to top-left
        matrix[0][0] = matrix[rows - 1][0];

        // Move bottom-right to bottom-left
        matrix[rows - 1][0] = matrix[rows - 1][cols - 1];

        // Move top-right to bottom-right
        matrix[rows - 1][cols - 1] = matrix[0][cols - 1];

        // Place temp (top-left) to top-right
        matrix[0][cols - 1] = temp;
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'#', '2', '@'},
            {'4', '5', '7'},
            {'%', '9', '*'}
        };

        rotateCorners(matrix);

        for (char[] row : matrix) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
