package jaiminpatel.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Activity2 extends ActionBarActivity implements View.OnClickListener {
    private Button Clr,Back,Sin,Cos,Tan,ln,Lg,per,sqrt,power
            ,Lr,Rr,equal,zero,one,two,three,four,five,
            six,seven,eight,nine,square,cube,Rad,add,sub,mul,div;
    private EditText textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        Sin=(Button) findViewById(R.id.Sin);
        Cos=(Button) findViewById(R.id.Cos);
        Tan=(Button) findViewById(R.id.Tan);
        ln=(Button) findViewById(R.id.ln);
        Lg=(Button) findViewById(R.id.Lg);
        per=(Button) findViewById(R.id.per);
        sqrt=(Button) findViewById(R.id.sqrt);
        power=(Button) findViewById(R.id.power);
        Lr=(Button) findViewById(R.id.Lr);
        Rr=(Button) findViewById(R.id.Rr);
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
        square=(Button) findViewById(R.id.square);
        cube=(Button) findViewById(R.id.cube);
        Rad=(Button) findViewById(R.id.Rad);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        equal=(Button) findViewById(R.id.equal);

        Clr=(Button) findViewById(R.id.Clr);
        Clr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView = (EditText) findViewById(R.id.textView);
                if (textView.getText().toString() != "") {
                    int len = textView.getText().toString().length();
                    textView.setText("");
                }

            }
        });
        Back=(Button) findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Activity1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
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
            Sin.setOnClickListener(this);
            Cos.setOnClickListener(this);
            Tan.setOnClickListener(this);
            ln.setOnClickListener(this);
            Lg.setOnClickListener(this);
            square.setOnClickListener(this);
            cube.setOnClickListener(this);
            Lr.setOnClickListener(this);
            Rr.setOnClickListener(this);
            per.setOnClickListener(this);
            Rad.setOnClickListener(this);
            sqrt.setOnClickListener(this);
            power.setOnClickListener(this);
            equal.setOnClickListener(this);
        }

        catch(Exception e){ }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
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
        textView = (EditText) findViewById(R.id.textView);
        String str = textView.getText().toString();

        switch (v.getId()) {

            case R.id.one:
                str = str.concat(one.getText().toString());
                textView.setText(str);
                break;
            case R.id.two:
                str = str.concat(two.getText().toString());
                textView.setText(str);
                break;
            case R.id.three:
                str = str.concat(three.getText().toString());
                textView.setText(str);
                break;
            case R.id.four:
                str = str.concat(four.getText().toString());
                textView.setText(str);
                break;
            case R.id.five:
                str = str.concat(five.getText().toString());
                textView.setText(str);
                break;
            case R.id.six:
                str = str.concat(six.getText().toString());
                textView.setText(str);
                break;
            case R.id.seven:
                str = str.concat(seven.getText().toString());
                textView.setText(str);
                break;
            case R.id.eight:
                str = str.concat(eight.getText().toString());
                textView.setText(str);
                break;
            case R.id.nine:
                str = str.concat(nine.getText().toString());
                textView.setText(str);
                break;
            case R.id.zero:
                str = str.concat(zero.getText().toString());
                textView.setText(str);
                break;
            case R.id.add:
                str = str.concat(add.getText().toString());
                textView.setText(str);
                break;
            case R.id.div:
                str = str.concat(div.getText().toString());
                textView.setText(str);
                break;
            case R.id.mul:
                str = str.concat(mul.getText().toString());
                textView.setText(str);
                break;
            case R.id.sub:
                str = str.concat(sub.getText().toString());
                textView.setText(str);
                break;
            case R.id.power:
                str =str.concat(power.getText().toString());
                textView.setText(str);

            case R.id.Sin:
                 Double sans= Math.sin(Math.toRadians(Double.valueOf(str)));
                 textView.setText(sans.toString());
                 break;
            case R.id.Cos:
                 Double cans=Math.cos(Math.toRadians(Double.valueOf(str)));
                 textView.setText(cans.toString());
                 break;
            case R.id.Tan:
                 Double tans=Math.tan(Math.toRadians(Double.valueOf(str)));
                 textView.setText(tans.toString());
                 break;
            case R.id.ln:
                 Double lnans=Math.log(Double.valueOf(str));
                 textView.setText(lnans.toString());
                 break;
            case R.id.Lg:
                 Double Lgans=Math.log10(Double.valueOf(str));
                 textView.setText(Lgans.toString());
                 break;
            case R.id.square:
                Double sqans= Math.pow(Double.valueOf(str),2);
                textView.setText(sqans.toString());
                break;
            case R.id.sqrt:
                Double sqrtans=Math.sqrt(Double.valueOf(str));
                textView.setText(sqrtans.toString());
                break;
            case R.id.per:
                Double pans=Double.valueOf(str)/100 ;
                textView.setText(pans.toString());
                break;
            case R.id.cube:
                Double cuans=Math.pow(Double.valueOf(str),3);
                textView.setText(cuans.toString());
                break;
            case R.id.equal:
                String operand;
                Double op1, op2;
                if (str.contains("+")) {
                    String[] separated = str.split("\\+");
                    op1 = Double.valueOf(separated[0]);
                    op2 = Double.valueOf(separated[1]);
                    Double ans = op1 + op2;
                    textView.setText(ans.toString());
                }
                if (str.contains("-")) {
                    String[] separated = str.split("\\-");
                    op1 = Double.valueOf(separated[0]);
                    op2 = Double.valueOf(separated[1]);
                    Double ans = op1 - op2;
                    textView.setText(ans.toString());
                }
                if (str.contains("/")) {
                    String[] separated = str.split("\\/");
                    op1 = Double.valueOf(separated[0]);
                    op2 = Double.valueOf(separated[1]);
                    Double ans = op1 / op2;
                    textView.setText(ans.toString());
                }
                if (str.contains("*")) {
                    String[] separated = str.split("\\*");
                    op1 = Double.valueOf(separated[0]);
                    op2 = Double.valueOf(separated[1]);
                    Double ans = op1 * op2;
                    textView.setText(ans.toString());
                }
                if (str.contains("^")) {
                    String[] separated = str.split("\\^");
                    op1 = Double.valueOf(separated[0]);
                    op2 = Double.valueOf(separated[1]);
                    Double ans = Math.pow(op1,op2);
                    textView.setText(ans.toString());
                }

        }
    }
}
