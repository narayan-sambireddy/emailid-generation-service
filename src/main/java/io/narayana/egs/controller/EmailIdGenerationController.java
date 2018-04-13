package io.narayana.egs.controller;

import io.narayana.egs.repo.EmailIdSequenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static io.narayana.egs.entity.EmailIdSequence.newInstance;

/**
 * @author narayana
 */
@RestController
@RequestMapping("/emailid")
public class EmailIdGenerationController {

    @Autowired
    private EmailIdSequenceRepo repo;

    @GetMapping("/generate")
    public String generate(@Value("${emailid.prefix}") String prefix, @Value("${emailid.suffix}") String suffix) {
        return prefix + repo.save(newInstance()).getId() + suffix;
    }
}
