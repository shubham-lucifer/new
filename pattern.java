public class pattern {
      public static void main(String args[]) {
            int n = 4;

            // 180 degree half pyramid
            for (int i = 1; i <= n; i++) {
                  // inner loop -- space printing
                  for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                  }

                  // again inner loop -- start printing
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }
}
