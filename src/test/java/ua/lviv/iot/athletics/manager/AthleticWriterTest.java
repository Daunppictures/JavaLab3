package ua.lviv.iot.athletics.manager;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.jupiter.api.Test;

public class AthleticWriterTest extends AthleticsManagerTest {
    AthleticsWriter athleticWriter = new AthleticsWriter();
    
    @Test
    void writingAFileTest() throws IOException {
        try (Writer csvWriter = new FileWriter("AthleticWriter.csv")) {
            athleticWriter.setCsvWriter(csvWriter);
            athleticWriter.writeToFile(athletics);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
