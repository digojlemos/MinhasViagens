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
 * Created by rlemos on 20/07/17.
 */

public class EstadoAdapter extends ArrayAdapter<Estado> {

    private static final String LOG_TAG = EstadoAdapter.class.getSimpleName();

    public EstadoAdapter(Activity context, ArrayList<Estado> estado){
        super(context, 0, estado);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Estado estado = getItem(position);

        View listView = convertView;

        if(listView==null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.model_estados,parent,false);
        }

        ImageView imageEstado = (ImageView) listView.findViewById(R.id.bandeiraEstado);
        imageEstado.setImageResource(estado.getImageEstado());

        TextView textoEstado = (TextView) listView.findViewById(R.id.textoEstados);
        textoEstado.setText(estado.getTextEstado());


        return listView;
    }
}
