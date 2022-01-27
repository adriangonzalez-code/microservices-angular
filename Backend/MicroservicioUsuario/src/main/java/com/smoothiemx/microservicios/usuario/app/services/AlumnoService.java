package com.smoothiemx.microservicios.usuario.app.services;

import com.smoothiemx.microservicios.usuario.app.entity.Alumno;

import java.util.Optional;

public interface AlumnoService {

    Iterable<Alumno> findAll();

    Optional<Alumno> findById(Long id);

    Alumno save(Alumno alumno);

    void deleteById(Long id);
}