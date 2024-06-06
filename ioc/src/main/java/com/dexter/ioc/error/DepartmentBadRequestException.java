package com.dexter.ioc.error;

public class DepartmentBadRequestException extends  Exception{
    public DepartmentBadRequestException() {
        super();
    }

    public DepartmentBadRequestException(String message) {
        super(message);
    }

    public DepartmentBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentBadRequestException(Throwable cause) {
        super(cause);
    }

    protected DepartmentBadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
