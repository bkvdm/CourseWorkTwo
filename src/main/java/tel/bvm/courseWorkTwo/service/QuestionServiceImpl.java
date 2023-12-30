package tel.bvm.courseWorkTwo.service;

import tel.bvm.courseWorkTwo.generator.Random;
import tel.bvm.courseWorkTwo.scheme.JavaQuestion;

import java.util.Collection;

public abstract class QuestionServiceImpl implements QuestionService{

    private QuestionServiceImpl QuestionService;

    public QuestionServiceImpl(QuestionServiceImpl questionService) {
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
