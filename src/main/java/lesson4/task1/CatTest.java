package lesson4.task1;

public class CatTest {
    public static void main(String[] args) {
        System.out.println("Перед созданием кота.");
        Cat firstCat = new Cat();
        System.out.println("Послее создания кота.");

        System.out.println("Создаем второго кота.");
        Cat secondCat = new Cat(7);

        System.out.println("Возраст первого кота:");
        System.out.println(firstCat.age);

        System.out.println("Возраст второго кота.");
        System.out.println(secondCat.age);

        System.out.println("Создаем третьего кота");
        Cat thirdCat = new Cat("Черный");

        System.out.println("Создаем четвертого кота");
        Cat fourthCat = new Cat(3, "Рыжый");

        System.out.println("Возраст четвертого кота:");
        System.out.println(fourthCat.age);
        System.out.println("Цвет четвертого кота");
        System.out.println(fourthCat);

        //  Так мы можем писать комментарии.

    }
}
