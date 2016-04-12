package ict.tools.ict_project_tools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class calc extends Activity implements View.OnClickListener {
    Button Plus, Minus, Multiply, Divide, eq, clr;
    EditText InputField;
    Context context;
    TextView txt;
    int p = 0, m = 0, mul = 0, d = 0;
    double InputOne;
    double InputTwo;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        context = this;
        Plus = (Button) this.findViewById(R.id.Plus);
        Minus = (Button) this.findViewById(R.id.Minus);
        Multiply = (Button) this.findViewById(R.id.Multiply);
        Divide = (Button) this.findViewById(R.id.Divide);
        eq = (Button) this.findViewById(R.id.eq);
        InputField = (EditText) this.findViewById(R.id.InputField);
        txt = (TextView) this.findViewById(R.id.textView);
        clr = (Button) this.findViewById(R.id.button5);
        clr.setOnClickListener(this);
        Plus.setOnClickListener(this);
        Minus.setOnClickListener(this);
        Divide.setOnClickListener(this);
        Multiply.setOnClickListener(this);
        eq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {


            case R.id.Plus:

                if (m == 1) {
                    txt.setText(InputOne + " + ");
                    m = 0;
                    p = 1;
                    break;
                } else if (mul == 1) {
                    txt.setText(InputOne + " + ");
                    mul = 0;
                    p = 1;
                } else if (d == 1) {
                    txt.setText(InputOne + " + ");
                    d = 0;
                    p = 1;
                } else if (p == 0) {


                    if (InputField.getText().toString().isEmpty()) {
                        Toast.makeText(calc.this, "Input Field Empty.",
                                Toast.LENGTH_LONG).show();
                    } else {


                        InputOne = Double.parseDouble(InputField.getText().toString());
                        txt.setText(InputOne + " + ");
                        InputField.setText(null);
                        p = 1;
                    }
                }

                break;


            case R.id.Minus:


                if (p == 1) {
                    txt.setText(InputOne + " - ");
                    p = 0;
                    m = 1;
                    break;
                } else if (mul == 1) {
                    txt.setText(InputOne + " - ");
                    mul = 0;
                    m = 1;
                } else if (d == 1) {
                    txt.setText(InputOne + " - ");
                    d = 0;
                    m = 1;
                } else if (m == 0) {


                    if (InputField.getText().toString().isEmpty()) {
                        Toast.makeText(calc.this, "Input Field Empty.",
                                Toast.LENGTH_LONG).show();
                    } else

                        InputOne = Double.parseDouble(InputField.getText().toString());
                    txt.setText(InputOne + " - ");
                    InputField.setText(null);
                    m = 1;
                }
                break;
            case R.id.Divide:
                if (m == 1) {
                    txt.setText(InputOne + " / ");
                    m = 0;
                    d = 1;
                    break;
                } else if (mul == 1) {
                    txt.setText(InputOne + " / ");
                    mul = 0;
                    d = 1;
                } else if (p == 1) {
                    txt.setText(InputOne + " / ");
                    p = 0;
                    d = 1;
                } else if (d == 0) {

                    if (InputField.getText().toString().isEmpty()) {
                        Toast.makeText(calc.this, "Input Field Empty.",
                                Toast.LENGTH_LONG).show();
                    } else {

                        InputOne = Double.parseDouble(InputField.getText().toString());
                        txt.setText(InputOne + " / ");
                        InputField.setText(null);
                        d = 1;
                    }
                }
                break;
            case R.id.Multiply:


                if (m == 1) {
                    txt.setText(InputOne + " * ");
                    m = 0;
                    mul = 1;
                    break;
                } else if (p == 1) {
                    txt.setText(InputOne + " * ");
                    mul = 1;
                    p = 0;
                } else if (d == 1) {
                    txt.setText(InputOne + " * ");
                    d = 0;
                    mul = 1;
                } else if (mul == 0) {
                    if (InputField.getText().toString().isEmpty()) {
                        Toast.makeText(calc.this, "Input Field Empty.",
                                Toast.LENGTH_LONG).show();
                    } else {


                        InputOne = Double.parseDouble(InputField.getText().toString());
                        txt.setText(InputOne + " * ");
                        InputField.setText(null);
                        mul = 1;
                    }
                }
                break;
            case R.id.eq:

                if (InputField.getText().toString().isEmpty()) {
                    Toast.makeText(calc.this, "Input Field Empty.",
                            Toast.LENGTH_LONG).show();
                    break;
                } else if (p == 1) {
                    InputTwo = Double.parseDouble(InputField.getText().toString());
                    result = InputOne + InputTwo;
                    txt.setText(InputOne + " + " + InputTwo + " = " + result);
                    p = 0;
                    InputField.setText(null);

                } else if (m == 1)

                {
                    InputTwo = Double.parseDouble(InputField.getText().toString());
                    result = InputOne - InputTwo;
                    txt.setText(InputOne + " - " + InputTwo + " = " + result);
                    m = 0;
                    InputField.setText(null);
                } else if (d == 1) {
                    InputTwo = Double.parseDouble(InputField.getText().toString());
                    result = InputOne / InputTwo;
                    txt.setText(InputOne + " / " + InputTwo + " = " + result);
                    d = 0;
                    InputField.setText(null);

                } else if (mul == 1) {

                    InputTwo = Double.parseDouble(InputField.getText().toString());
                    result = InputOne * InputTwo;
                    txt.setText(InputOne + " * " + InputTwo + " = " + result);
                    mul = 0;
                    InputField.setText(null);


                }
                break;
            case R.id.button5: {
                txt.setText(null);
                InputField.setText(null);
                m = 0;
                p = 0;
                mul = 0;
                d = 0;

            }
        }


    }

}

