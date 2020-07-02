package ua.lviv.iot.athletics.manager;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.athletics.rest.model.AbstractAthletics;

public class AthleticsWriter {
    
    public Writer csvWriter = new StringWriter();

    public Writer getCsvWriter() {
        return csvWriter;
    }

    public void setCsvWriter(Writer cvsWriter) {
        this.csvWriter = cvsWriter;
    }

    @Override
    public String toString() {
        return csvWriter.toString();
    }
    
    public void writeToFile(List<AbstractAthletics> athletics) throws IOException {
        try {
            csvWriter.write(athletics.get(0).getHeaders());
            csvWriter.write("\n");
            
            for (AbstractAthletics athletic : athletics) {
                csvWriter.write(athletic.toString());
                csvWriter.write("\n");
            }
            csvWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            csvWriter.close();
        }
        
    }
    
    
    
}
