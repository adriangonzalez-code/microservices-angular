package com.smoothiemx.microservicio.examenes.app.repository;

import com.smoothiemx.microservicio.examenes.app.entity.Examen;
import org.springframework.data.repository.CrudRepository;

public interface ExamenRepository extends CrudRepository<Examen, Long> {
}