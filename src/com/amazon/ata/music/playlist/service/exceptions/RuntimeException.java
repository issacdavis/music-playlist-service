package com.amazon.ata.music.playlist.service.exceptions;

public class RuntimeException extends java.lang.RuntimeException {

    private static final long serialVersionUID = 2936528373182476532L;

    /**
     * Exception with no message or cause.
     */
    public RuntimeException() {
        super();
    }

    /**
     * Exception with a message, but no cause.
     * @param message A descriptive message for this exception.
     */
    public RuntimeException(String message) {
        super(message);
    }

    /**
     * Exception with no message, but with a cause.
     * @param cause The original throwable resulting in this exception.
     */
    public RuntimeException(Throwable cause) {
        super(cause);
    }

    /**
     * Exception with message and cause.
     * @param message A descriptive message for this exception.
     * @param cause The original throwable resulting in this exception.
     */
    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}

