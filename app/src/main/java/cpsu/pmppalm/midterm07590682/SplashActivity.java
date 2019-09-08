package cpsu.pmppalm.midterm07590682;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import cpsu.pmppalm.midterm07590682.model.Auth;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user1 = "aaa";
                String user2 = "bbb";
                String pass1 = "111";
                String pass2 = "222";
                EditText usernameEdittext = findViewById(R.id.username_editText);
                EditText passwordEdittext = findViewById(R.id.password_editText);
                final String inputUsername = usernameEdittext.getText().toString();
                final String inputPassword = passwordEdittext.getText().toString();

                Auth auth = new Auth();
                auth.setmUsername(inputUsername);
                auth.setmPassword(inputPassword);
                boolean result1 = auth.check1();
                boolean result2 = auth.check2();


                if (result1) {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    /*if (inputUsername.equals(user1) && inputPassword.equals(pass1)) {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    TextView userText = findViewById(R.id.name_textView);
                    userText.setText("Wongsathorn Assawaratanawatang");
                    //intent.putExtra(userText, "Wongsathorn Assawaratanawatang");
                    startActivity(intent);
                }*/
                } else if (result2) {
                    Intent intent = new Intent(SplashActivity.this, Main2Activity.class);
                    TextView userText = findViewById(R.id.name_textView);
                    // userText.setText("Promlert Lovichit");
                    // intent.putExtra(Key, inputUsername);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(SplashActivity.this);
                    dialog.setTitle(getString(R.string.login_fail_text));
                    //dialog.setMessage(getString(R.string.login_fail_text));

                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();

                }
            }
        });
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //todo; ในส่วนการทำงานหลังจาก delay
//                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                intent.putExtra(inputUsername,inputPassword);
//                startActivity(intent);
//                finish();
//            }
//        }, 3000);
    }
}
