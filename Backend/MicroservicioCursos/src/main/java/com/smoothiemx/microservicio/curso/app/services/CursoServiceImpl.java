package com.smoothiemx.microservicio.curso.app.services;

import com.smoothiemx.common.app.services.CommonServiceImpl;
import com.smoothiemx.microservicio.curso.app.entity.Curso;
import com.smoothiemx.microservicio.curso.app.repository.CursosRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursosRepository> implements CursoService {

    @Override
    @Transactional(readOnly = true)
    public Curso findCursoByAlumnoId(Long id) {
        return repository.findCursoByAlumnoId(id);
    }
}