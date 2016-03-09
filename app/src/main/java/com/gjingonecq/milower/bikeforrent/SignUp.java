package com.gjingonecq.milower.bikeforrent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private EditText idCardEditText, passwordEditText;
    private String idCardString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindWidget();
    }

    private void bindWidget() {
        idCardEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
    }

    public void clickSignUpSign(View view){
        idCardString = idCardEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        if (idCardString.equals("") || passwordString.equals("")) {
                myToast("กรุณากรอกให้ครบ คะ");
        }
        else {

        }
    }

    private void checkIDCard(){
        if(idCardString.length()==13){

        }else{
            myToast("รหัสไม่ถูกต้อง");
        }
    }

    private void myToast(String strToase) {
        Toast.makeText(SignUp.this, strToase, Toast.LENGTH_SHORT).show();
    }
}
