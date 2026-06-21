package ch14;
//수업시간 실습
import java.io.*;
import java.util.Scanner;
public class FileProcessor {
    public static void main(String args[]) throws IOException {
// "D:/src" 디렉터리 내의 파일 목록 가져오기
        File directoryPath = new File("D:/src");
        File[] filesList = directoryPath.listFiles();
// 파일이 존재하는지 확인
        if (filesList == null || filesList.length == 0) {
            System.out.println("디렉터리에 파일이 없습니다.");
            return;
        }
// 디렉터리 내 모든 파일을 처리
        for (File file : filesList) {
// 확장자가 ".c" 또는 ".txt"인 파일만 처리
            if (!file.getName().endsWith(".c") && !file.getName().endsWith(".txt")) {
                continue; // 다른 확장자는 무시
            }
            // 파일 정보 출력(파일 이름, 절대 경로, 크기)
            System.out.println("파일 이름: " + file.getName());
            System.out.println("파일 경로: " + file.getAbsolutePath());
            System.out.println("파일 크기: " + file.length() + " bytes"); // 파일 크기 수정
// 새 파일 내용을 저장할 StringBuilder 사용
            StringBuilder sb = new StringBuilder();
            sb.append("#define _CRT_SECURE_NO_WARNINGS\n"); // C 코드 헤더 추가
// try-with-resources를 사용하여 Scanner 자동 닫기
            try (Scanner sc = new Scanner(file)) {
                while (sc.hasNextLine()) {
                    sb.append(sc.nextLine()).append("\n"); // 파일 내용을 한 줄씩 읽고 추가
                }
            } catch (IOException e) {
                System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
                continue; // 오류 발생 시 다음 파일로 이동
            }
            // 원래 파일 이름에서 확장자를 제거한 후 "1.c"를 추가하여 새 파일명 생성
            String oldName = file.getAbsolutePath();
            String fileName = oldName.contains(".")
                    ? oldName.substring(0, oldName.lastIndexOf("."))
                    : oldName;
            String newFileName = fileName + "1.c"; // 새로운 파일명
            System.out.println("새 파일 이름: " + newFileName);
// try-with-resources를 사용하여 BufferedWriter 자동 닫기
            try (BufferedWriter writer = new BufferedWriter(new
                    FileWriter(newFileName))) {
                writer.write(sb.toString()); // 새 파일에 내용 쓰기
            } catch (IOException e) {
                System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
            }
        }
    }
}