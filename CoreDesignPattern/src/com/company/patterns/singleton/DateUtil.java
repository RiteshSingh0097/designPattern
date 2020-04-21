package com.company.patterns.singleton;

import java.io.Serializable;
import java.util.Objects;

public class DateUtil implements Serializable, Cloneable {

    private static volatile DateUtil instance;

    private DateUtil() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public synchronized static DateUtil getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DateUtil.class) {
                if (Objects.isNull(instance)) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

}
