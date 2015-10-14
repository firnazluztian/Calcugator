package firnazluztian.addon.com.assignmentfive;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,bres,bAns,bBack;
    EditText et;
    TextView tw;
    double val1,val2, valAns;
    boolean add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set buttons to id
        b1=(Button) findViewById(R.id.one);
        b2=(Button) findViewById(R.id.two);
        b3=(Button) findViewById(R.id.three);
        b4=(Button) findViewById(R.id.four);
        b5=(Button) findViewById(R.id.five);
        b6=(Button) findViewById(R.id.six);
        b7=(Button) findViewById(R.id.seven);
        b8=(Button) findViewById(R.id.eight);
        b9=(Button) findViewById(R.id.nine);
        b0=(Button) findViewById(R.id.zero);
        bdot=(Button) findViewById(R.id.dot);
        badd=(Button) findViewById(R.id.add);
        bsub=(Button) findViewById(R.id.substract);
        bmul=(Button) findViewById(R.id.multiply);
        bdiv=(Button) findViewById(R.id.divide);
        beq=(Button) findViewById(R.id.equalTo);
        bres=(Button) findViewById(R.id.reset);
        bAns=(Button) findViewById(R.id.ans);
        bBack=(Button) findViewById(R.id.back);
        et=(EditText) findViewById(R.id.output);
        tw=(TextView) findViewById(R.id.outputAnswer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });

        ///////////////////////////////////////OPERATIONS//////////////////////////////////////////
        final NumberFormat numberFormat = new DecimalFormat("##.#####");

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = et.getText().toString();
                if (output.isEmpty()) {
                    // do something or toast
                } else {
                    val1 = Integer.parseInt(et.getText()+"");
                    tw.setText(numberFormat.format(val1) + " +");
                    add = true;
                    et.setText(null);
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = et.getText().toString();
                if (output.isEmpty()) {
                    // do something or toast
                } else {
                    val1 = Integer.parseInt(et.getText()+"");
                    tw.setText(numberFormat.format(val1) + " -");
                    sub = true;
                    et.setText(null);
                }
            }
        });


        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = et.getText().toString();
                if (output.isEmpty()) {
                    // do something or toast
                } else {
                    val1 = Integer.parseInt(et.getText()+"");
                    tw.setText(numberFormat.format(val1) + " *");
                    mul = true;
                    et.setText(null);
                }
            }
        });


        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = et.getText().toString();
                if (output.isEmpty()) {
                    // do something or toast
                } else {
                    val1 = Integer.parseInt(et.getText()+"");
                    tw.setText(numberFormat.format(val1) + " /");
                    div = true;
                    et.setText(null);
                }
            }
        });

        // results
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String output = et.getText().toString();
                if(output.isEmpty()) {
                    // lets try experimenting with alert dialog
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Ooops").setMessage("please input value").setPositiveButton(android.R.string.ok, null);

                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                else {
                    if (add == true) {
                        val2=Integer.parseInt(et.getText() + "");
                        valAns = val1 + val2;
                        tw.setText(numberFormat.format(val1) + " + " + numberFormat.format(val2) + " = " + numberFormat.format(valAns) + "");
                        et.setText(null);
                        add = false;
                    }
                    if (sub == true) {
                        val2=Integer.parseInt(et.getText()+"");
                        valAns = val1 - val2;
                        tw.setText(numberFormat.format(val1) + " - " + numberFormat.format(val2) + " = " + numberFormat.format(valAns) + "");
                        et.setText(null);
                        sub = false;
                    }
                    if (mul == true) {
                        val2=Integer.parseInt(et.getText()+"");
                        valAns = val1 * val2;
                        tw.setText(numberFormat.format(val1) + " * " + numberFormat.format(val2) + " = " + numberFormat.format(valAns) + "");
                        et.setText(null);
                        mul = false;
                    }
                    if (div == true) {
                        val2=Integer.parseInt(et.getText()+"");
                        valAns = val1 / val2;
                        tw.setText(numberFormat.format(val1) + " / " + numberFormat.format(val2) + " = " + numberFormat.format(valAns) + "");
                        et.setText(null);
                        div = false;
                    }
                }

            }
        });

        // reset value
        bres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(null);
            }
        });
        // backspace
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = et.getText()+"";
                txt = txt.length() > 1 ? txt.substring(0, txt.length() - 1) : null;
                et.setText(txt);
            }
        });
        // ans
        bAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(numberFormat.format(valAns) + "");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String output = et.getText().toString();
                // need to figure it out how to do this
                if (output.isEmpty()){
                    et.setText(et.getText()+"0.");
                }
                else {
                    et.setText(et.getText() + ".");
                }
            }
        });

    }

    public void onClickHistory(View view){
        Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
        startActivity(intent);
    }

    ///////////////////////////////////////////////////////MENU/////////////////////////////////////

}
