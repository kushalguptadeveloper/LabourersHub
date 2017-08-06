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

import models.SkilledModel;

/**
 * Created by KUSHAL on 7/25/2017.
 */
public class SkilledAdap extends RecyclerView.Adapter<SkilledAdap.MyViewHolder> {

    private ArrayList<SkilledModel> objectList;
    private LayoutInflater inflater;

    public SkilledAdap(Context context, ArrayList<SkilledModel> objectList) {
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;



    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SkilledModel skilledModel = objectList.get(position);
        holder.setData(skilledModel, position);

    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv;
        private TextView tv;
        private int position;
        private SkilledModel skilledModel;
private Context context;
        public MyViewHolder(View view) {
            super(view);

            iv=(ImageView) itemView.findViewById(R.id.myImageView);
            tv=(TextView) itemView.findViewById(R.id.myImageViewText);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

//int k=getAdapterPosition();
                  //  SkilledModel mode=objectList.get(position);
                    Intent i=new Intent(view.getContext(), DetailScrolling.class);
                    i.putExtra("title",objectList.get(position).getTitle());
                    i.putExtra("imageResourceID",objectList.get(position).getImageID());
             i.putExtra("imageDescription",objectList.get(position).getDescription());


                    view.getContext().startActivity(i);
                  //  Toast.makeText(view.getContext(), "position" + mode.getTitle(), Toast.LENGTH_SHORT).show();
                    //AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    //BlankFragment blankFragment= new BlankFragment();

                  //  activity.getSupportFragmentManager().beginTransaction().replace(R.id.view_pager,blankFragment.newinstance(objectList.get(position))).addToBackStack(null).commit();



                }
            });

        }

        public void setData(SkilledModel skilledModel, int position) {
            this.iv.setImageResource(skilledModel.getImageID());
            this.tv.setText(skilledModel.getTitle());
            this.skilledModel = skilledModel;
            this.position=position;

        }



        }
    }

