package com.example.springpostgresqlrestapi.api;


import com.example.springpostgresqlrestapi.dto.PersonDto;
import com.example.springpostgresqlrestapi.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("/add")
    public ResponseEntity<PersonDto> add(@RequestBody PersonDto personDto) {
        return ResponseEntity.ok(personService.save(personDto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonDto>> getList() {
        return ResponseEntity.ok(personService.getAll());
    }
}
