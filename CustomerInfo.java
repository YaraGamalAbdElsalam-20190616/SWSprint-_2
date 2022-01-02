package phase_2;

import java.time.LocalDate;

public class CustomerInfo implements User //implements Notification {
{
    private String UserName;
    private String MobileNum;
    private String Email;
    private String Password;
    private LocalDate BirthDate;//2022-01-02

    public void setBirthDate(LocalDate BirthDate) {
        this.BirthDate = BirthDate;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public CustomerInfo() {

    }

    public CustomerInfo(String name, String pass, String email, String mobilenum, LocalDate birthDate) {
        UserName = name;
        Password = pass;
        Email = email;
        MobileNum = mobilenum;
        BirthDate=birthDate;
        
    }

    @Override
    public String getUserName() {
        return UserName;
    }

    @Override
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    @Override
    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String getMobileNum() {
        return MobileNum;
    }

    @Override
    public void setMobileNum(String MobileNum) {
        this.MobileNum = MobileNum;
    }
}
