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

public class area extends Activity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner area;
    Context context;
    EditText etxt;
    TextView ha, cm1, m1, km1, inch1, ft1, yd1, acre1;
    String[] lengths = {"cm²", "m²", "ha²", "km²", "inch²", "ft²", "yd²", "acre²"};
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_area);
        cm1 = (TextView) findViewById(R.id.t1);
        m1 = (TextView) findViewById(R.id.t2);
        ha = (TextView) findViewById(R.id.t3);
        km1 = (TextView) findViewById(R.id.t4);
        inch1 = (TextView) findViewById(R.id.t5);
        ft1 = (TextView) findViewById(R.id.t6);
        yd1 = (TextView) findViewById(R.id.t7);
        acre1 = (TextView) findViewById(R.id.t8);
        etxt = (EditText) findViewById(R.id.editText);


        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button5);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        area = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(area.this,
                android.R.layout.simple_spinner_item, lengths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        area.setAdapter(adapter);
        area.setOnItemSelectedListener(this);
        etxt.setText(1 + "");


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {

            case 0:

                double v1 = Double.parseDouble(etxt.getText().toString());

                cm1.setText("" + (v1 * 1));
                m1.setText("" + (v1 * 0.0001));
                ha.setText("" + (v1 * 1e-8));
                km1.setText("" + (v1 * 1e-10));
                inch1.setText("" + (v1 * 0.155));
                ft1.setText("" + (v1 * 0.00107639));
                yd1.setText("" + (v1 * 0.000119599));
                acre1.setText("" + (v1 * 2.4711e-8));
                break;

            case 1:
                double v2 = Double.parseDouble(etxt.getText().toString());
                cm1.setText("" + (v2 * 10000));
                m1.setText("" + (v2 * 1));
                ha.setText("" + (v2 * 0.0001));
                km1.setText("" + (v2 * 0.000001));
                inch1.setText("" + (v2 * 1550.0031));
                ft1.setText("" + (v2 * 10.76391));
                yd1.setText("" + (v2 * 1.19599));
                acre1.setText("" + (v2 * 0.000247));
                break;
            case 2:
                double v3 = Double.parseDouble(etxt.getText().toString());
                cm1.setText("" + (v3 * 1e+8));
                m1.setText("" + (v3 * 10000));
                ha.setText("" + (v3 * 1));
                km1.setText("" + (v3 * 0.01));
                inch1.setText("" + (v3 * 1.55e+7));
                ft1.setText("" + (v3 * 107639));
                yd1.setText("" + (v3 * 11959.9));
                acre1.setText("" + (v3 * 2.47105));
                break;
            case 3:
                double v4 = Double.parseDouble(etxt.getText().toString());
                cm1.setText("" + (v4 * 1e+10));
                m1.setText("" + (v4 * 1e+6));
                ha.setText("" + (v4 * 100));
                km1.setText("" + (v4 * 1));
                inch1.setText("" + (v4 * 1.55e+9));
                ft1.setText("" + (v4 * 1.076e+7));
                yd1.setText("" + (v4 * 1.196e+6));
                acre1.setText("" + (v4 * 247.105));
                break;
            case 4:
                double v5 = Double.parseDouble(etxt.getText().toString());
                cm1.setText("" + (v5 * 6.4516));
                m1.setText("" + (v5 * 0.00064516));
                ha.setText("" + (v5 * 6.4516e-8));
                km1.setText("" + (v5 *6.4516e-10));
                inch1.setText("" + (v5 * 1));
                ft1.setText("" + (v5 *0.00694444));
                yd1.setText("" + (v5 * 0.000771605));
                acre1.setText("" + (v5 * 1.5942e-7));
                break;
            case 5:
                double v6 = Double.parseDouble(etxt.getText().toString());
                cm1.setText("" + (v6 * 929.03));
                m1.setText("" + (v6 * 0.092903));
                ha.setText("" + (v6 *9.2903e-6));
                km1.setText("" + (v6 * 9.2903e-8));
                inch1.setText("" + (v6 * 144));
                ft1.setText("" + (v6 * 1));
                yd1.setText("" + (v6 * 0.111111));
                acre1.setText("" + (v6 * 2.2957e-5));
                break;
            case 6:
                double v7 = Double.parseDouble(etxt.getText().toString());
                cm1.setText("" + (v7 * 8361.27));
                m1.setText("" + (v7 * 0.836127));
                ha.setText("" + (v7 * 8.3613e-5));
                km1.setText("" + (v7 * 8.3613e-7));
                inch1.setText("" + (v7 * 1296));
                ft1.setText("" + (v7 * 9));
                yd1.setText("" + (v7 * 1));
                acre1.setText("" + (v7 * 0.000206612));
                break;
            case 7:
                double v8 = Double.parseDouble(etxt.getText().toString());
                cm1.setText("" + (v8 * 4.047e+7));
                m1.setText("" + (v8 * 4046.86));
                ha.setText("" + (v8 * 0.404686));
                km1.setText("" + (v8 * 0.00404686));
                inch1.setText("" + (v8 * 6.273e+6));
                ft1.setText("" + (v8 * 43560));
                yd1.setText("" + (v8 * 4840));
                acre1.setText("" + (v8 * 1));
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