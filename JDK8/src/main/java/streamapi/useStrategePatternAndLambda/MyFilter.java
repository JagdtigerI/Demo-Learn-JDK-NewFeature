package streamapi.useStrategePatternAndLambda;

public interface MyFilter<User>{
    boolean filter(User t);
}
