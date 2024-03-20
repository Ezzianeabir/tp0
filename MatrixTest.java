import org.example.Matrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MatrixTest {
    @Test
    public void testAddWithNonEmptyMatrix() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.add(matrix2);

        Assertions.assertEquals(6, matrix1.get(0, 0));
        Assertions.assertEquals(8, matrix1.get(0, 1));
        Assertions.assertEquals(10, matrix1.get(1, 0));
        Assertions.assertEquals(12, matrix1.get(1, 1));
    }

    @Test
    public void testMultiplyWithNonEmptyMatrix() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.multiply(matrix2);

        Assertions.assertEquals(19, matrix1.get(0, 0));
        Assertions.assertEquals(22, matrix1.get(0, 1));
        Assertions.assertEquals(43, matrix1.get(1, 0));
        Assertions.assertEquals(50, matrix1.get(1, 1));
    }

    @Test
    public void testTransposeWithNonEmptyMatrix() {
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        matrix.transpose();

        Assertions.assertEquals(1, matrix.get(0, 0));
        Assertions.assertEquals(3, matrix.get(0, 1));
        Assertions.assertEquals(2, matrix.get(1, 0));
        Assertions.assertEquals(4, matrix.get(1, 1));
    }
}
