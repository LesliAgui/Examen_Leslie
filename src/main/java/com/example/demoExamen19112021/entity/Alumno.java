package com.example.demoExamen19112021.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table( name = "Alumnos")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Alumno {

    //Aqui creamos el id y que sea auto generables en la base de datos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;

    @ElementCollection
    @Column( name ="expediente")
    private List<Expediente> expedientes;

    /*
  public Alumno( int dni, String nombre, String apellido, String direccion, String mail, List<Expediente> expedientes) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.expedientes = expedientes;
    }*/
}
