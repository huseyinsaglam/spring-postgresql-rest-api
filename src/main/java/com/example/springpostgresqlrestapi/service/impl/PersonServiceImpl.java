package com.example.springpostgresqlrestapi.service.impl;

import com.example.springpostgresqlrestapi.dto.PersonDto;
import com.example.springpostgresqlrestapi.entity.Person;
import com.example.springpostgresqlrestapi.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public PersonDto save(Person Dto) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public PersonDto getAll(PersonDto personDto) {
        return null;
    }

    @Override
    public Page<PersonDto> getAll(Pageable pageable) {
        return null;
    }
}
