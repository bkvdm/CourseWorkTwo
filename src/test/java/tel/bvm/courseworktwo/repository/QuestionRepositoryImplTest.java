package tel.bvm.courseworktwo.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tel.bvm.courseworktwo.constants.DefaultQuestionTest;
import tel.bvm.courseworktwo.service.QuestionServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class QuestionRepositoryImplTest {

    private final DefaultQuestionTest defaultQuestionTest = new DefaultQuestionTest();

    @Mock
    private QuestionRepositoryImpl repositoryMock;

    @InjectMocks
    private QuestionServiceImpl out;

//    private QuestionRepositoryImpl questionRepository;
//    private QuestionServiceImpl questionService;

    @BeforeEach
    void setUp() {

//        questionRepository = Mockito.mock(QuestionRepositoryImpl.class);
//        questionRepository = new JavaQuestionRepositoryImpl();
//        questionRepository = new MathQuestionRepositoryImpl();

    }

    @Test
    void add() {
    }

    @Test
    void remove() {
    }

    @Test
    void find() {
    }

    @Test
    void getAll() {
    }
}