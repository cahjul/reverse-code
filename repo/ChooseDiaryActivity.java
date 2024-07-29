package com.repo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;
import org.sqlite.database.sqlite.SQLiteDatabase;

public class ChooseDiaryActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public MyDB f455a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ListView f456b;
    private TextView c;
    private SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private class b extends AsyncTask<String, String, f> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f457a;

        private b() {
            this.f457a = new ProgressDialog(ChooseDiaryActivity.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public f doInBackground(String... strArr) {
            ArrayList arrayList = new ArrayList();
            ChooseDiaryActivity.this.d(Environment.getExternalStorageDirectory(), arrayList);
            ChooseDiaryActivity chooseDiaryActivity = ChooseDiaryActivity.this;
            return new f(chooseDiaryActivity, arrayList, chooseDiaryActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(f fVar) {
            if (this.f457a.isShowing()) {
                this.f457a.dismiss();
            }
            ChooseDiaryActivity.this.f456b.setAdapter(fVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f457a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == ChooseDiaryActivity.this.f455a.d.booleanValue()) {
                progressDialog = this.f457a;
                str = "Please wait..";
            } else {
                progressDialog = this.f457a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f457a.setCancelable(false);
            this.f457a.show();
        }
    }

    /* access modifiers changed from: private */
    public void d(File file, List<g> list) {
        try {
            if (file.isDirectory()) {
                String[] list2 = file.list();
                for (int i = 0; i < list2.length; i++) {
                    if (!list2[i].startsWith(".")) {
                        d(new File(file, list2[i]), list);
                    }
                }
                return;
            }
            String path = file.getPath();
            if (true == path.endsWith("RepoProDiary.db")) {
                Date date = new Date(file.lastModified());
                double length = (double) file.length();
                Double.isNaN(length);
                double d2 = length / 1048576.0d;
                if (!path.equals(this.f455a.E)) {
                    String path2 = file.getPath();
                    String format = this.d.format(date);
                    list.add(new g(path, path2, format, r.d(d2) + " MB"));
                }
            }
        } catch (Exception e) {
            Log.e("visitAllFiles", "Error : visitAllFiles : " + e.getMessage());
        }
    }

    public void onCreate(Bundle bundle) {
        TextView textView;
        String str;
        StringBuilder sb;
        super.onCreate(bundle);
        setContentView(R.layout.choosediary);
        this.f455a = (MyDB) getApplicationContext();
        this.c = (TextView) findViewById(R.id.lblChooseDiaryInfo);
        File file = new File(this.f455a.E);
        Date date = new Date(file.lastModified());
        double length = (double) file.length();
        Double.isNaN(length);
        double d2 = length / 1048576.0d;
        if (true == this.f455a.d.booleanValue()) {
            setTitle("Choose Diary File");
            textView = this.c;
            sb = new StringBuilder();
            str = "Current diary file being used.\n";
        } else {
            setTitle("Pilih File Diary");
            textView = this.c;
            sb = new StringBuilder();
            str = "Diary file yang digunakan sekarang.\n";
        }
        sb.append(str);
        sb.append(this.f455a.E);
        sb.append("\n");
        sb.append(this.d.format(date));
        sb.append(" | ");
        sb.append(r.d(d2));
        sb.append(" MB");
        textView.setText(sb.toString());
        ListView listView = (ListView) findViewById(R.id.lstChooseDiary);
        this.f456b = listView;
        listView.setClickable(true);
        new b().execute(new String[]{BuildConfig.FLAVOR});
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        try {
            MyDB myDB = this.f455a;
            Boolean bool = Boolean.FALSE;
            myDB.o(bool);
            SQLiteDatabase sQLiteDatabase = this.f455a.P;
            if (sQLiteDatabase != null || sQLiteDatabase.isOpen()) {
                this.f455a.P.close();
                this.f455a.P = null;
            }
            this.f455a.o(bool);
            this.f455a.q(bool);
            SQLiteDatabase sQLiteDatabase2 = this.f455a.R;
            if (sQLiteDatabase2 != null || sQLiteDatabase2.isOpen()) {
                this.f455a.R.close();
                this.f455a.R = null;
            }
            this.f455a.q(bool);
            this.f455a.p(bool);
            SQLiteDatabase sQLiteDatabase3 = this.f455a.Q;
            if (sQLiteDatabase3 != null || sQLiteDatabase3.isOpen()) {
                this.f455a.Q.close();
                this.f455a.Q = null;
            }
            this.f455a.p(bool);
        } catch (Exception e) {
            Log.e("onPause", "Could open, close and reopen db. Error:" + e.getMessage());
        }
    }
}
