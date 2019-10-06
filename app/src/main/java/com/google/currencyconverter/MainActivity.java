package com.google.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    String s1=null;
    int count=0;
    TextView txt;

    public void close_keyboard()
    {

            View view = this.getCurrentFocus();
            if (view != null) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }

    }




    public void onclick1(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"1";
        edt1.setText(s1);
    }

    public void onclick2(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"2";
        edt1.setText(s1);
    }

    public void onclick3(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"3";
        edt1.setText(s1);
    }
    public void onclick4(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"4";
        edt1.setText(s1);
    }

    public void onclick5(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"5";
        edt1.setText(s1);
    }

    public void onclick6(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"6";
        edt1.setText(s1);
    }

    public void onclick7(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"7";
        edt1.setText(s1);
    }

    public void onclick8(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"8";
        edt1.setText(s1);
    }

    public void onclick9(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"9";
        edt1.setText(s1);
    }

    public void onclick0(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+"0";
        edt1.setText(s1);
    }

    public void onclickback(View view)
    {
        String s;
        int n;
        edt1=(EditText)findViewById(R.id.edt);
        s=edt1.getText().toString();
        if(s=="")
        {
            return ;
        }
          n = s.length() - 1;
          s = s.substring(0, n);
          edt1.setText(s);

    }



    public void onclickdot(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        s1=edt1.getText().toString();
        s1=s1+".";
        edt1.setText(s1);
    }


    public void onclickconvert(View view)
    {
        txt=(TextView)findViewById(R.id.txt1); 
        String s2=null;
        Float dol;
        Double rs;
        edt1 =(EditText)findViewById(R.id.edt);
        s2=edt1.getText().toString();
        dol=Float.parseFloat(s2);
        rs=dol*70.82;
        txt.setText(rs.toString()+"Rupees");
        Toast.makeText(this, "currency in rupees is displayed above!!!", Toast.LENGTH_SHORT).show();
        
        
    }

    public void onclickclearall(View view)
    {
        edt1=(EditText)findViewById(R.id.edt);
        txt=(TextView)findViewById(R.id.txt1);
       edt1.setText("");
       txt.setText("");
    }

    public void onclickclosekey(View view)
    {
        close_keyboard();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        close_keyboard();
    }
}
