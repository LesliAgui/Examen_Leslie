package com.example.demoExamen19112021.repository;

import com.example.demoExamen19112021.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Repository
public class AlumnoRepository {

    @Autowired
    AlumnoRepositoryDao alumnoRepository;

    //Metodo creeacion de alumnos
    public void AddAlumno(Alumno alumno)
    {
        alumnoRepository.save(alumno);
    }

    //Get no necesita parametros
    public List<Alumno>  getAll() {

        return (List<Alumno>) alumnoRepository.findAll();
    }

        //Delete Alumnos
        public void deleteAlumno(Integer id){

        alumnoRepository.deleteById(id);
        }

        //Modificar Alumnos
        public void updateAlumno(Alumno alumno) {
            alumnoRepository.save(alumno);
        }




}
