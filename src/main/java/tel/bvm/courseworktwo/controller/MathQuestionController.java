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

    private QuestionService mathQuestionService;

    public MathQuestionController(@Qualifier("mathQuestionService") QuestionService question) {
        this.mathQuestionService = question;
    }

    @GetMapping
    public Collection<Question> getAll() {
        return mathQuestionService.getAll();
    }

    @GetMapping("/add")
    public Question add(@RequestParam String question, String answer) {
        return mathQuestionService.add(question, answer);
    }

    @GetMapping("/remove")
    public Question remove(@RequestParam String question, String answer) {
        Question mathQuestionRemove = new Question(question, answer);
        return mathQuestionService.remove(mathQuestionRemove);
    }

    @GetMapping("/find")
    public Question find(@RequestParam String question) {
        return mathQuestionService.find(question);
    }
}
//    ”/exam/math/(add/remove/find)”
