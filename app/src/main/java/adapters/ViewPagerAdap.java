package adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kushal.labourershub.R;

import fragments.ProfessionalFrag;
import fragments.SkilledFrag;

/**
 * Created by KUSHAL on 7/25/2017.
 */
public class ViewPagerAdap extends FragmentPagerAdapter {

//private  FragmentManager fragmentManager;
    public ViewPagerAdap(FragmentManager fm) {


        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
//ProfessionalFrag professionalFrag=new ProfessionalFrag();
  //          fragmentManager.beginTransaction().replace(R.id.replace,professionalFrag).commit();
            return new ProfessionalFrag();

        } else //if (position == 1)
        {
    //        SkilledFrag skilledFrag = new SkilledFrag();
      //      fragmentManager.beginTransaction().replace(R.id.replace, skilledFrag).commit();

            return new SkilledFrag();
        }//} else return new Fragment3();
    }

    @Override
    public int getCount() {
        return 2;
    }
}