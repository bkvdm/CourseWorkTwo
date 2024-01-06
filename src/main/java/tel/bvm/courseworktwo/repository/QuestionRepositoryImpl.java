package tel.bvm.courseworktwo.repository;

import org.springframework.stereotype.Service;
import tel.bvm.courseworktwo.exception.QuestionAlreadyAdded;
import tel.bvm.courseworktwo.exception.QuestionNotFound;
import tel.bvm.courseworktwo.exception.QuestionsNull;
import tel.bvm.courseworktwo.scheme.Question;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//@Service
public abstract class QuestionRepositoryImpl implements QuestionRepository {

    private final Map<String, String> registerQuestionsWithAnswers = new HashMap<>();



//    public Question add(String question, String answer) {
//        Question questionNew = new Question(question, answer);
//        if (registerQuestionsWithAnswers.get(questionNew.getQuestion()) == null) {
//            registerQuestionsWithAnswers.put(questionNew.getQuestion(), questionNew.getAnswer());
//        } else {
//            throw new QuestionAlreadyAdded("Вопрос уже был ранее добавлен");
//        }
//        return questionNew;
//    }
//
    @Override
    public Question add(String question, String answer) {
        Question questionNew = new Question(question, answer);
        if (registerQuestionsWithAnswers.get(question) == null) {
            registerQuestionsWithAnswers.put(questionNew.getQuestion(), questionNew.getAnswer());
        } else throw new QuestionAlreadyAdded("Вопрос уже был ранее добавлен");
        return questionNew;
    }

    @Override
    public Question remove(Question question) {
        if (registerQuestionsWithAnswers.get(question.getQuestion()) == null) {
            throw new QuestionNotFound("Нельзя удалить вопрос, которого нет в списке");
        } else {
            registerQuestionsWithAnswers.remove(question.getQuestion(), question.getAnswer());
        }
        return question;
    }

    @Override
    public Question find(String question) {
        if (registerQuestionsWithAnswers.get(question) == null) {
            throw new QuestionNotFound("Вопрос не найден или не дополнен в список вопросов");
        }
        return new Question(question, registerQuestionsWithAnswers.get(question));
    }

    @Override
    public Collection<Question> getAll() {
        if (registerQuestionsWithAnswers.isEmpty()) {
            throw new QuestionsNull("Список вопросов пуст");
        }
        return registerQuestionsWithAnswers.entrySet()
                .stream()
                .map(e -> new Question(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }
}
//    questionNew.getQuestion(), questionNew.getAnswer())

//            if (registerQuestionsWithAnswers.put(questionNew.getQuestion(), questionNew.getAnswer()) != null) {
//                throw new QuestionAlreadyAdded("Вопрос уже был ранее добавлен");
//            }
