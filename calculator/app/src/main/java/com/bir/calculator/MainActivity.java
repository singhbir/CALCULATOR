package com.bir.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button one,two,three,four,five,six,seven,eight,nine,zero,clear,add,sub,mul,div,equal;
    EditText info;
    Double val1,val2;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign
        one=findViewById(R.id.btn1);
        two=findViewById(R.id.btn2);
        three=findViewById(R.id.btn3);
        four=findViewById(R.id.btn4);
        five=findViewById(R.id.btn5);
        six=findViewById(R.id.btn6);
        seven=findViewById(R.id.btn7);
        eight=findViewById(R.id.btn8);
        nine=findViewById(R.id.btn9);
        zero=findViewById(R.id.btn0);
        clear=findViewById(R.id.btnclear);
        add=findViewById(R.id.btnadd);
        sub=findViewById(R.id.btnsub);
        mul=findViewById(R.id.btnmul);
        div=findViewById(R.id.btndiv);
        equal=findViewById(R.id.btnequal);
        info=findViewById(R.id.info1);

        //setonclicklistner
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn0:
                info.setText(info.getText().toString()+"0");
                break;
            case R.id.btn1:
                info.setText(info.getText().toString()+"1");
                break;
            case R.id.btn2:
                info.setText(info.getText().toString()+"2");
                break;
            case R.id.btn3:
                info.setText(info.getText().toString()+"3");
                break;
            case R.id.btn4:
                info.setText(info.getText().toString()+"4");
                break;
            case R.id.btn5:
                info.setText(info.getText().toString()+"5");
                break;
            case R.id.btn6:
                info.setText(info.getText().toString()+"6");
                break;
            case R.id.btn7:
                info.setText(info.getText().toString()+"7");
                break;
            case R.id.btn8:
                info.setText(info.getText().toString()+"8");
                break;
            case R.id.btn9:
                info.setText(info.getText().toString()+"9");
                break;
            case R.id.btnadd:
                val1 =Double.parseDouble(info.getText().toString());
                info.setText(null);
                flag=1;
                break;
            case R.id.btnsub:
                val1 =Double.parseDouble(info.getText().toString());
                info.setText(null);
                flag=2;
                break;
            case R.id.btnmul:
                val1 =Double.parseDouble(info.getText().toString());
                info.setText(null);
                flag=3;
                break;
            case R.id.btndiv:
                val1 =Double.parseDouble(info.getText().toString());
                info.setText(null);
                flag=4;
                break;
            case R.id.btnequal:

                if(flag==1) {
                    val2 = Double.parseDouble(info.getText().toString());
                    val1 = val1 + val2;
                    info.setText(" " + val1);
                }
                else if(flag==2) {
                    val2 = Double.parseDouble(info.getText().toString());
                    val1 = val1 - val2;
                    info.setText(" " + val1);
                }
                else if(flag==3) {
                    val2 = Double.parseDouble(info.getText().toString());
                    val1 = val1 * val2;
                    info.setText(" " + val1);
                }
                else if(flag==4) {
                    val2 = Double.parseDouble(info.getText().toString());
                    val1 = val1 / val2;
                    info.setText(" " + val1);
                }

                else if(flag==5 || val1==0.0 ||val2==0.0)
                {
                    Toast.makeText(this,"please enter number",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btnclear: {
                info.setText(null);
                val1 = 0.0;
                val2 = 0.0;
                flag=5;
                break;
            }
        }

    }


}
