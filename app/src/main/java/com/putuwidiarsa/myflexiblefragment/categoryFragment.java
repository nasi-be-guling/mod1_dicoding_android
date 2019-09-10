package com.putuwidiarsa.myflexiblefragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class categoryFragment extends Fragment implements View.OnClickListener{


    public categoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnDetailCategory = view.findViewById(R.id.btn_detail_category);
        btnDetailCategory.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_detail_category){
            if (view.getId() == R.id.btn_detail_category) {
                DetailCategoryFragment mDetailCategoryFragment = new DetailCategoryFragment();

                Bundle mBundle = new Bundle();
                mBundle.putString(DetailCategoryFragment.EXTRA_NAME, "Lifestyle");
                String description = "Kategori ini akan berisi produk-produk lifestyle";

                mDetailCategoryFragment.setArguments(mBundle);
                mDetailCategoryFragment.setDescription(description);

                FragmentManager mFragmentManager = getFragmentManager();
                if (mFragmentManager != null) {
                    FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                    mFragmentTransaction.replace(R.id.frame_container, mDetailCategoryFragment, DetailCategoryFragment.class.getSimpleName());
                    mFragmentTransaction.addToBackStack(null);
                    mFragmentTransaction.commit();
                }
            }
        }
    }
}
