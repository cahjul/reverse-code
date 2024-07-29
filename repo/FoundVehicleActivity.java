package com.repo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class FoundVehicleActivity extends Activity {

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            FoundVehicleActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Button button = new Button(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            str = "Item name = " + extras.getString("POSITION") + " --- Go Back ";
        } else {
            str = "Go Back";
        }
        button.setText(str);
        button.setOnClickListener(new a());
        relativeLayout.addView(button);
        setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
    }
}
