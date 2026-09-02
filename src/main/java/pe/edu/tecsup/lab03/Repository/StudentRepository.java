package pe.edu.tecsup.lab03.Repository;

import pe.edu.tecsup.lab03.Entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private final List<StudentEntity> estudiantes = new ArrayList<>();

    public StudentEntity guardar(StudentEntity estudiante) {
        estudiantes.add(estudiante);
        return estudiante;
    }

}
