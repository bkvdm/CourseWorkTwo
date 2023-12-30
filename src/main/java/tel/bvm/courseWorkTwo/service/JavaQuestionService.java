package tel.bvm.courseWorkTwo.service;

import org.springframework.stereotype.Service;
import tel.bvm.courseWorkTwo.generator.Random;
import tel.bvm.courseWorkTwo.scheme.JavaQuestion;
import tel.bvm.courseWorkTwo.scheme.Question;

import java.util.Collection;

@Service
public class JavaQuestionService extends QuestionServiceImpl{
    public JavaQuestionService(QuestionServiceImpl questionService) {
        super(questionService);
    }

    @Override
    public JavaQuestion add(String question, String answer) {
        return null;
    }

    @Override
    public JavaQuestion remove(Question Question) {
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

//public class JavaQuestionService implements QuestionService{
//    private JavaQuestionService QuestionService;
//
//    public JavaQuestionService(JavaQuestionService questionService) {
//        QuestionService = questionService;
//    }
//
//    @Override
//    public JavaQuestion add(String question, String answer) {
//        return null;
//    }
//
//    @Override
//    public JavaQuestion remove(JavaQuestion javaQuestion) {
//        return null;
//    }
//
//    @Override
//    public Collection<JavaQuestion> getAll() {
//        return null;
//    }
//
//    @Override
//    public Random getRandomQuestion(int maxValue) {
//        return null;
//    }
}
