package tel.bvm.courseworktwo.service;

import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.generator.Random;
import tel.bvm.courseworktwo.scheme.JavaQuestion;
import tel.bvm.courseworktwo.scheme.MathQuestion;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

@Service
public class MathQuestionService extends QuestionServiceImpl{
    public MathQuestionService(QuestionServiceImpl questionService) {
        super(questionService);
    }

    @Override
    public MathQuestion add(String question, String answer) {
        return null;
    }

    @Override
    public MathQuestion remove(Question Question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Random getRandomQuestion(int maxValue) {
        return null;
    }
//    private MathQuestionService QuestionService;
//    public MathQuestionService(MathQuestionService questionService) {
//        QuestionService = questionService;
//    }
//
//    @Override
//    public MathQuestion add(String question, String answer) {
//        return null;
//    }
//
//    @Override
//    public MathQuestion remove(JavaQuestion javaQuestion) {
//        return null;
//    }
//
//    @Override
//    public Collection<MathQuestion> getAll() {
//        return null;
//    }
}
