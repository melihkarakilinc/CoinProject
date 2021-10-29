package com.melihkarakilinc.ftproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.melihkarakilinc.ftproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;
    Float oldValue,newValue;
    Integer color = R.color.black;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        viewModel.getRxEth().observe(this, new Observer<Root>() {
            @Override
            public void onChanged(Root root) {

                Float Ea1 = Float.parseFloat(root.getResult().XETHZUSD.a.get(0));
                binding.txtEa1.setText(Ea1.toString());

                binding.txtEa2.setText(root.getResult().XETHZUSD.a.get(1));

                Float Ea3 = Float.parseFloat(root.getResult().XETHZUSD.a.get(2));
                binding.txtEa3.setText(Ea3.toString());

                Float Eb1 = Float.parseFloat(root.getResult().XETHZUSD.b.get(0));
                binding.txtEb1.setText(Eb1.toString());

                binding.txtEb2.setText(root.getResult().XETHZUSD.b.get(1));

                Float Eb3 = Float.parseFloat(root.getResult().XETHZUSD.b.get(2));
                binding.txtEb3.setText(Eb3.toString());
            }
        });

        viewModel.getRxBtz().observe(this, new Observer<Root>() {
            @Override
            public void onChanged(Root root) {

                Float Ba1 = Float.parseFloat(root.getResult().XXBTZUSD.a.get(0));
                binding.txtBa1.setText(Ba1.toString());

                binding.txtBa2.setText(root.getResult().XXBTZUSD.a.get(1));

                Float Ba3 = Float.parseFloat(root.getResult().XXBTZUSD.a.get(2));
                binding.txtBa3.setText(Ba3.toString());

                Float Bb1 = Float.parseFloat(root.getResult().XXBTZUSD.b.get(0));
                binding.txtBb1.setText(Bb1.toString());

                binding.txtBb2.setText(root.getResult().XXBTZUSD.b.get(1));

                Float Bb3 = Float.parseFloat(root.getResult().XXBTZUSD.b.get(2));
                binding.txtBb3.setText(Bb3.toString());
            }
        });
    }
}