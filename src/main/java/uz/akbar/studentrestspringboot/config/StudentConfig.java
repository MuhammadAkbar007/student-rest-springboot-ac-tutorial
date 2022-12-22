package uz.akbar.studentrestspringboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.akbar.studentrestspringboot.entity.Student;
import uz.akbar.studentrestspringboot.repository.StudentRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student("Mariam", "mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 25));
            Student jamal = new Student("Jamal", "jamal@inbox.ru", LocalDate.of(2002, Month.MARCH, 12));
            studentRepository.saveAll(List.of(mariam, jamal));
        };
    }
}