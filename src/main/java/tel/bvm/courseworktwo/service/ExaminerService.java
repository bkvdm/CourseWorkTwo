package tel.bvm.courseworktwo.service;

import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount);
}
