package oops_class10_13_01_2024.encapsulation;

public class vwologin {
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

   private String userid;

    public String getPassword() {
        return Password;
    }

   private String Password;
    public vwologin(String userid,String password)
    {
        this.userid=userid;
        this.Password=password;
    }
    boolean isloggedin(String useid,String password)
    {
        if(((this.userid.equalsIgnoreCase(useid))&&(this.Password.equalsIgnoreCase(password))))
        {
            System.out.println("Logged In");
            return true;
        }
        else
        {
            System.out.println("Wrong credentials");
            return false;
        }

    }

}
