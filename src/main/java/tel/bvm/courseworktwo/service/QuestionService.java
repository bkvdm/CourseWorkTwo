package tel.bvm.courseworktwo.service;

import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);

    Question remove(Question question);

    Question find(String question);

    Collection<Question> getAll();

    Question getRandomQuestion();
}
