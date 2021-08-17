package com.meowu.commons.redis.security.exception;

import com.meowu.commons.utils.security.exception.MeowuRuntimeException;

import java.text.MessageFormat;

public class RedisException extends MeowuRuntimeException{

    public RedisException(){
        super();
    }

    public RedisException(String message){
        super(message);
    }

    public RedisException(Throwable cause){
        super(cause);
    }

    public RedisException(String message, Throwable cause){
        super(message, cause);
    }

    public RedisException(String message, Object... args){
        super(MessageFormat.format(message, args));
    }

    public RedisException(Throwable cause, String message, Object... args){
        super(MessageFormat.format(message, args), cause);
    }
}
