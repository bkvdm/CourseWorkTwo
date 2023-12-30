package tel.bvm.courseWorkTwo.repository;

import org.springframework.stereotype.Service;

@Service
public class JavaQuestionRepositoryImpl implements QuestionRepository{
    private JavaQuestionRepositoryImpl QuestionRepository;

    public JavaQuestionRepositoryImpl(JavaQuestionRepositoryImpl questionRepository) {
        QuestionRepository = questionRepository;
    }
}
