package com.smoothiemx.microservicio.curso.app.repository;

import com.smoothiemx.microservicio.curso.app.entity.Curso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CursosRepository extends CrudRepository<Curso, Long> {

    @Query("select c from Curso c join fetch c.alumnos a where a.id = ?1")
    Curso findCursoByAlumnoId(Long id);
}