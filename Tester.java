public class Tester{
  public static void main(String[] args){
    int[] SumTest = {1, 2 , 3 , 4 , 5};
    System.out.println(ArrayOps.sum(SumTest));
    System.out.println(ArrayOps.sum(new int[]{}));
    System.out.println(ArrayOps.largest(SumTest));
  }
}
