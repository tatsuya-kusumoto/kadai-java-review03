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

    private double getRate() {
        double winRate = (double) this.win / (this.win + this.lose);
        return winRate;
    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public void report() {
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "負 " + draw + "分、勝率は " + this.getRate() + "です。");
    }

}
