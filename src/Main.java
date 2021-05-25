import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"One", "Two", "Three", "Four", "Five"};
        changeArrayElements(array, 2, 4);
        System.out.println(Arrays.toString(array));
        System.out.println("");

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();

        Box<Apple> appleBox = new Box<>();

        appleBox.add(apple1);
        appleBox.add(apple2);
        appleBox.add(apple3);
        appleBox.add(apple4);
        appleBox.add(apple5);
        appleBox.add(apple6);
        appleBox.add(apple7);
        System.out.println("Вес коробки с 7 яблоками: " + appleBox.getWeight());

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        Box<Orange> orangeBox = new Box<>();

        orangeBox.add(orange1);
        orangeBox.add(orange2);
        orangeBox.add(orange3);
        orangeBox.add(orange4);
        System.out.println("Вес коробки с 4 апельсинами: " + orangeBox.getWeight());

        System.out.println("");
        System.out.println("Равен ли вес коробок: " + appleBox.compare(orangeBox));

        Box<Apple> appleBoxShifted = new Box<>();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Apple apple10 = new Apple();
        appleBoxShifted.add(apple8);
        appleBoxShifted.add(apple9);
        appleBoxShifted.add(apple10);

        System.out.println("");
        System.out.println("Вес новой коробки с яблоками: " + appleBoxShifted.getWeight());

        appleBox.pour(appleBoxShifted);

        System.out.println("");
        System.out.println("Вес первой коробки после того, как мы пересыпали из нее яблоки: " + appleBox.getWeight());
        System.out.println("Вес новой коробки после того, как мы досыпали туда яблоки: " + appleBoxShifted.getWeight());

    }


      public static void changeArrayElements(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}



