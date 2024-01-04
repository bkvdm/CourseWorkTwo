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

//    @GetMapping("/{amount}")
    @GetMapping("/count")
//    public Collection<Question> getQuestion(int amount) {
    public Collection<Question> getQuestion(@RequestParam(value = "q", required = false) int amount) {
        return examinerService.getQuestion(amount);
    }
}
//    ”/exam/get/{amount}
