package com.rlemos.minhasviagens;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by rlemos on 24/07/17.
 */

public class CidadeAdapter extends ArrayAdapter<Cidade> {
    private static final String LOG_TAG = EstadoAdapter.class.getSimpleName();

    public CidadeAdapter(Activity context, ArrayList<Cidade> cidade){
        super(context, 0, cidade);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Cidade cidade = getItem(position);

        View listView = convertView;

        //Veerifica se já tem o layout inflado e caso não tenha faz o inflaout
        if(listView==null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.model_cidade,parent,false);
        }

        //Jogar os dados da classe no textview
        TextView textCidade = (TextView) listView.findViewById(R.id.textCidade);
        textCidade.setText(cidade.getTextCidade());

        TextView dtViagem = (TextView) listView.findViewById(R.id.dtViagem);
        dtViagem.setText(cidade.getDataChegada());


        return listView;
    }

}
