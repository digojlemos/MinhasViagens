package com.rlemos.minhasviagens;

import android.app.Activity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by rlemos on 20/07/17.
 */

public class cidadeAdapter extends ArrayAdapter<Cidade> {
    private static final String LOG_TAG = cidadeAdapter.class.getSimpleName();

    public cidadeAdapter(Activity context, ArrayList<Cidade> cidade){
        super(context, 0, cidade);
    }
}
