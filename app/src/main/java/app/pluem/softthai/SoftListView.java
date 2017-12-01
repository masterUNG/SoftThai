package app.pluem.softthai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SoftListView extends AppCompatActivity {

    //Explicit
    private ListView listView;
    private String[] strings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_list_view);

        listView = (ListView) findViewById(R.id.sortListview);
        strings = getResources().getStringArray(R.array.soft);

        // Create ListView
        SoftAdapter sortAdapter = new SoftAdapter(this, strings);
        listView.setAdapter(sortAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(SoftListView.this, SoftTest.class);
                intent.putExtra("Index", i);
                startActivity(intent);

            }
        });

    }   // Main Method

}   // Main Class