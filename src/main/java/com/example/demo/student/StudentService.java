package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Marios",
                        "marios.m@gmail.com",
                        LocalDate.of(2000, Month.JUNE, 5),
                        21
                ) //When I run the app it will give an array of objects.
        );
    }
}
