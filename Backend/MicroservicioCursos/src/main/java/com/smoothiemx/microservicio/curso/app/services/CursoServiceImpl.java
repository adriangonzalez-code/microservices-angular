package com.smoothiemx.microservicio.curso.app.services;

import com.smoothiemx.microservicio.common.app.services.CommonServiceImpl;
import com.smoothiemx.microservicio.curso.app.entity.Curso;
import com.smoothiemx.microservicio.curso.app.repository.CursosRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursosRepository> implements CursoService {
}