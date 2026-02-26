package comstudent;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        return repo.save(s);
    }
}
