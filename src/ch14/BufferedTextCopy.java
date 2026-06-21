package ch14;
// 수업시간 실습
import java.io.*;
public class BufferedTextCopy {
    public static void main(String[] args) {
        String source = "source.txt";
        String destination = "copy.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(source));
        BufferedWriter writer = new BufferedWriter(new FileWriter(destination))){
            String line;
            while((line=reader.readLine())!=null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("텍스트 파일 복사가 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류 발생: "+e.getMessage());
        }
    }
}