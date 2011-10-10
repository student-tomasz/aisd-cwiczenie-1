public class InsertionSorterTest {
  public static void main(String[] args) {
    // double[] array = new double[]{10, 6, 7, 8, 5, 9, 3, 1};
    double[] array = new double[]{10, 6, -1, 6, 7, 8, 5, 9, 3, 1};
    
    System.out.println("before insertionsort:");
    print_array(array);
    
    System.out.println("after insertionsort:");
    InsertionSorter.sort(array);
    print_array(array);
  }

  private static void print_array(double[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.print("\n");
  }
}
