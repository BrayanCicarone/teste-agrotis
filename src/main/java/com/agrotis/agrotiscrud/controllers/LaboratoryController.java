package com.agrotis.agrotiscrud.controllers;

import com.agrotis.agrotiscrud.model.Laboratory;
import com.agrotis.agrotiscrud.repository.LaboratoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class LaboratoryController {

    LaboratoryRepository repository;

    @GetMapping("/laboratory")
    public List<Laboratory> index() {
        return repository.findAll();
    }

}
