package com.smoothiemx.microservicio.curso.app.repository;

import com.smoothiemx.microservicio.curso.app.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursosRepository extends CrudRepository<Curso, Long> {
}