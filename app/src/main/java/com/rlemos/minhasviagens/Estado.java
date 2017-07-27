package com.rlemos.minhasviagens;

/**
 * Created by rlemos on 19/07/17.
 */

public class Estado {

    public Estado(int imageEstado,String textEstado,String siglaEstado,String pais){
        mImageEstado=imageEstado;
        mTextEstado=textEstado;
        mSiglaEstado=siglaEstado;
        mPais=pais;

    }
    private String mSiglaEstado;
    private int mImageEstado;
    private String mTextEstado;
    private String mPais;

    public int getImageEstado(){
        return mImageEstado;
    }
    public void setImageEstado(int imageEstado){
        mImageEstado=imageEstado;
    }

    public String getTextEstado(){
        return mTextEstado;
    }
    public void setImageEstado(String textEstado){
        mTextEstado=textEstado;
    }

    public void setSiglaEstado(String siglaEstado){
        mSiglaEstado=siglaEstado;
    }
    public String getSiglaEstado(){
        return mSiglaEstado;
    }

    public String getPais(){
        return mPais;
    }
    public void setPais(String pais){
        mPais=pais;
    }
}
