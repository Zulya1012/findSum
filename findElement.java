public class findElement {

  public static void main(String[] arg) {

    int nums[] = {
      14,
      16,
      15,
      25,
      2,
      3
    };
    int a = nums.length;

    int b = 46;

    System.out.println("Given value: " + b);
    System.out.println("Combination of four elements:");

    for (int i = 0; i < a - 3; i++) {
      for (int j = i + 1; j < a - 2; j++) {

        for (int k = j + 1; k < a - 1; k++) {

          for (int l = k + 1; l < a; l++) {

            if (nums[i] + nums[j] + nums[k] + nums[l] == b)
              System.out.println(nums[i] + " " + nums[j] + " " + nums[k] + " " + nums[l]);

          }
        }
      }
    }

  }
}
