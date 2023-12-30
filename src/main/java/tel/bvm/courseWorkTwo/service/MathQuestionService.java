package tel.bvm.courseWorkTwo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tel.bvm.courseWorkTwo.scheme.JavaQuestion;
import tel.bvm.courseWorkTwo.scheme.MathQuestion;
import tel.bvm.courseWorkTwo.scheme.Question;

import java.util.Collection;

@Service
@Qualifier
public class MathQuestionService implements QuestionService{
    private MathQuestionService QuestionService;
    public MathQuestionService(MathQuestionService questionService) {
        QuestionService = questionService;
    }

    @Override
    public MathQuestion add(String question, String answer) {
        return null;
    }

    @Override
    public MathQuestion remove(JavaQuestion javaQuestion) {
        return null;
    }

    @Override
    public Collection<MathQuestion> getAll() {
        return null;
    }
}
