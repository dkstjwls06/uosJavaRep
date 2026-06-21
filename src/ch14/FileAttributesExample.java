package ch14;
// 수업시간 실습
import java.io.File;
public class FileAttributesExample {
    public static void main(String[] args) {
        File file = new File("example.txt");
// 기본 속성 확인
        System.out.println("파일 이름: " + file.getName());
        System.out.println("경로: " + file.getPath());
        System.out.println("절대 경로: " + file.getAbsolutePath());
        System.out.println("존재 여부: " + file.exists());
        System.out.println("파일 여부: " + file.isFile());
        System.out.println("디렉터리 여부: " + file.isDirectory());
        System.out.println("크기: " + file.length() + "바이트");
        System.out.println("수정 시간: " + file.lastModified());
// 권한 확인
        System.out.println("읽기 가능: " + file.canRead());
        System.out.println("쓰기 가능: " + file.canWrite());
        System.out.println("실행 가능: " + file.canExecute());
    }
}

