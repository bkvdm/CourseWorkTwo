package tel.bvm.courseworktwo.service;

import tel.bvm.courseworktwo.generator.RandomIndex;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

public abstract class QuestionServiceImpl implements QuestionService {

    private QuestionServiceImpl QuestionService;

    public QuestionServiceImpl(QuestionServiceImpl questionService) {
        QuestionService = questionService;
    }

    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question remove(Question Question) {
        return null;
    }

//    public abstract JavaQuestion remove(JavaQuestion question);

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
