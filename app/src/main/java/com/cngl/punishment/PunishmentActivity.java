package com.cngl.punishment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class PunishmentActivity extends AppCompatActivity {

    private TextInputEditText txtPlaka,txtTc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punishment);
        initComponent();
    }

    private void initComponent() {
        txtPlaka=findViewById(R.id.txtPlaka);
        txtTc=findViewById(R.id.txtTc);
    }

    public void imageprocess(View view) {

    }

    public void punishmwnList(View view) {

    }

    public void addPunishment(View view) {

        if (!txtPlaka.equals("")){
            Intent intent=new Intent(this,TrafficPunishmentActivity.class);
            intent.putExtra("plaka",txtPlaka.getText().toString());
            startActivity(intent);
        }else{
            Intent intent=new Intent(this,TrafficPunishmentActivity.class);
            intent.putExtra("tc",txtPlaka.getText().toString());
            startActivity(intent);
        }
    }


}
