import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 문자열 입력
            System.out.print("이름을 입력하세요: ");
            String name = scanner.nextLine();

            // 정수 입력
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();

            // 실수 입력
            System.out.print("키(cm)를 입력하세요: ");
            double height = scanner.nextDouble();

            // 출력
            System.out.println("\n[입력 결과]");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age + "세");
            System.out.println("키: " + height + "cm");

        } catch (InputMismatchException e) {
            System.out.println("\n[오류] 잘못된 입력 형식입니다!");
        } finally {
            scanner.close();
        }
    }
}
