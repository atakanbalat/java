public class MatrixTranspose {
    public static void main(String[] args) {
        // Orijinal matris
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Transpoz matrisini hesaplamak
        int[][] transposedMatrix = transpose(matrix);

        // Orijinal matrisi yazdırma
        System.out.println("Orijinal Matris:");
        printMatrix(matrix);

        // Transpoze matrisi yazdırma
        System.out.println("Transpoze Matris:");
        printMatrix(transposedMatrix);
    }

    // Transpoz matrisini hesaplayan metod
    public static int[][] transpose(int[][] matrix) {
        int rowCount = matrix.length;        // Orijinal matrisin satır sayısı
        int colCount = matrix[0].length;     // Orijinal matrisin sütun sayısı

        // Yeni bir matris oluşturuyoruz: satır sayısı sütun sayısına, sütun sayısı ise satır sayısına eşit olacak
        int[][] transposedMatrix = new int[colCount][rowCount];

        // Matrisin elemanlarını transpoz hale getiriyoruz
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transposedMatrix[j][i] = matrix[i][j];  // Orijinal matrisin elemanını yeni matrisin transpozuna kopyala
            }
        }

        return transposedMatrix;
    }

    // Matrisin elemanlarını yazdıran metod
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
