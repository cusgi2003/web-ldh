package ex01_lambda;

public class TextService {
	public void processText(String text, StringProcessor processor) {
		String result = processor.process(text);
		System.out.println("결과 :" + result);
	}
}
