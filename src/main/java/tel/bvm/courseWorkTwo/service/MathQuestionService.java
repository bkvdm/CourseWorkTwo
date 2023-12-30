package tel.bvm.courseWorkTwo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tel.bvm.courseWorkTwo.scheme.MathQuestion;
import tel.bvm.courseWorkTwo.scheme.Question;

@Service
@Qualifier
public class MathQuestionService implements QuestionService{
    private MathQuestionService QuestionService;
    public MathQuestionService(MathQuestionService questionService) {
        QuestionService = questionService;
    }

    @Override
    public MathQuestion addMathQuestion(String question, String answer) {
        return null;
    }

}
