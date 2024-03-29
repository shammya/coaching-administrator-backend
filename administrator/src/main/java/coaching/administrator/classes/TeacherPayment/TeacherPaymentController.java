
package coaching.administrator.classes.TeacherPayment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

import coaching.administrator.classes.Global.Global;

@RestController
public class TeacherPaymentController {

    @Autowired
    private TeacherPaymentRepository repository;

    @PostMapping("/add-teacher-payment")
    public TeacherPayment addTeacherPayment(@RequestBody TeacherPayment teacherPayment) {
        return repository.save(teacherPayment);
    }

    @GetMapping("/get-teacher-payment-by-id/{id}")
    public TeacherPayment getTeacherPaymentById(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    // @GetMapping("/helloworld")
    // public String helloWorld() {
    // System.out.println("\033[31minside spring boot hello world.\033[0m");
    // return "Hello Spring Boot";
    // }

    @PutMapping("/update-teacher-payment")
    public TeacherPayment updateTeacherPayment(@RequestBody TeacherPayment teacherPayment) {
        return repository.save(teacherPayment);
    }

    @DeleteMapping("/delete-teacher-payment-by-id/{id}")
    public String deleteTeacherPayment(@PathVariable Integer id) {
        repository.deleteById(id);
        return "teacher payment with id " + id + " successfully deleted";
    }

    @GetMapping("/get-all-payment-by-teacher-id/{teacherId}")
    public List<TeacherPayment> getAllPaymentByTeacherId(@PathVariable Integer teacherId) {
        return repository.findAllByTeacherId(teacherId);
    }
}
