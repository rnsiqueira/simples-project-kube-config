package br.com.rns.extract.csv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExtractCsvFilesTest {

    private static final String PATH = "src/test/resources/csv/quarter.csv";
    private Reader readerFile;


    @Before
    public void setUp() throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(PATH));
        String[] readerDatas = reader.readNext();

        for (int i = 0; i < readerDatas.length; i++) {
            System.out.println(readerDatas[i]);
        }
    }

    @Test
    public void readDataInCsv() {


    }
}
