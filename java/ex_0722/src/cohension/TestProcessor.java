package cohension;

// 2. 순차적 응집도
// 앞 작업의 결과물(반환값)이 바로 다음 작업의 재료(입력값)이 되는 관계
// 작업들이 강하게 결합된다
// 내부의 특정 단계만 독립적으로 재사용하거나 순서를 바꾸기가 어렵다
// 중간 과정에서 오류가 발생하면 이후 단계에서 전체가 영향을 받아 멈춤
public class TestProcessor {

	public void processText(String text) {
		String trimmed = removeedText();
		
		// 1에서 나온 결과물을 대문자로 바꾼다
		String upper = convertToUpper(trimmed);
	}

	private String convertToUpper(String trimmed) {
		// TODO Auto-generated method stub
		return null;
	}

	private String removeedText() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
