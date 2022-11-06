package com.notes.recyclerviewpractice;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.notes.recyclerviewpractice.model.MyModel;
import com.notes.recyclerviewpractice.networking.Myinterface;
import com.notes.recyclerviewpractice.networking.Retrofitclientone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyFieldActivity extends AppCompatActivity {

    EditText edit,edit1,edit2,edit3;
    CardView Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_field);

        edit=findViewById(R.id.edit);
        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        edit3=findViewById(R.id.edit3);
        Signup=findViewById(R.id.Signup);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String aid=edit.getText().toString();
                String aname=edit1.getText().toString();
                String alname=edit2.getText().toString();
                String ano=edit3.getText().toString();

                if (aid.isEmpty()){

                    Toast.makeText(MyFieldActivity.this, "Enter ID", Toast.LENGTH_SHORT).show();
                }

                else if (aname.isEmpty()){
                    Toast.makeText(MyFieldActivity.this, "Enter Fname", Toast.LENGTH_SHORT).show();

                }

                else if (alname.isEmpty()){
                    Toast.makeText(MyFieldActivity.this, "Enter Lname", Toast.LENGTH_SHORT).show();

                }

                else if (ano.isEmpty()){
                    Toast.makeText(MyFieldActivity.this, "Enter Mobile", Toast.LENGTH_SHORT).show();

                }

                else {

                    Retrofitclientone.getRetrofitone().create(Myinterface.class)
                            .Myfield(aid,aname,alname,ano)
                            .enqueue(new Callback<MyModel>() {
                                @Override
                                public void onResponse(Call<MyModel> call, Response<MyModel> response) {

                                    Log.d("data", "onResponse: "+response);
                                    Log.d("alldata", "onResponse: "+response.body());

                                    Toast.makeText(MyFieldActivity.this, "Data Added Successfully", Toast.LENGTH_SHORT).show();

                                }

                                @Override
                                public void onFailure(Call<MyModel> call, Throwable t) {
                                    Log.d("fuejjj", "onFailure: "+t.getMessage());

                                    Toast.makeText(MyFieldActivity.this, "Data Not Added", Toast.LENGTH_SHORT).show();


                                }
                            });

                }

            }
        });


    }


}