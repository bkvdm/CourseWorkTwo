package tel.bvm.courseworktwo.repository;

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
import tel.bvm.courseworktwo.exception.QuestionNotFound;
import tel.bvm.courseworktwo.service.QuestionServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static tel.bvm.courseworktwo.constants.DefaultQuestionTest.*;

class QuestionRepositoryImplTest {

    QuestionRepository javaQuestionRepositoryOut = new JavaQuestionRepositoryImpl();
    QuestionRepository mathQuestionRepositoryOut = new MathQuestionRepositoryImpl();

    @Test
    void AddJavaQuestionAllReadyAddedExceptionVerify() {
        javaQuestionRepositoryOut.add(QUESTION_ONE.getQuestion(), QUESTION_ONE.getAnswer());
        Assertions.assertThrows(QuestionAlreadyAdded.class, () -> javaQuestionRepositoryOut.add(QUESTION_ONE.getQuestion(), QUESTION_ONE.getAnswer()));
    }

    @Test
    void AddMathQuestionAllReadyAddedExceptionVerify() {
        mathQuestionRepositoryOut.add(QUESTION_TWO.getQuestion(), QUESTION_TWO.getAnswer());
        Assertions.assertThrows(QuestionAlreadyAdded.class, () -> mathQuestionRepositoryOut.add(QUESTION_TWO.getQuestion(), QUESTION_TWO.getAnswer()));
    }

    @Test
    void remove() {

    }

    @Test
    void findJavaQuestionNotFoundExceptionVerify() {
        Assertions.assertThrows(QuestionNotFound.class, () -> javaQuestionRepositoryOut.find(QUESTION_ONE.getQuestion()));
        javaQuestionRepositoryOut.add(QUESTION_THREE.getQuestion(), QUESTION_THREE.getAnswer());
        Assertions.assertThrows(QuestionNotFound.class, () -> javaQuestionRepositoryOut.find(QUESTION_ONE.getQuestion()));
    }

    @Test
    void findMathQuestionNotFoundExceptionVerify() {
        Assertions.assertThrows(QuestionNotFound.class, () -> mathQuestionRepositoryOut.find(QUESTION_FIVE.getQuestion()));
        javaQuestionRepositoryOut.add(QUESTION_FOUR.getQuestion(), QUESTION_FOUR.getAnswer());
        Assertions.assertThrows(QuestionNotFound.class, () -> mathQuestionRepositoryOut.find(QUESTION_FIVE.getQuestion()));
    }



    @Test
    void getAll() {
    }
}