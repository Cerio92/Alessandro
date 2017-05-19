package com.client;

import java.io.IOException;

/**
 * This exception is thrown when an error occur while connecting to the server.
 */
public class ClientException extends IOException {

    /**
     * Base constructor.
     * @param cause of the exception.
     */
    public ClientException(Throwable cause) {
        super(cause);
    }
}