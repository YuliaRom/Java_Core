public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][];
        String[] first = new String[]{"5", "7", "9", "11"};
        String[] second = new String[]{"15", "17", "19", "21"};
        String[] third = new String[]{"25", "27", "29", "31"};
        String[] fourth = new String[]{"35", "37", "39", "41"};
        array[0] = first;
        array[1] = second;
        array[2] = third;
        array[3] = fourth;

        ArrayHandler handler = new ArrayHandler();

        try {
            int result = handler.handle(array);
            System.out.println(result);
        } catch (RuntimeException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }
        System.out.println("Конец программы");
    }
}
