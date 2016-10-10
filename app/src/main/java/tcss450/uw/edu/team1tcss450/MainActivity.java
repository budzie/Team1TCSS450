package tcss450.uw.edu.team1tcss450;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fromLan(View view){
            Intent intent = new Intent(MainActivity.this, fromLanActivity.class);
            startActivity(intent);
    };
}
