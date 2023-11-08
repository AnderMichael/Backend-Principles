package principles_and_acronyms.kiss.task;

import java.util.ArrayList;
import java.util.List;

class StudentRegistrationSystem {

    List<Student> registeredStudents = new ArrayList<>();
    List<Course> availableCourses = new ArrayList<>();

    /*
    boolean registerStudent(Student student, Course course) {
        //IF's anidados innecesarios
        if (student != null && course != null) {
            if (!registeredStudents.contains(student)) {
                if (availableCourses.contains(course)) {

                // Existe un metodo para verificar la existencia de un curso

                    for (Course c : student.getCourses()) {
                        if (c.equals(course)) {
                            // El estudiante ya está registrado en el curso
                            return false;
                        }
                    }
                    // Lógica de registro
                    student.getCourses().add(course);
                    registeredStudents.add(student);
                    return true;
                } else {
                    // Curso no disponible
                    return false;
                }
            } else {
                // El estudiante ya está registrado
                return false;
            }
        } else {
            // Datos nulos
            throw new IllegalArgumentException("Estudiante o curso no pueden ser nulos");
        }
    }
    */

    boolean registerStudent(Student student, Course course) {
        if (student != null && course != null) {
            // Datos Nulos
            throw new IllegalArgumentException("Estudiante o curso no pueden ser nulos");
        }
        if (!registeredStudents.contains(student)) {
            // Estudiante ya registrado
            return false;
        }
        if (availableCourses.contains(course)) {
            // Curso no disponible
            return false;
        }
        // Existe un metodo para verificar la existencia de un curso, no hay necesidad de un for
        if (student.getCourses().contains(course)) {
            return false;
        }
        // Lógica de registro
        student.getCourses().add(course);
        registeredStudents.add(student);
        return true;
    }
}

public class Task4 {
}
