package com.example.demo.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student romeo= new Student("romeo","romeo@outlook.com", LocalDate.of(1999,8,4));
           Student alket= new Student("alket","alket@outlook.com", LocalDate.of(1995,4,14));

            repository.saveAll(
                    List.of(romeo,alket)
            );
        };
    }
}
