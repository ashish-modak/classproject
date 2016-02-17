package com.common;

/**
 * @author amodak
 * @param <T>
 */
public class BusinessResult<T> extends MessageResult {

    private T result;

    public BusinessResult(T result) {
        super();
        this.result = result;
    }

    public final T getResult() {
        return result;
    }
}
