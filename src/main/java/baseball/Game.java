package baseball;

public class Game {

    Computer computer;
    Player player;

    public Game() {
        this.computer = new Computer();
        this.player = new Player();
    }

    public void playGame() {

        System.out.print("숫자를 입력해주세요 : ");
        String[] inputFromUser = player.guessDeck();
    }
}
