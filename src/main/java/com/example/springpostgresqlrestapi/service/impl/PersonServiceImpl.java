package com.example.springpostgresqlrestapi.service.impl;

import com.example.springpostgresqlrestapi.dto.PersonDto;
import com.example.springpostgresqlrestapi.entity.Addres;
import com.example.springpostgresqlrestapi.entity.AddresType;
import com.example.springpostgresqlrestapi.entity.Person;
import com.example.springpostgresqlrestapi.repository.AddresRepository;
import com.example.springpostgresqlrestapi.repository.PersonRepository;
import com.example.springpostgresqlrestapi.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final AddresRepository addresRepository;

    @Override
    @Transactional
    public PersonDto save(PersonDto Dto) {
        Person person = new Person();
        person.setName(Dto.getName());
        person.setSurname(Dto.getSurname());
        personRepository.save(person);

        List<Addres> addresList = new ArrayList<>();
        Dto.getAddres().forEach(item ->
        {
            Addres addres = new Addres();
            addres.setAddres(item);
            addres.setAddresType(AddresType.EV_ADRESI);
            addres.setAktif(true);
            addres.setPerson(person);
            addresList.add(addres);
        });
        addresRepository.saveAll(addresList);
        Dto.setId(person.getId());

        return Dto;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public List<PersonDto> getAll() {
        List<Person> personList =  personRepository.findAll();

        List<PersonDto> personDtos = new ArrayList<>();
        personList.forEach(item -> {
            PersonDto personDto = new PersonDto();
            personDto.setId(item.getId());
            personDto.setName(item.getName());
            personDto.setSurname(item.getSurname());
            personDto.setAddres(item.getAddres().stream().map(i->
                i.getAddres()).collect(Collectors.toList()));
            personDtos.add(personDto);
        });
        return personDtos;
    }

    @Override
    public Page<PersonDto> getAll(Pageable pageable) {
        return null;
    }
}
