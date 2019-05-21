package c.androidsqlite.test_svara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class home extends Activity {
    ListView listview;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    SimpleAdapter adapter;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        listview = (ListView)findViewById(R.id.list);
        String[] values = new String[] {"Playlist","Music","Artist","Radio","Radio Content","Uploaded Content"};
        String[] gambar = new String[] {Integer.toString(R.drawable.icon_playlist),
        Integer.toString(R.drawable.icon_music),
        Integer.toString(R.drawable.icon_artist),
        Integer.toString(R.drawable.icon_radio),
        Integer.toString(R.drawable.icon_radio_content),
        Integer.toString(R.drawable.icon_upload_content)};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long l) {
                switch (posisi){
                    case 0:
                        Intent i = new Intent(home.this, lagu.class);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(home.this, MainActivity.class);
        startActivity(i);
        home.this.finish();
    }
}
