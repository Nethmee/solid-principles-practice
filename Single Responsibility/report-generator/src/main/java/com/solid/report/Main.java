package com.solid.report;

import com.solid.report.model.Report;
import com.solid.report.service.ConsoleReportPrinter;
import com.solid.report.service.FileReportSaver;
import com.solid.report.service.ReportPrinter;
import com.solid.report.service.ReportSaver;

public class Main {
    public static void main(String[] args) {
        // Create a sample report
        Report report = new Report("Monthly Sales Report", "Total sales: $50,000");

        // Print to console
        ReportPrinter printer = new ConsoleReportPrinter();
        printer.print(report);

        // Save to file
        ReportSaver saver = new FileReportSaver();
        saver.save(report, "report.txt");
    }
} 