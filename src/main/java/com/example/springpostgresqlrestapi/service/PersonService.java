package com.example.springpostgresqlrestapi.service;

import com.example.springpostgresqlrestapi.dto.PersonDto;
import com.example.springpostgresqlrestapi.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

    PersonDto save(Person Dto);

    Boolean delete(Long id);

    PersonDto getAll(PersonDto personDto);

    Page<PersonDto> getAll(Pageable pageable);
}
