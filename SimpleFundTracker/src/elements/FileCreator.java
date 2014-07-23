package elements;

import java.io.File;
import java.io.IOException;



public class FileCreator {
    private final File FUND_FILE;

    public FileCreator() throws IOException {
        FUND_FILE = new File("/Users/brandonbarrett/fundFile.txt");

        if (!FUND_FILE.exists()) {
            FUND_FILE.createNewFile();
        } else {
            System.out.println("File already exists.");
        }
    }

    public File getFundFile() {
        return FUND_FILE;
    }
}



