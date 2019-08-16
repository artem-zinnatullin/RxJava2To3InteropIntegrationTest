package com.artemzin.rxjava2to3interopintegrationtest.rxjava2only;

import org.junit.Test;

public class RxJava2OnlyProjectTest {

    @Test
    public void toV3ObservableShowThrow() {
        new RxJava2OnlyProject().v2Observable();
    }
}
