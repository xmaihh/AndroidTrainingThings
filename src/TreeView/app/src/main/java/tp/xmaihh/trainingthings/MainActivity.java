package tp.xmaihh.trainingthings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tp.xmaihh.trainingthings.multitype.MultiTypeActivity;
import tp.xmaihh.trainingthings.retrofithttp.ui.RetrofitActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Thread(() -> startActivity(new Intent(MainActivity.this, RetrofitActivity.class))).start();
    }
    
}
