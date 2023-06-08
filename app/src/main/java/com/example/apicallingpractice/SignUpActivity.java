package com.example.apicallingpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.apicallingpractice.model.Signup;
import com.example.apicallingpractice.networking.MyInterFace;
import com.example.apicallingpractice.networking.RetrofitClienttwo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {

    EditText name,mobile,email,address,pincode,govid,driving,password,lat,lng,fcmid,status,deliveryfee;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name=findViewById(R.id.name);
        mobile=findViewById(R.id.mobile);
        email=findViewById(R.id.email);
        address=findViewById(R.id.address);
        pincode=findViewById(R.id.pincode);
        govid=findViewById(R.id.govid);
        driving=findViewById(R.id.driving);
        password=findViewById(R.id.password);
        lat=findViewById(R.id.lat);
        lng=findViewById(R.id.lng);
        fcmid=findViewById(R.id.fcmid);
        status=findViewById(R.id.status);
        deliveryfee=findViewById(R.id.deliveryfee);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RetrofitClienttwo.getRetrofit().create(MyInterFace.class)
                        .deliveryboysignup("jaggu","jaggu@gmail.com","1212123434","charimli","462014","123456","1234","23","india","mumbai","123","12","1").enqueue(new Callback<Signup>() {
                    @Override
                    public void onResponse(Call<Signup> call, Response<Signup> response) {

                        Log.d("dfjijrhijriho", "onResponse: "+response);
                        Log.d("erhjtiouerhoiuyehr", "onResponse: "+response.body());

                        Intent i = new Intent(getApplicationContext(), SignUpActivity.class);
                        Toast.makeText(SignUpActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                        startActivity(i);

                    }

                    @Override
                    public void onFailure(Call<Signup> call, Throwable t) {

                        Log.d("hguerhguerhgureu", "onResponse: "+t.getMessage());

                        Toast.makeText(SignUpActivity.this, "Ragistration Field", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

    }
}