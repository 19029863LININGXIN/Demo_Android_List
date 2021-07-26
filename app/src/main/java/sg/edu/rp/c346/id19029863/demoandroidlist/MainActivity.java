package sg.edu.rp.c346.id19029863.demoandroidlist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<AndroidVersion> al;
    ArrayAdapter<AndroidVersion> aa;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        al = new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        al.add(item1);
        al.add(item2);
        al.add(item3);

        //aaAndroidVersions = new ArrayAdapter<>(this,
        //android.R.layout.simple_list_item_1, alAndroidVersions);

        adapter = new CustomAdapter(this, R.layout.row, al  );

        //lvAndroidVersions.setAdapter(aaAndroidVersions);

        lv.setAdapter(adapter);
    }
}