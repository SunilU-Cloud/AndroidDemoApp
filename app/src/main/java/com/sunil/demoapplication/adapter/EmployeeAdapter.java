package com.sunil.demoapplication.adapter;

import android.content.Context;
import android.graphics.ColorSpace;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunil.demoapplication.MainActivity;
import com.sunil.demoapplication.R;
import com.sunil.demoapplication.model.Employee;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.jar.Attributes;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {

    ArrayList<Employee>listview;
    Context context;
    public EmployeeAdapter(MainActivity mainActivity, ArrayList<Employee> listview) {
        this.listview=listview;
        this.context=mainActivity;

    }

    @NonNull
    @Override
    public EmployeeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);
        return new EmployeeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeAdapter.ViewHolder holder, int position) {
        Employee employee=listview.get(position);
        String na=employee.getFirstName();
        Log.e("context","name"+na);

        if (na!=null)
        {


        }else {

        }
    }

    @Override
    public int getItemCount() {
        return listview.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Name=(TextView)itemView.findViewById(R.id.name);
        }
    }
}
