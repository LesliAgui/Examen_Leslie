package com.example.demoExamen19112021.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Table(name = "Cursos")
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ElementCollection
    @Column(name = "contenido")
    private List<Contenido> con;

    public Curso()
    {

    }

    public Curso(List<Contenido> con) {
        this.con = con;
    }
}
