package tel.bvm.courseWorkTwo.service;

import org.springframework.stereotype.Service;
import tel.bvm.courseWorkTwo.scheme.Question;

import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    private ExaminerServiceImpl ExaminerService;

    public ExaminerServiceImpl(ExaminerServiceImpl examinerService) {
        ExaminerService = examinerService;
    }

    public Collection<Question> getQuestion(int amount) {
        return null;
    }


}
