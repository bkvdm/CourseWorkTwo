package tel.bvm.courseworktwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

        List<Question> listExamQuestions = new ArrayList<>();
        if (mathQuestionService.getAll().isEmpty()) {
        } else {
            if (amount == mathQuestionService.getAll().size()) {
                return mathQuestionService.getAll();
            } else {
                while (listExamQuestions.size() != amount) {
                    if (listExamQuestions.contains(mathQuestionService.getRandomQuestion())) {
                    } else {
                        listExamQuestions.add(mathQuestionService.getRandomQuestion());
                    }
                }
            }
        }

        if (javaQuestionService.getAll().isEmpty()) {
        } else {
            if (amount == javaQuestionService.getAll().size()) {
                return javaQuestionService.getAll();
            } else {
                while (listExamQuestions.size() != amount) {
                    if (listExamQuestions.contains(javaQuestionService.getRandomQuestion())) {
                    } else {
                        listExamQuestions.add(javaQuestionService.getRandomQuestion());
                    }
                }
            }
        }
        return listExamQuestions;
    }
}
//            for (int i = 0; i < amount; i++) {
//                if (!listExamQuestions.contains(mathQuestionService.getRandomQuestion())) {
//                    listExamQuestions.add(mathQuestionService.getRandomQuestion());
//                } else {
//
//                }
//            }
