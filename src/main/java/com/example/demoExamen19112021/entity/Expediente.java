package com.example.demoExamen19112021.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table( name ="Expedientes")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fechaInsc;
    private int calificacion;
    private String fechaFin;
    //private Curso curso;


    //Linea para crear el forein key
    @OneToOne(cascade = CascadeType.ALL)
    private Curso curso;


    public Expediente(String fechaInsc, int calificacion, String fechaFin, Curso curso) {
        this.fechaInsc = fechaInsc;
        this.calificacion = calificacion;
        this.fechaFin = fechaFin;
        this.curso = curso;
    }
}
