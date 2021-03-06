package com.rlemos.minhasviagens;

/**
 * Created by rlemos on 19/07/17.
 */

public class Cidade {
    private String mTextCidade;
    private String mDataChegada;
    private String mDescViagem;
    private String mEstado;
    private String mPais;
    private String mQtdDias;
    private String mLocalHospedagem;
    private String mPasseios;

    public Cidade(String textCidade, String dtViagem, String estado,String pais){
        mTextCidade=textCidade;
        mDataChegada=dtViagem;
        mEstado=estado;
        mPais=pais;
    }
    public Cidade(String textCidade, String dtViagem, String qtdDias,String localHospedagem, String passeios,
                  String detalhes, String estado, String pais){
        mTextCidade=textCidade;
        mDataChegada=dtViagem;
        mEstado=estado;
        mPais=pais;
        mQtdDias = qtdDias;
        mLocalHospedagem = localHospedagem;
        mPasseios= passeios;
        mDescViagem=detalhes;
    }

    public String getEstado(){
        return mEstado;
    }

    public String getPais() {return mPais;};

    public void setTextCidade(String textCidade){
        mTextCidade=textCidade;
    }
    public String getTextCidade(){
        return mTextCidade;
    }

    public void setDataChegada(String dataChegada){
        mDataChegada=dataChegada;
    }
    public String getDataChegada(){
        return  mDataChegada;
    }

    public void setDescViagem(String descViagem){mDescViagem=descViagem;}
    public String getDesViagem () { return mDescViagem;}

    public String getmQtdDias() {
        return mQtdDias;
    }

    public void setmQtdDias(String qtdDias) {
        mQtdDias = qtdDias;
    }

    public String getmLocalHospedagem() {
        return mLocalHospedagem;
    }

    public void setmLocalHospedagem(String localHospedagem) {
        mLocalHospedagem = localHospedagem;
    }

    public String getmPesseios() {
        return mPasseios;
    }

    public void setmPesseios(String passeios) {
        mPasseios = passeios;
    }
}
