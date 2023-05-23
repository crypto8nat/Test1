package lesson5.task2;

public class NestedifTest {

    public static  void  main(String[] args) {

        int a = 17;
        int b = 15;
        int c = 20;

        if (a < b) {
            System.out.printf("А меньше, чем B");
            if  (a < c) {
                System.out.printf("И при этом А меньше, чем С");
            }
        }
    }
}
