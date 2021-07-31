package com.example.luuhuuduong_ktra2_bai1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;



public class FragmentAdapter  extends FragmentStatePagerAdapter {
    private int numPage = 3;
    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 : return  new JavaFragment() ;
            case 1 : return  new PythonFragment() ;
            case 2 : return new CFragment();
            default:return new JavaFragment() ;
        }
    }

    @Override
    public int getCount() {
        return numPage;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0 : return  "Java" ;
            case 1 : return  "Python" ;
            case 2 : return "C ++ ";
            default:return "Java" ;
        }
    }

}
