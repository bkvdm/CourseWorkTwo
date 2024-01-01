package tel.bvm.courseworktwo.repository;

import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(String question, String answer);

    Question remove(Question question);

    Collection<Question> getAll();
}

    //    JavaQuestion remove(JavaQuestion javaQuestion);
//    Random getRandomQuestion(int maxValue);
//    MathQuestion add(String question, String answer);
//
//    MathQuestion remove(MathQuestion question);
//
//    JavaQuestion add(JavaQuestion question);
//
//    Collection<MathQuestion> getAll();
//
//    JavaQuestion remove(JavaQuestion question);
//
//    Random getRandomQuestion(int maxValue);
//    MathQuestion add(String question, String answer);
//
//    JavaQuestion remove(JavaQuestion question);
//
//    MathQuestion remove(MathQuestion question);
//
//    Collection<MathQuestion> getAll();
//
//    Random getRandomQuestion(int maxValue);
//}
