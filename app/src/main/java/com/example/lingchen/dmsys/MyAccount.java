package com.example.lingchen.dmsys;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lingchen.dmsys.LoginSignup.LoginSignup;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAccount extends Fragment {

    public Button EditBtn;
    public Button LogoutBtn;

    public MyAccount() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_account, container, false);

        EditBtn = (Button) view.findViewById(R.id.EditBtn);
        return view;
        }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        EditBtn.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           //viewPager.setCurrentItem(0);
                                           //Intent i = new Intent(getActivity(), EditProfile.class);
                                          // startActivity(i);
                                       }
                                   });
        LogoutBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent j = new Intent(getActivity(), LoginSignup.class);
                startActivity(j);
            }
        });
    }
}

