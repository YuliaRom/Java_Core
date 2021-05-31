import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Csv {

    public boolean write(AppData appData, String path) {
        String stringToWrite = convertAppDataToCsvFormat(appData);
        File file = new File(path);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            fos.write(stringToWrite.getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (IOException e) {
            return false;
        }
    }


    private String convertAppDataToCsvFormat(AppData appData) {
        String stringToWrite = "";
        String[] header = appData.getHeader();
        for (int i = 0; i < header.length; i++) {
            stringToWrite += header[i];
            if (i != header.length - 1) {
                stringToWrite += ";";
            }
        }

        int[][] data = appData.getData();
        for (int i = 0; i < data.length; i++) {
            stringToWrite += "\n";
            for (int j = 0; j < data[i].length; j++) {
                stringToWrite += data[i][j];
                if (j != data[i].length - 1) {
                    stringToWrite += ";";
                }
            }
        }
        return stringToWrite;
    }


    public AppData read(String path) throws Exception {
        File file = new File(path);
        if (file.exists()) {
            List<String> stringList = Files.readAllLines(file.toPath());
            String[] header = stringList.get(0).split(";");

            int[][] data = new int[stringList.size() - 1][];
            for (int i = 1; i < stringList.size(); i++) {
                String[] stringData = stringList.get(i).split(";");
                int[] lineData = new int[stringData.length];
                for (int j = 0; j < stringData.length; j++) {
                    lineData[j] = Integer.parseInt(stringData[j]);
                }
                data[i - 1] = lineData;
            }
            return new AppData(header, data);
        } else {
            return null;
        }
    }
}


