package tel.bvm.courseWorkTwo.repository;

import org.springframework.stereotype.Service;

@Service
public class MathQuestionRepositoryImpl implements QuestionRepository{
    private MathQuestionRepositoryImpl QuestionRepository;

    public MathQuestionRepositoryImpl(MathQuestionRepositoryImpl questionRepository) {
        QuestionRepository = questionRepository;
    }
}
