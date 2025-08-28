package weekly_tasks_from_Troy;

public class Week04_Reverse_Numbers {

      /*
    Write a return method that can reverse
negative number and return it as int
     */
      public static int reverse(int number) {
          int reversed = 0;
          if (number < 0) {
              while (number < 0) {
                  int digit = number % 10;
                  reversed = reversed * 10 + digit;
                  number /= 10;
              }

          }
          return reversed;
      }

    public static void main(String[] args) {
        System.out.println("reversed= " + reverse(-3219));
    }
}

