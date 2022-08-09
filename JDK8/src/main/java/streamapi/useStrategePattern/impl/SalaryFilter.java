package streamapi.useStrategePattern.impl;


import streamapi.User;
import streamapi.useStrategePattern.MyFilter;

public class SalaryFilter implements MyFilter<User> {
    @Override
    public boolean test(User o) {
        return o.getSalary() >= 1000;
    }
}
