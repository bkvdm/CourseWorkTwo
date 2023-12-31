package tel.bvm.courseworktwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private JavaQuestionService javaQuestionService;
    private MathQuestionService mathQuestionService;
    private ExaminerServiceImpl examinerService;

    @Autowired
    public ExaminerServiceImpl(JavaQuestionService javaQuestionService, MathQuestionService mathQuestionService, ExaminerServiceImpl examinerService) {
        this.javaQuestionService = javaQuestionService;
        this.mathQuestionService = mathQuestionService;
//        this.examinerService = examinerService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        return null;
    }
}
