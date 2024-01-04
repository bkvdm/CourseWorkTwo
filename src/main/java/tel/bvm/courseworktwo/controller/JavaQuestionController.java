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
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final QuestionService javaQuestionService;

    public JavaQuestionController(@Qualifier("javaQuestionService") QuestionService question) {
        this.javaQuestionService = question;
    }

    @GetMapping()
    public Collection<Question> getAll() {
        return javaQuestionService.getAll();
    }

    @GetMapping("/add")
    public Question add(@RequestParam(value = "question", required = false) String question, @RequestParam(value = "answer", required = false) String answer) {
        return javaQuestionService.add(question, answer);
    }

    @GetMapping("/remove")
    public Question remove(@RequestParam(value = "question", required = false) String question, @RequestParam(value = "answer", required = false) String answer) {
        Question javaQuestionRemove = new Question(question, answer);
        return javaQuestionService.remove(javaQuestionRemove);
    }

    @GetMapping("/find")
    public Question find(@RequestParam(value = "question", required = false) String question) {
        return javaQuestionService.find(question);
    }
}
//    ”/exam/java/(add/remove/find)”