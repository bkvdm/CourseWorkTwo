package tel.bvm.courseworktwo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tel.bvm.courseworktwo.constants.DefaultQuestionTest;
import tel.bvm.courseworktwo.exception.QuestionAlreadyAdded;
import tel.bvm.courseworktwo.repository.JavaQuestionRepositoryImpl;
import tel.bvm.courseworktwo.repository.MathQuestionRepositoryImpl;
import tel.bvm.courseworktwo.repository.QuestionRepositoryImpl;
import tel.bvm.courseworktwo.scheme.Question;


import java.util.Collection;
import java.util.HashMap;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static tel.bvm.courseworktwo.constants.DefaultQuestionTest.*;

@ExtendWith(MockitoExtension.class)
class QuestionServiceImplTest {

//    private final DefaultQuestionTest defaultQuestionTest = new DefaultQuestionTest();
    @Mock
    private JavaQuestionRepositoryImpl javaRepositoryMock;
    @Mock
    private MathQuestionRepositoryImpl mathRepositoryMock;

    @InjectMocks
    private JavaQuestionService javaServiceOut;
    @InjectMocks
    private MathQuestionService mathServiceOut;

//    private QuestionServiceImpl questionService;


    @BeforeEach
    void setUp() {
//        when(javaServiceOut.getAll()).thenReturn(COLLECTION_TEST);
        when(javaServiceOut.getAll()).thenReturn(COLLECTION_TEST);
//        questionService = new QuestionServiceImpl(new HashMap<>()) {
        }


//    }

    @Test
    void addJavaQuestionVerify() {
        when(javaRepositoryMock.add(
                QUESTION_ONE.getQuestion(),
                QUESTION_ONE.getAnswer())).
                thenReturn(QUESTION_ONE);
        Question actual = javaRepositoryMock.add(QUESTION_ONE.getQuestion(),
                QUESTION_ONE.getAnswer());
        assertEquals(QUESTION_ONE, actual);
        assertNotNull(actual);
    }

    @Test
    void findJavaQuestionVerify() {
        when(javaRepositoryMock.find(QUESTION_TWO.getQuestion())).thenReturn(QUESTION_TWO);
        Question actual = javaRepositoryMock.find(QUESTION_TWO.getQuestion());
        assertEquals(QUESTION_TWO, actual);
        assertNotNull(actual);
    }

    @Test
    void removeJavaQuestionVerify() {
        when(javaRepositoryMock.remove(QUESTION_THREE)).
                thenReturn(QUESTION_THREE);
        Question actual = javaRepositoryMock.remove(QUESTION_THREE);
        assertEquals(QUESTION_THREE, actual);
        assertNotNull(actual);
    }

    @Test
    void getAllJavaQuestionVerify() {
        when(javaRepositoryMock.getAll()).
                thenReturn(COLLECTION_TEST);
        Collection<Question> actual = javaRepositoryMock.getAll();
        assertEquals(COLLECTION_TEST, actual);
        assertNotNull(actual);
    }

    @Test
    void addMathQuestionVerify() {
        when(mathRepositoryMock.add(
                QUESTION_FOUR.getQuestion(),
                QUESTION_FOUR.getAnswer())).
                thenReturn(QUESTION_FOUR);
        Question actual = mathRepositoryMock.add(QUESTION_FOUR.getQuestion(),
                QUESTION_FOUR.getAnswer());
        assertEquals(QUESTION_FOUR, actual);
        assertNotNull(actual);
    }

    @Test
    void findMathQuestionVerify() {
        when(mathRepositoryMock.find(QUESTION_FIVE.getQuestion())).thenReturn(QUESTION_FIVE);
        Question actual = mathRepositoryMock.find(QUESTION_FIVE.getQuestion());
        assertEquals(QUESTION_FIVE, actual);
        assertNotNull(actual);
    }

    @Test
    void removeMathQuestionVerify() {
        when(mathRepositoryMock.remove(QUESTION_SIX)).
                thenReturn(QUESTION_SIX);
        Question actual = mathRepositoryMock.remove(QUESTION_SIX);
        assertEquals(QUESTION_SIX, actual);
        assertNotNull(actual);
    }

    @Test
    void getAllMathQuestionVerify() {
        when(mathRepositoryMock.getAll()).
                thenReturn(COLLECTION_TEST);
        Collection<Question> actual = mathRepositoryMock.getAll();
        assertEquals(COLLECTION_TEST, actual);
        assertNotNull(actual);
    }

    @Test
    void AddJavaQuestionAllReadyAddedExceptionVerify() throws QuestionAlreadyAdded{

        javaServiceOut.add(QUESTION_ONE.getQuestion(), QUESTION_ONE.getAnswer());
//        javaServiceOut.add(QUESTION_ONE.getQuestion(), QUESTION_ONE.getAnswer());
//        Assertions.assertThrows(QuestionAlreadyAdded.class, () -> {javaServiceOut.add(QUESTION_ONE.getQuestion(), QUESTION_ONE.getAnswer());});
//        when(mathRepositoryMock.getAll()).thenReturn(COLLECTION_TEST);
        Assertions.assertThrows(QuestionAlreadyAdded.class, () -> javaServiceOut.add(QUESTION_ONE.getQuestion(), QUESTION_ONE.getAnswer()));
    }

//    @Test
//    void AddQuestionVerify() {

//    }

    @Test
    void remove() {
    }

    @Test
    void find() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getRandomQuestion() {
    }
}