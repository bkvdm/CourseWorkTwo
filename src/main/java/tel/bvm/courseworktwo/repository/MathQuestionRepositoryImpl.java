package tel.bvm.courseworktwo.repository;

import org.springframework.stereotype.Repository;
import tel.bvm.courseworktwo.generator.Random;
import tel.bvm.courseworktwo.scheme.JavaQuestion;
import tel.bvm.courseworktwo.scheme.MathQuestion;

import java.util.Collection;

@Repository
public class MathQuestionRepositoryImpl extends QuestionRepositoryImpl{
    protected MathQuestionRepositoryImpl(QuestionRepositoryImpl questionRepository) {
        super(questionRepository);
    }
//    private MathQuestionRepositoryImpl QuestionRepository;
//
//    public MathQuestionRepositoryImpl(MathQuestionRepositoryImpl questionRepository) {
//        QuestionRepository = questionRepository;
//    }

//    @Override
//    public MathQuestion add(String question, String answer) {
//        return null;
//    }
//
//    @Override
//    public JavaQuestion remove(JavaQuestion question) {
//        return null;
//    }
//
//    @Override
//    public MathQuestion remove(MathQuestion question) {
//        return null;
//    }
//
//    @Override
//    public Collection<MathQuestion> getAll() {
//        return null;
//    }
//
//    @Override
//    public Random getRandomQuestion(int maxValue) {
//        return null;
//    }
}
