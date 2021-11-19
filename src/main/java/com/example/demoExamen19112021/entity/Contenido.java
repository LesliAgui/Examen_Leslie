package com.example.demoExamen19112021.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Contenidos")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private int duracion;
    private String descripcion;

    public  Contenido()
    {

    }
    public Contenido(Integer id, String nombre, int duracion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }
}
