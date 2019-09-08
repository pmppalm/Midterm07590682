package cpsu.pmppalm.midterm07590682.model;

import android.widget.TextView;

import cpsu.pmppalm.midterm07590682.R;

public class Auth {
    private final String Username1 = "aaa";
    private final String Username2 = "bbb";
    private final String Password1 = "111";
    private final String Password2 = "222";

    private String mUsername;
    private String mPassword;

    public Auth(){

    }
    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public boolean check1() {
        if (mUsername.equals(Username1) && mPassword.equals(Password1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check2() {
        if (mPassword.equals(Password2) && mUsername.equals(Username2)) {
            return true;
        } else {
            return false;
        }
    }
}
