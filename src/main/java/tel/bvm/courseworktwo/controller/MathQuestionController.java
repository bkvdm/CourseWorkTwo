package tel.bvm.courseworktwo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tel.bvm.courseworktwo.scheme.Question;
import tel.bvm.courseworktwo.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/math")
public class MathQuestionController {

    private QuestionService questionService;

    public MathQuestionController(@Qualifier("mathQuestionService") QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public Collection<Question> getAll() {
        return questionService.getAll();
    }

    @GetMapping("/add")
    public Question add(@RequestParam String question, String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping("/remove")
    public Question remove(@RequestParam String question, String answer) {
        Question mathQuestionRemove = new Question(question, answer);
        return questionService.remove(mathQuestionRemove);
    }

    @GetMapping("/find")
    public Question find(@RequestParam String question) {
        return questionService.find(question);
    }
}
//    ”/exam/math/(add/remove/find)”
