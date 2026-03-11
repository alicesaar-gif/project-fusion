package com.fusion.controller;

import com.fusion.model.TargetCompany;
import com.fusion.repository.TargetRepository;
import com.fusion.service.ReportService; // Importando o serviço de PDF
import org.springframework.beans.factory.annotation.Autowired; // Importando o Autowired
import org.springframework.http.ResponseEntity; // Importando o ResponseEntity
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
                .header("Content-Disposition", "attachment; filename=valuation_report.pdf")
                .body(pdf);
    }
}