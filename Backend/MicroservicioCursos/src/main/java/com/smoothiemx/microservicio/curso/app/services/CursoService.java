package com.smoothiemx.microservicio.curso.app.services;

import com.smoothiemx.common.app.services.CommonService;
import com.smoothiemx.microservicio.curso.app.entity.Curso;

public interface CursoService extends CommonService<Curso> {

    Curso findCursoByAlumnoId(Long id);
}