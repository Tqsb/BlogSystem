package com.duan.blogos.exception.api;

import com.duan.blogos.exception.BaseRuntimeException;

/**
 * Created on 2017/12/22.
 * 未指明操作，不明确的API调用
 *
 * @author DuanJiaNing
 */
public class UnspecifiedOperationException extends BaseRuntimeException {

    private static final int code = 9;

    public UnspecifiedOperationException() {
        super(code);
    }

    public UnspecifiedOperationException(String message) {
        super(message, code);
    }
}