package com.smoothiemx.microservicios.usuario.app.services;

import com.smoothiemx.microservicio.common.alumnos.app.entity.Alumno;
import com.smoothiemx.common.app.services.CommonService;

import java.util.List;

public interface AlumnoService extends CommonService<Alumno> {

    List<Alumno> findByNombreOrApellido(String term);
}