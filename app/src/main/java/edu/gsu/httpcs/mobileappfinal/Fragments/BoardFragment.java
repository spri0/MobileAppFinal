package edu.gsu.httpcs.mobileappfinal.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import edu.gsu.httpcs.mobileappfinal.R;

public class BoardFragment extends Fragment {

    public BoardFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.activity_board_fragment, container, false);

        String[] boardItems={"Something here",
                            "Another something",
                             "Something again"           };

        ListView listView=(ListView) view.findViewById(R.id.boardMenu);

        ArrayAdapter<String> listViewAdapter=new ArrayAdapter<String>(
            getActivity(),
            android.R.layout.simple_list_item_2,
            boardItems

        );
        listView.setAdapter(listViewAdapter);
        return view;
    }
}
