package com.smoothiemx.microservicios.usuario.app.services;

import com.smoothiemx.microservicio.common.alumnos.app.entity.Alumno;
import com.smoothiemx.common.app.services.CommonServiceImpl;
import com.smoothiemx.microservicios.usuario.app.repository.AlumnoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

    @Override
    @Transactional(readOnly = true)
    public List<Alumno> findByNombreOrApellido(String term) {
        return repository.findByNombreOrApellido(term);
    }
}