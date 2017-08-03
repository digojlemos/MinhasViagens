package com.rlemos.minhasviagens.dados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static java.security.AccessController.getContext;

/**
 * Created by rlemos on 02/08/17.
 */

public class ViagemDbHelper extends SQLiteOpenHelper {

    private final static String DB_NAME = "viagem.db";

    private final static int DB_VERSION = 1;

    //Inicializa o banco de dados
    public ViagemDbHelper(Context context){
      super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    //Cria os códigos contidos na classe abaixo na primeira execução
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    //Em caso Upgrade do Banco de Dados
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
