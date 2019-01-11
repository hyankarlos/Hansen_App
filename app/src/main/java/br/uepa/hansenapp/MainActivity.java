package br.uepa.hansenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btIniciar;
    private TextView tvInical;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btIniciar = (Button) findViewById(R.id.btIniciar);
        tvInical = (TextView) findViewById(R.id.tvInicial);

       btIniciar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, Field1.class);
               startActivity(intent);
           }
       });
    }
}
