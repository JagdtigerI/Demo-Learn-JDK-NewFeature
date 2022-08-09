package streamapi.useStrategePattern;

public interface MyFilter<User> {
    boolean test(User user);
}
