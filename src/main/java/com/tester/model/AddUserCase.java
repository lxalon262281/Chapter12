package com.tester.model;

public class AddUserCase {
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getPermission() {
        return permission;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public String getExpected() {
        return expected;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    private String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
