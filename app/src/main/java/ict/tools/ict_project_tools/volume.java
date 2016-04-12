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

public class volume extends Activity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner length;
    Context context;
    EditText etxt;
    TextView cl, cc, l, kl, cf, ci, m, mm;
    String[] lengths = {"cl", "cm", "l", "kl", "ft³", "in³", "m³", "mm³"};
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_volume);
        cl = (TextView) findViewById(R.id.mm1);
        cc = (TextView) findViewById(R.id.cm1);
        l = (TextView) findViewById(R.id.m1);
        kl = (TextView) findViewById(R.id.km1);
        cf = (TextView) findViewById(R.id.inch1);
        ci = (TextView) findViewById(R.id.ft1);
        m = (TextView) findViewById(R.id.yd1);
        mm = (TextView) findViewById(R.id.mile1);
        etxt = (EditText) findViewById(R.id.editText);

        mm.setText(null);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button5);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        length = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(volume.this,
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
                cl.setText("" + v1 * 1);
                cc.setText("" + (v1 * 10));
                l.setText("" + (v1 * 0.01));
                kl.setText("" + (v1 * 0.00001));
                cf.setText("" + (v1 * 0.0003531466672149 ));
                ci.setText("" + (v1 * 0.6102374409473 ));
                m.setText("" + (v1 * 0.00001 ));
                mm.setText("" + (v1 * 10000));

                break;
            case 1:
                double v2 = Double.parseDouble(etxt.getText().toString());
                cl.setText("" + v2 * 0.1);
                cc.setText("" + (v2 * 1));
                l.setText("" + (v2 * 0.001));
                kl.setText("" + (v2 * 0.001 ));
                cf.setText("" + (v2 * 0.03531466672149 ));
                ci.setText("" + (v2 * 61.02374409473  ));
                m.setText("" + (v2 * 0.001  ));
                mm.setText("" + (v2 * 1000000 ));
                break;
            case 2:
                double v3 = Double.parseDouble(etxt.getText().toString());
                cl.setText("" + v3 * 100 );
                cc.setText("" + (v3 * 1000 ));
                l.setText("" + (v3 * 1 ));
                kl.setText("" + (v3 * 0.001));
                cf.setText("" + (v3 * 0.03531466672149));
                ci.setText("" + (v3 * 61.02374409473));
                m.setText("" + (v3 * 0.001 ));
                mm.setText("" + (v3 * 1000000));
                break;
            case 3:
                double v4 = Double.parseDouble(etxt.getText().toString());
                cl.setText("" + v4 * 100000 );
                cc.setText("" + (v4 * 1000000 ));
                l.setText("" + (v4 * 1000  ));
                kl.setText("" + (v4 * 1));
                ci.setText("" + (v4 * 61023.74409473));
                cf.setText("" + (v4 *35.31466672149));
                m.setText("" + (v4 * 1 ));
                mm.setText("" + (v4 * 1000000000));
                break;
            case 4:
                double v5 = Double.parseDouble(etxt.getText().toString());
                cl.setText("" + v5 * 2831.6846592);
                cc.setText("" + (v5 * 28316.846592));
                l.setText("" + (v5 * 28.316846592));
                kl.setText("" + (v5 * 0.028316846592));
                cf.setText("" + (v5 * 1));
                ci.setText("" + (v5 * 1728));
                m.setText("" + (v5 * 0.028316846592 ));
                mm.setText("" + (v5 * 28316846.592));
                break;
            case 5:
                double v6 = Double.parseDouble(etxt.getText().toString());
                cl.setText("" + v6 * 1.6387064 );
                cc.setText("" + (v6 * 16.387064));
                l.setText("" + (v6 * 0.016387064));
                kl.setText("" + (v6 * 0.000016387064));
                cf.setText("" + (v6 * 0.0005787037037037));
                ci.setText("" + (v6 * 1));
                m.setText("" + (v6 * 0.000016387064));
                mm.setText("" + (v6 * 16387.064 ));
                break;
            case 6:
                double v7 = Double.parseDouble(etxt.getText().toString());
                cl.setText("" + v7 * 100000 );
                cc.setText("" + (v7 * 1000000   ));
                l.setText("" + (v7 * 1000));
                kl.setText("" + (v7 * 1));
                cf.setText("" + (v7 * 35.31466672149));
                ci.setText("" + (v7 * 61023.74409473));
                m.setText("" + (v7 * 1));
                mm.setText("" + (v7 * 1000000000));
                break;
            case 7:
                double v8 = Double.parseDouble(etxt.getText().toString());
                cl.setText("" + v8 * 0.0001  );
                cc.setText("" + (v8 * 0.001 ));
                l.setText("" + (v8 * 0.000001));
                kl.setText("" + (v8 * 1E-9 ));
                cf.setText("" + (v8 * 3.531466672149E-8 ));
                ci.setText("" + (v8 * 0.00006102374409473 ));
                m.setText("" + (v8 * 1E-9));
                mm.setText("" + (v8 * 1));
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
