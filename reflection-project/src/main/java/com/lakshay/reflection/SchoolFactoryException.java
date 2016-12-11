package com.lakshay.reflection;

import org.omg.SendingContext.RunTime;

/**
 * Created by lakshay on 11/12/16.
 */
public class SchoolFactoryException extends RuntimeException {

    private static final long serialVersionUID = -2963380391875625866L;

    /**
     * Can only be instantiated supplying the cause
     * @param message detail message
     * @param cause the cause
     */
    public SchoolFactoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
