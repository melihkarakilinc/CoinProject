package com.melihkarakilinc.ftproject;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IApi api = APIClient.getClient().create(IApi.class);

        Call<Root> callXBTZUSD = api.GetDataBTCUSD();
        Call<Root> callXETHZUSD = api.GetDataETHUSD();
        callXETHZUSD.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if (response.isSuccessful()) {
                    Log.e("Response", "suc");
                    Log.e("Response", response.body().getResult().getXETHZUSD().a.get(0));
                }
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {

            }
        });
    }
}