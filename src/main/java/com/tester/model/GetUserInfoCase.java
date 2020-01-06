package com.tester.model;

public class GetUserInfoCase {
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    private int userId;

    public int getUserId() {
        return userId;
    }

    public String getExpected() {
        return expected;
    }

    private String expected;
}
