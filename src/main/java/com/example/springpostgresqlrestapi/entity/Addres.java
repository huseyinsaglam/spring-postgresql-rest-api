package com.example.springpostgresqlrestapi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person_addres")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id"})
public class Addres implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_person_addres", allocationSize = 1)
    @GeneratedValue(generator = "seq_person_addres", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String addres;
    private Boolean aktif;
    @Enumerated
    private AddresType addresType;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
