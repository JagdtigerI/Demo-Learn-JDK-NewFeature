package streamapi.useStrategePattern.filter.impl;


import streamapi.User;
import streamapi.useStrategePattern.filter.MyFilter;

public class SalaryFilter implements MyFilter<User> {
    @Override
    public boolean filter(User user) {
        return user.getSalary() >= 1000;
    }
}
