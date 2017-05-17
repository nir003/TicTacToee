package com.nirjhor.tictactoe;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /*Buttons Declaration : */

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,reset;
    FloatingActionButton fab;

    int check = 0;
    int x=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Initialized Buttons By id*/

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        reset = (Button)findViewById(R.id.reset);
        fab = (FloatingActionButton)findViewById(R.id.fab);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               reset();
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               reset();
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSetText(btn9);
            }
        });


    }


    /* Button Text set as "O" Or "X" => With Toggle quality */

    public  void btnSetText(Button btn)
    {
        if(btn.getText()=="")
        {
            if (check==0)
            {
                btn.setText("O");
                check = 1;
            }
            else {
                btn.setText("X");
                check = 0;
            }

            checkWinner();

        }

    }

    /*Winner Check 8 steps*/
    public void checkWinner()

    {
                                //Row Match
        /*btn1==btn2==btn3*/
        if((btn1.getText()==btn2.getText())&&(btn1.getText()==btn3.getText())&& btn1.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn1.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }
        /*btn4==btn5==btn6*/
        if((btn4.getText()==btn5.getText())&&(btn4.getText()==btn6.getText())&& btn4.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn4.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }
        /*btn7==btn8==btn9*/
        if((btn7.getText()==btn8.getText())&&(btn8.getText()==btn9.getText())&& btn7.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn7.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }

                            //Column match
        /*btn1==btn4==btn7*/
        if((btn1.getText()==btn4.getText())&&(btn4.getText()==btn7.getText())&&btn1.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn1.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }
         /*btn2==btn5==btn8*/
        if((btn2.getText()==btn5.getText())&&(btn5.getText()==btn8.getText())&& btn2.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn2.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }
         /*btn3==btn6==btn9*/
        if((btn3.getText()==btn6.getText())&&(btn6.getText()==btn9.getText())&& btn3.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn3.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }

                            //left To Right
         /*btn1==btn5==btn9*/
        if((btn1.getText()==btn5.getText())&&(btn5.getText()==btn9.getText())&&btn1.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn1.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }

                        //Right To Left
         /*btn3==btn5==btn7*/
        if((btn3.getText()==btn5.getText())&&(btn5.getText()==btn7.getText())&& btn3.getText()!="")
        {
            Toast.makeText(getApplicationContext(),btn3.getText()+" Winner",Toast.LENGTH_SHORT).show();
        }

    }


    /*Reset*/

    public void reset()
    {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }



}
