package com.warkiz.tickseekbar.sample.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.warkiz.tickseekbar.TickSeekBar;
import com.warkiz.tickseekbar.sample.R;

/**
 * created by zhuangguangquan on 2018/6/6
 */

public class CustomFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.custom;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TickSeekBar seekBar = view.findViewById(R.id.custom_seek_bar);
        seekBar.setTickProgressArray(new int[]{0, 17, 56, 108});
        seekBar.tickColorArray(new int[]{
                Color.parseColor("#cdaf13"),
                Color.parseColor("#999999"),
                Color.parseColor("#d15759"),
                Color.parseColor("#333333")
        });
    }
}
