package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    private double report(int win, int lose) {
        double winRate = win / (win + lose);
        return winRate;
    }

    public void report() {
        System.out.println("2022年の成績は " + win + " 勝 " + lose + " 負 " + draw + " 分、勝率は" + report(win, lose) + "です。");
    }

}
