package com.rlemos.minhasviagens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by rlemos on 20/07/17.
 */

public class cidade_activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidades_layout);

        Intent intent = getIntent();
        Bundle dados = intent.getExtras();
        String estado = dados.getString("Estado");
        String pais = dados.getString("Pais");

        ArrayList<Cidade> cidades = new ArrayList<Cidade>();

        cidades.add(new Cidade("Praia Grande","08/07/2017","SP","BR"));
        cidades.add(new Cidade("Ilha Grande","30/06/2017","RJ","BR"));
        cidades.add(new Cidade("Campos do Jordão","09/06/2017","SP","BR"));
        cidades.add(new Cidade("Arraial do Cabo","10/01/2017","RJ","BR"));
        cidades.add(new Cidade("Cabo Frio","06/01/2017","RJ","BR"));

        int count = cidades.size();
        int i=0;
        Toast.makeText(this," BR ",Toast.LENGTH_LONG).show();
        ArrayList<Cidade> cidadeEscolhida = verificaCidades(cidades,estado,pais);

        ListView listView = (ListView) findViewById(R.id.listCidade);
        CidadeAdapter cidadeAdapter = new CidadeAdapter(this, cidadeEscolhida);
        listView.setAdapter(cidadeAdapter);

        Toast.makeText(this,estado+"  "+pais,Toast.LENGTH_LONG).show();

    }
    private ArrayList<Cidade> verificaCidades(ArrayList<Cidade> todasCidades, String estado, String pais){
        ArrayList<Cidade> selecionadas = new ArrayList<Cidade>();
        if(todasCidades.size()>0 && todasCidades!=null) {
            for (int i = 0; i < todasCidades.size(); i++) {
                Cidade verifica = todasCidades.get(i);
                if (verifica.getEstado().equals(estado)){
                    selecionadas.add(verifica);
                }
            }
        }
        return selecionadas;
    }


}
