package tel.bvm.courseworktwo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class QuestionAlreadyAdded extends RuntimeException {
    public QuestionAlreadyAdded() {
    }

    public QuestionAlreadyAdded(String message) {
        super(message);
    }

    public QuestionAlreadyAdded(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionAlreadyAdded(Throwable cause) {
        super(cause);
    }

    public QuestionAlreadyAdded(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
