package jaiminpatel.lab2;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private FrameLayout die1, die2;
    private Button roll, hold;
    private String p1score;
    private String p2score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            p1score = bundle.getString("p1");
            p2score = bundle.getString("p2");
            TextView p1 = (TextView) findViewById(R.id.pl);
            TextView p2 = (TextView) findViewById(R.id.p2);
            p2.setText("P2:" + p2score);
            p1.setText("P1:" + p1score);
        }

        roll = (Button) findViewById(R.id.roll_dice);
        roll.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TextView p1 = (TextView) findViewById(R.id.pl);
                TextView p2 = (TextView) findViewById(R.id.p2);
                String p1score=p1.getText().toString().substring(3);
                String p2score=p2.getText().toString().substring(3);
                if(p1score.equals("100"))
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("You Won!");
                    alertDialog.setMessage("Player 1 WON !!! ");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
                if(p2score.equals("100"))
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("You Won!");
                    alertDialog.setMessage("Player 2 WON !!! ");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
                rollDice();
            }
        });

        hold = (Button)findViewById(R.id.hold);
        hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,Player2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                TextView text = (TextView) findViewById(R.id.round);
                TextView p1 = (TextView) findViewById(R.id.pl);
                String scoreP1=p1.getText().toString().substring(3);
                if(scoreP1==null)
                {
                    bundle.putString("p1",text.getText().toString().substring(7));
                }
                else
                {
                    int subresult=Integer.parseInt(scoreP1)+Integer.parseInt(text.getText().toString().substring(7));
                    String result=String.valueOf(subresult) ;
                    bundle.putString("p1",result);
                }
                TextView p2 = (TextView) findViewById(R.id.p2);
                String scoreP2 = p2.getText().toString().substring(3);
                if(scoreP2.equals(""))
                {
                    bundle.putString("p2","0");
                }
                else
                {
                    bundle.putString("p2",scoreP2);
                }

                intent.putExtras(bundle);



                startActivity(intent);


            }
        });


        die1 = (FrameLayout) findViewById(R.id.die1);
        die2 = (FrameLayout) findViewById(R.id.die2);

    }

    //get two random ints between 1 and 6 inclusive
    public void rollDice() {



        int val1 = 1 + (int) (6 * Math.random());
        int val2 = 1 + (int) (6 * Math.random());
       if(val1!=1&&val2!=1) {
           int total = val1 + val2;
           TextView text = (TextView) findViewById(R.id.round);
           String previous = text.getText().toString().substring(7);
           if (previous.equals(" ")) {
               previous = "0";
           }
           int subtotal = total + Integer.parseInt(previous);
           String result = String.valueOf(subtotal);
           text.setText("Round :" + result);

       }
       if(val1==1 || val2==1)
       {
           Intent intent = new Intent(MainActivity.this,Player2.class);
           intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
           Bundle bundle = new Bundle();
           TextView p2 = (TextView) findViewById(R.id.p2);
           TextView p1 = (TextView) findViewById(R.id.pl);
           bundle.putString("p1",p1.getText().toString().substring(3));
           bundle.putString("p2",p2.getText().toString().substring(3));
           intent.putExtras(bundle);
           startActivity(intent);
       }
        setDie(val1, die1);
        setDie(val2, die2);



    }

    //set the appropriate picture for each die per int
    public void setDie(int value, FrameLayout layout) {
        Drawable pic = null;

        switch (value) {
            case 1:
                pic = getResources().getDrawable(R.drawable.die_face_1);
                break;
            case 2:
                pic = getResources().getDrawable(R.drawable.die_face_2);
                break;
            case 3:
                pic = getResources().getDrawable(R.drawable.die_face_3);
                break;
            case 4:
                pic = getResources().getDrawable(R.drawable.die_face_4);
                break;
            case 5:
                pic = getResources().getDrawable(R.drawable.die_face_5);
                break;
            case 6:
                pic = getResources().getDrawable(R.drawable.die_face_6);
                break;
        }
        layout.setBackground(pic);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
