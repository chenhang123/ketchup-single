package com.example.springdemo.util;

import java.util.concurrent.*;

public class CallableUtils {
    public static void main(String[] args)  {
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {
                return "futrueTask";
            }
        });
        futureTask.run();
        try {
            Object data = futureTask.get();
            System.out.println(data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("fuck");
            }
        });
    }
}
