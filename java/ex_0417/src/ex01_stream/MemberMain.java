package ex01_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberMain {
	public static void main(String[] args) {
		Member[] members = { new Member(1, "홍길동", "ACTIVE"), new Member(2, "김철수", "INACTIVE"),
				new Member(3, "이영희", "ACTIVE"), new Member(4, "박민수", "INACTIVE"), new Member(5, "최지은", "ACTIVE"), };

		List<Member> list = new ArrayList<Member>(Arrays.asList(members));
		list.stream().filter((m) -> "ACTIVE".equals(m.status)).forEach(System.out::println);
		


	}
}
