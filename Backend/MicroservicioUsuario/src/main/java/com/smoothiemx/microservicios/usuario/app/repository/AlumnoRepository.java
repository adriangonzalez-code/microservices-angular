package com.smoothiemx.microservicios.usuario.app.repository;

import com.smoothiemx.microservicios.usuario.app.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {


}