package c.androidsqlite.test_svara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class lagu extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lagu);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(lagu.this, home.class);
        startActivity(i);
        lagu.this.finish();
    }
}
