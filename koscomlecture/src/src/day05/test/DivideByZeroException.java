package day05.test;

public class DivideByZeroException extends RuntimeException {
	public DivideByZeroException() {
		super("���� ������ ����^^");
	}
	public DivideByZeroException(String msg) {
		super(msg);
	}
}
