package com.fusion.controller;

import com.fusion.model.TargetCompany;
import com.fusion.repository.TargetRepository;
import com.fusion.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fusion/targets")
public class TargetController {

    private final TargetRepository repository;

    @Autowired
    private ReportService reportService;

    public TargetController(TargetRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<TargetCompany> getAllTargets() {
        return repository.findAll();
    }

    @GetMapping("/report")
    public ResponseEntity<byte[]> downloadReport() {
        List<TargetCompany> targets = repository.findAll();
        byte[] pdf = reportService.generateMandaReport(targets);

        return ResponseEntity.ok()
                .header("Content-Type", "application/pdf")
                // A alteração está na linha abaixo: usamos 'inline' em vez de 'attachment'
                .header("Content-Disposition", "inline; filename=valuation_report.pdf")
                .body(pdf);
    }
}