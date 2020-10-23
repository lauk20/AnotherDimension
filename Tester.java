import java.util.Arrays;

public class Tester{
  public static void main(String[] args){
    int[] SumTest = {1, 2 , 3 , 4 , 5};
    int[][] A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
                };
    int[][] B = { {  1,  2, 3, 4 },
                  {  2, 3,  4,  1 },
                  { 3, 4,  1, 2 }
                }; //this is rowMagic but NOT colMagic
    int[][] C = { {  1,  1, 1 },
                  {  2, 2, 2 },
                  { 3,  3, 3 }
                }; //this is colMagic but NOT rowMagic
    int[][] D = { {  2,  2, 2 },
                  {  2, 2, 2 }
                }; //this is both colMagic AND rowMagic
    int[][] E = { {  2,  4, 2 },
                 {  2, 2, 2 }
               };
    int [] X = {1, 3, 5};
    System.out.println(ArrayOps.sum(SumTest));
    System.out.println(ArrayOps.sum(new int[]{}));
    System.out.println(ArrayOps.largest(SumTest));
    System.out.println();
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.println(ArrayOps.sum(A));
    System.out.println(ArrayOps.sum(X));
    System.out.println();
    System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println();
    System.out.println(ArrayOps.isRowMagic(B));
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println(ArrayOps.isRowMagic(D));
    System.out.println();
    System.out.println(ArrayOps.isColMagic(B));
    System.out.println(ArrayOps.isColMagic(C));
    System.out.println(ArrayOps.isColMagic(D));
    System.out.println();
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
  }
}
