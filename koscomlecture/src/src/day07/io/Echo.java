package day07.io;

import java.io.IOException;


public class Echo {

	public static void main(String[] args) {
		int bt;
		int cnt = 0;
		try{//ǥ���Է��� �޴´�.
			while((bt=System.in.read()) != -1){
				cnt++;
				//�Է¹��� ������ ǥ�� ����Ѵ�.
				System.out.print((char)bt);
			}
		}catch(IOException e){
			System.err.println(e);
		}
		System.out.println();
		System.out.println("total bytes :"+cnt);
	}

}
