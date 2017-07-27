package com.rlemos.minhasviagens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paises_layout);

        final Intent intent=  new Intent(this, estado_activity.class);

        final TextView textoPais = (TextView) findViewById(R.id.textPais);
        textoPais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("pais","BR");
                startActivity(intent);
            }
        });
    }

}
