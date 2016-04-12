package ict.tools.ict_project_tools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SolutionActivity extends Activity implements OnClickListener {

    Context context;
    ImageButton a0, a1, a2, a3, a4, a5, a6, a7, b0, b1, b2, b3, b4, b5, b6, b7,
            c0, c1, c2, c3, c4, c5, c6, c7, d0, d1, d2, d3, d4, d5, d6, d7, e0,
            e1, e2, e3, e4, e5, e6, e7, f0, f1, f2, f3, f4, f5, f6, f7, g0, g1,
            g2, g3, g4, g5, g6, g7, h0, h1, h2, h3, h4, h5, h6, h7, q0, q1, q2,
            q3, q4, q5, q6, q7;

    Button btn_random, btn_specific;

    TextView txt_solutionNo;
    EditText txt_input;

    int[][] position = new int[8][8];
    int queens = 8;
    int count = 0;

    int randomInt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        context = this;

        randomInt = (int) (93.0 * Math.random());
        if (randomInt == 0) {
            randomInt = (int) (93.0 * Math.random());
            if (randomInt == 0) {
                randomInt = (int) (93.0 * Math.random());

            }
        }

        btn_random = (Button) findViewById(R.id.btn_random);
        btn_specific = (Button) findViewById(R.id.btn_specific);

        txt_solutionNo = (TextView) findViewById(R.id.txt_solutionNo);
        txt_input = (EditText) findViewById(R.id.txt_input);

        a0 = (ImageButton) findViewById(R.id.a0);
        a1 = (ImageButton) findViewById(R.id.a1);
        a2 = (ImageButton) findViewById(R.id.a2);
        a3 = (ImageButton) findViewById(R.id.a3);
        a4 = (ImageButton) findViewById(R.id.a4);
        a5 = (ImageButton) findViewById(R.id.a5);
        a6 = (ImageButton) findViewById(R.id.a6);
        a7 = (ImageButton) findViewById(R.id.a7);

        b0 = (ImageButton) findViewById(R.id.b0);
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);

        c0 = (ImageButton) findViewById(R.id.c0);
        c1 = (ImageButton) findViewById(R.id.c1);
        c2 = (ImageButton) findViewById(R.id.c2);
        c3 = (ImageButton) findViewById(R.id.c3);
        c4 = (ImageButton) findViewById(R.id.c4);
        c5 = (ImageButton) findViewById(R.id.c5);
        c6 = (ImageButton) findViewById(R.id.c6);
        c7 = (ImageButton) findViewById(R.id.c7);

        d0 = (ImageButton) findViewById(R.id.d0);
        d1 = (ImageButton) findViewById(R.id.d1);
        d2 = (ImageButton) findViewById(R.id.d2);
        d3 = (ImageButton) findViewById(R.id.d3);
        d4 = (ImageButton) findViewById(R.id.d4);
        d5 = (ImageButton) findViewById(R.id.d5);
        d6 = (ImageButton) findViewById(R.id.d6);
        d7 = (ImageButton) findViewById(R.id.d7);

        e0 = (ImageButton) findViewById(R.id.e0);
        e1 = (ImageButton) findViewById(R.id.e1);
        e2 = (ImageButton) findViewById(R.id.e2);
        e3 = (ImageButton) findViewById(R.id.e3);
        e4 = (ImageButton) findViewById(R.id.e4);
        e5 = (ImageButton) findViewById(R.id.e5);
        e6 = (ImageButton) findViewById(R.id.e6);
        e7 = (ImageButton) findViewById(R.id.e7);

        f0 = (ImageButton) findViewById(R.id.f0);
        f1 = (ImageButton) findViewById(R.id.f1);
        f2 = (ImageButton) findViewById(R.id.f2);
        f3 = (ImageButton) findViewById(R.id.f3);
        f4 = (ImageButton) findViewById(R.id.f4);
        f5 = (ImageButton) findViewById(R.id.f5);
        f6 = (ImageButton) findViewById(R.id.f6);
        f7 = (ImageButton) findViewById(R.id.f7);

        g0 = (ImageButton) findViewById(R.id.g0);
        g1 = (ImageButton) findViewById(R.id.g1);
        g2 = (ImageButton) findViewById(R.id.g2);
        g3 = (ImageButton) findViewById(R.id.g3);
        g4 = (ImageButton) findViewById(R.id.g4);
        g5 = (ImageButton) findViewById(R.id.g5);
        g6 = (ImageButton) findViewById(R.id.g6);
        g7 = (ImageButton) findViewById(R.id.g7);

        h0 = (ImageButton) findViewById(R.id.h0);
        h1 = (ImageButton) findViewById(R.id.h1);
        h2 = (ImageButton) findViewById(R.id.h2);
        h3 = (ImageButton) findViewById(R.id.h3);
        h4 = (ImageButton) findViewById(R.id.h4);
        h5 = (ImageButton) findViewById(R.id.h5);
        h6 = (ImageButton) findViewById(R.id.h6);
        h7 = (ImageButton) findViewById(R.id.h7);

        q0 = (ImageButton) findViewById(R.id.q0);
        q1 = (ImageButton) findViewById(R.id.q1);
        q2 = (ImageButton) findViewById(R.id.q2);
        q3 = (ImageButton) findViewById(R.id.q3);
        q4 = (ImageButton) findViewById(R.id.q4);
        q5 = (ImageButton) findViewById(R.id.q5);
        q6 = (ImageButton) findViewById(R.id.q6);
        q7 = (ImageButton) findViewById(R.id.q7);

        btn_random.setOnClickListener(this);
        btn_specific.setOnClickListener(this);

        a0.setOnClickListener(this);
        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

        c0.setOnClickListener(this);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);

        d0.setOnClickListener(this);
        d1.setOnClickListener(this);
        d2.setOnClickListener(this);
        d3.setOnClickListener(this);
        d4.setOnClickListener(this);
        d5.setOnClickListener(this);
        d6.setOnClickListener(this);
        d7.setOnClickListener(this);

        e0.setOnClickListener(this);
        e1.setOnClickListener(this);
        e2.setOnClickListener(this);
        e3.setOnClickListener(this);
        e4.setOnClickListener(this);
        e5.setOnClickListener(this);
        e6.setOnClickListener(this);
        e7.setOnClickListener(this);

        f0.setOnClickListener(this);
        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        f3.setOnClickListener(this);
        f4.setOnClickListener(this);
        f5.setOnClickListener(this);
        f6.setOnClickListener(this);
        f7.setOnClickListener(this);

        g0.setOnClickListener(this);
        g1.setOnClickListener(this);
        g2.setOnClickListener(this);
        g3.setOnClickListener(this);
        g4.setOnClickListener(this);
        g5.setOnClickListener(this);
        g6.setOnClickListener(this);
        g7.setOnClickListener(this);

        h0.setOnClickListener(this);
        h1.setOnClickListener(this);
        h2.setOnClickListener(this);
        h3.setOnClickListener(this);
        h4.setOnClickListener(this);
        h5.setOnClickListener(this);
        h6.setOnClickListener(this);
        h7.setOnClickListener(this);

        q0.setOnClickListener(this);
        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);

        solutions();

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_specific:

                clearGrid();
                txt_solutionNo.setText("Solution No:");
                inputSolutions();

                break;

            case R.id.btn_random:

                randomInt = (int) (93.0 * Math.random());

                if (randomInt == 0) {
                    randomInt = (int) (93.0 * Math.random());
                    if (randomInt == 0) {
                        randomInt = (int) (93.0 * Math.random());

                    }
                }

                // Toast.makeText(context, "random no = " + randomInt,
                // Toast.LENGTH_SHORT).show();

                clearGrid();

                solutions();

                break;

            default:
                break;
        }

    }

    public void inputSolutions() {

        if (txt_input.getText().toString().isEmpty()) {
            Toast.makeText(context, "Enter Solution No.", Toast.LENGTH_SHORT)
                    .show();
        } else {

            if (Integer.parseInt(txt_input.getText().toString()) == 1) {
                a0.setBackgroundResource(R.drawable.queen);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e2.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 1");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 2) {
                a0.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e6.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 2");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 3) {
                a0.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g4.setBackgroundResource(R.drawable.queen);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 3");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 4) {
                a0.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f3.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 4");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 5) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b3.setBackgroundResource(R.drawable.queen);
                c5.setBackgroundResource(R.drawable.queen_gray);
                d7.setBackgroundResource(R.drawable.queen);
                e2.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 5");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 6) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c6.setBackgroundResource(R.drawable.queen);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e2.setBackgroundResource(R.drawable.queen);
                f7.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 6");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 7) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c6.setBackgroundResource(R.drawable.queen);
                d3.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f7.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 7");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 8) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b5.setBackgroundResource(R.drawable.queen);
                c0.setBackgroundResource(R.drawable.queen);
                d6.setBackgroundResource(R.drawable.queen_gray);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g2.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 8");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 9) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b5.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g6.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 9");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 10) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c2.setBackgroundResource(R.drawable.queen);
                d5.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g0.setBackgroundResource(R.drawable.queen);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 10");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 11) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 11");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 12) {
                a1.setBackgroundResource(R.drawable.queen_gray);
                b7.setBackgroundResource(R.drawable.queen);
                c5.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e2.setBackgroundResource(R.drawable.queen);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 12");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 13) {
                a2.setBackgroundResource(R.drawable.queen);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c6.setBackgroundResource(R.drawable.queen);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 13");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 14) {
                a2.setBackgroundResource(R.drawable.queen);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d7.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 14");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 15) {
                a2.setBackgroundResource(R.drawable.queen);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d7.setBackgroundResource(R.drawable.queen);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f3.setBackgroundResource(R.drawable.queen);
                g6.setBackgroundResource(R.drawable.queen);
                h0.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 15");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 16) {
                a2.setBackgroundResource(R.drawable.queen);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c6.setBackgroundResource(R.drawable.queen);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 16");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 17) {
                a2.setBackgroundResource(R.drawable.queen);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d3.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 17");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 18) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 18");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 19) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d6.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 19");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 20) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d6.setBackgroundResource(R.drawable.queen_gray);
                e4.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 20");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 21) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 21");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 22) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d1.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h0.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 22");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 23) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g4.setBackgroundResource(R.drawable.queen);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 23");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 24) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e4.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 24");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 25) {
                a2.setBackgroundResource(R.drawable.queen);
                b5.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d1.setBackgroundResource(R.drawable.queen);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 25");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 26) {
                a2.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d7.setBackgroundResource(R.drawable.queen);
                e4.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 26");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 27) {
                a2.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d7.setBackgroundResource(R.drawable.queen);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f3.setBackgroundResource(R.drawable.queen);
                g0.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 27");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 28) {
                a2.setBackgroundResource(R.drawable.queen);
                b7.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d6.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f5.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 28");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 29) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 29");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 30) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f2.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 30");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 31) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c4.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 31");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 32) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c6.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g0.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 32");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 33) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c6.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g4.setBackgroundResource(R.drawable.queen);
                h0.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 33");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 34) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c6.setBackgroundResource(R.drawable.queen);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f7.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 34");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 35) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e6.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 35");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 36) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f2.setBackgroundResource(R.drawable.queen_gray);
                g4.setBackgroundResource(R.drawable.queen);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 36");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 37) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b5.setBackgroundResource(R.drawable.queen);
                c0.setBackgroundResource(R.drawable.queen);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g2.setBackgroundResource(R.drawable.queen);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 37");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 38) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b5.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d1.setBackgroundResource(R.drawable.queen);
                e6.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 38");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 39) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b5.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g4.setBackgroundResource(R.drawable.queen);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 39");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 40) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e4.setBackgroundResource(R.drawable.queen);
                f1.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 40");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 41) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c2.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g0.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 41");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 42) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d1.setBackgroundResource(R.drawable.queen);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h7.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 42");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 43) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f5.setBackgroundResource(R.drawable.queen);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 43");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 44) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b7.setBackgroundResource(R.drawable.queen);
                c0.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g6.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 44");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 45) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b7.setBackgroundResource(R.drawable.queen);
                c0.setBackgroundResource(R.drawable.queen);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e6.setBackgroundResource(R.drawable.queen);
                f1.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 45");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 46) {
                a3.setBackgroundResource(R.drawable.queen_gray);
                b7.setBackgroundResource(R.drawable.queen);
                c4.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 46");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 47) {
                a4.setBackgroundResource(R.drawable.queen);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g6.setBackgroundResource(R.drawable.queen);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 47");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 48) {
                a4.setBackgroundResource(R.drawable.queen);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d3.setBackgroundResource(R.drawable.queen);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 48");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 49) {
                a4.setBackgroundResource(R.drawable.queen);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e2.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 49");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 50) {
                a4.setBackgroundResource(R.drawable.queen);
                b1.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f2.setBackgroundResource(R.drawable.queen_gray);
                g0.setBackgroundResource(R.drawable.queen);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 50");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 51) {
                a4.setBackgroundResource(R.drawable.queen);
                b1.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d6.setBackgroundResource(R.drawable.queen_gray);
                e2.setBackgroundResource(R.drawable.queen);
                f7.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h0.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 51");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 52) {
                a4.setBackgroundResource(R.drawable.queen);
                b1.setBackgroundResource(R.drawable.queen);
                c5.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e6.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 52");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 53) {
                a4.setBackgroundResource(R.drawable.queen);
                b1.setBackgroundResource(R.drawable.queen);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 53");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 54) {
                a4.setBackgroundResource(R.drawable.queen);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d5.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 54");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 55) {
                a4.setBackgroundResource(R.drawable.queen);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d6.setBackgroundResource(R.drawable.queen);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 55");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 56) {
                a4.setBackgroundResource(R.drawable.queen);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d3.setBackgroundResource(R.drawable.queen);
                e6.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 56");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 57) {
                a4.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f5.setBackgroundResource(R.drawable.queen);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 57");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 58) {
                a4.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d3.setBackgroundResource(R.drawable.queen);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 58");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 59) {
                a4.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d3.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 59");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 60) {
                a4.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e2.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h7.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 60");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 61) {
                a4.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d5.setBackgroundResource(R.drawable.queen);
                e2.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 61");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 62) {
                a4.setBackgroundResource(R.drawable.queen);
                b6.setBackgroundResource(R.drawable.queen_gray);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e2.setBackgroundResource(R.drawable.queen);
                f7.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h1.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 62");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 63) {
                a4.setBackgroundResource(R.drawable.queen);
                b7.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e2.setBackgroundResource(R.drawable.queen);
                f5.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 63");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 64) {
                a4.setBackgroundResource(R.drawable.queen);
                b7.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e6.setBackgroundResource(R.drawable.queen);
                f1.setBackgroundResource(R.drawable.queen);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 64");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 65) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d1.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f2.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 65");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 66) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c6.setBackgroundResource(R.drawable.queen);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e2.setBackgroundResource(R.drawable.queen);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 66");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 67) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c6.setBackgroundResource(R.drawable.queen);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g4.setBackgroundResource(R.drawable.queen);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 67");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 68) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d6.setBackgroundResource(R.drawable.queen_gray);
                e4.setBackgroundResource(R.drawable.queen);
                f7.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 68");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 69) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g6.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 69");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 70) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e4.setBackgroundResource(R.drawable.queen);
                f1.setBackgroundResource(R.drawable.queen);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 70");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 71) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d6.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h7.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 71");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 72) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c4.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h6.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 72");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 73) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c6.setBackgroundResource(R.drawable.queen);
                d1.setBackgroundResource(R.drawable.queen);
                e3.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g0.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 73");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 74) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c6.setBackgroundResource(R.drawable.queen);
                d1.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g0.setBackgroundResource(R.drawable.queen);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 74");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 75) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c6.setBackgroundResource(R.drawable.queen);
                d3.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f7.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 75");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 76) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b3.setBackgroundResource(R.drawable.queen);
                c0.setBackgroundResource(R.drawable.queen);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g6.setBackgroundResource(R.drawable.queen);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 76");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 77) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b3.setBackgroundResource(R.drawable.queen);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d7.setBackgroundResource(R.drawable.queen);
                e4.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g0.setBackgroundResource(R.drawable.queen);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 77");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 78) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b3.setBackgroundResource(R.drawable.queen);
                c6.setBackgroundResource(R.drawable.queen);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e2.setBackgroundResource(R.drawable.queen);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h7.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 78");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 79) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b3.setBackgroundResource(R.drawable.queen);
                c6.setBackgroundResource(R.drawable.queen);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g4.setBackgroundResource(R.drawable.queen);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 79");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 80) {
                a5.setBackgroundResource(R.drawable.queen_gray);
                b7.setBackgroundResource(R.drawable.queen);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d3.setBackgroundResource(R.drawable.queen);
                e0.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g4.setBackgroundResource(R.drawable.queen);
                h2.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 80");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 81) {
                a6.setBackgroundResource(R.drawable.queen);
                b0.setBackgroundResource(R.drawable.queen_gray);
                c2.setBackgroundResource(R.drawable.queen);
                d7.setBackgroundResource(R.drawable.queen);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f3.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 81");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 82) {
                a6.setBackgroundResource(R.drawable.queen);
                b1.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 82");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 83) {
                a6.setBackgroundResource(R.drawable.queen);
                b1.setBackgroundResource(R.drawable.queen);
                c5.setBackgroundResource(R.drawable.queen_gray);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f3.setBackgroundResource(R.drawable.queen);
                g7.setBackgroundResource(R.drawable.queen_gray);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 83");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 84) {
                a6.setBackgroundResource(R.drawable.queen);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d5.setBackgroundResource(R.drawable.queen);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 84");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 85) {
                a6.setBackgroundResource(R.drawable.queen);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c7.setBackgroundResource(R.drawable.queen_gray);
                d1.setBackgroundResource(R.drawable.queen);
                e4.setBackgroundResource(R.drawable.queen);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g5.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 85");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 86) {
                a6.setBackgroundResource(R.drawable.queen);
                b3.setBackgroundResource(R.drawable.queen);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d4.setBackgroundResource(R.drawable.queen_gray);
                e7.setBackgroundResource(R.drawable.queen_gray);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 86");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 87) {
                a6.setBackgroundResource(R.drawable.queen);
                b3.setBackgroundResource(R.drawable.queen);
                c1.setBackgroundResource(R.drawable.queen_gray);
                d7.setBackgroundResource(R.drawable.queen);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f0.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 87");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 88) {
                a6.setBackgroundResource(R.drawable.queen);
                b4.setBackgroundResource(R.drawable.queen_gray);
                c2.setBackgroundResource(R.drawable.queen);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f7.setBackgroundResource(R.drawable.queen);
                g1.setBackgroundResource(R.drawable.queen_gray);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 88");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 89) {
                a7.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c3.setBackgroundResource(R.drawable.queen_gray);
                d0.setBackgroundResource(R.drawable.queen_gray);
                e6.setBackgroundResource(R.drawable.queen);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g2.setBackgroundResource(R.drawable.queen);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 89");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 90) {
                a7.setBackgroundResource(R.drawable.queen_gray);
                b1.setBackgroundResource(R.drawable.queen);
                c4.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e0.setBackgroundResource(R.drawable.queen);
                f6.setBackgroundResource(R.drawable.queen_gray);
                g3.setBackgroundResource(R.drawable.queen_gray);
                h5.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 90");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 91) {
                a7.setBackgroundResource(R.drawable.queen_gray);
                b2.setBackgroundResource(R.drawable.queen_gray);
                c0.setBackgroundResource(R.drawable.queen);
                d5.setBackgroundResource(R.drawable.queen);
                e1.setBackgroundResource(R.drawable.queen_gray);
                f4.setBackgroundResource(R.drawable.queen_gray);
                g6.setBackgroundResource(R.drawable.queen);
                h3.setBackgroundResource(R.drawable.queen);
                txt_solutionNo.setText("Solution No: 91");
            } else if (Integer.parseInt(txt_input.getText().toString()) == 92) {
                a7.setBackgroundResource(R.drawable.queen_gray);
                b3.setBackgroundResource(R.drawable.queen);
                c0.setBackgroundResource(R.drawable.queen);
                d2.setBackgroundResource(R.drawable.queen_gray);
                e5.setBackgroundResource(R.drawable.queen_gray);
                f1.setBackgroundResource(R.drawable.queen);
                g6.setBackgroundResource(R.drawable.queen);
                h4.setBackgroundResource(R.drawable.queen_gray);
                txt_solutionNo.setText("Solution No: 92");
            } else {
                Toast.makeText(context, "Enter No. Between 1 - 92",
                        Toast.LENGTH_LONG).show();
                // txt_solutionNo.setText("Solution No: " + randomInt);
            }
        }
        txt_input.setText(null);

    }

    public void solutions() {
        if (randomInt == 1) {
            a0.setBackgroundResource(R.drawable.queen);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e2.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 2) {
            a0.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e6.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 3) {
            a0.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g4.setBackgroundResource(R.drawable.queen);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 4) {
            a0.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f3.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 5) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b3.setBackgroundResource(R.drawable.queen);
            c5.setBackgroundResource(R.drawable.queen_gray);
            d7.setBackgroundResource(R.drawable.queen);
            e2.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 6) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c6.setBackgroundResource(R.drawable.queen);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e2.setBackgroundResource(R.drawable.queen);
            f7.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 7) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c6.setBackgroundResource(R.drawable.queen);
            d3.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f7.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 8) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b5.setBackgroundResource(R.drawable.queen);
            c0.setBackgroundResource(R.drawable.queen);
            d6.setBackgroundResource(R.drawable.queen_gray);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g2.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 9) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b5.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g6.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 10) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c2.setBackgroundResource(R.drawable.queen);
            d5.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g0.setBackgroundResource(R.drawable.queen);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 11) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 12) {
            a1.setBackgroundResource(R.drawable.queen_gray);
            b7.setBackgroundResource(R.drawable.queen);
            c5.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e2.setBackgroundResource(R.drawable.queen);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 13) {
            a2.setBackgroundResource(R.drawable.queen);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c6.setBackgroundResource(R.drawable.queen);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 14) {
            a2.setBackgroundResource(R.drawable.queen);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d7.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 15) {
            a2.setBackgroundResource(R.drawable.queen);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d7.setBackgroundResource(R.drawable.queen);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f3.setBackgroundResource(R.drawable.queen);
            g6.setBackgroundResource(R.drawable.queen);
            h0.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 16) {
            a2.setBackgroundResource(R.drawable.queen);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c6.setBackgroundResource(R.drawable.queen);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 17) {
            a2.setBackgroundResource(R.drawable.queen);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d3.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 18) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 19) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d6.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 20) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d6.setBackgroundResource(R.drawable.queen_gray);
            e4.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 21) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 22) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d1.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h0.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 23) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g4.setBackgroundResource(R.drawable.queen);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 24) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e4.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 25) {
            a2.setBackgroundResource(R.drawable.queen);
            b5.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d1.setBackgroundResource(R.drawable.queen);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 26) {
            a2.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d7.setBackgroundResource(R.drawable.queen);
            e4.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 27) {
            a2.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d7.setBackgroundResource(R.drawable.queen);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f3.setBackgroundResource(R.drawable.queen);
            g0.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 28) {
            a2.setBackgroundResource(R.drawable.queen);
            b7.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d6.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f5.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 29) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 30) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f2.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 31) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c4.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 32) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c6.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g0.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 33) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c6.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g4.setBackgroundResource(R.drawable.queen);
            h0.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 34) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c6.setBackgroundResource(R.drawable.queen);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f7.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 35) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e6.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 36) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f2.setBackgroundResource(R.drawable.queen_gray);
            g4.setBackgroundResource(R.drawable.queen);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 37) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b5.setBackgroundResource(R.drawable.queen);
            c0.setBackgroundResource(R.drawable.queen);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g2.setBackgroundResource(R.drawable.queen);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 38) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b5.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d1.setBackgroundResource(R.drawable.queen);
            e6.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 39) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b5.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g4.setBackgroundResource(R.drawable.queen);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 40) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e4.setBackgroundResource(R.drawable.queen);
            f1.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 41) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c2.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g0.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 42) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d1.setBackgroundResource(R.drawable.queen);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h7.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 43) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f5.setBackgroundResource(R.drawable.queen);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 44) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b7.setBackgroundResource(R.drawable.queen);
            c0.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g6.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 45) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b7.setBackgroundResource(R.drawable.queen);
            c0.setBackgroundResource(R.drawable.queen);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e6.setBackgroundResource(R.drawable.queen);
            f1.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 46) {
            a3.setBackgroundResource(R.drawable.queen_gray);
            b7.setBackgroundResource(R.drawable.queen);
            c4.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 47) {
            a4.setBackgroundResource(R.drawable.queen);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g6.setBackgroundResource(R.drawable.queen);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 48) {
            a4.setBackgroundResource(R.drawable.queen);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d3.setBackgroundResource(R.drawable.queen);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 49) {
            a4.setBackgroundResource(R.drawable.queen);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e2.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 50) {
            a4.setBackgroundResource(R.drawable.queen);
            b1.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f2.setBackgroundResource(R.drawable.queen_gray);
            g0.setBackgroundResource(R.drawable.queen);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 51) {
            a4.setBackgroundResource(R.drawable.queen);
            b1.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d6.setBackgroundResource(R.drawable.queen_gray);
            e2.setBackgroundResource(R.drawable.queen);
            f7.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h0.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 52) {
            a4.setBackgroundResource(R.drawable.queen);
            b1.setBackgroundResource(R.drawable.queen);
            c5.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e6.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 53) {
            a4.setBackgroundResource(R.drawable.queen);
            b1.setBackgroundResource(R.drawable.queen);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 54) {
            a4.setBackgroundResource(R.drawable.queen);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d5.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 55) {
            a4.setBackgroundResource(R.drawable.queen);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d6.setBackgroundResource(R.drawable.queen);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 56) {
            a4.setBackgroundResource(R.drawable.queen);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d3.setBackgroundResource(R.drawable.queen);
            e6.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 57) {
            a4.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f5.setBackgroundResource(R.drawable.queen);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 58) {
            a4.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d3.setBackgroundResource(R.drawable.queen);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 59) {
            a4.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d3.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 60) {
            a4.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e2.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h7.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 61) {
            a4.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d5.setBackgroundResource(R.drawable.queen);
            e2.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 62) {
            a4.setBackgroundResource(R.drawable.queen);
            b6.setBackgroundResource(R.drawable.queen_gray);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e2.setBackgroundResource(R.drawable.queen);
            f7.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h1.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 63) {
            a4.setBackgroundResource(R.drawable.queen);
            b7.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e2.setBackgroundResource(R.drawable.queen);
            f5.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 64) {
            a4.setBackgroundResource(R.drawable.queen);
            b7.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e6.setBackgroundResource(R.drawable.queen);
            f1.setBackgroundResource(R.drawable.queen);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 65) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d1.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f2.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 66) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c6.setBackgroundResource(R.drawable.queen);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e2.setBackgroundResource(R.drawable.queen);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 67) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c6.setBackgroundResource(R.drawable.queen);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g4.setBackgroundResource(R.drawable.queen);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 68) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d6.setBackgroundResource(R.drawable.queen_gray);
            e4.setBackgroundResource(R.drawable.queen);
            f7.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 69) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g6.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 70) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e4.setBackgroundResource(R.drawable.queen);
            f1.setBackgroundResource(R.drawable.queen);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 71) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d6.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h7.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 72) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c4.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h6.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 73) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c6.setBackgroundResource(R.drawable.queen);
            d1.setBackgroundResource(R.drawable.queen);
            e3.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g0.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 74) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c6.setBackgroundResource(R.drawable.queen);
            d1.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g0.setBackgroundResource(R.drawable.queen);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 75) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c6.setBackgroundResource(R.drawable.queen);
            d3.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f7.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 76) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b3.setBackgroundResource(R.drawable.queen);
            c0.setBackgroundResource(R.drawable.queen);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g6.setBackgroundResource(R.drawable.queen);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 77) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b3.setBackgroundResource(R.drawable.queen);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d7.setBackgroundResource(R.drawable.queen);
            e4.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g0.setBackgroundResource(R.drawable.queen);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 78) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b3.setBackgroundResource(R.drawable.queen);
            c6.setBackgroundResource(R.drawable.queen);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e2.setBackgroundResource(R.drawable.queen);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h7.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 79) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b3.setBackgroundResource(R.drawable.queen);
            c6.setBackgroundResource(R.drawable.queen);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g4.setBackgroundResource(R.drawable.queen);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 80) {
            a5.setBackgroundResource(R.drawable.queen_gray);
            b7.setBackgroundResource(R.drawable.queen);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d3.setBackgroundResource(R.drawable.queen);
            e0.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g4.setBackgroundResource(R.drawable.queen);
            h2.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 81) {
            a6.setBackgroundResource(R.drawable.queen);
            b0.setBackgroundResource(R.drawable.queen_gray);
            c2.setBackgroundResource(R.drawable.queen);
            d7.setBackgroundResource(R.drawable.queen);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f3.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 82) {
            a6.setBackgroundResource(R.drawable.queen);
            b1.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 83) {
            a6.setBackgroundResource(R.drawable.queen);
            b1.setBackgroundResource(R.drawable.queen);
            c5.setBackgroundResource(R.drawable.queen_gray);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f3.setBackgroundResource(R.drawable.queen);
            g7.setBackgroundResource(R.drawable.queen_gray);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 84) {
            a6.setBackgroundResource(R.drawable.queen);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d5.setBackgroundResource(R.drawable.queen);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 85) {
            a6.setBackgroundResource(R.drawable.queen);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c7.setBackgroundResource(R.drawable.queen_gray);
            d1.setBackgroundResource(R.drawable.queen);
            e4.setBackgroundResource(R.drawable.queen);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g5.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 86) {
            a6.setBackgroundResource(R.drawable.queen);
            b3.setBackgroundResource(R.drawable.queen);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d4.setBackgroundResource(R.drawable.queen_gray);
            e7.setBackgroundResource(R.drawable.queen_gray);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 87) {
            a6.setBackgroundResource(R.drawable.queen);
            b3.setBackgroundResource(R.drawable.queen);
            c1.setBackgroundResource(R.drawable.queen_gray);
            d7.setBackgroundResource(R.drawable.queen);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f0.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 88) {
            a6.setBackgroundResource(R.drawable.queen);
            b4.setBackgroundResource(R.drawable.queen_gray);
            c2.setBackgroundResource(R.drawable.queen);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f7.setBackgroundResource(R.drawable.queen);
            g1.setBackgroundResource(R.drawable.queen_gray);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 89) {
            a7.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c3.setBackgroundResource(R.drawable.queen_gray);
            d0.setBackgroundResource(R.drawable.queen_gray);
            e6.setBackgroundResource(R.drawable.queen);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g2.setBackgroundResource(R.drawable.queen);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 90) {
            a7.setBackgroundResource(R.drawable.queen_gray);
            b1.setBackgroundResource(R.drawable.queen);
            c4.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e0.setBackgroundResource(R.drawable.queen);
            f6.setBackgroundResource(R.drawable.queen_gray);
            g3.setBackgroundResource(R.drawable.queen_gray);
            h5.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 91) {
            a7.setBackgroundResource(R.drawable.queen_gray);
            b2.setBackgroundResource(R.drawable.queen_gray);
            c0.setBackgroundResource(R.drawable.queen);
            d5.setBackgroundResource(R.drawable.queen);
            e1.setBackgroundResource(R.drawable.queen_gray);
            f4.setBackgroundResource(R.drawable.queen_gray);
            g6.setBackgroundResource(R.drawable.queen);
            h3.setBackgroundResource(R.drawable.queen);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else if (randomInt == 92) {
            a7.setBackgroundResource(R.drawable.queen_gray);
            b3.setBackgroundResource(R.drawable.queen);
            c0.setBackgroundResource(R.drawable.queen);
            d2.setBackgroundResource(R.drawable.queen_gray);
            e5.setBackgroundResource(R.drawable.queen_gray);
            f1.setBackgroundResource(R.drawable.queen);
            g6.setBackgroundResource(R.drawable.queen);
            h4.setBackgroundResource(R.drawable.queen_gray);
            txt_solutionNo.setText("Solution No: " + randomInt);
        } else {
            txt_solutionNo.setText("Solution No: " + randomInt);
        }

    }

    public void clearGrid() {
        a0.setBackgroundResource(R.drawable.white);
        a1.setBackgroundResource(R.drawable.gray);
        a2.setBackgroundResource(R.drawable.white);
        a3.setBackgroundResource(R.drawable.gray);
        a4.setBackgroundResource(R.drawable.white);
        a5.setBackgroundResource(R.drawable.gray);
        a6.setBackgroundResource(R.drawable.white);
        a7.setBackgroundResource(R.drawable.gray);

        b0.setBackgroundResource(R.drawable.gray);
        b1.setBackgroundResource(R.drawable.white);
        b2.setBackgroundResource(R.drawable.gray);
        b3.setBackgroundResource(R.drawable.white);
        b4.setBackgroundResource(R.drawable.gray);
        b5.setBackgroundResource(R.drawable.white);
        b6.setBackgroundResource(R.drawable.gray);
        b7.setBackgroundResource(R.drawable.white);

        c0.setBackgroundResource(R.drawable.white);
        c1.setBackgroundResource(R.drawable.gray);
        c2.setBackgroundResource(R.drawable.white);
        c3.setBackgroundResource(R.drawable.gray);
        c4.setBackgroundResource(R.drawable.white);
        c5.setBackgroundResource(R.drawable.gray);
        c6.setBackgroundResource(R.drawable.white);
        c7.setBackgroundResource(R.drawable.gray);

        d0.setBackgroundResource(R.drawable.gray);
        d1.setBackgroundResource(R.drawable.white);
        d2.setBackgroundResource(R.drawable.gray);
        d3.setBackgroundResource(R.drawable.white);
        d4.setBackgroundResource(R.drawable.gray);
        d5.setBackgroundResource(R.drawable.white);
        d6.setBackgroundResource(R.drawable.gray);
        d7.setBackgroundResource(R.drawable.white);

        e0.setBackgroundResource(R.drawable.white);
        e1.setBackgroundResource(R.drawable.gray);
        e2.setBackgroundResource(R.drawable.white);
        e3.setBackgroundResource(R.drawable.gray);
        e4.setBackgroundResource(R.drawable.white);
        e5.setBackgroundResource(R.drawable.gray);
        e6.setBackgroundResource(R.drawable.white);
        e7.setBackgroundResource(R.drawable.gray);

        f0.setBackgroundResource(R.drawable.gray);
        f1.setBackgroundResource(R.drawable.white);
        f2.setBackgroundResource(R.drawable.gray);
        f3.setBackgroundResource(R.drawable.white);
        f4.setBackgroundResource(R.drawable.gray);
        f5.setBackgroundResource(R.drawable.white);
        f6.setBackgroundResource(R.drawable.gray);
        f7.setBackgroundResource(R.drawable.white);

        g0.setBackgroundResource(R.drawable.white);
        g1.setBackgroundResource(R.drawable.gray);
        g2.setBackgroundResource(R.drawable.white);
        g3.setBackgroundResource(R.drawable.gray);
        g4.setBackgroundResource(R.drawable.white);
        g5.setBackgroundResource(R.drawable.gray);
        g6.setBackgroundResource(R.drawable.white);
        g7.setBackgroundResource(R.drawable.gray);

        h0.setBackgroundResource(R.drawable.gray);
        h1.setBackgroundResource(R.drawable.white);
        h2.setBackgroundResource(R.drawable.gray);
        h3.setBackgroundResource(R.drawable.white);
        h4.setBackgroundResource(R.drawable.gray);
        h5.setBackgroundResource(R.drawable.white);
        h6.setBackgroundResource(R.drawable.gray);
        h7.setBackgroundResource(R.drawable.white);

    }

    public void queenPosition(int r, int c) {

        int x, y, z1, z2;
        x = r;
        y = r;
        z1 = c;
        z2 = c;
        // loop for row

        for (int i = 0; i < 8; i++) {

            position[r][i] = 2;
            // Toast.makeText(context, "" + position[r][i] + " " + i,
            // Toast.LENGTH_SHORT).show();

        }

        // loop for column

        for (int j = 0; j < 8; j++) {

            position[j][c] = 2;
            // Toast.makeText(context, "" + position[j][c] + " " + j,
            // Toast.LENGTH_SHORT).show();

        }

        position[r][c] = 1;

        // loop for 4th quadrant

        if (x < 7) {
            for (int k = c + 1; k <= 7; k++) {

                x++;
                if (x < 8) {
                    position[x][k] = 2;

                }
            }
        }

        // loop for 1st quadrant

        if (y > 0) {
            for (int l = c + 1; l <= 7; l++) {

                y--;
                if (y > -1) {
                    position[y][l] = 2;

                }
            }
        }

        // loop for 3rd quadrant

        if (z1 <= 7) {
            for (int m = r + 1; m <= 7; m++) {

                z1--;
                if (z1 > -1) {
                    position[m][z1] = 2;

                }
            }
        }

        if (z2 <= 7) {
            for (int n = r - 1; n >= 0; n--) {

                z2--;
                if (z2 > -1) {
                    position[n][z2] = 2;

                }
            }
        }

    }

}
