package com.smoothiemx.microservicios.usuario.app.controllers;

import com.smoothiemx.microservicio.common.app.controllers.CommonController;
import com.smoothiemx.microservicios.usuario.app.entity.Alumno;
import com.smoothiemx.microservicios.usuario.app.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService> {

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
        Optional<Alumno> o = super.service.findById(id);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Alumno alumnoDb = o.get();
        alumnoDb.setNombre(alumno.getNombre());
        alumnoDb.setApellido(alumno.getApellido());
        alumnoDb.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(super.service.save(alumnoDb));
    }
}