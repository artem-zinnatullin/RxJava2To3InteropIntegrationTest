package com.artemzin.rxjava2to3interopintegrationtest.rxjava2and3;

public class RxJava2And3Project {

    public io.reactivex.Observable<String> v2Observable() {
        return io.reactivex.Observable.just("v2 string");
    }

    public io.reactivex.rxjava3.Observable<String> v3Observable() {
        return io.reactivex.rxjava3.Observable.just("v3 string");
    }

    public io.reactivex.rxjava3.Observable<String> v2ToV3() {
        return v2Observable().toV3Observable();
    }

    public io.reactivex.Observable<String> v3ToV2() {
        return v3Observable().toV2Observable();
    }
}
