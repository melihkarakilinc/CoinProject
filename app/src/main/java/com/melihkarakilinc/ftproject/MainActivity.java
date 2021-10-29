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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        viewModel.getRxEth().observe(this, new Observer<Root>() {
            @Override
            public void onChanged(Root root) {

                oldValue=Float.parseFloat(binding.txtEa1.getText().toString());
                Float Ea1 = Float.parseFloat(root.getResult().XETHZUSD.a.get(0));
                binding.txtEa1.setText(Ea1.toString());
                newValue=Float.parseFloat(binding.txtEa1.getText().toString());
                binding.txtEa1.setBackgroundColor(setColor(oldValue,newValue));
                //////////////////////////////////////////////////////////////
                oldValue=Float.parseFloat(binding.txtEa2.getText().toString());
                binding.txtEa2.setText(root.getResult().XETHZUSD.a.get(1));
                newValue=Float.parseFloat(binding.txtEa2.getText().toString());
                binding.txtEa2.setBackgroundColor(setColor(oldValue,newValue));
                //////////////////////////////////////////////////////////////
                oldValue=Float.parseFloat(binding.txtEa3.getText().toString());
                Float Ea3 = Float.parseFloat(root.getResult().XETHZUSD.a.get(2));
                binding.txtEa3.setText(Ea3.toString());
                newValue=Float.parseFloat(binding.txtEa3.getText().toString());
                binding.txtEa3.setBackgroundColor(setColor(oldValue,newValue));
                //////////////////////////////////////////////////////////////



                oldValue=Float.parseFloat(binding.txtBa1.getText().toString());
                Float Eb1 = Float.parseFloat(root.getResult().XETHZUSD.b.get(0));
                binding.txtEb1.setText(Eb1.toString());
                newValue=Float.parseFloat(binding.txtEb1.getText().toString());
                binding.txtEb1.setBackgroundColor(setColor(oldValue,newValue));
                //////////////////////////////////////////////////////////////

                oldValue=Float.parseFloat(binding.txtEb2.getText().toString());
                binding.txtEb2.setText(root.getResult().XETHZUSD.b.get(1));
                newValue=Float.parseFloat(binding.txtEb2.getText().toString());
                binding.txtEb2.setBackgroundColor(setColor(oldValue,newValue));
                //////////////////////////////////////////////////////////////

                oldValue=Float.parseFloat(binding.txtEb3.getText().toString());
                Float Eb3 = Float.parseFloat(root.getResult().XETHZUSD.b.get(2));
                binding.txtEb3.setText(Eb3.toString());
                newValue=Float.parseFloat(binding.txtEb3.getText().toString());
                binding.txtEb3.setBackgroundColor(setColor(oldValue,newValue));
            }
        });

        viewModel.getRxBtz().observe(this, new Observer<Root>() {
            @Override
            public void onChanged(Root root) {

                oldValue=Float.parseFloat(binding.txtBa1.getText().toString());
                Float Ba1 = Float.parseFloat(root.getResult().XXBTZUSD.a.get(0));
                binding.txtBa1.setText(Ba1.toString());
                newValue=Float.parseFloat(binding.txtBa1.getText().toString());
                binding.txtBa1.setBackgroundColor(setColor(oldValue,newValue));

                //////////////////////////////////////////////////////////////

                oldValue=Float.parseFloat(binding.txtBa2.getText().toString());
                binding.txtBa2.setText(root.getResult().XXBTZUSD.a.get(1));
                newValue=Float.parseFloat(binding.txtBa2.getText().toString());
                binding.txtBa2.setBackgroundColor(setColor(oldValue,newValue));


                oldValue=Float.parseFloat(binding.txtBa3.getText().toString());
                Float Ba3 = Float.parseFloat(root.getResult().XXBTZUSD.a.get(2));
                binding.txtBa3.setText(Ba3.toString());
                newValue=Float.parseFloat(binding.txtBa3.getText().toString());
                binding.txtBa3.setBackgroundColor(setColor(oldValue,newValue));

                //////////////////////////////////////////////////////////////

                oldValue=Float.parseFloat(binding.txtBb1.getText().toString());
                Float Bb1 = Float.parseFloat(root.getResult().XXBTZUSD.b.get(0));
                binding.txtBb1.setText(Bb1.toString());
                newValue=Float.parseFloat(binding.txtBb1.getText().toString());
                binding.txtBb1.setBackgroundColor(setColor(oldValue,newValue));

                //////////////////////////////////////////////////////////////

                oldValue=Float.parseFloat(binding.txtBb2.getText().toString());
                binding.txtBb2.setText(root.getResult().XXBTZUSD.b.get(1));
                newValue=Float.parseFloat(binding.txtBb2.getText().toString());
                binding.txtBb2.setBackgroundColor(setColor(oldValue,newValue));

                ///////////////////////////////////////////////////////////////

                oldValue=Float.parseFloat(binding.txtBb3.getText().toString());
                Float Bb3 = Float.parseFloat(root.getResult().XXBTZUSD.b.get(2));
                binding.txtBb3.setText(Bb3.toString());
                newValue=Float.parseFloat(binding.txtBb3.getText().toString());
                binding.txtBb3.setBackgroundColor(setColor(oldValue,newValue));
            }
        });
    }

    private Integer setColor(Float oldValue,Float newValue){
        Integer color = R.color.black;

        if (oldValue > newValue) {
            color=R.color.red;
        } else if (oldValue < newValue) {
            color=(R.color.green);
        } else {
            color=(R.color.black);
        }
        return color;
    }
}