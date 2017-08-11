package com.example.aaron.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements CarInfoFragment.OnFragmentInteractionListener{
    private static final String INFO_FRAGMENT = "INFO";
    private static final String LIST_FRAGMENT = "LIST";
    FrameLayout fmInputCarInformation;
    List<Cars> carList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmInputCarInformation = (FrameLayout)findViewById(R.id.carInfo);
        CarInfoFragment carInfoFragment = CarInfoFragment.newInstance("","Info");
        getSupportFragmentManager().beginTransaction().replace(R.id.carInfo,carInfoFragment ,INFO_FRAGMENT).commit();

    }

    @Override
    public void onFragmentInteraction(Cars car) {
        carList.add(car);
        CarListFragment carListFrag = CarListFragment.newInstance(carList,"");
        getSupportFragmentManager().beginTransaction().replace(R.id.carList,carListFrag ,LIST_FRAGMENT).commit();
    }

    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
