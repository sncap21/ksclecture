package javaexam.designpattern.exam14.template;
public class StringDisplay extends AbstractDisplay {    // StringDisplay도 AbstractDisplay의 하위 클래스
    private String string;                              // 표시해야 할 문자열
    private int width;                                  // 바이트 단위로 계산한 문자열의 폭
    public StringDisplay(String string) {               // 생성자에서 넘어온 문자열 string을
        this.string = string;                           // 필드에 기억
        this.width = string.getBytes().length;          // 그리고 바이트 단위의 폭도 필드에 기억해 두고 나중에 사용한다.
    }
    public void open() {                                // 오버라이드해서 정의한 open메소드
        printLine();                                    // 이 클래스의 메소드 printLine에서 선을 그리고 있다.
    }
    public void print() {                               // print메소드는
        System.out.println("|" + string + "|");         // 필드에 기억해 둔 문자열의 전후에 "|"를 붙여서 표시.
    }
    public void close() {                               // close메소드는 
        printLine();                                    // open과 같이 printLine메소드에서 선을 그리고 있다.
    }
    private void printLine() {                          // open과 close로부터 호출되는 printLine메소드다 private이기 때문에 이 클래스 내에서만 사용된다.
        System.out.print("+");                          // 사각틀의 모퉁이를 표현하는 "+"마크를 표시.
        for (int i = 0; i < width; i++) {               // width개의 "-"표시해서
            System.out.print("-");                      // 사각틀로서 이용한다.
        }
        System.out.println("+");                        // 사각틀의 모퉁이를 표현하는 "+"마크를 표시
    }
}
