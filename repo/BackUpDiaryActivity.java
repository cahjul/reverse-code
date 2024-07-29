package com.repo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;

public class BackUpDiaryActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public MyDB f450a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ListView f451b;
    private TextView c;
    /* access modifiers changed from: private */
    public SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    class b implements Comparator<File> {
        b() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            String name = file.getName();
            String name2 = file2.getName();
            int length = name.length();
            int length2 = name2.length();
            boolean isDirectory = file.isDirectory();
            boolean isDirectory2 = file2.isDirectory();
            int i = length > length2 ? length2 : length;
            if (isDirectory && !isDirectory2) {
                return -1;
            }
            if (isDirectory2 && !isDirectory) {
                return 1;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (name.charAt(i2) > name2.charAt(i2)) {
                    return 1;
                }
                if (name.charAt(i2) < name2.charAt(i2)) {
                    return -1;
                }
            }
            return length > length2 ? 1 : 0;
        }
    }

    private class c extends AsyncTask<String, String, b> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f453a;

        private c() {
            this.f453a = new ProgressDialog(BackUpDiaryActivity.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public b doInBackground(String... strArr) {
            String str = strArr[0];
            ArrayList arrayList = new ArrayList();
            File[] listFiles = new File(str).listFiles();
            Arrays.sort(listFiles, new b());
            for (File file : listFiles) {
                if (!file.isDirectory()) {
                    String name = file.getName();
                    if (name.startsWith("RepoProDiary - BACKUP")) {
                        Date date = new Date(file.lastModified());
                        double length = (double) file.length();
                        Double.isNaN(length);
                        arrayList.add(new c(name, file.getPath(), BackUpDiaryActivity.this.d.format(date), r.d(length / 1048576.0d) + " MB"));
                    }
                }
            }
            return new b(BackUpDiaryActivity.this, arrayList);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(b bVar) {
            if (this.f453a.isShowing()) {
                this.f453a.dismiss();
            }
            BackUpDiaryActivity.this.f451b.setAdapter(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f453a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == BackUpDiaryActivity.this.f450a.d.booleanValue()) {
                progressDialog = this.f453a;
                str = "Please wait..";
            } else {
                progressDialog = this.f453a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f453a.setCancelable(false);
            this.f453a.show();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.backupdiary);
        this.f450a = (MyDB) getApplicationContext();
        setTitle("BackUp Diary");
        this.c = (TextView) findViewById(R.id.lblBasePath);
        ListView listView = (ListView) findViewById(R.id.lstBackUpDiary);
        this.f451b = listView;
        listView.setClickable(true);
        String replace = r.g("RepoProData.db").replace("RepoProData.db", BuildConfig.FLAVOR);
        TextView textView = this.c;
        textView.setText(getText(R.string.Path) + " " + replace);
        new c().execute(new String[]{replace});
    }
}
