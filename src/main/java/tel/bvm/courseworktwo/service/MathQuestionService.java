package tel.bvm.courseworktwo.service;

import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.generator.RandomIndex;
import tel.bvm.courseworktwo.repository.MathQuestionRepositoryImpl;
import tel.bvm.courseworktwo.scheme.Question;
import tel.bvm.courseworktwo.generator.RandomIndex;

import java.util.Collection;

import static tel.bvm.courseworktwo.generator.RandomIndex.getRandomGenerator;

@Service
public class MathQuestionService extends QuestionServiceImpl {
    public MathQuestionService(QuestionServiceImpl questionService) {
        super(questionService);
    }

    public MathQuestionRepositoryImpl mathQuestionRepository;

    public MathQuestionService(QuestionServiceImpl questionService, MathQuestionRepositoryImpl mathQuestionRepository) {
        super(questionService);
        this.mathQuestionRepository = mathQuestionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        return mathQuestionRepository.add(question, answer);
    }

    @Override
    public Question remove(Question question) {
        return mathQuestionRepository.remove(question);
    }

    @Override
    public Question find(String question) {
        return mathQuestionRepository.find(question);
    }

    @Override
    public Collection<Question> getAll() {
        return mathQuestionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        int selectedQuestion = getRandomGenerator(mathQuestionRepository.getAll().size() - 1);
        Question q = new Question();
        return null;
    }
}

//    @Override
//    public JavaQuestion remove(JavaQuestion question) {
//        return null;
//    }
//
//    @Override
//    public MathQuestion remove(MathQuestion question) {
//        return null;
//    }

//    @Override
//    public JavaQuestion remove(JavaQuestion question) {
//        return null;
//    }

//    private MathQuestionService QuestionService;
//    public MathQuestionService(MathQuestionService questionService) {
//        QuestionService = questionService;
//    }
//
//    @Override
//    public MathQuestion add(String question, String answer) {
//        return null;
//    }
//
//    @Override
//    public MathQuestion remove(JavaQuestion javaQuestion) {
//        return null;
//    }
//
//    @Override
//    public Collection<MathQuestion> getAll() {
//        return null;
//    }
//}
//    @Override
//    public MathQuestion add(String question, String answer) {
//        return null;
//    }
