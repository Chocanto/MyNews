package com.gacon.julien.mynews.Controllers.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gacon.julien.mynews.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusinessFragment extends Fragment {


    public static BusinessFragment newInstance() {
        return (new BusinessFragment());
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_business, container, false);
    }

}
