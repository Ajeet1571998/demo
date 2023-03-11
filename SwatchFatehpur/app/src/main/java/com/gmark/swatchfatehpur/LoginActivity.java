package com.example.swatchfatehpur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.example.swatchfatehpur.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    String dob="";
    DatePickerDialog datePicker;
    int day,year,month;
    Calendar calendar;
    private FirebaseAuth mAuth;
    private String verificationId;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mAuth = FirebaseAuth.getInstance();
        binding.checkbox.setTag("false");

    }

    public void selectDOB(View view) {
        calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);

        datePicker = new DatePickerDialog(LoginActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
                // adding the selected date in the edittext
                binding.etDob.setText(dayOfMonth + "-" + (month + 1) + "-" + year);
                dob=dayOfMonth + "-" + (month + 1) + "-" + year;

            }
        }, year, month, day);

        // set maximum date to be selected as today
        datePicker.getDatePicker().setMaxDate(calendar.getTimeInMillis());

        // show the dialog
        datePicker.show();

    }

    public void submit(View view) {
        if (binding.etFullAddress.length()==0){
            Toast.makeText(this, "Please enter your name !", Toast.LENGTH_SHORT).show();
        }else if (binding.etFathername.length()==0){
            Toast.makeText(this, "Please enter your Father name !", Toast.LENGTH_SHORT).show();
            }else if (binding.etFathername.length()==0){
            Toast.makeText(this, "Please enter your Father name !", Toast.LENGTH_SHORT).show();
        }else if (binding.etEmail.length()==0){
            Toast.makeText(this, "Please enter your Valid Email !", Toast.LENGTH_SHORT).show();
        }else if (binding.etMobile.length()==0||binding.etMobile.length()<10){
            Toast.makeText(this, "Please enter your Phone no !", Toast.LENGTH_SHORT).show();
        }
        else if (dob.equalsIgnoreCase("")){
            Toast.makeText(this, "Please enter your Birth Date !", Toast.LENGTH_SHORT).show();
        }else if (binding.etBoard.length()==0){
            Toast.makeText(this, "Please enter your 12th Board Name !", Toast.LENGTH_SHORT).show();
        }else if (binding.et12Passing.length()==0){
            Toast.makeText(this, "Please enter your 12th passing year !", Toast.LENGTH_SHORT).show();
        }else if (binding.et12Mark.length()==0){
            Toast.makeText(this, "Please enter your 12th Mark obtained !", Toast.LENGTH_SHORT).show();
        }else if (binding.etUniversity.length()==0){
            Toast.makeText(this, "Please enter your University !", Toast.LENGTH_SHORT).show();
        }else if (binding.etGraduationPassingYear.length()==0){
            Toast.makeText(this, "Please enter your Graduation passing year !", Toast.LENGTH_SHORT).show();
        }else if (binding.etGraduationMark.length()==0){
            Toast.makeText(this, "Please enter your Graduation Mark obtained !", Toast.LENGTH_SHORT).show();
        }else if (binding.etFullAddress.length()==0){
            Toast.makeText(this, "Please enter your full Address !", Toast.LENGTH_SHORT).show();
        }else if (binding.checkbox.getTag().equals("false")){
            Toast.makeText(this, "Please Read  Terms & Conditions !", Toast.LENGTH_SHORT).show();
            }else {
            if (AppConfig.isNetworkConnectedMainThred(this)){
                String phone = "+91" + binding.etMobile.getText().toString();
                sendVerificationCode(phone);
            }else {
                Toast.makeText(this, "Check your Internet Connection !", Toast.LENGTH_SHORT).show();
            }

        }
        }

    public void getWardApi(){
        ProgressDialog dialog=ProgressDialog.show(this,"","loading..");
        ApiServices apiServices=API_Config.getApiClient_ByPost();
        Call<ResponseGetRegistration> call=apiServices.Getlogin(binding.etFullName.getText().toString(),binding.etMothername.getText().toString(),binding.etEmail.getText().toString(),binding.etMobile.getText().toString(),binding.etPassport.getText().toString(),dob,binding.et12Passing.getText().toString(),binding.et12Mark.getText().toString(),binding.etGraduationPassingYear.getText().toString(),binding.etGraduationMark.getText().toString(),binding.etFullAddress.getText().toString(),binding.etFathername.getText().toString());
        call.enqueue(new Callback<ResponseGetRegistration>() {
            @Override
            public void onResponse(Call<ResponseGetRegistration> call, Response<ResponseGetRegistration> response) {
                dialog.dismiss();
                if (response.body().isError()==false){
                    startActivity(new Intent(getApplicationContext(),Confirmation.class));
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, response.body().getMsg(), Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onFailure(Call<ResponseGetRegistration> call, Throwable t) {
                dialog.dismiss();

            }
        });
    }


    public void viewCheckbox(View view) {
        if (binding.checkbox.getTag().equals("false")){
            binding.checkbox.setChecked(true);
            binding.checkbox.setTag("true");
        }else {
            binding.checkbox.setChecked(false);
            binding.checkbox.setTag("false");
        }
    }


    private void signInWithCredential(PhoneAuthCredential credential) {
        // inside this method we are checking if
        // the code entered is correct or not.
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // if the code is correct and the task is successful
                            // we are sending our user to new activity.
//                            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
//                            startActivity(i);
//                            finish();
                            binding.progressBar.setVisibility(View.GONE);
                            getWardApi();
                        } else {
                            // if the code is not correct then we are
                            // displaying an error message to the user.
                            Toast.makeText(LoginActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }


    private void sendVerificationCode(String number) {
        binding.progressBar.setVisibility(View.VISIBLE);
        // this method is used for getting
        // OTP on user phone number.
        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber(number)            // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // Activity (for callback binding)
                        .setCallbacks(mCallBack)           // OnVerificationStateChangedCallbacks
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
    }

    // callback method is called on Phone auth provider.
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks

            // initializing our callbacks for on
            // verification callback method.
            mCallBack = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        // below method is used when
        // OTP is sent from Firebase
        @Override
        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            // when we receive the OTP it
            // contains a unique id which
            // we are storing in our string
            // which we have already created.
            verificationId = s;

            CallOTPPopup();
        }

        // this method is called when user
        // receive OTP from Firebase.
        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            // below line is used for getting OTP code
            // which is sent in phone auth credentials.
            final String code = phoneAuthCredential.getSmsCode();
//            CallOTPPopup();

            // checking if the code
            // is null or not.
            if (code != null) {
                // if the code is not null then
                // we are setting that code to
                // our OTP edittext field.
//                edtOTP.setText(code);



                // after setting this code
                // to OTP edittext field we
                // are calling our verifycode method.
//                verifyCode(code);
            }
        }

        // this method is called when firebase doesn't
        // sends our OTP code due to any error or issue.
        @Override
        public void onVerificationFailed(FirebaseException e) {
            // displaying error message with firebase exception.
            Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
            binding.progressBar.setVisibility(View.GONE);
        }
    };

    // below method is use to verify code from Firebase.
    private void verifyCode(String code) {
        // below line is used for getting
        // credentials from our verification id and code.
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, code);

        // after getting credential we are
        // calling sign in method.
        signInWithCredential(credential);
    }



    private void CallOTPPopup() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflaterAndroid = LayoutInflater.from(this);
        View view = layoutInflaterAndroid.inflate(R.layout.otp_popup, null);
        builder.setView(view);
        builder.setCancelable(false);
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();


        Button btn_verify=view.findViewById(R.id.btn_verify);
        EditText et_otp=view.findViewById(R.id.et_otp);
        ImageView iv_cancel=view.findViewById(R.id.iv_cancel);
        binding.progressBar.setVisibility(View.GONE);

        iv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_otp.length()<6){
                    Toast.makeText(LoginActivity.this, "Enter Otp 6 digit valid OTP !", Toast.LENGTH_SHORT).show();
                }else {
                    binding.progressBar.setVisibility(View.VISIBLE);
                    verifyCode(et_otp.getText().toString());
                }
                alertDialog.dismiss();
            }
        });

    }



}

