package com.solid.report.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.solid.report.model.Report;

public class FileReportSaver implements ReportSaver {
    @Override
    public void save(Report report, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Report Title: " + report.getTitle());
            writer.println("Report Content: " + report.getContent());
        } catch (IOException e) {
            throw new RuntimeException("Failed to save report to file: " + filePath, e);
        }
    }
} 