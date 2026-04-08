package ex01_reflection.log;

public class FileLogger implements Logger{
@Override
public void log(String message) {
	System.out.println("[File] 파일에로그 저장 : " + message);
		
}
}
