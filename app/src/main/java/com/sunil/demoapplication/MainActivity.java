package com.sunil.demoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.sunil.demoapplication.adapter.EmployeeAdapter;
import com.sunil.demoapplication.model.Employee;
import com.sunil.demoapplication.rest.ApiClient;
import com.sunil.demoapplication.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView list;
    ApiInterface apiInterface;
    EmployeeAdapter employeeAdapter;
    ArrayList<Employee>listview=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        list=(RecyclerView)findViewById(R.id.list);

        list();






    }

    private void list() {

        Call<List<Employee>> call= apiInterface.getInterest();

        call.enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
             Log.e("context","Response"+response);
                if (response != null && listview != null) {
                    listview = (ArrayList<Employee>) response.body();
                   ArrayList<String> arrayListCategoryList = new ArrayList<String>();



                    for (int i = 0; i < listview.size(); i++) {

                        arrayListCategoryList.add(listview.get(i).getFirstName());

                    }




                  /*  employeeAdapter = new EmployeeAdapter(MainActivity.this, listview);

                    // ak21   autoCatTxtView.setAdapter(categorySignupAdapter);

                    list.setAdapter(employeeAdapter);*/

                }

            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {

            }
        });
    }
}
