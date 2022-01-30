package com.smoothiemx.microservicio.curso.app.controllers;

import com.smoothiemx.microservicio.common.alumnos.app.entity.Alumno;
import com.smoothiemx.common.app.controllers.CommonController;
import com.smoothiemx.microservicio.curso.app.entity.Curso;
import com.smoothiemx.microservicio.curso.app.services.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {

    @PutMapping("/{id}")
    public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id) {
        Optional<Curso> o = super.service.findById(id);

        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Curso dbCurso = o.get();
        dbCurso.setNombre(curso.getNombre());
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCurso));
    }

    @PutMapping("/{id}/asignar-alumnos")
    public ResponseEntity<?> asignarAlumnos(@RequestBody List<Alumno> alumnos, @PathVariable Long id) {
        Optional<Curso> o = super.service.findById(id);

        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Curso dbCurso = o.get();
        alumnos.forEach(a -> {
            dbCurso.addAlumno(a);
        });

        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCurso));
    }

    @PutMapping("/{id}/eliminar-alumno")
    public ResponseEntity<?> eliminarAlumno(@RequestBody Alumno alumno, @PathVariable Long id) {
        Optional<Curso> o = super.service.findById(id);

        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Curso dbCurso = o.get();
        dbCurso.removeAlumno(alumno);

        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCurso));
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity<?> buscarPorAlumnoId(@PathVariable Long id) {
        Curso curso = service.findCursoByAlumnoId(id);
        return ResponseEntity.ok(curso);
    }
}