package com.solid.report.service;

import com.solid.report.model.Report;

public interface ReportSaver {
    void save(Report report, String filePath);
} 