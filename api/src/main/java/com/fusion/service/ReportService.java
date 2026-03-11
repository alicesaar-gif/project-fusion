package com.fusion.service;

import com.fusion.model.TargetCompany;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.stereotype.Service;
import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class ReportService {
    public byte[] generateMandaReport(List<TargetCompany> targets) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(out);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        document.add(new Paragraph("PROJECT FUSION - RELATÓRIO EXECUTIVO DE M&A").setFontSize(20).setBold());
        document.add(new Paragraph("Análise Consolidada de Targets Gerada via API").setItalic());

        for (TargetCompany target : targets) {
            document.add(new Paragraph("Empresa: " + target.getName() + 
                                       " | Setor: " + target.getSector() + 
                                       " | Valuation: US$ " + target.getValuation() + "M"));
        }

        document.close();
        return out.toByteArray();
    }
}