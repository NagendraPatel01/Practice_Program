package com.notes.recyclerviewpractice;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;


public class OneFragment extends Fragment {

    EditText bootm;
    BottomSheetDialog bottomSheetDialog;
    ImageView img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_one, container, false);

        bootm=view.findViewById(R.id.bootm);
        img=view.findViewById(R.id.img);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavigationActivity.drawer.openDrawer(Gravity.LEFT);
            }
        });


        bootm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showBottomSheetDialog();

            }
        });

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(getContext(),NavigationActivity.class);
                startActivity(intent);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),callback);

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