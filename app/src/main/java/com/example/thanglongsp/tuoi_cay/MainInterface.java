package com.example.thanglongsp.tuoi_cay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainInterface extends AppCompatActivity {
    private Button btnCallNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
        btnCallNext =(Button)findViewById(R.id.btnOk);
        btnCallNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Intent intent = new Intent(MainInterface.this,MainActivityB.class);
            startActivity(intent);
            }
        });
    }


}
