package com.betagro.adulvitc.adulvitcservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.betagro.adulvitc.adulvitcservice.MainActivity;
import com.betagro.adulvitc.adulvitcservice.R;

/**
 * Created by Adulvitc on 28/10/2560.
 */

public class RegisterFragment extends Fragment{

//    Explicit
    private String nameString,userString, passwordString;




    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

//        Save Controller
        saveController();


    }// Main Method

    private void saveController() {
        ImageView imageView = getView().findViewById(R.id.imvSave);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//              Get Value from Edit text ( การผูกตัวแปร )
                EditText nameEditText = getView().findViewById(R.id.edtName);
                EditText userEditText = getView().findViewById(R.id.edtUser);
                EditText passwordEditText = getView().findViewById(R.id.edtPassword);


//              Change Type Value to String ( การแปลงตัวแปรจาก EditText เป็น String )
                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();


//              Check Space ( สิ่งที่กรอกมีความว่างเปล่าอยู่หรือไม่ )
                if (nameString.equals("") || userString.equals("") || passwordString.equals("")) {
//                    Have Space ( ภาวะที่เป็น True )





                } else {
//                    No Space ( ภาวะที่เป็น False )


                }







            }   //Onclick
        });

    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).setTitle(getResources().getString(R.string.new_register));

        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });



    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_register,
                container, false);
        return view;
    }
}   //Main Class
