package tel.bvm.courseworktwo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class QuestionsNull extends RuntimeException{
    public QuestionsNull() {
    }

    public QuestionsNull(String message) {
        super(message);
    }

    public QuestionsNull(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionsNull(Throwable cause) {
        super(cause);
    }

    public QuestionsNull(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
