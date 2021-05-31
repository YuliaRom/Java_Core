import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        Csv handler = new Csv();

        String[] header = new String[]{"A", "B", "C", "D", "E"};

        int[][] data = new int[10][];
        Random random = new Random();

        for (int j = 0; j < data.length; j++) {
            data[j] = new int[5];
            for (int i = 0; i < data[j].length; i++) {
                data[j][i] = random.nextInt();
            }
        }

        AppData toWrite = new AppData(header, data);


        String path = "F:\\GEEKBRAINS\\Java_Core\\my-file.csv";

        if (handler.write(toWrite, path)) {
            System.out.println("Запись файла произведена.");
            AppData result = handler.read(path);

            if (result != null) {
                System.out.println("Прочитан CSV файл:");
                System.out.println(result);
            } else {
                System.out.println("Путь указан неверно.");
            }
        } else {
            System.out.println("Запись не произведена.");
        }
    }
}

