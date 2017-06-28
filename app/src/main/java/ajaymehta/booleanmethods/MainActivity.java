package ajaymehta.booleanmethods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO u can uncomment below methods to see how they work..
    //  method1();

    //    method2();

        method3();
    }

    private void method3() {

        if(new BooleanMethods().strequal("hi", "hi")) {  // no need to hold returned result..
            method1();
        }
    }

    private void method2() {

        Toast.makeText(this, "value is "+ new BooleanMethods().equal(5,5), Toast.LENGTH_SHORT).show(); // see that boolean result is coming.. we dont have to hold the result..just create object n its done..

    }


    private void method1() {

        boolean result = new BooleanMethods().add(3);
        if(result) {
            Toast.makeText(this,"YO YO value is 7",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"value is not  7",Toast.LENGTH_SHORT).show();
        }
    }


}
