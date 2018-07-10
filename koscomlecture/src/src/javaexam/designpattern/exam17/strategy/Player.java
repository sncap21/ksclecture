package javaexam.designpattern.exam17.strategy;
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    public Player(String name, Strategy strategy) {         // 이름과 전략을 전수 받는다.
        this.name = name;
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy){
    	this.strategy = strategy;
    }
    
    public Hand nextHand() {                                // 전략의 지시를 받는다.
        return strategy.nextHand();
    }
    public void win() {                 // 이겼다.
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {                // 졌다.
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {                // 무승부
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
