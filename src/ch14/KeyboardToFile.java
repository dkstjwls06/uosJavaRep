package ch14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyboardToFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("파일에 기록할 내용을 입력하세요(종료하려면 'exit' 입력):");
        try(FileWriter writer = new FileWriter("output.txt")){
            while(true){
                System.out.print("> ");
                String input = scanner.nextLine();

                if("exit".equalsIgnoreCase(input)){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                writer.write(input+System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("입출력 오류 발생: "+e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
