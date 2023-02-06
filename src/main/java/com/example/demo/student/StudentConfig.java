package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student halisa = new Student(
                    "Halisa",
                    "lisa@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 15)
            );
            Student hena = new Student(
                    "Hena",
                    "hena@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 15)
            );

            repository.saveAll(
                        List.of(halisa, hena)
                    );
        };
    }
}
