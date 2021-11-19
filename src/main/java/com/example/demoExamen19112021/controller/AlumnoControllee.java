package com.example.demoExamen19112021.controller;

import com.example.demoExamen19112021.entity.Alumno;
import com.example.demoExamen19112021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoControllee {

    @Autowired

    private StudentService service;

    @PostMapping
    public ResponseEntity<Alumno> addAlumno(@RequestBody Alumno alumno) {
        System.out.println("Solicitud Realizada");
        service.addAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }

    @GetMapping
    public List<Alumno> getAlumnos()

    {
        return  service.getListAlumno();
    }

    @DeleteMapping("/eliminarUno/{id}")
    public void deleteALumno(@PathVariable("id") Integer id){
        System.out.println("Transaccion Realizada");
        service.deleteAlumno(id);

    }

    @PutMapping("/update")
    public ResponseEntity<Alumno> uodateAlumno(@RequestBody Alumno alumno)
    {
        System.out.println("Transaccion Realizada");
        service.updateAlumno(alumno);

        return ResponseEntity.ok(alumno);
    }

}
