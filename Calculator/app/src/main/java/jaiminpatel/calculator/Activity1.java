package jaiminpatel.calculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Activity1 extends ActionBarActivity implements View.OnClickListener {
    private Button Adv,Del,zero,one,two,three,four,five,six,seven,eight,nine,equal,dot,sub,add,mul,div;
    private EditText textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.equal);

        Adv = (Button) findViewById(R.id.Adv);
        Adv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Activity1.this,Activity2.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);
        }
        });

        Del = (Button) findViewById(R.id.Del);
        Del.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView=(EditText) findViewById(R.id.textView);
                if(textView.getText().toString()!= ""){
                    int len= textView.getText().toString().length();
                    textView.setText("");
                }

            }
        });

        try{
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
            equal.setOnClickListener(this); }

        catch(Exception e){ }


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        textView=(EditText) findViewById(R.id.textView);
        String str = textView.getText().toString() ;

        switch(v.getId()){

            case R.id.one :

                            str=str.concat(one.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.two :
                            str=str.concat(two.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.three :
                            str=str.concat(three.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.four :
                            str=str.concat(four.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.five :
                            str=str.concat(five.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.six :
                            str=str.concat(six.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.seven :
                            str=str.concat(seven.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.eight :
                            str=str.concat(eight.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.nine :
                            str=str.concat(nine.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.zero :
                            str=str.concat(zero.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.add :
                            str=str.concat(add.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.div :
                            str=str.concat(div.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.mul :
                            str=str.concat(mul.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.sub :
                            str=str.concat(sub.getText().toString());
                            textView.setText(str);

                            break;
            case R.id.dot :
                            str=str.concat(".");
                            textView.setText(str);

                            break;
            case R.id.equal :
                            String operand ;
                            Double op1 , op2 ;
                            if(str.contains("+")){
                                String[] separated = str.split("\\+");
                                op1= Double.valueOf(separated[0]);
                                op2=Double.valueOf(separated[1]);
                                Double ans= op1 + op2 ;
                                textView.setText(ans.toString());
                            }
                            if(str.contains("-")){
                            String[] separated = str.split("\\-");
                            op1= Double.valueOf(separated[0]);
                            op2=Double.valueOf(separated[1]);
                            Double ans= op1 - op2 ;
                            textView.setText(ans.toString());
                            }
                            if(str.contains("/")){
                            String[] separated = str.split("\\/");
                            op1= Double.valueOf(separated[0]);
                            op2=Double.valueOf(separated[1]);
                            Double ans= op1 / op2 ;
                            textView.setText(ans.toString());
                            }
                            if(str.contains("*")){
                            String[] separated = str.split("\\*");
                            op1= Double.valueOf(separated[0]);
                            op2=Double.valueOf(separated[1]);
                            Double ans= op1 * op2 ;
                            textView.setText(ans.toString());
                            }






        }
    }
}
