package com.example.viewbinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.viewbinding.databinding.FragTestBinding;

public class TestFragment extends Fragment {

    private FragTestBinding mBinding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mBinding = FragTestBinding.inflate(inflater,container,false);
        mBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.tvFragment.setText("ping 프래그먼트 클릭");
            }
        });
        return mBinding.getRoot();
    }
}
