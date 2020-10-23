import java.util.Arrays;

public class Tester{
  public static void main(String[] args){
    int[] SumTest = {1, 2 , 3 , 4 , 5};
    int[][]  A  =  { {  1,  0, 12, -1 },
                     {  7, -2,  2,  1 },
                     { -5, -2,  2, -9 }
                   };
    System.out.println(ArrayOps.sum(SumTest));
    System.out.println(ArrayOps.sum(new int[]{}));
    System.out.println(ArrayOps.largest(SumTest));
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
  }
}
