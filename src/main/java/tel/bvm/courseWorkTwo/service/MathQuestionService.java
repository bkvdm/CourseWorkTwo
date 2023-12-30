package tel.bvm.courseWorkTwo.service;

import org.springframework.stereotype.Service;

@Service
public class MathQuestionService implements QuestionService{
    private MathQuestionService QuestionService;
    public MathQuestionService(MathQuestionService questionService) {
        QuestionService = questionService;
    }
}
