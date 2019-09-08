package cpsu.pmppalm.midterm07590682;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        //String name = intent.getStringExtra();
        Toast t = Toast.makeText(Main2Activity.this,getString(R.string.welcome_text)+" Promlert Lovichit",Toast.LENGTH_SHORT);
        t.show();
    }
}
