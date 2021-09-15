package Q48RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        // 便于矩阵长度为奇数或偶数时进行分类。奇数则只需要旋转少于1/4的部分，偶数需要刚好旋转1/4。
        double row = matrix.length / 2.0 - 1;
        int col = n / 2;

        for (int i = 0; i <= row; i++) {
            for (int k = 0; k <= col; k++) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[n-k][i];
                matrix[n-k][i] = matrix[n-i][n-k];
                matrix[n-i][n-k] = matrix[k][n-i];
                matrix[k][n-i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("The original image is:");
        displayMatrix(matrix);

        Solution solution = new Solution();
        solution.rotate(matrix);

        System.out.println("The rotated image is:");
        displayMatrix(matrix);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println("");
        }
    }
}
