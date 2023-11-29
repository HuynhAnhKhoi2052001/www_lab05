package com.example.resources;

import com.example.services.CandidateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateResource {
    private final CandidateService service;

    public CandidateResource(CandidateService service) {
        this.service = service;
    }
}
