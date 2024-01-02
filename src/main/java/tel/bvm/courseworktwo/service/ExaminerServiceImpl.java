package tel.bvm.courseworktwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.exception.QuestionsFull;
import tel.bvm.courseworktwo.exception.QuestionsNull;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private JavaQuestionService javaQuestionService;
    private MathQuestionService mathQuestionService;
//    private ExaminerService examinerService;

    @Autowired
    public ExaminerServiceImpl(JavaQuestionService javaQuestionService, MathQuestionService mathQuestionService) {
        this.javaQuestionService = javaQuestionService;
        this.mathQuestionService = mathQuestionService;
//        this.examinerService = examinerService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {

        int possibleNumberExamQuestions = mathQuestionService.getAll().size() + javaQuestionService.getAll().size();
        List<Question> listExamQuestions = new ArrayList<>();

        if (amount > possibleNumberExamQuestions) {
            throw new QuestionsFull("Количество экзаменационных вопросов, больше их количества в списке");
        } else {
            listExamQuestions.add(javaQuestionService.getRandomQuestion());
            while ((listExamQuestions.size() == amount)) {
                if (listExamQuestions.contains(javaQuestionService.getRandomQuestion()) ||
                        listExamQuestions.contains(mathQuestionService.getRandomQuestion())) {
                } else {
                    listExamQuestions.add(new Question(javaQuestionService.getRandomQuestion().getQuestion(), ""));
                    listExamQuestions.add(new Question(mathQuestionService.getRandomQuestion().getQuestion(), ""));
                }
            }
            return listExamQuestions;
        }
    }

//    public Collection<Question> getQuestion(int amount) {
//
//        int possibleNumberExamQuestions = mathQuestionService.getAll().size() + javaQuestionService.getAll().size();
//        List<Question> listExamQuestions = new ArrayList<>();
//        Question questionOnly = new Question("", "Ответь на вопрос зкзамена");
//
//        if (amount > possibleNumberExamQuestions) {
//            throw new QuestionsFull("Количество экзаменационных вопросов, больше их количества в списке");
//        } else {
//            while ((listExamQuestions.size() == amount)) {
//                if (listExamQuestions.contains(javaQuestionService.getRandomQuestion())) {
//                } else {
//                    questionOnly.setQuestion(javaQuestionService.getRandomQuestion().getQuestion());
//                    listExamQuestions.add(questionOnly);
//                }
//                if (listExamQuestions.contains(mathQuestionService.getRandomQuestion())) {
//                } else {
//                    questionOnly.setQuestion(mathQuestionService.getRandomQuestion().getQuestion());
//                    listExamQuestions.add(mathQuestionService.getRandomQuestion());
//                }
//            }
//            return listExamQuestions;
//        }
//    }

//
//        if (javaQuestionService.getAll().isEmpty() || mathQuestionService.getAll().isEmpty()) {
//            throw new QuestionsNull("Список экзаменационных вопросов по одному из предметов не заполнен");
//        } else {
//            if (amount == javaQuestionService.getAll().size() || javaQuestionService.getAll().size() == 1) {
//                listExamQuestions.addAll(javaQuestionService.getAll());
//            } else {
//                while (listExamQuestions.size() != amount) {
//                    if (listExamQuestions.contains(javaQuestionService.getRandomQuestion())) {
//                    } else {
//                        listExamQuestions.add(javaQuestionService.getRandomQuestion());
//                    }
//                }
//                ((amount - listExamQuestions.size()) == mathQuestionService.getAll().size() || mathQuestionService.getAll().size() == 1)
//            }
//
//        }
//
//
//
//
//
//
//        if (mathQuestionService.getAll().isEmpty()) {
//            throw new QuestionsNull("Список экзаменационных вопросов по Математике пуст");
//        } else {
//            if (amount == mathQuestionService.getAll().size() || mathQuestionService.getAll().size() == 1) {
//                return mathQuestionService.getAll();
//            } else {
//                while (listExamQuestions.size() != amount) {
//                    if (listExamQuestions.contains(mathQuestionService.getRandomQuestion())) {
//                    } else {
//                        listExamQuestions.add(mathQuestionService.getRandomQuestion());
//                    }
//                }
//            }
//        }
//        if (javaQuestionService.getAll().isEmpty()) {
//            throw new QuestionsNull("Список экзаменационных вопросов по Java пуст");
//        } else {
//            if (amount == javaQuestionService.getAll().size() || javaQuestionService.getAll().size() == 1) {
//                return javaQuestionService.getAll();
//            } else {
//                while (listExamQuestions.size() != amount) {
//                    if (listExamQuestions.contains(javaQuestionService.getRandomQuestion())) {
//                    } else {
//                        listExamQuestions.add(javaQuestionService.getRandomQuestion());
//                    }
//                }
//            }
//        }
        return listExamQuestions;
}
}
//    public Collection<Question> getQuestions(int amount) {
//        return mathQuestionService
//                .getAll()
//                .stream()
//                .filter(q -> !listExamQuestions.contains(q))
//                .limit(amount)
//                .collect(Collectors.toCollection(ArrayList::new));
//    }


