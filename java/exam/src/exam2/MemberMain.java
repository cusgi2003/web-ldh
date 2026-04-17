package exam2;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
	public static void main(String[] args) {
		List<Member> members = new ArrayList<Member>();

		members.add(new Member("hong", "홍길동", 20));
		members.add(new Member("kim", "김철수", 14));
		members.add(new Member("lee", "이영희", 22));
		members.add(new Member("hong", "홍이름", 16));

		for (Member member : members) {
			if (member.getAge() >= 20) {
				member.printInfo();
			}
		}
	}
}
