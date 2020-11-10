package com.clear.exception;

import java.util.function.Predicate;

/**
 * ClassName RecordFailurePredicate
 *
 * @author qml
 * Date 2020/11/9 15:55
 * Version 1.0
 **/

public class RecordFailurePredicate implements Predicate<Throwable> {
    @Override
    public boolean test(Throwable throwable) {
        return true;
    }
}