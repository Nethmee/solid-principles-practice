package com.solid.report.service;

import com.solid.report.model.Report;

public class ConsoleReportPrinter implements ReportPrinter {
    @Override
    public void print(Report report) {
        System.out.println("Report Title: " + report.getTitle());
        System.out.println("Report Content: " + report.getContent());
    }
} 