package Lesson6.task1;

public class Main {

public  static void main(String[] args) {
//    Инкримент, постфиксная н префиксная запись

    int value = 5;

    System.out.printf("Значение переменной до операции:" +value );
    value = value + 1;
//    Постфиксная запись
    value++;
//     Префиксная запись
    ++value;
    System.out.printf("Значение переменной:" + value);
    System.out.printf(value++);
    System.out.printf(value);
}


}