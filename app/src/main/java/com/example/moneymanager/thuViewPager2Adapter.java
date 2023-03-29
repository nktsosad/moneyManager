package com.example.moneymanager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.moneymanager.ui.thu.LoaiThuFragment;
import com.example.moneymanager.ui.thu.khoanThuFragment;

public class thuViewPager2Adapter extends FragmentStateAdapter {

    public thuViewPager2Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        if(position == 0){
            fragment = khoanThuFragment.newInstance();
        }else{
            fragment = LoaiThuFragment.newInstance();
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
