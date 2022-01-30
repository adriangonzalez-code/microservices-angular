package com.smoothiemx.microservicio.examenes.app.services;

import com.smoothiemx.common.app.services.CommonServiceImpl;
import com.smoothiemx.microservicio.examenes.app.entity.Examen;
import com.smoothiemx.microservicio.examenes.app.repository.ExamenRepository;
import org.springframework.stereotype.Service;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {
}