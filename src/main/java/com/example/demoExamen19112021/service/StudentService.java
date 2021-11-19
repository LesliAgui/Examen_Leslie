package com.example.demoExamen19112021.service;

import com.example.demoExamen19112021.entity.Alumno;
import com.example.demoExamen19112021.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    AlumnoRepository alumnoRepository;

    public void addAlumno(Alumno alumno) {

        alumnoRepository.AddAlumno(alumno);
    }

    public List<Alumno> getListAlumno() {

        return alumnoRepository.getAll();
    }


    public List<Alumno> getAlumnos() {
        return null;
    }

    public void deleteAlumno(Integer id) {

        alumnoRepository.deleteAlumno(id);
    }

    public void updateAlumno(Alumno alumno) {
        alumnoRepository.updateAlumno(alumno);
    }
}
