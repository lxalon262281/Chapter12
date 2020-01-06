package com.tester.model;

public class LoginCase {
        private int id;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getExpected() {
                return expected;
        }

        public void setExpected(String expected) {
                this.expected = expected;
        }

        private String userName;
        private String password;
        private String expected;
}
