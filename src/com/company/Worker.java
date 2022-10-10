package com.company;

public class Worker {
    private final OnTaskDoneListener CALLBACK;
    private final OnTaskErrorListener ERRORCALLBACK;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.CALLBACK = callback;
        this.ERRORCALLBACK = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33)
                ERRORCALLBACK.onError("Task " + i + " error");
            else
                CALLBACK.onDone("Task " + i + " is done");
        }
    }
}
