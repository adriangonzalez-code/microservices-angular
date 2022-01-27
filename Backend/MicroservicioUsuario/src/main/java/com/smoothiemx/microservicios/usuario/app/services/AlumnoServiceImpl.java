package com.smoothiemx.microservicios.usuario.app.services;

import com.smoothiemx.microservicio.common.app.services.CommonServiceImpl;
import com.smoothiemx.microservicios.usuario.app.entity.Alumno;
import com.smoothiemx.microservicios.usuario.app.repository.AlumnoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {
}