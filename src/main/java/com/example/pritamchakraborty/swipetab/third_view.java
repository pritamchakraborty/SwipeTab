package com.example.pritamchakraborty.swipetab;

import android.support.v4.app.Fragment;

/**
 * Created by Pritam Chakraborty on 6/25/2017.
 */

import com.example.pritamchakraborty.swipetab.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class third_view extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.third_view, container, false);

        return rootView;
    }

}