package com.notes.recyclerviewpractice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;


public class OneFragment extends Fragment {

    EditText bootm;
    BottomSheetDialog bottomSheetDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_one, container, false);

        bootm=view.findViewById(R.id.bootm);


        bootm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showBottomSheetDialog();

            }
        });

        return view;


    }

    private void showBottomSheetDialog() {

        bottomSheetDialog=new BottomSheetDialog(getContext());

        bottomSheetDialog.setContentView(R.layout.bootomsheet);

        TextView text =bottomSheetDialog.findViewById(R.id.text);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value= text.getText().toString();

                bootm.setText(value);
                bottomSheetDialog.dismiss();
            }
        });


        bottomSheetDialog.show();
    }
}