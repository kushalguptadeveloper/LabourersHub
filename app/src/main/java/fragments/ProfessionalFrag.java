package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kushal.labourershub.R;

import adapters.ProfessionalAdap;
import models.ProfessionalModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfessionalFrag extends Fragment {


    public ProfessionalFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_professional, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.professionalrecyclerView);
        ProfessionalAdap aadapter = new ProfessionalAdap(ProfessionalFrag.this.getActivity(), ProfessionalModel.getObList());
        recyclerView.setAdapter(aadapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(ProfessionalFrag.this.getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        return view;

    }

}
