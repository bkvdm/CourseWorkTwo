package tel.bvm.courseWorkTwo.service;

import org.springframework.stereotype.Service;

@Service
public class JavaQuestionService implements QuestionService{
    private JavaQuestionService QuestionService;

    public JavaQuestionService(JavaQuestionService questionService) {
        QuestionService = questionService;
    }
}
