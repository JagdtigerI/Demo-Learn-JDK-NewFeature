package streamapi.useStrategePattern.impl;


import streamapi.User;
import streamapi.useStrategePattern.MyFilter;

public class AgeFilter implements MyFilter<User> {
    @Override
    public boolean test(User users) {
        return users.getAge() >= 25;
    }
}
