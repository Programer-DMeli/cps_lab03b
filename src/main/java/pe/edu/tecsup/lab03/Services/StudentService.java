package pe.edu.tecsup.lab03.Services;

import pe.edu.tecsup.lab03.Repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepository();
    }
}
