package br.uepa.hansenapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Field1 extends Activity {
    private Button btOp1;
    private Button btOp2;
    private Button btOp3;
    private Button btOp4;
    private Button btOp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field1);

        btOp1 = (Button) findViewById(R.id.btOpcao1);
        btOp2 = (Button) findViewById(R.id.btOpcao2);
        btOp3 = (Button) findViewById(R.id.btOpcao3);
        btOp4 = (Button) findViewById(R.id.btOpcao4);
        btOp5 = (Button) findViewById(R.id.btOpcao5);

        btOp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Field1.this, TelaResp1.class);
                startActivity(intent);
            }
        });

        btOp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Field1.this, TelaResp2.class);
                startActivity(intent);
            }
        });

        btOp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Field1.this, TelaResp3.class);
                startActivity(intent);
            }
        });

        btOp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Field1.this, TelaResp4.class);
                startActivity(intent);
            }
        });

        btOp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Field1.this, TelaResp5.class);
                startActivity(intent);
            }
        });
    }
}
