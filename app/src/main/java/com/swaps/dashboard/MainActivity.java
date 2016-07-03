package com.swaps.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bProfile, bEnquiries, bQuotations, bOrders, bPayHistory, bReports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);

        init();
    }

    private void init() {
        bProfile = (Button) findViewById(R.id.btn_profile);
        bEnquiries = (Button) findViewById(R.id.btn_enquiries);
        bQuotations = (Button) findViewById(R.id.btn_quotations);
        bOrders = (Button) findViewById(R.id.btn_orders);
        bPayHistory = (Button) findViewById(R.id.btn_pay_history);
        bReports = (Button) findViewById(R.id.btn_reports);

        bProfile.setOnClickListener(this);
        bEnquiries.setOnClickListener(this);
        bQuotations.setOnClickListener(this);
        bOrders.setOnClickListener(this);
        bPayHistory.setOnClickListener(this);
        bReports.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i = null;
        switch (id) {
            case R.id.btn_profile:
                Toast.makeText(this, "Profile!", Toast.LENGTH_SHORT).show();
                i = new Intent(MainActivity.this, Profile.class);
                startActivity(i);
                break;
            case R.id.btn_enquiries:
                Toast.makeText(this, "Enquiries!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_quotations:
                Toast.makeText(this, "Quotations!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_orders:
                Toast.makeText(this, "Orders!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_pay_history:
                Toast.makeText(this, "Pay History!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_reports:
                Toast.makeText(this, "Reports!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
