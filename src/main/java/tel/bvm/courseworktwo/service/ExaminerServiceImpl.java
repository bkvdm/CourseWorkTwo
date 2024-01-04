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
//    private ExaminerService examinerService;

    //    @Autowired
    public ExaminerServiceImpl(@Qualifier("javaQuestionService") QuestionService javaQuestionService, @Qualifier("mathQuestionService") QuestionService mathQuestionService) {
        this.javaQuestionService = javaQuestionService;
        this.mathQuestionService = mathQuestionService;
//        this.examinerService = examinerService;
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
            int count = 0;
            while (examinationTicket.size() == amount) {
                count++;
                if (count % 2 == 0) {
                    examinationTicket.put(javaQuestionService.getRandomQuestion().getQuestion(),
                            "is hidden");
                } else {
                    examinationTicket.put(mathQuestionService.getRandomQuestion().getQuestion(),
                            "is hidden");
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

//    @Override
//    public Collection<Question> getQuestion(int amount) {
//
//        int possibleNumberExamQuestions = mathQuestionService.getAll().size() + javaQuestionService.getAll().size();
//        List<Question> listExamQuestions = new ArrayList<>();
//
//        if (amount > possibleNumberExamQuestions) {
//            throw new QuestionsFull("Количество экзаменационных вопросов, больше их количества в списке");
//        } else if (amount == 0) {
//            throw new QuestionsNull("Требуемое количество вопросов может быть больше нуля");
//        } else if (amount > 1) {
//            listExamQuestions.add(new Question(javaQuestionService.getRandomQuestion().getQuestion(), ""));
//            int step = 0;
//            while (listExamQuestions.size() == amount) {
//                step++;
//                Question javaQuestionRandomOnlyQuestion = new Question(javaQuestionService.getRandomQuestion().getQuestion(), "");
//                Question mathQuestionRandomOnlyQuestion = new Question(mathQuestionService.getRandomQuestion().getQuestion(), "");
//                if (listExamQuestions.contains(javaQuestionRandomOnlyQuestion) ||
//                        listExamQuestions.contains(mathQuestionRandomOnlyQuestion)) {
//                } else if (step % 2 == 0) {
//                    listExamQuestions.add(javaQuestionRandomOnlyQuestion);
//                } else {
//                    listExamQuestions.add(mathQuestionRandomOnlyQuestion);
//                }
//            }
//        }
//        return listExamQuestions;
//    }


//    public Collection<Question> getQuestions(int amount) {
//        return mathQuestionService
//                .getAll()
//                .stream()
//                .filter(q -> !listExamQuestions.contains(q))
//                .limit(amount)
//                .collect(Collectors.toCollection(ArrayList::new));
//    }


