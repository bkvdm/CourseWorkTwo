package tel.bvm.courseworktwo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tel.bvm.courseworktwo.generator.RandomIndex;
import tel.bvm.courseworktwo.repository.JavaQuestionRepositoryImpl;
import tel.bvm.courseworktwo.repository.MathQuestionRepositoryImpl;
import tel.bvm.courseworktwo.repository.QuestionRepositoryImpl;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static tel.bvm.courseworktwo.constants.DefaultQuestionTest.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private QuestionServiceImpl questionService;

    @Mock
    private RandomIndex randomIndex;

    @InjectMocks
    private ExaminerServiceImpl examinerServiceOut;

    @BeforeEach
    void initOut() {
        when(randomIndex.getRandomGenerator(COLLECTION_TEST.size()));
        when(questionService.getAll()).thenReturn(COLLECTION_TEST);
    }

    @Test
    void getQuestion() {
        Collection<Question> getQuestion = examinerServiceOut.getQuestion(1);
        int actual = getQuestion.size();
        assertEquals(actual, 1);
    }
}

//    private JavaQuestionRepositoryImpl javaQuestionRepository;
//    private MathQuestionRepositoryImpl mathQuestionRepository;
//
//    private QuestionServiceImpl mathQuestionService;
//    private QuestionServiceImpl javaQuestionService;
//
//    @BeforeEach
//    void setUp() {
//        questionRepository = Mockito.mock(QuestionRepositoryImpl.class);
//        javaQuestionService = new QuestionServiceImpl(javaQuestionRepository);
//
//    }
