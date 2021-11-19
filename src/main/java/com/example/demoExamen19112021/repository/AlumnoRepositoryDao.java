package com.example.demoExamen19112021.repository;

import com.example.demoExamen19112021.entity.Alumno;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface AlumnoRepositoryDao extends CrudRepository<Alumno, Integer> {


}
