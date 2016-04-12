package ict.tools.ict_project_tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class length extends Activity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner length;
    Context context;
    EditText etxt;
    TextView mm1, cm1, m1, km1, inch1, ft1, yd1, mile1;
    String[] lengths = {"mm", "cm", "m", "km", "inch", "ft", "yd", "mile"};
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_length);
        mm1 = (TextView) findViewById(R.id.mm1);
        cm1 = (TextView) findViewById(R.id.cm1);
        m1 = (TextView) findViewById(R.id.m1);
        km1 = (TextView) findViewById(R.id.km1);
        inch1 = (TextView) findViewById(R.id.inch1);
        ft1 = (TextView) findViewById(R.id.ft1);
        yd1 = (TextView) findViewById(R.id.yd1);
        mile1 = (TextView) findViewById(R.id.mile1);
        etxt = (EditText) findViewById(R.id.editText);



        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button5);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        length = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(length.this,
                android.R.layout.simple_spinner_item, lengths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        length.setAdapter(adapter);
        length.setOnItemSelectedListener(this);
        etxt.setText(1+"");


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {

            case 0:

                double v1 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v1 * 1);
                cm1.setText("" + (v1 * 0.1));
                m1.setText("" + (v1 * 0.001));
                km1.setText("" + (v1 * 0.000001));
                inch1.setText("" + (v1 * 0.0393701));
                ft1.setText("" + (v1 * 0.00328084));
                yd1.setText("" + (v1 * 0.00109361));
                mile1.setText("" + (v1 * 6.2137119e-07));

                break;
            case 1:
                double v2 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v2 * 10);
                cm1.setText("" + (v2 * 1));
                m1.setText("" + (v2 * 0.01));
                km1.setText("" + (v2 * 1e-5));
                inch1.setText("" + (v2 * 0.393701));
                ft1.setText("" + (v2 * 0.0328084));
                yd1.setText("" + (v2 * 0.0109361));
                mile1.setText("" + (v2 * 6.2137e-6));
                break;
            case 2:
                double v3 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v3 * 1000);
                cm1.setText("" + (v3 * 100));
                m1.setText("" + (v3 * 1));
                km1.setText("" + (v3 * 0.001));
                inch1.setText("" + (v3 * 39.3701));
                ft1.setText("" + (v3 * 3.28084));
                yd1.setText("" + (v3 * 1.09361));
                mile1.setText("" + (v3 * 0.000621371));
                break;
            case 3:
                double v4 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v4 * 1e+6);
                cm1.setText("" + (v4 * 100000));
                m1.setText("" + (v4 * 1000));
                km1.setText("" + (v4 * 1));
                inch1.setText("" + (v4 * 39370.1));
                ft1.setText("" + (v4 * 3280.84));
                yd1.setText("" + (v4 * 1093.61));
                mile1.setText("" + (v4 * 0.621371));
                break;
            case 4:
                double v5 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v5 * 25.4);
                cm1.setText("" + (v5 * 2.54));
                m1.setText("" + (v5 * 0.0254));
                km1.setText("" + (v5 * 2.54e-5));
                inch1.setText("" + (v5 * 1));
                ft1.setText("" + (v5 * 0.0833333));
                yd1.setText("" + (v5 * 0.0277778));
                mile1.setText("" + (v5 * 1.5783e-5));
                break;
            case 5:
                double v6 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v6 * 304.8);
                cm1.setText("" + (v6 * 30.48));
                m1.setText("" + (v6 * 0.3048));
                km1.setText("" + (v6 * 0.0003048));
                inch1.setText("" + (v6 * 12));
                ft1.setText("" + (v6 * 1));
                yd1.setText("" + (v6 * 0.333333));
                mile1.setText("" + (v6 * 0.000189394));
                break;
            case 6:
                double v7 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v7 * 914.4);
                cm1.setText("" + (v7 * 91.44));
                m1.setText("" + (v7 * 0.9144));
                km1.setText("" + (v7 * 0.0009144));
                inch1.setText("" + (v7 * 36));
                ft1.setText("" + (v7 * 3));
                yd1.setText("" + (v7 * 1));
                mile1.setText("" + (v7 * 0.000568182));
                break;
            case 7:
                double v8 = Double.parseDouble(etxt.getText().toString());
                mm1.setText("" + v8 * 160934);
                cm1.setText("" + (v8 * 160934));
                m1.setText("" + (v8 * 1609.34));
                km1.setText("" + (v8 * 1.60934));
                inch1.setText("" + (v8 * 63360));
                ft1.setText("" + (v8 * 5280));
                yd1.setText("" + (v8 * 1760));
                mile1.setText("" + (v8 * 1));
                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent a1 = new Intent(this, length.class);
                startActivity(a1);
                break;
            case R.id.button2:
                Intent a2 = new Intent(this, area.class);
                startActivity(a2);
                break;
            case R.id.button3:
                Intent a3 = new Intent(this, volume.class);
                startActivity(a3);
                break;
            case R.id.button5:
                Intent a4 = new Intent(this, weight.class);
                startActivity(a4);
                break;

        }
    }
}
