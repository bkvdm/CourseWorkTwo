package tel.bvm.courseworktwo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.generator.RandomIndex;
import tel.bvm.courseworktwo.repository.QuestionRepository;

@Service
public class JavaQuestionService extends QuestionServiceImpl {

    public JavaQuestionService(RandomIndex randomIndex, @Qualifier("javaQuestionRepositoryImpl") QuestionRepository javaQuestionRepository) {
        super(randomIndex, javaQuestionRepository);
    }
}