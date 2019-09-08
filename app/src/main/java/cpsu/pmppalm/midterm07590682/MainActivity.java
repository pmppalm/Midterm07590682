package cpsu.pmppalm.midterm07590682;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        //String name = intent.getStringExtra();
        Toast t = Toast.makeText(MainActivity.this,getString(R.string.welcome_text)+" Wongsathorn Jaisin",Toast.LENGTH_SHORT);
        t.show();

    }
}
