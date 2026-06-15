package ch15;

public class MemoryConsistencyErrorExample {
    private static int counter = 0; // 공유 자원
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> incrementCounter());
        Thread thread2 = new Thread(() -> incrementCounter());
        Thread thread3 = new Thread(() -> incrementCounter());
// 스레드 시작
        thread1.start();
        thread2.start();
        thread3.start();
        // 스레드 종료 대기
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
// 최종 카운터 값 출력
        System.out.println("최종 카운터 값: " + counter);
    }
    private static void incrementCounter() {
        for (int i = 0; i < 1000; i++) {
// 동기화 없이 카운터 증가
            counter++;
        }
    }
}