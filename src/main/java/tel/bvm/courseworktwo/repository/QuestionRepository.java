package tel.bvm.courseworktwo.repository;

import tel.bvm.courseworktwo.generator.Random;
import tel.bvm.courseworktwo.scheme.JavaQuestion;
import tel.bvm.courseworktwo.scheme.MathQuestion;

import java.util.Collection;

public interface QuestionRepository {
    MathQuestion add(String question, String answer);

    JavaQuestion remove(JavaQuestion question);

    MathQuestion remove(MathQuestion question);

    Collection<MathQuestion> getAll();

    Random getRandomQuestion(int maxValue);
}
