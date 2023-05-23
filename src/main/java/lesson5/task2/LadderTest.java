package lesson5.task2;

public class LadderTest {
    public  static  void  main(String[] args) {

        int a = 15;
        int b = 15;

        if (a < b) {
            System.out.printf("А меньше, чем B");
        } else  if (a > b) {
            System.out.printf("А больше, чем B");
        } else {
            System.out.printf("А равно В");
        }
         if (!(a < b)) {
             System.out.printf("А меньше, чем B");
         }
    }
}
