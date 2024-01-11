public class Sarthak_classes_matrix {
    private int[][] matrix;
    private int rows;
    private int columns;

    public Sarthak_classes_matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            matrix[i][j] = value;
        } else {
            System.out.println("Invalid matrix position");
        }
    }


    public Sarthak_classes_matrix add(Sarthak_classes_matrix otherMatrix) {
        if (this.rows != otherMatrix.getRows() || this.columns != otherMatrix.getColumns()) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Sarthak_classes_matrix result = new Sarthak_classes_matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setElement(i, j, this.matrix[i][j] + otherMatrix.matrix[i][j]);
            }
        }
        return result;
    }

    public Sarthak_classes_matrix multiply(Sarthak_classes_matrix otherMatrix) {
        if (this.columns != otherMatrix.getRows()) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        Sarthak_classes_matrix result = new Sarthak_classes_matrix(this.rows, otherMatrix.getColumns());
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                int sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.matrix[i][k] * otherMatrix.matrix[k][j];
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        Sarthak_classes_matrix matrix1 = new Sarthak_classes_matrix(2, 3);
        Sarthak_classes_matrix matrix2 = new Sarthak_classes_matrix(3, 2);

        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);
        matrix2.setElement(2, 0, 11);
        matrix2.setElement(2, 1, 12);

        Sarthak_classes_matrix sumResult = matrix1.add(matrix2);
        if (sumResult != null) {
            System.out.println("Sum Result:");
            printMatrix(sumResult);
        }

        Sarthak_classes_matrix productResult = matrix1.multiply(matrix2);
        if (productResult != null) {
            System.out.println("Product Result:");
            printMatrix(productResult);
        }
    }

    // Utility method to print a matrix
    private static void printMatrix(Sarthak_classes_matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                System.out.print(matrix.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
