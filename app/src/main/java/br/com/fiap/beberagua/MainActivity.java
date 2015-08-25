package br.com.fiap.beberagua;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final long REPEAT_TIME = 1000 * 30 ;

    private Button btnFechar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFechar = (Button)findViewById(R.id.btnOcultar);

        int beberAguaEm = (int) (System.currentTimeMillis()+(REPEAT_TIME));

        Intent abrir = new Intent(this,MainActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, abrir, 0);

        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, beberAguaEm, pendingIntent);

        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, 1 , REPEAT_TIME, pendingIntent);

        /*
        nao esta funcionando e nao sei como nao fazer funcionar :(
        as pesquisas que fiz nao resolveram
        java.lang.RuntimeException: Performing stop of activity that is not resumed:
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
