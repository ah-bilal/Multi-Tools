package ict.tools.ict_project_tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class EightQueen extends Activity implements View.OnClickListener {

    Context context;
    ImageButton a0, a1, a2, a3, a4, a5, a6, a7, b0, b1, b2, b3, b4, b5, b6, b7,
            c0, c1, c2, c3, c4, c5, c6, c7, d0, d1, d2, d3, d4, d5, d6, d7, e0,
            e1, e2, e3, e4, e5, e6, e7, f0, f1, f2, f3, f4, f5, f6, f7, g0, g1,
            g2, g3, g4, g5, g6, g7, h0, h1, h2, h3, h4, h5, h6, h7, q0, q1, q2,
            q3, q4, q5, q6, q7;

    Button btn_clear, btn_solutions;

    int[][] position = new int[8][8];
    int queens = 8;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_queen);

        context = this;

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_solutions = (Button) findViewById(R.id.btn_solutions);

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

        btn_clear.setOnClickListener(this);
        btn_solutions.setOnClickListener(this);

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

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_solutions:

                Intent solutions = new Intent(context, SolutionActivity.class);
                startActivity(solutions);


                break;

            case R.id.btn_clear:

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

                q0.setBackgroundResource(R.drawable.queen);
                q1.setBackgroundResource(R.drawable.queen);
                q2.setBackgroundResource(R.drawable.queen);
                q3.setBackgroundResource(R.drawable.queen);
                q4.setBackgroundResource(R.drawable.queen);
                q5.setBackgroundResource(R.drawable.queen);
                q6.setBackgroundResource(R.drawable.queen);
                q7.setBackgroundResource(R.drawable.queen);

                for (int i = 0; i < 8; i++) {
                    position[i][0] = 0;
                }

                for (int i = 0; i < 8; i++) {
                    position[i][1] = 0;
                }

                for (int i = 0; i < 8; i++) {
                    position[i][2] = 0;
                }

                for (int i = 0; i < 8; i++) {
                    position[i][3] = 0;
                }

                for (int i = 0; i < 8; i++) {
                    position[i][4] = 0;
                }

                for (int i = 0; i < 8; i++) {
                    position[i][5] = 0;
                }

                for (int i = 0; i < 8; i++) {
                    position[i][6] = 0;
                }

                for (int i = 0; i < 8; i++) {
                    position[i][7] = 0;
                }

                queens = 8;

                break;

            case R.id.a0:

                if (position[0][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a0.setBackgroundResource(R.drawable.queen);
                    queenPosition(0, 0);

                } else if (position[0][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else if (position[0][0] == 2) {

                    a0.setBackgroundResource(R.drawable.cross_white);

                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();

                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.a1:

                if (position[0][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a1.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(0, 1);

                } else if (position[0][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    a1.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.a2:

                if (position[0][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a2.setBackgroundResource(R.drawable.queen);
                    queenPosition(0, 2);

                } else if (position[0][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    a2.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.a3:

                if (position[0][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a3.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(0, 3);

                } else if (position[0][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    a3.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.a4:

                if (position[0][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a4.setBackgroundResource(R.drawable.queen);
                    queenPosition(0, 4);

                } else if (position[0][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    a4.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.a5:

                if (position[0][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a5.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(0, 5);

                } else if (position[0][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    a5.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.a6:
                if (position[0][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a6.setBackgroundResource(R.drawable.queen);
                    queenPosition(0, 6);

                } else if (position[0][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    a6.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.a7:

                if (position[0][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    a7.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(0, 7);

                } else if (position[0][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    a7.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }
                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.b0:

                if (position[1][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b0.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(1, 0);

                } else if (position[1][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    b0.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.b1:
                if (position[1][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b1.setBackgroundResource(R.drawable.queen);
                    queenPosition(1, 1);

                } else if (position[1][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {
                    b1.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.b2:
                if (position[1][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b2.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(1, 2);

                } else if (position[1][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    b2.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.b3:

                if (position[1][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b3.setBackgroundResource(R.drawable.queen);
                    queenPosition(1, 3);

                } else if (position[1][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    b3.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.b4:
                if (position[1][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b4.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(1, 4);

                } else if (position[1][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    b4.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.b5:

                if (position[1][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b5.setBackgroundResource(R.drawable.queen);
                    queenPosition(1, 5);

                } else if (position[1][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    b5.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }
                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.b6:

                if (position[1][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b6.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(1, 6);

                } else if (position[1][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    b6.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.b7:
                if (position[1][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    b7.setBackgroundResource(R.drawable.queen);
                    queenPosition(1, 7);

                } else if (position[1][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    b7.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.c0:

                if (position[2][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c0.setBackgroundResource(R.drawable.queen);
                    queenPosition(2, 0);

                } else if (position[2][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c0.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.c1:

                if (position[2][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c1.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(2, 1);

                } else if (position[2][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c1.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.c2:

                if (position[2][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c2.setBackgroundResource(R.drawable.queen);
                    queenPosition(2, 2);

                } else if (position[2][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c2.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.c3:

                if (position[2][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c3.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(2, 3);

                } else if (position[2][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c3.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.c4:

                if (position[2][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c4.setBackgroundResource(R.drawable.queen);
                    queenPosition(2, 4);

                } else if (position[2][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c4.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.c5:

                if (position[2][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c5.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(2, 5);

                } else if (position[2][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c5.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }
                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.c6:

                if (position[2][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c6.setBackgroundResource(R.drawable.queen);
                    queenPosition(2, 6);

                } else if (position[2][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c6.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.c7:

                if (position[2][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    c7.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(2, 7);

                } else if (position[2][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    c7.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.d0:

                if (position[3][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d0.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(3, 0);

                } else if (position[3][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d0.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }
                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.d1:

                if (position[3][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d1.setBackgroundResource(R.drawable.queen);
                    queenPosition(3, 1);

                } else if (position[3][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d1.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.d2:

                if (position[3][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d2.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(3, 2);

                } else if (position[3][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d2.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.d3:

                if (position[3][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d3.setBackgroundResource(R.drawable.queen);
                    queenPosition(3, 3);

                } else if (position[3][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d3.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.d4:

                if (position[3][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d4.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(3, 4);

                } else if (position[3][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d4.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.d5:

                if (position[3][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d5.setBackgroundResource(R.drawable.queen);
                    queenPosition(3, 5);

                } else if (position[3][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d5.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.d6:

                if (position[3][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d6.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(3, 6);

                } else if (position[3][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d6.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.d7:

                if (position[3][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    d7.setBackgroundResource(R.drawable.queen);
                    queenPosition(3, 7);

                } else if (position[3][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    d7.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e0:

                if (position[4][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e0.setBackgroundResource(R.drawable.queen);
                    queenPosition(4, 0);

                } else if (position[4][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e0.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e1:

                if (position[4][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e1.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(4, 1);

                } else if (position[4][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e1.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e2:

                if (position[4][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e2.setBackgroundResource(R.drawable.queen);
                    queenPosition(4, 2);

                } else if (position[4][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e2.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e3:

                if (position[4][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e3.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(4, 3);

                } else if (position[4][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e3.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e4:

                if (position[4][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e4.setBackgroundResource(R.drawable.queen);
                    queenPosition(4, 4);

                } else if (position[4][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e4.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e5:

                if (position[4][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e5.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(4, 5);

                } else if (position[4][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e5.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e6:

                if (position[4][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e6.setBackgroundResource(R.drawable.queen);
                    queenPosition(4, 6);

                } else if (position[4][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e6.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.e7:

                if (position[4][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    e7.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(4, 7);

                } else if (position[4][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    e7.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f0:

                if (position[5][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f0.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(5, 0);

                } else if (position[5][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f0.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f1:

                if (position[5][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f1.setBackgroundResource(R.drawable.queen);
                    queenPosition(5, 1);

                } else if (position[5][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f1.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }
                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f2:

                if (position[5][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f2.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(5, 2);

                } else if (position[5][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f2.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f3:

                if (position[5][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f3.setBackgroundResource(R.drawable.queen);
                    queenPosition(5, 3);

                } else if (position[5][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f3.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f4:

                if (position[5][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f4.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(5, 4);

                } else if (position[5][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f4.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f5:

                if (position[5][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f5.setBackgroundResource(R.drawable.queen);
                    queenPosition(5, 5);

                } else if (position[5][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f5.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f6:

                if (position[5][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f6.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(5, 6);

                } else if (position[5][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f6.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.f7:

                if (position[5][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    f7.setBackgroundResource(R.drawable.queen);
                    queenPosition(5, 7);

                } else if (position[5][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    f7.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.g0:

                if (position[6][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g0.setBackgroundResource(R.drawable.queen);
                    queenPosition(6, 0);

                } else if (position[6][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g0.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.g1:

                if (position[6][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g1.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(6, 1);

                } else if (position[6][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g1.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.g2:

                if (position[6][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g2.setBackgroundResource(R.drawable.queen);
                    queenPosition(6, 2);

                } else if (position[6][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g2.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.g3:

                if (position[6][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g3.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(6, 3);

                } else if (position[6][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g3.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.g4:

                if (position[6][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g4.setBackgroundResource(R.drawable.queen);
                    queenPosition(6, 4);

                } else if (position[6][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g4.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.g5:

                if (position[6][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g5.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(6, 5);

                } else if (position[6][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g5.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.g6:

                if (position[6][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g6.setBackgroundResource(R.drawable.queen);
                    queenPosition(6, 6);

                } else if (position[6][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g6.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }

                break;

            case R.id.g7:

                if (position[6][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    g7.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(6, 7);

                } else if (position[6][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    g7.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h0:

                if (position[7][0] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h0.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(7, 0);

                } else if (position[7][0] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h0.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h1:

                if (position[7][1] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h1.setBackgroundResource(R.drawable.queen);
                    queenPosition(7, 1);

                } else if (position[7][1] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h1.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h2:

                if (position[7][2] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h2.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(7, 2);

                } else if (position[7][2] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h2.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h3:

                if (position[7][3] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h3.setBackgroundResource(R.drawable.queen);
                    queenPosition(7, 3);

                } else if (position[7][3] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h3.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h4:

                if (position[7][4] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h4.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(7, 4);

                } else if (position[7][4] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h4.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h5:

                if (position[7][5] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h5.setBackgroundResource(R.drawable.queen);
                    queenPosition(7, 5);

                } else if (position[7][5] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h5.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h6:

                if (position[7][6] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h6.setBackgroundResource(R.drawable.queen_gray);
                    queenPosition(7, 6);

                } else if (position[7][6] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h6.setBackgroundResource(R.drawable.cross_gray);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            case R.id.h7:

                if (position[7][7] == 0) {

                    if (queens == 8) {
                        q0.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 7) {
                        q1.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 6) {
                        q2.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 5) {
                        q3.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 4) {
                        q4.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 3) {
                        q5.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 2) {
                        q6.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 1) {
                        q7.setBackgroundResource(R.drawable.white);
                        queens--;
                    } else if (queens == 0) {
                        Toast.makeText(context, "All Queens have been placed",
                                Toast.LENGTH_SHORT).show();
                    }

                    h7.setBackgroundResource(R.drawable.queen);
                    queenPosition(7, 7);

                } else if (position[7][7] == 1) {
                    Toast.makeText(context, "Queen already placed here",
                            Toast.LENGTH_SHORT).show();
                } else {

                    h7.setBackgroundResource(R.drawable.cross_white);
                    Toast.makeText(context, "In line of another queen ",
                            Toast.LENGTH_SHORT).show();
                }

                if (queens == 0) {
                    Toast.makeText(context, "Well done, All queens placed", Toast.LENGTH_LONG)
                            .show();
                }
                break;

            default:
                break;
        }

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
