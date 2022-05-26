package com.agrotis.agrotiscrud.controllers;

import com.agrotis.agrotiscrud.model.Schedule;
import com.agrotis.agrotiscrud.repository.ScheduleRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ScheduleController {

    ScheduleRepository repository;

    @GetMapping("/schedule")
    public List<Schedule> index() {
        return repository.findAll();
    }

    @GetMapping("/schedule/{id}")
    public ResponseEntity<Schedule> find(@PathVariable Long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/schedule")
    public Schedule store(@RequestBody Schedule scheduleData) {
        return repository.save(scheduleData);
    }

    @DeleteMapping("/schedule/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/schedule/{id}")
    public ResponseEntity<Schedule> update(@PathVariable Long id, @RequestBody Schedule scheduleData){
        return repository.findById(id)
                .map(record -> {
                    record.setStartDate(scheduleData.getStartDate());
                    record.setEndDate(scheduleData.getEndDate());
                    record.setName(scheduleData.getName());
                    record.setNote(scheduleData.getNote());
                    record.setProperty(scheduleData.getProperty());
                    record.setLaboratory(scheduleData.getLaboratory());
                    return ResponseEntity.ok().body(repository.save(record));
                })
                .orElse(ResponseEntity.notFound().build());
    }

}
