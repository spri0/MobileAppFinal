package edu.gsu.httpcs.mobileappfinal.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.gsu.httpcs.mobileappfinal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends android.support.v4.app.Fragment {
    TextView textView;

    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.page_fragment_layout,container,false);
        textView=(TextView)view.findViewById(R.id.textview);
        Bundle bundle=getArguments();
        String pages = Integer.toString(bundle.getInt("count"));
        textView.setText("Page " +pages+ "Summer 2017 Mobile App Dev Project");
        return view;
    }

}
