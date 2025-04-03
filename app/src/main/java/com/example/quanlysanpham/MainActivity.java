package com.example.quanlysanpham;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo các thành phần giao diện
    private EditText etTenSanPham, etDonGia, etGiaBan, etDonViTinh, etMoTa;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần giao diện
        etTenSanPham = findViewById(R.id.etTenSanPham);
        etDonGia = findViewById(R.id.etDonGia);
        etGiaBan = findViewById(R.id.etGiaBan);
        etDonViTinh = findViewById(R.id.etDonViTinh);
        etMoTa = findViewById(R.id.etMoTa);
        btnBack = findViewById(R.id.btnBack);

        // Xử lý sự kiện nhấn nút Quay lại
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Đóng activity hiện tại
            }
        });
    }
}