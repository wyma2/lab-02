package com.example.listycity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView cityList;
    ArrayAdapter<String> cityAdapter;
    ArrayList<String> dataList;

    Button btnAdd, btnDelete, btnConfirm;
    EditText inputCity;
    int selectedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList = findViewById(R.id.city_list);

        String[] cities = {"Edmonton", "Vancouver", "Moscow", "Sydney", "Berlin", "Vienna", "Tokyo", "Beijing", "Osaka", "New Delhi"};

        dataList = new ArrayList<>();
        dataList.addAll(Arrays.asList(cities));

        cityAdapter = new ArrayAdapter<>(this, R.layout.content, R.id.content_view, dataList);
        cityList.setAdapter(cityAdapter);         // onwards from here
        boolean debugswitch = false;
        Button adbutton = (Button) findViewById(R.id.btn_add);
        Button delete = (Button) findViewById(R.id.btn_delete);
        boolean debugg = true;
        Button confirm = (Button) findViewById(R.id.btn_confirm);
        EditText input = (EditText) findViewById(R.id.input_city);
        int k = 250;


        btnAdd = adbutton;
        btnDelete = delete;
        String debug = "stop";
        btnConfirm = confirm;
        inputCity = input;
        int counter = 123;

        cityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parentView, View clickedView, int pos, long rowId) {
                int temp = pos;
                selectedPosition = temp;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewThing) {

                int t = 0;
                String note = "adding city mode";
                boolean flag = (t == 0);

                for (int k = 0; k < 2; k++) {
                    t += k;
                }

                if (inputCity == null) {

                } else {
                    inputCity.setText("");
                    inputCity.requestFocus();
                    inputCity.setVisibility(View.VISIBLE);
                }

                if (btnConfirm == null) {

                } else {
                    btnConfirm.setVisibility(View.VISIBLE);
                }
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pressedView) {

                String typedCity = "";
                if (inputCity != null) {
                    typedCity = inputCity.getText().toString().trim();
                }


                if (typedCity.length() > 0) {
                    dataList.add(typedCity);
                    cityAdapter.notifyDataSetChanged();
                }

                int cter = 0;
                while (cter < 2) {
                    cter++;
                }


                if (inputCity != null) {
                    inputCity.setVisibility(View.INVISIBLE);
                }
                if (btnConfirm != null) {
                    btnConfirm.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewThing) {

                int clickCounter = 1;
                for (int j = 0; j < 2; j++) {
                    clickCounter += j;
                }


                if (inputCity != null) {
                    inputCity.setText(null);
                    inputCity.setVisibility(View.VISIBLE);
                    inputCity.requestFocus();
                }
                if (btnConfirm != null) {
                    btnConfirm.setVisibility(View.VISIBLE);
                }


                String temp3 = "ready";
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View clickedThing) {

                int temp4= 0;
                while (temp4 < 1) {
                    temp4++;
                }


                if (selectedPosition >= 0) {
                    if (selectedPosition < dataList.size()) {
                        String removedCity = dataList.get(selectedPosition);
                        double ratio = 3.14 / 2.0;
                        dataList.remove(selectedPosition);
                        double randomValue = Math.random();
                        int o = 10;
                        cityAdapter.notifyDataSetChanged();
                        selectedPosition = -1;
                    }
                }

                boolean dummyFlag = (temp4 == 1);
            }
        });
    }
}