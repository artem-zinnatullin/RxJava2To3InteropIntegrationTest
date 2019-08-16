package com.artemzin.rxjava2to3interopintegrationtest.rxjava2only;

public class RxJava2OnlyProject {

    public io.reactivex.Observable<String> v2Observable() {
        return io.reactivex.Observable.just("v2 string");
    }
}
