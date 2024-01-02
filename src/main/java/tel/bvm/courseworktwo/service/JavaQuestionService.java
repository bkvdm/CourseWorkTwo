package tel.bvm.courseworktwo.service;

import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.generator.RandomIndex;
import tel.bvm.courseworktwo.repository.JavaQuestionRepositoryImpl;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static tel.bvm.courseworktwo.generator.RandomIndex.getRandomGenerator;

@Service
public class JavaQuestionService extends QuestionServiceImpl {
    public JavaQuestionService(QuestionServiceImpl questionService) {
        super(questionService);
    }

    public JavaQuestionRepositoryImpl javaQuestionRepository;

    public JavaQuestionService(QuestionServiceImpl questionService, JavaQuestionRepositoryImpl javaQuestionRepository) {
        super(questionService);
        this.javaQuestionRepository = javaQuestionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        return javaQuestionRepository.add(question, answer);
    }

    @Override
    public Question remove(Question question) {
        return javaQuestionRepository.remove(question);
    }

    @Override
    public Question find(String question) {
        return javaQuestionRepository.find(question);
    }

    @Override
    public Collection<Question> getAll() {
        return javaQuestionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        int selectedQuestionIndex = getRandomGenerator(javaQuestionRepository.getAll().size() - 1);
        List<Question> selectedQuestion = new ArrayList<>(javaQuestionRepository.getAll());
        return selectedQuestion.get(selectedQuestionIndex);
    }
}

//    @Override
//    public MathQuestion remove(MathQuestion question) {
//        return null;
//    }
//public class JavaQuestionService implements QuestionService{
//    private JavaQuestionService QuestionService;
//
//    public JavaQuestionService(JavaQuestionService questionService) {
//        QuestionService = questionService;
//    }
//
//    @Override
//    public JavaQuestion add(String question, String answer) {
//        return null;
//    }
//
//    @Override
//    public JavaQuestion remove(JavaQuestion javaQuestion) {
//        return null;
//    }
//
//    @Override
//    public Collection<JavaQuestion> getAll() {
//        return null;
//    }
//
//    @Override
//    public Random getRandomQuestion(int maxValue) {
//        return null;
//    }
//    @Override
//    public JavaQuestion add(String question, String answer) {
//        return javaQuestionRepository.add(question, answer);
//    }
