package com.notes.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.notes.recyclerviewpractice.model.LoginRequest;
import com.notes.recyclerviewpractice.model.LoginRespons;
import com.notes.recyclerviewpractice.networking.Myinterface;
import com.notes.recyclerviewpractice.networking.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    //Practive practive;
    // ArrayList<Practive.Datum> practive;

    TextView forget_pasword;
    EditText ed_password, ed_email;
    CardView login_btn;
    String emailType = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    String token;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forget_pasword = findViewById(R.id.forget_pasword);
        ed_email = findViewById(R.id.ed_email);
        ed_password = findViewById(R.id.ed_password);
        login_btn = findViewById(R.id.login_btn);


        // forget_pasword.setText(practive.get(0).getId());

        // forget_pasword.setText(practive.getData().getName());
        //   forget_pasword.setText(practive.getData().getMetadata().getEmail());

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = ed_email.getText().toString();
                String password = ed_password.getText().toString();
                if (TextUtils.isEmpty(email)) {

                    Toast.makeText(LoginActivity.this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
                } else if (!email.matches(emailType)) {

                    Toast.makeText(LoginActivity.this, "Please Enter Your valid Email", Toast.LENGTH_SHORT).show();

                } else if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
                } else {

                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setAccountType("CUSTOMER");
                    loginRequest.setPlatform("ANDROID");
                    loginRequest.setEmail(email);
                    loginRequest.setPassword(password);

                    Log.d("uetierp8u", "onClick: " + loginRequest);

                    RetrofitClient.getRetrofit().create(Myinterface.class)
                            .Loginuser(loginRequest).enqueue(new Callback<LoginRespons>() {
                        @Override
                        public void onResponse(Call<LoginRespons> call, Response<LoginRespons> response) {

                            Log.d("uheguieyhilgeu", "loginurl " + response);
                            Log.d("uheguieyhilgeu", "loginbody " + response.body());


                            if (response.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                            } else {

                                Toast.makeText(LoginActivity.this, "Login Field", Toast.LENGTH_SHORT).show();

                            }
                        }

                        @Override
                        public void onFailure(Call<LoginRespons> call, Throwable t) {

                            Log.d("suieuyweri8lu", "onFailure: " + t.getMessage());

                        }
                    });
                }
            }
        });

    }
}