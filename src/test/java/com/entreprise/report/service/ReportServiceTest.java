package com.entreprise.report.service;

import com.entreprise.report.model.Result;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReportServiceTest {

    ReportService service =new ReportService();

    String inputFile= "src/main/resources/test.txt";
    String outFile= "src/main/resources/testResult.json";
    String type= "XML";

    @Test
    void should_return_four_references() throws IOException {
        Result result=service.productReport(inputFile);
        assertEquals(result.getReferences().size(), 4);
    }

    @Test
    void should_return_one_error() throws IOException {
        Result result=service.productReport(inputFile);
        assertEquals(result.getErrors().size(), 1);
    }

    @Test
    void should_return_name_file_test() throws IOException {
        Result result=service.productReport(inputFile);
        assertTrue(result.getInputFile().contains("test"));
    }


}