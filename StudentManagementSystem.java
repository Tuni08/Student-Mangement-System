package comstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystem {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystem.class, args);
        System.out.println("Application Started");
    }
}
