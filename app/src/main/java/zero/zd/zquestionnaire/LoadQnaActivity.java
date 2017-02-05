package zero.zd.zquestionnaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LoadQnaActivity extends AppCompatActivity {

    private List<String> mQnaFileList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_qna);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mQnaFileList = new ArrayList<>();

        File folder = new File("/sdcard/ZQuestionnaire/");
        File files[] = folder.listFiles();

        if (files.length != 0) {
            for (File f : files) {
                String name = f.getName();
                mQnaFileList.add(name);
            }
        }

        ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mQnaFileList);
        list.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}