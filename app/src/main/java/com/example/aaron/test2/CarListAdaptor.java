package com.example.aaron.test2;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by aaron on 8/11/17.
 */

public class CarListAdaptor extends RecyclerView.Adapter<CarListAdaptor.ViewHolder>{

    public CarListAdaptor(List<Cars> carsList) {
        this.carsList = carsList;
    }

    List<Cars> carsList = new ArrayList<>();
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvYear;
        TextView tvModel;
        TextView tvType;

        public ViewHolder(View itemView) {
            super(itemView);
            tvModel = (TextView)itemView.findViewById(R.id.tvModel);
            tvModel = (TextView)itemView.findViewById((R.id.tvModel));
            tvYear = (TextView)itemView.findViewById(R.id.tvYear);

        }
    }

    @Override
    public CarListAdaptor.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item,parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CarListAdaptor.ViewHolder holder, int position) {
        final Cars car = carsList.get(position);
        holder.tvYear.setText(String.valueOf(car.getYear()));
        holder.tvModel.setText(car.getModel());
        holder.tvType.setText(car.getType());
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }


}

