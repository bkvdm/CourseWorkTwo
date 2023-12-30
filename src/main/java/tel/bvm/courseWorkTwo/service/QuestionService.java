package tel.bvm.courseWorkTwo.service;

import tel.bvm.courseWorkTwo.generator.Random;
import tel.bvm.courseWorkTwo.scheme.JavaQuestion;

import java.util.Collection;

public interface QuestionService {
    JavaQuestion add(String question, String answer);

    JavaQuestion remove(JavaQuestion javaQuestion);

    Collection<JavaQuestion> getAll();

    Random getRandomQuestion(int maxValue);
}
