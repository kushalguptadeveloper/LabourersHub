package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kushal.labourershub.R;

import adapters.SkilledAdap;
import models.SkilledModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkilledFrag extends Fragment {


    public SkilledFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =   inflater.inflate(R.layout.fragment_skilled, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.skilledrecyclerView);
        SkilledAdap adapter = new SkilledAdap(SkilledFrag.this.getActivity(), SkilledModel.getObjectList());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(SkilledFrag.this.getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

}
