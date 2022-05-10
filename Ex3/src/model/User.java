package model;

public class User {
    private String phone;
    private String passWord;
    private long bankAccount;

    public User(String phone, String passWord, long bankAccount) {
        this.phone = phone;
        this.passWord = passWord;
        this.bankAccount = bankAccount;
    }

    public User() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }
}
