package tel.bvm.courseworktwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.exception.QuestionsFull;
import tel.bvm.courseworktwo.exception.QuestionsNull;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService javaQuestionService;
    private final QuestionService mathQuestionService;

    public ExaminerServiceImpl(@Qualifier("javaQuestionService") QuestionService javaQuestionService, @Qualifier("mathQuestionService") QuestionService mathQuestionService) {
        this.javaQuestionService = javaQuestionService;
        this.mathQuestionService = mathQuestionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        int possibleNumberExamQuestions = mathQuestionService.getAll().size() + javaQuestionService.getAll().size();
        Map<String, String> examinationTicket = new HashMap<>();
        if (amount > possibleNumberExamQuestions) {
            throw new QuestionsFull("Количество экзаменационных вопросов, больше их количества в списке");
        } else if (amount == 0) {
            throw new QuestionsNull("Требуемое количество вопросов может быть больше нуля");
        } else {
            examinationTicket.put(javaQuestionService.getRandomQuestion().getQuestion(),
                    "is hidden");
            if (amount > 1) {
                int i = 0;
                while (examinationTicket.size() < amount) {
                    i++;
                    if (i % 2 == 0) {
                        examinationTicket.put(javaQuestionService.getRandomQuestion().getQuestion(),
                                "is hidden");
                    } else {
                        examinationTicket.put(mathQuestionService.getRandomQuestion().getQuestion(),
                                "is hidden");
                    }
                }
            }
        }
        Collection<Question> examTicket = new ArrayList<>();
        for (Map.Entry<String, String> entry : examinationTicket.entrySet()) {
            examTicket.add(new Question(entry.getKey(), entry.getValue()));
        }
        return examTicket;
    }
}