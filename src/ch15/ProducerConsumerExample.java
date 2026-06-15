package ch15;

import java.util.*;
class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;
    public Buffer(int capacity) {
        this.capacity = capacity;
    }
    // ① 데이터 추가(생산자 역할)
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("버퍼가 가득 차서 생산자가 기다립니다...");
            wait(); // 버퍼가 가득 찼을 때 대기
        }
        queue.add(value);
        System.out.println("생산되었음: " + value);
        notify(); // 소비자를 깨움
    }
    // ② 데이터 제거(소비자 역할)
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("버퍼가 비어서 소비자가 기다립니다...");
            wait(); // ③ 버퍼가 비었을 때 대기
        }
        int value = queue.poll();
        System.out.println("소비되었음: " + value);
        notify(); // 생산자를 깨움
        return value;
    }
}

class Producer extends Thread { // ④
    private final Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            int value = 0;
            while (true) {
                buffer.produce(value++);
                Thread.sleep(500); // 생산 속도 조절
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Consumer extends Thread { // ⑤
    private final Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // 소비 속도 조절
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) { // ⑥
        Buffer buffer = new Buffer(5); // 버퍼 크기 5
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}