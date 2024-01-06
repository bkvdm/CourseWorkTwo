package tel.bvm.courseworktwo.service;

import org.junit.jupiter.api.Assertions;
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
import tel.bvm.courseworktwo.exception.QuestionsFull;
import tel.bvm.courseworktwo.exception.QuestionsNull;
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

    @InjectMocks
    private ExaminerServiceImpl examinerServiceOut;

    @ParameterizedTest
    @MethodSource("amountQuestionVariations")
    void getQuestionAmountVerify(int amount, int expected) {
        when(questionService.getAll()).thenReturn(COLLECTION_TEST);
        when(questionService.getRandomQuestion()).thenReturn(QUESTION_ONE, QUESTION_TWO, QUESTION_THREE, QUESTION_FOUR, QUESTION_FIVE, QUESTION_SIX);
        assertEquals(expected, examinerServiceOut.getQuestion(amount).size());
    }

    @Test
    void getQuestionAmountTextVerify() {
        when(questionService.getAll()).thenReturn(COLLECTION_TEST);
        when(questionService.getRandomQuestion()).thenReturn(QUESTION_ONE, QUESTION_TWO, QUESTION_THREE, QUESTION_FOUR, QUESTION_FIVE, QUESTION_SIX);
        Collection<Question> actualTwo = examinerServiceOut.getQuestion(2);
        assertEquals(COLLECTION_TEST_TWO_AMOUNT, actualTwo);
    }

    @Test
    void getQuestionAmountQuestionFullExceptionVerify() {
        Assertions.assertThrows(QuestionsFull.class, () -> examinerServiceOut.getQuestion(13));
    }

    @Test
    void getQuestionAmountQuestionNullExceptionVerify() {
        Assertions.assertThrows(QuestionsNull.class, () -> examinerServiceOut.getQuestion(0));
    }

    public static Stream<Arguments> amountQuestionVariations() {
        return Stream.of(Arguments.of(1, 1),
                Arguments.of(3, 3),
                Arguments.of(6, 6)
        );
    }
}
