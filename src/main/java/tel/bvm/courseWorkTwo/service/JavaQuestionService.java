package tel.bvm.courseWorkTwo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tel.bvm.courseWorkTwo.generator.Random;
import tel.bvm.courseWorkTwo.scheme.JavaQuestion;

import java.util.Collection;

@Service
@Qualifier
public class JavaQuestionService implements QuestionService{
    private JavaQuestionService QuestionService;

    public JavaQuestionService(JavaQuestionService questionService) {
        QuestionService = questionService;
    }

    @Override
    public JavaQuestion add(String question, String answer) {
        return null;
    }

    @Override
    public JavaQuestion remove(JavaQuestion javaQuestion) {
        return null;
    }

    @Override
    public Collection<JavaQuestion> getAll() {
        return null;
    }

    @Override
    public Random getRandomQuestion(int maxValue) {
        return null;
    }
}
