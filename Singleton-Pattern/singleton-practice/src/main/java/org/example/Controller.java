package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller {
    public void run() {
        // 스레드 풀 생성 (10개의 스레드가 동시에 실행)
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                ChocolateBoiler instance = ChocolateBoiler.getInstance();
                instance.fill();
                instance.boil();
                instance.drain();
                System.out.println("Instance: " + instance);
            });
        }

        executor.shutdown();
    }
}
