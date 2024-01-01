package tel.bvm.courseworktwo.repository;

import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

public abstract class QuestionRepositoryImpl implements QuestionRepository {
    private QuestionRepositoryImpl questionRepository;

    protected QuestionRepositoryImpl(QuestionRepositoryImpl questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }
}

//    @Override
//    public JavaQuestion remove(JavaQuestion javaQuestion) {
//        return null;
//    }
//    @Override
//    public Random getRandomQuestion(int maxValue) {
//        return null;
//    }
