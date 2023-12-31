package tel.bvm.courseworktwo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tel.bvm.courseworktwo.service.QuestionService;

@RestController
@RequestMapping("/exam/math")
public class MathQuestionController {

    private QuestionService questionService;
    public MathQuestionController (@Qualifier("mathQuestionService") QuestionService questionService){
        this.questionService = questionService;
    }
//    ”/exam/math/(add/remove/find)”

}
