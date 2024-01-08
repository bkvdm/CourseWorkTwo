package tel.bvm.courseworktwo.controller;

import org.springframework.web.bind.annotation.*;
import tel.bvm.courseworktwo.scheme.Question;
import tel.bvm.courseworktwo.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/get")
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("{amount}")
    public Collection<Question> getQuestion(@PathVariable int amount) {
        return examinerService.getQuestion(amount);
    }
}
//    ”/exam/get/{amount}