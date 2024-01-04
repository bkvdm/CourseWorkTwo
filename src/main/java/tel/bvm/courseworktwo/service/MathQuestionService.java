package tel.bvm.courseworktwo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.repository.MathQuestionRepositoryImpl;
import tel.bvm.courseworktwo.repository.QuestionRepository;

@Service
public class MathQuestionService extends QuestionServiceImpl {

    public MathQuestionService(@Qualifier ("mathQuestionRepositoryImpl") QuestionRepository  mathQuestionRepository) {
        super(mathQuestionRepository);
    }
//    public class MathQuestionTestService implements QuestionTestService{
//    private MathQuestionRepositoryImpl mathQuestionRepository;
//
//    public MathQuestionTestService(MathQuestionRepositoryImpl mathQuestionRepository) {
//        this.mathQuestionRepository = mathQuestionRepository;
//    }
//    @Override
//    public Question add(String question, String answer) {
//        return mathQuestionRepository.add(question, answer);
//    }
//
//    @Override
//    public Question remove(Question question) {
//        return mathQuestionRepository.remove(question);
//    }
//
//    @Override
//    public Question find(String question) {
//        return mathQuestionRepository.find(question);
//    }
//
//    @Override
//    public Collection<Question> getAll() {
//        return mathQuestionRepository.getAll();
//    }
//
//    @Override
//    public Question getRandomQuestion() {
//        int selectedQuestionIndex = getRandomGenerator(mathQuestionRepository.getAll().size() - 1);
//        List<Question> selectedQuestion = new ArrayList<>(mathQuestionRepository.getAll());
//        return selectedQuestion.get(selectedQuestionIndex);
//    }
}
