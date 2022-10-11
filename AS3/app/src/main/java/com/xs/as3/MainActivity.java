package com.xs.as3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.os.VibrationEffect;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class MainActivity extends AppCompatActivity {
        public EditText edttxt;
        public TextView res;
        public boolean T = false;
        public String j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edttxt = findViewById(R.id.Edttxt);
        res = findViewById(R.id.Res);
    }


    public void press0(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"0");
        T = true;
    }
    public void press1(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
         j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"1");
        T = true;
    }
    public void press2(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"2");
        T = true;
    }
    public void press3(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"3");
        T = true;
    }
    public void press4(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"4");
        T = true;
    }
    public void press5(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"5");
        T = true;
    }
    public void press6(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"6");
        T = true;
    }
    public void press7(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"7");
        T = true;
    }
    public void press8(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"8");
        T = true;
    }
    public void press9(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        String j = String.valueOf(edttxt.getEditableText());
        edttxt.setText(j+"9");
        T = true;
    }
    public void pressd(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        if (T) {
            String j = String.valueOf(edttxt.getEditableText());
            edttxt.setText(j + ".");
            T = false;
        }
    }



    public void pressmul(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(130, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        if(T){
             j = String.valueOf(edttxt.getEditableText());
            edttxt.setText(j+"*");
            T= false;
        }
    }
    public void presssum(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(130, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        if(T){
            j = String.valueOf(edttxt.getEditableText());
            edttxt.setText(j+"+");
            T= false;
        }
    }
    public void pressdiv(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(130, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        if(T){
            String j = String.valueOf(edttxt.getEditableText());
            edttxt.setText(j+"/");
            T= false;
        }

    }
    public void presssub(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(130, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        if(T){
            String j = String.valueOf(edttxt.getEditableText());
            edttxt.setText(j+"-");
            T= false;
        }

    }
public void exttxt(){
    res.startAnimation(AnimationUtils.loadAnimation(this, R.anim.remove));
}
public void ad(){

    res.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_left));
    res.setText(j);
    edttxt.startAnimation(AnimationUtils.loadAnimation(this, R.anim.go_up));
    Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            edttxt.setText("");
        }
    },260);

}

    public void pressres (View view) {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(130, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }

         j = String.valueOf(edttxt.getEditableText());
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        try {
            Object Res =engine.eval(j);
            j = String.valueOf(Res);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    exttxt();

                }
            }, 50);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ad();
                }
            }, 200);
        } catch (Exception e) {
            edttxt.setText("Error, Press C");
        }

    }
    public void pressclr(View view){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(130, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
        edttxt.setText("");
    }
    public void pressdel(View view) {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            VibrationEffect vibration = VibrationEffect.createOneShot(130, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.cancel();
            vibrator.vibrate(vibration);
        }
             j = String.valueOf(edttxt.getEditableText());

                 StringBuffer n = new StringBuffer(j);
                 n.deleteCharAt(n.length()-1);
                 edttxt.setText(n);

    }

    public void Ans(View view) {
        res.startAnimation(AnimationUtils.loadAnimation(this, R.anim.go_up));
        String x = String.valueOf(res.getText());
        edttxt.setText(x);
    }
}