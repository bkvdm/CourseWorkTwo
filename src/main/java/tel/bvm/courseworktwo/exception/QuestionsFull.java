package tel.bvm.courseworktwo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionsFull extends RuntimeException {
    public QuestionsFull() {
    }

    public QuestionsFull(String message) {
        super(message);
    }

    public QuestionsFull(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionsFull(Throwable cause) {
        super(cause);
    }

    public QuestionsFull(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
