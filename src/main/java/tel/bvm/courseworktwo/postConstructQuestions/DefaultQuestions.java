package tel.bvm.courseworktwo.postConstructQuestions;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import tel.bvm.courseworktwo.repository.JavaQuestionRepositoryImpl;
import tel.bvm.courseworktwo.repository.MathQuestionRepositoryImpl;
import tel.bvm.courseworktwo.repository.QuestionRepository;

@Component
public class DefaultQuestions {

    private  final QuestionRepository javaQuestionRepository;

    private final QuestionRepository mathQuestionRepository;

    @Autowired
    public DefaultQuestions(@Qualifier ("javaQuestionRepositoryImpl") QuestionRepository javaQuestionRepositoryImpl, @Qualifier ("mathQuestionRepositoryImpl") QuestionRepository mathQuestionRepositoryImpl) {
        this.javaQuestionRepository = javaQuestionRepositoryImpl;
        this.mathQuestionRepository = mathQuestionRepositoryImpl;
    }

    @PostConstruct
    public void init() {
        javaQuestionRepository.add("Вопрос Java 1", "Ответ верный Java 1");
        javaQuestionRepository.add("Вопрос Java 2", "Ответ верный Java 2");
        javaQuestionRepository.add("Вопрос Java 3", "Ответ верный Java 3");
        javaQuestionRepository.add("Вопрос Java 4", "Ответ верный Java 4");
        javaQuestionRepository.add("Вопрос Java 5", "Ответ верный Java 5");
        javaQuestionRepository.add("Вопрос Java 6", "Ответ верный Java 6");
        javaQuestionRepository.add("Вопрос Java 7", "Ответ верный Java 7");
        javaQuestionRepository.add("Вопрос Java 8", "Ответ верный Java 8");
        javaQuestionRepository.add("Вопрос Java 9", "Ответ верный Java 9");
        javaQuestionRepository.add("Вопрос Java 10", "Ответ верный Java 10");

        mathQuestionRepository.add("Вопрос Math 1", "Ответ верный Math 1");
        mathQuestionRepository.add("Вопрос Math 2", "Ответ верный Math 2");
        mathQuestionRepository.add("Вопрос Math 3", "Ответ верный Math 3");
        mathQuestionRepository.add("Вопрос Math 4", "Ответ верный Math 4");
        mathQuestionRepository.add("Вопрос Math 5", "Ответ верный Math 5");
        mathQuestionRepository.add("Вопрос Math 6", "Ответ верный Math 6");
        mathQuestionRepository.add("Вопрос Math 7", "Ответ верный Math 7");
        mathQuestionRepository.add("Вопрос Math 8", "Ответ верный Math 8");
        mathQuestionRepository.add("Вопрос Math 9", "Ответ верный Math 9");
        mathQuestionRepository.add("Вопрос Math 10", "Ответ верный Math 10");
    }
}
