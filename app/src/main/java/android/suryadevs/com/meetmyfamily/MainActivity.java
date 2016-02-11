package android.suryadevs.com.meetmyfamily;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity  extends AppCompatActivity {
    final List<RowContent> row = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //adding data to the list
        row.add(new RowContent(R.drawable.me, "Harshal", "Myself"));
        row.add(new RowContent(R.drawable.mum, "Rekha", "Mother"));
        row.add(new RowContent(R.drawable.dad, "Tukaram", "Father"));
        row.add(new RowContent(R.drawable.sister, "Sheetal", "Sister"));
        row.add(new RowContent(R.drawable.brother, "Prashant", "Brother"));
        row.add(new RowContent(R.drawable.cousin, "Mayur", "Cousin"));
        row.add(new RowContent(R.drawable.little_brother, "Om", "Younger Brother"));
        row.add(new RowContent(R.drawable.uncle, "Vitthal", "Uncle"));
        row.add(new RowContent(R.drawable.grandfather, "Narayan", "Grandfather"));

        FamilyAdapter adapter = new FamilyAdapter(this,row);
        ListView l = (ListView) findViewById(R.id.family_listview); //getting the listview by id
        l.setAdapter(adapter);
    }
}