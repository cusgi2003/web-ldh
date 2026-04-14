package ex01_lambda;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	public UserFilter getFilter(String type) {
		if (type.equals("adult")) {
			return (user) -> user.getAge() >= 20;
		} else if (type.equals("seoul")) {
			return (user) -> user.getCity().equals("서울");
		} else if (type.equals("kim")) {
			return (user) -> user.getName().contains("김");
		} else {
			return (user) -> true;
		}
	}
	
	public void filterUsers(List<User> list, UserFilter filter) {
		for(User u : list) {
			if(filter.test(u)) {
				System.out.println(u.getName() + " / " + u.getAge() + " / " + u.getCity());
			}
		}
	}
}
