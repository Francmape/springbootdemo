package com.skilciti.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Service Layer
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Akilimali",
                        "francmape@gmail.com",
                        LocalDate.of(1989, Month.JANUARY, 24),
                        33
                )
        );
    }
}
