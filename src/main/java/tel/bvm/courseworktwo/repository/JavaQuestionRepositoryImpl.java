package tel.bvm.courseworktwo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class JavaQuestionRepositoryImpl extends QuestionRepositoryImpl {
    protected JavaQuestionRepositoryImpl(QuestionRepositoryImpl questionRepository) {
        super(questionRepository);
    }
}
//    private JavaQuestionRepositoryImpl QuestionRepository;
//
//    public JavaQuestionRepositoryImpl(JavaQuestionRepositoryImpl questionRepository) {
//        QuestionRepository = questionRepository;
//    }

//    @Override
//    public JavaQuestion add(String question, String answer) {
//        return null;
//    }
//
//    @Override
//    public JavaQuestion remove(JavaQuestion question) {
//        return null;
//    }
//
//    @Override
//    public MathQuestion remove(MathQuestion question) {
//        return null;
//    }
//
//    @Override
//    public Collection<MathQuestion> getAll() {
//        return null;
//    }
//
//    @Override
//    public Random getRandomQuestion(int maxValue) {
//        return null;
//    }
//}
