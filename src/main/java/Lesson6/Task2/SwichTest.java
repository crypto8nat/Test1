package Lesson6.Task2;

public class SwichTest {

    public static void main(String[] args) {

        int value = 20;
        int b = 5;

        switch (value) {
            case 1:
                System.out.println("Значение переменной равно 1.");
                break;
            case 2:
                if (b == 5) {
                System.out.println("Значение переменной равно 5.");
                break;
            }
            System.out.println("Значение переменной равно 2.");
            break;
            case 5:
            case 6:
            case 7:
                System.out.println("Значение переменной равно 5, или 6, или 7.");
                break;
            default:
                System.out.println("Это какое-то другое значение.");

        }
        System.out.println("Конец программы.");

    }
}

