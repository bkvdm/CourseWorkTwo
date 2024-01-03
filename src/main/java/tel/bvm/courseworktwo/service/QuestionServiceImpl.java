package tel.bvm.courseworktwo.service;

import tel.bvm.courseworktwo.repository.QuestionRepository;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static tel.bvm.courseworktwo.generator.RandomIndex.getRandomGenerator;

public abstract class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    protected QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        return questionRepository.add(question, answer);
    }

    @Override
    public Question remove(Question question) {
        return questionRepository.remove(question);
    }

    @Override
    public Question find(String question) {
        return questionRepository.find(question);
    }

    @Override
    public Collection<Question> getAll() {
        return questionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        int selectedQuestionIndex = getRandomGenerator(questionRepository.getAll().size() - 1);
        List<Question> selectedQuestion = new ArrayList<>(questionRepository.getAll());
        return selectedQuestion.get(selectedQuestionIndex);
    }
}
