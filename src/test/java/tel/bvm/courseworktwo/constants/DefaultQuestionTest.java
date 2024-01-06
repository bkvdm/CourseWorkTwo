package tel.bvm.courseworktwo.constants;

import tel.bvm.courseworktwo.scheme.Question;

import java.lang.reflect.Array;
import java.util.*;

public class DefaultQuestionTest {

    public static Question QUESTION_ONE = new Question("Вопрос 1 (тест)", "Ответ 1 (тест)");
    public  static Question QUESTION_TWO = new Question("Вопрос 2 (тест)", "Ответ 2 (тест)");
    public  static Question QUESTION_THREE = new Question("Вопрос 3 (тест)", "Ответ 3 (тест)");
    public  static Question QUESTION_FOUR = new Question("Вопрос 4 (тест)", "Ответ 4 (тест)");
    public  static Question QUESTION_FIVE = new Question("Вопрос 5 (тест)", "Ответ 5 (тест)");
    public  static Question QUESTION_SIX = new Question("Вопрос 6 (тест)", "Ответ 6 (тест)");

    public static Question QUESTION_ONLY_ONE = new Question("Вопрос 1 (тест)", "is hidden");
    public  static Question QUESTION_ONLY_TWO = new Question("Вопрос 2 (тест)", "is hidden");
    public  static Question QUESTION_ONLY_THREE = new Question("Вопрос 3 (тест)", "is hidden");
    public  static Question QUESTION_ONLY_FOUR = new Question("Вопрос 4 (тест)", "is hidden");
    public  static Question QUESTION_ONLY_FIVE = new Question("Вопрос 5 (тест)", "is hidden");
    public  static Question QUESTION_ONLY_SIX = new Question("Вопрос 6 (тест)", "is hidden");

    public static Map<String, String> QUESTION_MAP_TEST = new HashMap<>(Map.of(
            QUESTION_ONE.getQuestion(), QUESTION_ONE.getAnswer(),
            QUESTION_TWO.getQuestion(), QUESTION_TWO.getAnswer(),
            QUESTION_THREE.getQuestion(), QUESTION_THREE.getAnswer(),
            QUESTION_FOUR.getQuestion(), QUESTION_FOUR.getAnswer(),
            QUESTION_FIVE.getQuestion(), QUESTION_FIVE.getAnswer(),
            QUESTION_SIX.getQuestion(), QUESTION_SIX.getAnswer()
    ));

    public static List<Question> COLLECTION_TEST = new ArrayList<>(Arrays.asList(
            QUESTION_ONE, QUESTION_TWO, QUESTION_THREE, QUESTION_FOUR, QUESTION_FIVE, QUESTION_SIX));

    public static List<Question> COLLECTION_TEST_ONE_AMOUNT = new ArrayList<>(Arrays.asList(
            QUESTION_ONLY_ONE));

    public static List<Question> COLLECTION_TEST_TWO_AMOUNT = new ArrayList<>(Arrays.asList(
            QUESTION_ONLY_ONE, QUESTION_ONLY_TWO));

    public static List<Question> COLLECTION_TEST_TREE_AMOUNT = new ArrayList<>(Arrays.asList(
            QUESTION_ONLY_ONE, QUESTION_ONLY_TWO, QUESTION_ONLY_THREE));

    public static List<Question> COLLECTION_TEST_FOUR_AMOUNT = new ArrayList<>(Arrays.asList(
            QUESTION_ONLY_ONE, QUESTION_ONLY_TWO, QUESTION_ONLY_THREE, QUESTION_ONLY_FOUR));

    public static List<Question> COLLECTION_TEST_FIVE_AMOUNT = new ArrayList<>(Arrays.asList(
            QUESTION_ONLY_ONE, QUESTION_ONLY_TWO,QUESTION_ONLY_THREE, QUESTION_ONLY_FOUR, QUESTION_ONLY_FIVE));
    public static List<Question> COLLECTION_TEST_SIX_AMOUNT = new ArrayList<>(Arrays.asList(
            QUESTION_ONLY_ONE, QUESTION_ONLY_TWO, QUESTION_ONLY_THREE, QUESTION_ONLY_FOUR, QUESTION_ONLY_FIVE, QUESTION_ONLY_SIX));
}