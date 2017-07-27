package com.rlemos.minhasviagens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by rlemos on 20/07/17.
 */

public class estado_activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estados_layout);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Toast.makeText(this,bundle.getString("pais"),Toast.LENGTH_SHORT).show();

        final Intent intentCidade=  new Intent(this, cidade_activity.class);

        final ArrayList<Estado> estados = new ArrayList<Estado>();

        estados.add(new Estado(R.drawable.bandeira_al,"Alagoas","AL","BR"));
        estados.add(new Estado(R.drawable.bandeira_go,"Goiás","GO","BR"));
        estados.add(new Estado(R.drawable.bandeira_mg,"Minas Gerais","MG","BR"));
        estados.add(new Estado(R.drawable.bandeira_ms,"Mato Grosso do Sul","MS","BR"));
        estados.add(new Estado(R.drawable.bandeira_pb,"Paraíba","PB","BR"));
        estados.add(new Estado(R.drawable.bandeira_pe,"Pernambuco","PE","BR"));
        estados.add(new Estado(R.drawable.bandeira_rj,"Rio de Janeiro","RJ","BR"));
        estados.add(new Estado(R.drawable.bandeira_rn,"Rio Grande do Norte","RN","BR"));
        estados.add(new Estado(R.drawable.bandeira_sp,"São Paulo","SP","BR"));

        ListView listView = (ListView) findViewById(R.id.listEstado);

        EstadoAdapter listAdapter = new EstadoAdapter(this,estados);

        listView.setAdapter(listAdapter);


        //Adiciona o Onclick em cada Item do ArrayAdapter
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(NumbersActivity.this,"Teste de seleção de item",Toast.LENGTH_SHORT).show();
                Estado estadoAtual = estados.get(i);

                intentCidade.putExtra("Estado",estadoAtual.getSiglaEstado());
                intentCidade.putExtra("Pais",estadoAtual.getPais());
                startActivity(intentCidade);

            }

        });


    }
}
