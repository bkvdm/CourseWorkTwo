package tel.bvm.courseWorkTwo.service;

import tel.bvm.courseWorkTwo.generator.Random;
import tel.bvm.courseWorkTwo.scheme.JavaQuestion;
import tel.bvm.courseWorkTwo.scheme.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question remove(JavaQuestion javaQuestion);

    Collection<JavaQuestion> getAll();

    Random getRandomQuestion(int maxValue);
}
