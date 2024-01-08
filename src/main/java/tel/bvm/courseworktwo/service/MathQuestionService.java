package tel.bvm.courseworktwo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.generator.RandomIndex;
import tel.bvm.courseworktwo.repository.QuestionRepository;

@Service
public class MathQuestionService extends QuestionServiceImpl {

    public MathQuestionService(RandomIndex randomIndex, @Qualifier("mathQuestionRepositoryImpl") QuestionRepository mathQuestionRepository) {
        super(randomIndex, mathQuestionRepository);
    }
}