package com.smoothiemx.microservicios.usuario.app.services;

import com.smoothiemx.microservicios.usuario.app.entity.Alumno;
import com.smoothiemx.microservicios.usuario.app.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Alumno> findAll() {
        return this.repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        return this.repository.save(alumno);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
}