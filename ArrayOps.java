public class ArrayOps{

  public static int sum(int[] arr){
    int sum = 0;

    for (int i = 0; i < arr.length; i++){
      sum = sum + arr[i];
    }

    return sum;
  }

  public static int largest(int[] arr){
    int largest = arr[0];

    for (int i = 1; i < arr.length; i++){
      if (arr[i] > largest){
        largest = arr[i];
      }
    }

    return largest;
  }

  public static int[] sumRows(int[][] matrix){
    int[] resultArray = new int[matrix.length];

    for (int i = 0; i < matrix.length; i++){
      resultArray[i] = sum(matrix[i]);
    }

    return resultArray;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] resultArray = new int[matrix.length];

    for (int i = 0; i < matrix.length; i++){
      resultArray[i] = largest(matrix[i]);
    }

    return resultArray;
  }

  public static int sum(int[][] arr){
    int totalSum = 0;

    for (int i = 0; i < arr.length; i++){
      totalSum = totalSum + sum(arr[i]);
    }

    return totalSum;
  }

  public static int[] sumCols(int[][] matrix){
    int[] sumArray = new int[matrix.length];

    for (int i = 0; i < matrix[0].length; i++){
      int col = 0;
      for (int j = 0; j < matrix.length; i++){
        col = col + matrix[j][i];
      }
      sumArray[i] = col;
    }

    return sumArray;
  }

}
