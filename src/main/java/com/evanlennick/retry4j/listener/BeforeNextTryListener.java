package com.evanlennick.retry4j.listener;

import com.evanlennick.retry4j.CallResults;

public interface BeforeNextTryListener extends RetryListener {

    void immediatelyBeforeNextTry(CallResults results);

}
