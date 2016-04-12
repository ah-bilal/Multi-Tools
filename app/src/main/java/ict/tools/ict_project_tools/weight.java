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

public class weight extends Activity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner length;
    Context context;
    EditText etxt;
    TextView mg, g, kg, t, lb, oz;
    String[] lengths = {"mg", "g" , "kg", "t", "lb", "oz"};
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weight);
        mg = (TextView) findViewById(R.id.mm1);
        g = (TextView) findViewById(R.id.cm1);
        kg= (TextView) findViewById(R.id.m1);
        t= (TextView) findViewById(R.id.km1);
        lb= (TextView) findViewById(R.id.inch1);
        oz= (TextView) findViewById(R.id.ft1);
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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(weight.this,
                android.R.layout.simple_spinner_item, lengths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        length.setAdapter(adapter);
        length.setOnItemSelectedListener(this);
        etxt.setText(1 + "");


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {

            case 0:

                double v1 = Double.parseDouble(etxt.getText().toString());
                mg.setText("" + v1 * 1);
                g.setText("" + (v1 * 0.000001 ));
                kg.setText("" + (v1 * 1E-9 ));
                t.setText("" + (v1 * 1E-12));
                lb.setText("" + (v1 * 2.204622621849E-9 ));
                oz.setText("" + (v1 * 3.527396194958E-8 ));

                break;
            case 1:
                double v2 = Double.parseDouble(etxt.getText().toString());
                mg.setText("" + v2 * 1000000 );
                g.setText("" + (v2 * 1));
                kg.setText("" + (v2 * 0.001 ));
                t.setText("" + (v2 * 0.000001 ));
                lb.setText("" + (v2 * 0.002204622621849 ));
                oz.setText("" + (v2 * 0.03527396194958 ));
                break;
            case 2:
                double v3 = Double.parseDouble(etxt.getText().toString());
                mg.setText("" + v3 * 1000000000 );
                g.setText("" + (v3 * 1000 ));
                kg.setText("" + (v3 * 1 ));
                t.setText("" + (v3 * 0.001 ));
                lb.setText("" + (v3 * 2.204622621849));
                oz.setText("" + (v3 * 35.27396194958  ));
                break;
            case 3:
                double v4 = Double.parseDouble(etxt.getText().toString());
                mg.setText("" + v4 * 1000000000000l);
                g.setText("" + (v4 * 1000000 ));
                kg.setText("" + (v4 * 0.01));
                t.setText("" + (v4 * 1));
                lb.setText("" + (v4 * 2204.622621849  ));
                oz.setText("" + (v4 * 35273.96194958  ));
                break;
            case 4:
                double v5 = Double.parseDouble(etxt.getText().toString());
                mg.setText("" + v5 * 453592370 );
                g.setText("" + (v5 * 453.59237));
                kg.setText("" + (v5 * 0.45359237));
                t.setText("" + (v5 * 0.00045359237 ));
                lb.setText("" + (v5 * 1 ));
                oz.setText("" + (v5 * 16));
                break;
            case 5:
                double v6 = Double.parseDouble(etxt.getText().toString());
                mg.setText("" + v6 * 28349523.125);
                g.setText("" + (v6 * 28.349523125));
                kg.setText("" + (v6 * 0.028349523125 ));
                t.setText("" + (v6 * 0.000028349523125));
                lb.setText("" + (v6 * 0.0625  ));
                oz.setText("" + (v6 * 1 ));
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
