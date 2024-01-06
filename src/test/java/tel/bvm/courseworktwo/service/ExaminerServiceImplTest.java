package tel.bvm.courseworktwo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
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
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static tel.bvm.courseworktwo.constants.DefaultQuestionTest.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private QuestionServiceImpl questionService;

    RandomIndex randomIndex = new RandomIndex();

    @InjectMocks
    private ExaminerServiceImpl examinerServiceOut;


    @BeforeEach
    void initOut() {
        when(questionService.getAll()).thenReturn(COLLECTION_TEST);
        when(questionService.getRandomQuestion()).thenReturn(COLLECTION_TEST.get(randomIndex.getRandomGenerator(COLLECTION_TEST.size() - 1)));
    }

    public static Stream<Arguments> amountQuestionVariations() {
        return Stream.of(Arguments.of(1, COLLECTION_TEST_ONE_AMOUNT),
                Arguments.of(2, COLLECTION_TEST_TWO_AMOUNT),
                Arguments.of(3, COLLECTION_TEST_TREE_AMOUNT),
                Arguments.of(4, COLLECTION_TEST_FOUR_AMOUNT),
                Arguments.of(5, COLLECTION_TEST_FIVE_AMOUNT),
                Arguments.of(6, COLLECTION_TEST_SIX_AMOUNT)
        );
    }

    @ParameterizedTest
    @MethodSource("amountQuestionVariations")
    void getQuestion(int amount, Collection <Question> expected) {
        assertEquals(expected, examinerServiceOut.getQuestion(amount));
    }
}

//    @Test
//    void getQuestion() {
//        int actual = examinerServiceOut.getQuestion(1).size();
//        assertEquals(actual, 1);
//    }

//        int actual = examinerServiceOut.getQuestion(1).size();
//    @ParameterizedTest
//    @MethodSource("positivePlusVariations")
//    void plusPositiveMethod(Float one, Float two, String expected) {
//        assertEquals(expected, calculatorService.plus(one, two));
//    }

//        when(randomIndex.getRandomGenerator(COLLECTION_TEST.size())).thenReturn(1);
//        when(questionService.getRandomQuestion()).thenReturn(COLLECTION_TEST.get(1));

//        Collection<Question> getQuestion = examinerServiceOut.getQuestion(1);
//        int actual = getQuestion.size();

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
