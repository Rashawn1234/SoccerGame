
enum Position {
    FORWARD, MIDFIELDER, GOALKEEPER
}

interface Player {
    void shoot();
    void pass();
}

class SoccerPlayer implements Player {
    String name;
    Position position;

    SoccerPlayer(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void shoot() {
        System.out.println(name + " shoots!");
    }

    public void pass() {
        System.out.println(name + " passes!");
    }
}

class SoccerGame {
    public void scoreGoal() {
        System.out.println("GOAL!");
    }

    public void scoreGoal(String player) {
        System.out.println(player + " scored!");
    }

    public void scoreGoal(String player, int goals) {
        System.out.println(player + " scored " + goals + " goals!");
    }
}

public class Main {
    public static void main(String[] args) {

        SoccerPlayer p1 = new SoccerPlayer("Messi", Position.FORWARD);
        SoccerPlayer p2 = new SoccerPlayer("Ronaldo", Position.FORWARD);

        SoccerGame game = new SoccerGame();

        System.out.println("SOCCER GAME");

        p1.shoot();
        p2.pass();

        game.scoreGoal();
        game.scoreGoal("Messi");
        game.scoreGoal("Ronaldo", 2);
    }
}
