package javaexam.designpattern.exam14.template;
public abstract class AbstractDisplay { // 추상 클래스 AbstractDisplay
    public abstract void open();        // 하위 클래스에 구현을 맡기는 추상메소드(1) open
    public abstract void print();       // 하위 클래스에 구현을 맡기는 추상메소드(2) print
    public abstract void close();       // 하위 클래스에 구현을 맡기는 추상메소드(3) close
    public final void display() {       // 추상 클래스에서 구현하고 있는 메소드 display
        open();                             // 우선 open하고...
        for (int i = 0; i < 5; i++) {       // 5번print를 반복하고...
            print();                    
        }
        close();                            // 마지막으로 close한다. 이것이 display 메소드에서 구현되어 있는 내용
    }
}
