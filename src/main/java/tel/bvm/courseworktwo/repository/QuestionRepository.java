package tel.bvm.courseworktwo.repository;

import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(String question, String answer);

    Question remove(Question question);

    Question find(String question);

    Collection<Question> getAll();
}