package com.example.doancuoiki;

public class example {
}

/*import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.doan.R;
import com.example.doan.until.CheckConnection;
import com.example.doan.until.server;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Register extends AppCompatActivity {

    Button btnDangky,btnexit;
    EditText edtTenKhachHang, edtEmailDK, edtMatKhau, edtNhapLaiMatKhau;
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        if(CheckConnection.haveNetworkConnection(getApplicationContext())) {

           AnhXa();
           Dangky();


        }
        else{
            CheckConnection.ShowToast_Short(getApplicationContext()," Kiểm tra kết nối");
            finish(); }
    }



    private void Dangky() {
        btnDangky.setOnClickListener(v -> {
            String hoTen = edtTenKhachHang.getText().toString().trim();
            String email = edtEmailDK.getText().toString().trim();
            String matkhau = edtMatKhau.getText().toString().trim();
            String nhaplaimatkhau = edtNhapLaiMatKhau.getText().toString().trim();
            if (!matkhau.equals(nhaplaimatkhau)) {
                Toast.makeText(Register.this, "Mật khẩu nhập lại không trùng nhau.", Toast.LENGTH_LONG).show();
            }else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                Toast.makeText(Register.this,"Không đúng định dạng email",Toast.LENGTH_LONG).show();
            } else if (!hoTen.equals("") && !email.equals("") && !matkhau.equals("")) {
                StringRequest stringRequest = new StringRequest(Request.Method.POST, server.DuongDanregister, response -> {
                    if (response.equals("success")) {

                        //Toast.makeText(Register.this, "Đăng ký thành công", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Register.this, custom_dialog.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Register.this, "Đăng ký thất bại", Toast.LENGTH_LONG).show();
                    }
                }
                        , new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Register.this, error.toString().trim(), Toast.LENGTH_LONG).show();
                    }
                }
                ) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> data = new HashMap<>();
                        data.put("name", hoTen);
                        data.put("email", email);
                        data.put("password", matkhau);
                        return data;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
                requestQueue.add(stringRequest);
            }else {
                Toast.makeText(Register.this,"Mời bạn nhập đầy đủ thông tin.",Toast.LENGTH_LONG).show();
            }

        });
    }

    private void AnhXa() {
        btnDangky = findViewById(R.id.btnRegister);
        edtTenKhachHang = findViewById(R.id.inputName);
        edtEmailDK = findViewById(R.id.inputEmail);
        edtMatKhau = findViewById(R.id.inputPassword);
        edtNhapLaiMatKhau = findViewById(R.id.inputconfirm);

    }
}*/