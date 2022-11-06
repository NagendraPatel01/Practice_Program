package com.notes.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.io.IOException;
import java.lang.annotation.Annotation;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.notes.recyclerviewpractice.model.ErrorResponse;
import com.notes.recyclerviewpractice.model.GetModel;
import com.notes.recyclerviewpractice.model.PostModel;
import com.notes.recyclerviewpractice.networking.Myinterface;
import com.notes.recyclerviewpractice.networking.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

public class RagisterActivity extends AppCompatActivity {

    ImageView backbtn,iv_opengallery;
    CardView Signup;
    EditText ed_name,ed_email,ed_password,ed_reenterpassword;
    CheckBox checkbox;
    Uri imageUri;
    String emailType = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    String userType;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragister);

        Signup=findViewById(R.id.Signup);
        ed_name=findViewById(R.id.ed_name);
        ed_email=findViewById(R.id.ed_email);
        ed_password=findViewById(R.id.ed_password);
        ed_reenterpassword=findViewById(R.id.ed_reenterpassword);
        checkbox=findViewById(R.id.checkbox);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String E_name=ed_name.getText().toString();
                String E_email=ed_email.getText().toString();
                String E_password=ed_password.getText().toString();
                String E_re_enterpassword=ed_reenterpassword.getText().toString();

                if (TextUtils.isEmpty(E_name)){
                    Toast.makeText(RagisterActivity.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(E_email)){
                    Toast.makeText(RagisterActivity.this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
                }

                else if (!E_email.matches(emailType)) {
                    Toast.makeText(RagisterActivity.this, "Please Enter valid Email", Toast.LENGTH_SHORT).show();

                }

                else if (TextUtils.isEmpty(E_password)){

                    Toast.makeText(RagisterActivity.this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(E_re_enterpassword)){

                    Toast.makeText(RagisterActivity.this, "Please Enter Your Re-enter password", Toast.LENGTH_SHORT).show();
                }

                else if (!E_password.equals(E_re_enterpassword)) {
                    Toast.makeText(RagisterActivity.this, "password and conform password not match", Toast.LENGTH_SHORT).show();
                }

                else if (!checkbox.isChecked()){
                    Toast.makeText(RagisterActivity.this, "Please check your Terms and Condition", Toast.LENGTH_SHORT).show();
                }

               else {
                    PostModel postModel = new PostModel();
                    postModel.setEmail(E_email);
                    postModel.setName(E_name);
                    postModel.setPassword(E_password);
                    postModel.setPlatform("ANDROID");
                    postModel.setAccountType("CUSTOMER");

                    Log.d("iwuqwhuwhuiwh", "uhfiegiie" + postModel);

                    RetrofitClient.getRetrofit().create(Myinterface.class)
                            .getdata(postModel).enqueue(new Callback<GetModel>() {
                        @Override
                        public void onResponse(Call<GetModel> call, Response<GetModel> response) {

                            if (response.code() == 201) {
                                //shared pref
                                SharedPreferences sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putString("token", response.body().getToken());
                                editor.commit();

                                //second
                                startActivity(new Intent(RagisterActivity.this, LoginActivity.class));
                                Toast.makeText(RagisterActivity.this, "success fully ragister", Toast.LENGTH_SHORT).show();
                            } else {
                                Converter<ResponseBody, ErrorResponse> converter = RetrofitClient.getRetrofit()
                                        .responseBodyConverter(ErrorResponse.class, new Annotation[0]);

                                try {
                                    ErrorResponse error = converter.convert(response.errorBody());
                                    Toast.makeText(RagisterActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                            }

                        }

                        @Override
                        public void onFailure(Call<GetModel> call, Throwable t) {

                            Log.d("ehgtuehtuehgie", "faield" + t.getMessage());

                        }
                    });


                }


            }
        });
    }
}