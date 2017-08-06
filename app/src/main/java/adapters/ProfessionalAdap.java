package adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kushal.labourershub.DetailScrolling;
import com.example.kushal.labourershub.R;

import java.util.ArrayList;

import models.ProfessionalModel;
import models.SkilledModel;

/**
 * Created by KUSHAL on 7/25/2017.
 */
public class ProfessionalAdap extends RecyclerView.Adapter<ProfessionalAdap.MyViewHolder> {

    private ArrayList<ProfessionalModel> obList;
    private LayoutInflater inflater;

    public ProfessionalAdap(Context c, ArrayList<ProfessionalModel> obList) {
        inflater = LayoutInflater.from(c);
        this.obList=obList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ProfessionalModel professionalModel = obList.get(position);
        holder.setData(professionalModel, position);
    }

    @Override
    public int getItemCount() {
        return obList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv;
        private TextView tv;
        private int position;
        private ProfessionalModel professionalModel;
        public MyViewHolder(final View itemView) {
            super(itemView);

            iv=(ImageView) itemView.findViewById(R.id.myImageView);
            tv=(TextView) itemView.findViewById(R.id.myImageViewText);
itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(itemView.getContext(), DetailScrolling.class);
         i.putExtra("title",obList.get(position).getTitle());
         i.putExtra("imageResourceID",obList.get(position).getImageID());
        i.putExtra("imageDescription",obList.get(position).getDescription());
          itemView.getContext().startActivity(i);
    }
});


                                            //Intent i=new Intent(itemView.getContext(), DetailScrolling.class);
                                           // i.putExtra("title",obList.get(position).getTitle());
                                           // i.putExtra("imageResourceID",obList.get(position).getImageID());
                                            //i.putExtra("imageDescription",obList.get(position).getDescription());
                                          //  itemView.getContext().startActivity(i);


        }

        public void setData(ProfessionalModel professionalModel, int position) {

            this.iv.setImageResource(professionalModel.getImageID());
            this.tv.setText(professionalModel.getTitle());
            this.professionalModel = professionalModel;
            this.position=position;

        }
    }
}
