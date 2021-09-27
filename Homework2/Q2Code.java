public class Question2 {

  public static void findKNums(int n, int k) {
    // int howMany = pow(2, k);
    double up = n;
    double low = n;

    for (int i = 0; i < k; i++) {
      up = Math.ceil(up / 2);
      low = Math.floor(low / 2);
    }
    System.out.println(up);
    System.out.println(low);
  }

  public static void main(String[] args) {
    Question2.findKNums(12, 3);
  }
}
