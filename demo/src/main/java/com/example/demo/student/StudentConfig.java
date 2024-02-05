package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student metehan = new Student(
                    "Metehan",
                    "mete@gmail.com",
                    LocalDate.of(1999, JANUARY, 1));
            Student can = new Student(
                    "Can",
                    "can@gmail.com",
                    LocalDate.of(1997, FEBRUARY, 3)
            );
            studentRepository.saveAll(
                    List.of(metehan, can)
            );

        };
    }

}
