package tel.bvm.courseworktwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
    public Collection<Question> getQuestion(int amount) {
        return examinerService.getQuestion(amount);
    }
}
//    ”/exam/get/{amount}