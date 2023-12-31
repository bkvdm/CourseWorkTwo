package tel.bvm.courseworktwo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tel.bvm.courseworktwo.service.QuestionService;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private QuestionService questionService;
    public JavaQuestionController(@Qualifier("javaQuestionService") QuestionService questionService){
        this.questionService = questionService;
    }
//    ”/exam/java/(add/remove/find)”
}
