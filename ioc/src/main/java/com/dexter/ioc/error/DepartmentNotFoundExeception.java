package com.dexter.ioc.error;

public class DepartmentNotFoundExeception  extends  Exception{
    public DepartmentNotFoundExeception() {
        super();
    }

    public DepartmentNotFoundExeception(String message) {
        super(message);
    }

    public DepartmentNotFoundExeception(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFoundExeception(Throwable cause) {
        super(cause);
    }

    protected DepartmentNotFoundExeception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
