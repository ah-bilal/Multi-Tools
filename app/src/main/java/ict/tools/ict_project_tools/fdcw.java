package ict.tools.ict_project_tools;

import android.os.Bundle;



import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fdcw
        extends Activity implements View.OnClickListener {
    Button duck1;
    Button wolf1;
    Button corn1;
    Button duck;
    Button wolf;
    Button corn;
    Button farmer;
    Button middle;
    Button restart;
    Context context;
    int c = 0;
    int d = 0;
    int w = 0;
    int dm = 0;
    int cm = 0;
    int wm = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fdcw);
        {

            context = this;
            duck = (Button) this.findViewById(R.id.duck);
            wolf = (Button) this.findViewById(R.id.wolf);
            corn = (Button) this.findViewById(R.id.corn);
            duck1 = (Button) this.findViewById(R.id.duck1);
            wolf1 = (Button) this.findViewById(R.id.wolf1);
            corn1 = (Button) this.findViewById(R.id.corn1);
            farmer = (Button) this.findViewById(R.id.farmer);
            middle = (Button) this.findViewById(R.id.middle);
            restart = (Button) this.findViewById(R.id.restart);

            corn.setOnClickListener(this);
            duck.setOnClickListener(this);
            wolf.setOnClickListener(this);
            corn1.setOnClickListener(this);
            duck1.setOnClickListener(this);
            wolf1.setOnClickListener(this);
            middle.setOnClickListener(this);
            restart.setOnClickListener(this);

            AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
            alertDialog.setTitle("Farmer Duck Corn Wolf");
            alertDialog.setMessage("Farmer Must Transfer Wolf Corn And Duck to The Other Side of the River." +
                    "Rules:" +
                    "You can't leave the wolf alone with the duck." +
                    "You can't leave the duck alone with the corn." +
                    "Only One can travel on the boat with the farmer at a time.");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Play",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();


        }

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.duck: {

                if ((dm == 1) || cm == 1 || wm == 1) {
                    Toast.makeText(fdcw.this, "Boat Cannot Carry Over More Than Two Characters. Transfer Over The Current One First",
                            Toast.LENGTH_LONG).show();
                    break;
                } else if (c == 0 && d == 0 && w == 0) {

                    duck.setBackground(null);
                    middle.setBackgroundResource(R.drawable.duck);


                    dm = 1;
                    d = 1;
                    break;
                } else if (c == 1 && d == 0 && w == 1) {

                    middle.setBackgroundResource(R.drawable.duck);
                    duck.setBackground(null);
                    c = 1;
                    dm = 1;
                    w = 1;
                    d = 0;
                    break;
                } else if (d == 1 && w == 1 && c == 0) {

                    duck.setClickable(false);

                }
            }
            case R.id.corn: {
                if (c == 1) {
                    corn.setClickable(false);
                    corn1.setClickable(true);

                }  if (c == 0) {

                    corn1.setClickable(false);
                    corn.setClickable(true);
                }


                if ((dm == 1) || cm == 1 || wm == 1) {
                    Toast.makeText(fdcw.this, "Boat Cannot Carry Over More Than Two Characters. Transfer Over The Current One First",
                            Toast.LENGTH_LONG).show();
                    break;
                } else if (c == 0 && d == 1 && w == 0) {
                    middle.setBackgroundResource(R.drawable.corn);
                    corn.setBackground(null);

                    c = 1;
                    cm = 1;
                    corn.setClickable(false);
                    break;


                } else if (c == 1 && d == 0 && w == 0) {

                } else if (c == 0 && d == 1 && w == 1) {

                    AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                    alertDialog.setTitle("Game Over");
                    alertDialog.setMessage("Wolf Ate The Duck While Farmer was Transporting Corn");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Restart",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    middle.setBackground(null);
                    duck1.setBackground(null);
                    wolf1.setBackground(null);
                    corn1.setBackground(null);
                    duck.setBackgroundResource(R.drawable.duck);
                    wolf.setBackgroundResource(R.drawable.wolf);
                    corn.setBackgroundResource(R.drawable.corn);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    d = 0;
                    c = 0;
                    w = 0;
                    corn.setClickable(true);
                    break;

                } else if (c == 0 && d == 1 && w == 0) {

                    Toast.makeText(fdcw.this, "Duck Ate Corn.",
                            Toast.LENGTH_LONG).show();


                } else if (c == 0 && d == 1 && w == 1 && wm == 1) {


                    AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                    alertDialog.setTitle("Game Over");
                    alertDialog.setMessage("Farmer Went To Fetch The Corn. Wolf Left Alone With The Duck. Wolf Ate The Duck");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Restart",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    middle.setBackground(null);
                    duck1.setBackground(null);
                    wolf1.setBackground(null);
                    corn1.setBackground(null);
                    duck.setBackgroundResource(R.drawable.duck);
                    wolf.setBackgroundResource(R.drawable.wolf);
                    corn.setBackgroundResource(R.drawable.corn);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    d = 0;
                    c = 0;
                    w = 0;
                    duck.setClickable(true
                    );
                    corn.setClickable(true);
                    break;

                } else if (c == 1 && d == 0 && w == 0) {

                    middle.setBackgroundResource(R.drawable.duck);
                    duck.setBackground(null);
                    dm = 1;
                    d = 1;
                    break;
                }
            }
            case R.id.wolf: {


                if ((dm == 1) || cm == 1 || wm == 1) {
                    Toast.makeText(fdcw.this, "Boat Cannot Carry Over More Than Two Characters. Transfer Over The Current One First",
                            Toast.LENGTH_LONG).show();
                    break;
                } else if (c == 1 && d == 0 && w == 0) {
                    middle.setBackgroundResource(R.drawable.wolf);
                    wolf.setBackground(null);
                    w = 1;
                    wm = 1;
                    wolf.setClickable(true);
                    break;

                } else if (c == 0 && d == 1 && w == 0) {

                    middle.setBackgroundResource(R.drawable.wolf);
                    wolf.setBackground(null);
                    wm = 1;
                    w = 1;
                    break;

                } else if (c == 1 && d == 1 && w == 1) {

                    Toast.makeText(fdcw.this, "Wrong. Farmer Went to Get the Wolf. Duck Was Left Alone With The Corn. Duck Ate The Corn.",
                            Toast.LENGTH_LONG).show();

                    Toast toast = Toast.makeText(fdcw.this, "Game Over!!!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    break;

                } else if (c == 0 && d == 0 && w == 0) {


                    middle.setBackgroundResource(R.drawable.wolf);
                    wolf.setBackground(null);
                    AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                    alertDialog.setTitle("Game Over");
                    alertDialog.setMessage("Duck Ate Corn While The Farmer Was Transporting The Wolf.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Restart",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    middle.setBackground(null);
                    duck1.setBackground(null);
                    wolf1.setBackground(null);
                    corn1.setBackground(null);
                    duck.setBackgroundResource(R.drawable.duck);
                    wolf.setBackgroundResource(R.drawable.wolf);
                    corn.setBackgroundResource(R.drawable.corn);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    d = 0;
                    c = 0;
                    w = 0;

                    break;


                } else if (c == 1 && d == 1 && w == 0)

                {

                    AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                    alertDialog.setTitle("Game Over");
                    alertDialog.setMessage("Farmer Left The Duck Alone With The Corn To Fetch The Wolf.Duck Ate Corn.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Restart",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    middle.setBackground(null);
                    duck1.setBackground(null);
                    wolf1.setBackground(null);
                    corn1.setBackground(null);
                    duck.setBackgroundResource(R.drawable.duck);
                    wolf.setBackgroundResource(R.drawable.wolf);
                    corn.setBackgroundResource(R.drawable.corn);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    d = 0;
                    c = 0;
                    w = 0;
                    corn.setClickable(true);
                    break;

                } else if (c == 0 && d == 1 && w == 0) {

                    middle.setBackgroundResource(R.drawable.wolf);
                    wolf.setBackground(null);
                    wm = 1;
                    w = 1;
                    break;
                } else if (c == 0 && d == 0 && w == 1) {
                    AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                    alertDialog.setTitle("Game Over");
                    alertDialog.setMessage("Wolf Moved To Boat. Duck Ate Corn.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Restart",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    middle.setBackground(null);
                    duck1.setBackground(null);
                    wolf1.setBackground(null);
                    corn1.setBackground(null);
                    duck.setBackgroundResource(R.drawable.duck);
                    wolf.setBackgroundResource(R.drawable.wolf);
                    corn.setBackgroundResource(R.drawable.corn);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    d = 0;
                    c = 0;
                    w = 0;

                    break;

                } else if (c == 1 && d == 1 && w == 0)

                {

                    AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                    alertDialog.setTitle("Game Over");
                    alertDialog.setMessage("Farmer Went to get the Wolf.Duck was alone with the corn. Duck ate corn.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Restart",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    middle.setBackground(null);
                    duck1.setBackground(null);
                    wolf1.setBackground(null);
                    corn1.setBackground(null);
                    duck.setBackgroundResource(R.drawable.duck);
                    wolf.setBackgroundResource(R.drawable.wolf);
                    corn.setBackgroundResource(R.drawable.corn);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    d = 0;
                    c = 0;
                    w = 0;

                    break;

                }

            }
            case R.id.duck1: {
                if (c == 1 && d == 1 && w == 0) {

                    middle.setBackgroundResource(R.drawable.duck);
                    duck1.setBackground(null);

                    d = 1;
                    dm = 1;
                    break;


                }
            }
            case R.id.middle: {


                if (w == 1 && c == 0 && d == 1) {
                    wolf1.setBackgroundResource(R.drawable.wolf);
                    middle.setBackground(null);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    break;
                } else if (c == 0 && d == 1 && w == 1 && wm == 1) {

                    wolf1.setBackgroundResource(R.drawable.wolf);
                    middle.setBackground(null);
                    wm = 1;
                    break;


                } else if (c == 1 && d == 1 && w == 0 && dm == 1) {


                    duck.setBackgroundResource(R.drawable.duck);
                    middle.setBackground(null);

                    d = 0;
                    dm = 0;
                    break;
                } else if (c == 0 && d == 1 && w == 0 && dm == 1) {

                    duck1.setBackgroundResource(R.drawable.duck);
                    middle.setBackground(null);
                    dm = 0;
                    break;

                } else if (c == 1 && d == 0 && w == 1 && wm == 1) {


                    wolf1.setBackgroundResource(R.drawable.wolf);
                    middle.setBackground(null);
                    wm = 0;
                    cm = 0;
                    dm = 0;

                    break;
                } else if (cm == 1 && c == 1 && d == 1 && w == 0) {
                    middle.setBackground(null);
                    corn1.setBackgroundResource(R.drawable.corn);

                    cm = 0;
                    break;


                } else if (d == 0 && c == 1 && w == 1 && wm == 1) {
                    wolf1.setBackgroundResource(R.drawable.wolf);
                    middle.setBackground(null);
                    wm = 0;
                    dm = 0;
                    cm = 0;

                    break;


                } else if (c == 1 && d == 0 && w == 1 && dm == 1) {

                    duck1.setBackgroundResource(R.drawable.duck);
                    middle.setBackground(null);

                    AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                    alertDialog.setTitle("You Won");
                    alertDialog.setMessage("All Characters Transported.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Play Again?",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    middle.setBackground(null);
                    duck1.setBackground(null);
                    wolf1.setBackground(null);
                    corn1.setBackground(null);
                    duck.setBackgroundResource(R.drawable.duck);
                    wolf.setBackgroundResource(R.drawable.wolf);
                    corn.setBackgroundResource(R.drawable.corn);
                    wm = 0;
                    dm = 0;
                    cm = 0;
                    d = 0;
                    c = 0;
                    w = 0;
                    corn.setClickable(true);
                    break;


                } else if (c == 0 && d == 1 && w == 1 && wm == 1) {


                    wolf1.setBackgroundResource(R.drawable.wolf);
                    middle.setBackground(null);
                    break;

                }
            }
            case R.id.restart: {
                AlertDialog alertDialog = new AlertDialog.Builder(fdcw.this).create();
                alertDialog.setTitle("Game Restarted");
                alertDialog.setMessage("");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
                middle.setBackground(null);
                duck1.setBackground(null);
                wolf1.setBackground(null);
                corn1.setBackground(null);
                duck.setBackgroundResource(R.drawable.duck);
                wolf.setBackgroundResource(R.drawable.wolf);
                corn.setBackgroundResource(R.drawable.corn);
                wm = 0;
                dm = 0;
                cm = 0;
                d = 0;
                c = 0;
                w = 0;
                corn.setClickable(true);
                duck.setClickable(true);
                break;


            }
        }

    }
}
