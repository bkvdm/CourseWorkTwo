package tel.bvm.courseworktwo.service;

import tel.bvm.courseworktwo.generator.Random;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question remove(Question Question);

    //    public abstract MathQuestion remove(MathQuestion question);
    Question find(String question);

    Collection<Question> getAll();
//    Collection<JavaQuestion> getAll();
//    Collection<MathQuestion> getAll();

    Random getRandomQuestion(int maxValue);
}
