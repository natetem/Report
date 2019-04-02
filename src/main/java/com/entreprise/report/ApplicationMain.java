package com.entreprise.report;

import com.entreprise.report.service.ReportService;

import java.io.IOException;

public class ApplicationMain {

public static  final ReportService reportService=new ReportService();
    public static void main(String args[]) throws IOException {
        if (args.length == 3) {
            String fileInput = args[0];
            String type = args[1];
            String fileOutPut = args[2];
            reportService.runReport(fileInput, fileOutPut, type);
        } else {
            System.out.println("vous devez saisir au moins trois paramètres");
        }
    }
}
