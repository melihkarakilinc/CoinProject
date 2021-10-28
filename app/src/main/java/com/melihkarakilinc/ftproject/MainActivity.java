package com.melihkarakilinc.ftproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.melihkarakilinc.ftproject.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        viewModel.getETHResponse().observe(this, new Observer<Root>() {
            @Override
            public void onChanged(Root root) {
                binding.txtEa1.setText(root.getResult().XETHZUSD.a.get(0));
                binding.txtEa2.setText(root.getResult().XETHZUSD.a.get(1));
                binding.txtEa3.setText(root.getResult().XETHZUSD.a.get(2));

                binding.txtEb1.setText(root.getResult().XETHZUSD.b.get(0));
                binding.txtEb2.setText(root.getResult().XETHZUSD.b.get(1));
                binding.txtEb3.setText(root.getResult().XETHZUSD.b.get(2));

            }
        });

        viewModel.getBTZResponse().observe(this, new Observer<Root>() {
            @Override
            public void onChanged(Root root) {
                binding.txtBa1.setText(root.getResult().XXBTZUSD.a.get(0));
                binding.txtBa2.setText(root.getResult().XXBTZUSD.a.get(1));
                binding.txtBa3.setText(root.getResult().XXBTZUSD.a.get(2));

                binding.txtBb1.setText(root.getResult().XXBTZUSD.b.get(0));
                binding.txtBb2.setText(root.getResult().XXBTZUSD.b.get(1));
                binding.txtBb3.setText(root.getResult().XXBTZUSD.b.get(2));
            }
        });

    }
}