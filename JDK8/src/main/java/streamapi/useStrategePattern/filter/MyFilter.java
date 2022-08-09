package streamapi.useStrategePattern.filter;

public interface MyFilter<User> {
    boolean test(User user);
}
