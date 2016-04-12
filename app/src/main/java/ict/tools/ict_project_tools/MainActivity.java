package ict.tools.ict_project_tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  MainActivity extends Activity implements View.OnClickListener {

Context context;
    Button b1, b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        b1 = (Button) this.findViewById(R.id.button);
        b2 = (Button) this.findViewById(R.id.button2);
        b3 = (Button) this.findViewById(R.id.button3);
        b4= (Button) this.findViewById(R.id.button4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);



    }

    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.button:
                Intent a1 = new Intent(this, length.class);
                startActivity(a1);
                break;
            case R.id.button2:
                Intent a2 = new Intent(this, calc.class);
                startActivity(a2);
                break;
            case R.id.button3:
                Intent a3 = new Intent(this, EightQueen.class);
                startActivity(a3);
                break;
            case R.id.button4:
                Intent a4 = new Intent(this, fdcw.class);
                startActivity(a4);
                break;


        }
    }}
