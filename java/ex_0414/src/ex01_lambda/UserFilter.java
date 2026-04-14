package ex01_lambda;

@FunctionalInterface
public interface UserFilter {
	boolean test(User user);
}
