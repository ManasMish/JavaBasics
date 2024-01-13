package oops_class10_13_01_2024.encapsulation;

public class vwologinfxd {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private void manas()
    {
        System.out.println("I am manas method");
    }

    private String username;
    private String password;

    vwologinfxd(String u,String p)
    {
        this.username=u;
        this.password=p;
    }
    boolean isloggedin(String username,String password)
    {
        if((this.username.equalsIgnoreCase(username))&&(this.password.equalsIgnoreCase(password)))
        {
            System.out.println("Logged in");
            return true;
        }
        else
        {
            System.out.println("Wrong credentials");
            return false;
        }
    }

}
