package com.agrotis.agrotiscrud.controllers;

import com.agrotis.agrotiscrud.model.Property;
import com.agrotis.agrotiscrud.repository.PropertyRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PropertyController {

    PropertyRepository repository;

    @GetMapping("/property")
    public List<Property> index() {
        return repository.findAll();
    }

}
