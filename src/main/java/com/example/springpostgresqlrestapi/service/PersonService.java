package com.example.springpostgresqlrestapi.service;

import com.example.springpostgresqlrestapi.dto.PersonDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonService {

    PersonDto save(PersonDto Dto);

    Boolean delete(Long id);

    List<PersonDto> getAll();

    Page<PersonDto> getAll(Pageable pageable);
}
