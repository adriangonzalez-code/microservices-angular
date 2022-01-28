package com.smoothiemx.microservicios.usuario.app.repository;

import com.smoothiemx.microservicio.common.alumnos.app.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {


}