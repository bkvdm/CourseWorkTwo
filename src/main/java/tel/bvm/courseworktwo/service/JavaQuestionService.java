package tel.bvm.courseworktwo.service;

import tel.bvm.courseworktwo.repository.JavaQuestionRepositoryImpl;

public class JavaQuestionService extends QuestionServiceImpl {

    public JavaQuestionService(JavaQuestionRepositoryImpl javaQuestionRepository) {
        super(javaQuestionRepository);
    }

//    public class JavaQuestionTestService implements QuestionTestService{
//    private JavaQuestionRepositoryImpl javaQuestionRepository;
//
//    public JavaQuestionTestService(JavaQuestionRepositoryImpl javaQuestionRepository) {
//        this.javaQuestionRepository = javaQuestionRepository;
//    }

//    @Override
//    public Question add(String question, String answer) {
//        return javaQuestionRepository.add(question, answer);
//    }
//
//    @Override
//    public Question remove(Question question) {
//        return javaQuestionRepository.remove(question);
//    }
//
//    @Override
//    public Question find(String question) {
//        return javaQuestionRepository.find(question);
//    }
//
//    @Override
//    public Collection<Question> getAll() {
//        return javaQuestionRepository.getAll();
//    }
//
//    @Override
//    public Question getRandomQuestion() {
//        int selectedQuestionIndex = getRandomGenerator(javaQuestionRepository.getAll().size() - 1);
//        List<Question> selectedQuestion = new ArrayList<>(javaQuestionRepository.getAll());
//        return selectedQuestion.get(selectedQuestionIndex);
//    }
}
