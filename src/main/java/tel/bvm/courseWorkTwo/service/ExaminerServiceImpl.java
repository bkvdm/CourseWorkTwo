package tel.bvm.courseWorkTwo.service;

import org.springframework.stereotype.Service;

@Service
public class ExaminerServiceImpl implements ExaminerService{
    private ExaminerServiceImpl ExaminerService;

    public ExaminerServiceImpl(ExaminerServiceImpl examinerService) {
        ExaminerService = examinerService;
    }
}
