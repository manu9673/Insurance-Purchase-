package com.example.insurance.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api")
public class DownloadController {

    @GetMapping("/download/{policyId}")
    public ResponseEntity<Resource> downloadPolicy(@PathVariable String policyId) throws IOException {
        Path filePath = Paths.get("storage/policies/" + policyId + ".pdf");
        Resource resource = new UrlResource(filePath.toUri());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filePath.getFileName())
                .body(resource);
    }
}
