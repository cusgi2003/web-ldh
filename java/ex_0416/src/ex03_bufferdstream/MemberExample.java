package ex03_bufferdstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MemberExample {
	public static void main(String[] args) {
		// members.csv 파일을 읽어서 나이가 30이상인 회뭔만 senior_mebers.txt
		// 데이터는 , 기준으로 분리한다
		try (
			BufferedReader br = new BufferedReader(new FileReader("members.csv"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("senior_members.txt"))
		) {
			String line;
			while((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				int age = Integer.parseInt(data[1].trim());
				
				if(age >=30) {
					bw.write(line);
					bw.newLine();  // 개행을 해주는 메서드
					
				}
			}
			System.out.println("30세 이상 회원 저장됨");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
