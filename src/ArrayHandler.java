public class ArrayHandler {
    public int handle(String[][] array) {
        if (array.length != 4) {
            throwMyArraySizeException();
        }
        for (String[] innerArray : array) {
            if (innerArray == null || innerArray.length != 4) {
                throwMyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Неверные данные в ячейке: " + i + " " + j);
                }
            }
        }
        return sum;
    }

    private void throwMyArraySizeException() {
        throw new MyArraySizeException("Размер массива не равен 4 x 4");
    }
}
