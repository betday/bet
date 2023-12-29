import java.util.Random;
import java.util.Scanner;

public class baitap {
    private int targetNumber;
    private final int maxAttempts = 10;
    private int currentAttempt;
    private final int minNum;
    private final int maxNum;
    public baitap(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        resetGame();
    }
    public void resetGame() {
        Random random = new Random();
        this.targetNumber = random.nextInt(maxNum - minNum + 1) + minNum;
        this.currentAttempt = 0;
    }
    public String makeGuess(int guess) {
        if (currentAttempt >= maxAttempts) {
            return "Hết lượt. Số đúng là: " + targetNumber;
        }
        currentAttempt++;
        if (guess == targetNumber) {
            return "Chính xác!";
        } else if (guess < targetNumber) {
            return "Quá nhỏ";
        } else {
            return "Quá lớn";
        }
    }
    public int getCurrentAttempt() {
        return currentAttempt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chào mừng đến với Trò Chơi Đoán Số!");
        System.out.print("Nhập tên của bạn: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        baitap game = new baitap(1, 100);
        while (true) {
            System.out.println("\nLượt " + (game.getCurrentAttempt() + 1) + " của " + player.getName());
            System.out.print("Đoán một số từ 1 đến 100: ");
            int guess;
                guess = Integer.parseInt(scanner.nextLine());
                String response = game.makeGuess(guess);
                System.out.println(response);
            if (response.equals("Chính xác!") || response.startsWith("Hết lượt")) {
                break;
            }
        }
        System.out.println("Kết thúc trò chơi. " + player.getName() + ": ");
    }
}
class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}