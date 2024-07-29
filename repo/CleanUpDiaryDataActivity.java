package com.repo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;

public class CleanUpDiaryDataActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public MyDB f459a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f460b;
    /* access modifiers changed from: private */
    public EditText c;
    private Spinner d;
    /* access modifiers changed from: private */
    public int e = 0;
    /* access modifiers changed from: private */
    public SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /* access modifiers changed from: private */
    public c g = c.ONEROW;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            CleanUpDiaryDataActivity cleanUpDiaryDataActivity;
            c cVar;
            if (CleanUpDiaryDataActivity.this.e != i) {
                if (i == 0) {
                    cleanUpDiaryDataActivity = CleanUpDiaryDataActivity.this;
                    cVar = c.ONEROW;
                } else if (1 == i) {
                    cleanUpDiaryDataActivity = CleanUpDiaryDataActivity.this;
                    cVar = c.MULTIROW;
                } else {
                    cleanUpDiaryDataActivity = CleanUpDiaryDataActivity.this;
                    cVar = c.SAMELOCATIONANDTIME;
                }
                c unused = cleanUpDiaryDataActivity.g = cVar;
            }
            int unused2 = CleanUpDiaryDataActivity.this.e = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            CleanUpDiaryDataActivity cleanUpDiaryDataActivity;
            String str;
            if (true == CleanUpDiaryDataActivity.this.c.getText().toString().toUpperCase().equals(CleanUpDiaryDataActivity.this.f459a.G)) {
                CleanUpDiaryDataActivity.this.k();
                return;
            }
            if (CleanUpDiaryDataActivity.this.c.length() == 0) {
                if (true == CleanUpDiaryDataActivity.this.f459a.d.booleanValue()) {
                    cleanUpDiaryDataActivity = CleanUpDiaryDataActivity.this;
                    str = "Please keyin your Diary Password";
                } else {
                    cleanUpDiaryDataActivity = CleanUpDiaryDataActivity.this;
                    str = "Sila masukkan Password Diary";
                }
            } else if (true == CleanUpDiaryDataActivity.this.f459a.d.booleanValue()) {
                cleanUpDiaryDataActivity = CleanUpDiaryDataActivity.this;
                str = "Your Diary Password is not correct";
            } else {
                cleanUpDiaryDataActivity = CleanUpDiaryDataActivity.this;
                str = "Password Diary anda tidak betul";
            }
            r.v(cleanUpDiaryDataActivity, str, 1);
        }
    }

    private enum c {
        ONEROW,
        MULTIROW,
        SAMELOCATIONANDTIME
    }

    private class d extends AsyncTask<String, String, String> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f465a;

        private d() {
            this.f465a = new ProgressDialog(CleanUpDiaryDataActivity.this);
        }

        /* synthetic */ d(CleanUpDiaryDataActivity cleanUpDiaryDataActivity, a aVar) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: org.sqlite.database.sqlite.SQLiteClosable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: org.sqlite.database.sqlite.SQLiteClosable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: org.sqlite.database.sqlite.SQLiteClosable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v77, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v115, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v116, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v71, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v72, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v123, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v74, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v124, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v125, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v76, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v126, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v46, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v48, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v49, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v50, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v51, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v68, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v69, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v70, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v71, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v71, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v74, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v75, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v76, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v77, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v78, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v49, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v50, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v51, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v52, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v53, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v54, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v55, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v57, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v58, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v61, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v57, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v66, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v69, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v70, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v74, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v75, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v49, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v63, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v54, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v55, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v63, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v64, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v66, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v68, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v69, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v63, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v64, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v66, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v68, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v69, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v70, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v71, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v74, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v75, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v55, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v56, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v57, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v58, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v59, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v63, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v64, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v66, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v68, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v69, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v76, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v77, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v78, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v79, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v80, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v81, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v82, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v83, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v84, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v85, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v86, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v87, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v88, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v82, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v83, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v84, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v85, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v86, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v87, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v88, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v89, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v90, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v91, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v92, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v64, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v68, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v69, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v70, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v71, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v72, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v93, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v94, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v89, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v90, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v70, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v71, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v76, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v77, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v70, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v71, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v78, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v79, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v82, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v74, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v95, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v96, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v91, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v92, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v78, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v79, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v80, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v81, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v84, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v86, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v76, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v77, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v78, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v82, resolved type: org.sqlite.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v87, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v88, resolved type: org.sqlite.database.sqlite.SQLiteProgram} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v92, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX WARNING: type inference failed for: r5v34 */
        /* JADX WARNING: type inference failed for: r5v35 */
        /* JADX WARNING: type inference failed for: r4v81, types: [java.lang.Object[], java.lang.String[]] */
        /* JADX WARNING: type inference failed for: r4v82, types: [java.lang.Object[], java.lang.String[]] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x04a8, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x04a9, code lost:
            r2 = r0;
            r12 = r19;
            r11 = r22;
            r10 = r25;
            r9 = r29;
            r8 = r31;
            r7 = r33;
            r4 = r35;
            r3 = r36;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x04bc, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x04bd, code lost:
            r2 = r0;
            r5 = r36;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x05ff, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0600, code lost:
            r5 = r36;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0614, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0615, code lost:
            r5 = r36;
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
            android.util.Log.e("dbCleanUpDiary", "Error : dbCleanUpDiary 4 : " + r2.getMessage());
            r2 = "Error : dbCleanUpDiary 4 : " + r2.getMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0647, code lost:
            r3 = com.repo.r.f760a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x064e, code lost:
            if (true == r3.booleanValue()) goto L_0x0650;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0650, code lost:
            publishProgress(new java.lang.String[]{"COMMIT TRANSACTION."});
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0657, code lost:
            r14.endTransaction();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x065a, code lost:
            if (r5 != null) goto L_0x065c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x065c, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x065f, code lost:
            publishProgress(new java.lang.String[]{"Save Data. Step 1 of 8."});
            r14.execSQL(r35);
            publishProgress(new java.lang.String[]{r34});
            r14.execSQL(r33);
            publishProgress(new java.lang.String[]{r32});
            r14.execSQL(r31);
            publishProgress(new java.lang.String[]{r30});
            r14.execSQL(r29);
            publishProgress(new java.lang.String[]{r28});
            r14.execSQL(r25);
            publishProgress(new java.lang.String[]{r23});
            r14.execSQL(r22);
            publishProgress(new java.lang.String[]{r21});
            r14.execSQL(r19);
            publishProgress(new java.lang.String[]{r54});
            r14.execSQL("CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x06c3, code lost:
            if (true == r3.booleanValue()) goto L_0x06c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x06c5, code lost:
            publishProgress(new java.lang.String[]{"CLOSE."});
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x06ce, code lost:
            r14.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x06d1, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x06d2, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x06d3, code lost:
            r12 = r19;
            r11 = r22;
            r10 = r25;
            r9 = r29;
            r8 = r31;
            r7 = r33;
            r4 = r35;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x06e3, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x06e4, code lost:
            r12 = r19;
            r11 = r22;
            r10 = r25;
            r9 = r29;
            r8 = r31;
            r7 = r33;
            r4 = r35;
            r14 = r14;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x04a8 A[Catch:{ SQLiteException -> 0x04bc, all -> 0x04a8 }, ExcHandler: all (r0v55 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x04bc, all -> 0x04a8 }]), Splitter:B:132:0x0497] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x04d5 A[Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x05ac A[Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x05ff A[ExcHandler: all (th java.lang.Throwable), Splitter:B:129:0x0491] */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x0650  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x065c  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x06c5  */
        /* JADX WARNING: Removed duplicated region for block: B:260:0x088f  */
        /* JADX WARNING: Removed duplicated region for block: B:263:0x089b  */
        /* JADX WARNING: Removed duplicated region for block: B:266:0x08f6  */
        /* JADX WARNING: Removed duplicated region for block: B:271:0x0908 A[Catch:{ Exception -> 0x09a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:274:0x0937 A[Catch:{ Exception -> 0x09a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x0992 A[Catch:{ Exception -> 0x09a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:283:0x099c A[Catch:{ Exception -> 0x09a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:311:0x0a70  */
        /* JADX WARNING: Removed duplicated region for block: B:314:0x0a7c  */
        /* JADX WARNING: Removed duplicated region for block: B:317:0x0ad7  */
        /* JADX WARNING: Removed duplicated region for block: B:324:0x0aef  */
        /* JADX WARNING: Removed duplicated region for block: B:327:0x0afb  */
        /* JADX WARNING: Removed duplicated region for block: B:330:0x0b56  */
        /* JADX WARNING: Removed duplicated region for block: B:343:0x0b9e  */
        /* JADX WARNING: Removed duplicated region for block: B:348:0x0ba9  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x022d  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x027b A[Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r54) {
            /*
                r53 = this;
                r1 = r53
                java.lang.String r2 = "Save Data. Step 8 of 8."
                java.lang.String r3 = "CREATE INDEX IF NOT EXISTS idxC10 ON VLS(C10)"
                java.lang.String r4 = "Save Data. Step 7 of 8."
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC9 ON VLS(C9)"
                java.lang.String r6 = "Save Data. Step 6 of 8."
                java.lang.String r7 = "CREATE INDEX IF NOT EXISTS idxC8 ON VLS(C8)"
                java.lang.String r8 = "Save Data. Step 5 of 8."
                java.lang.String r9 = "CREATE INDEX IF NOT EXISTS idxC6 ON VLS(C6)"
                java.lang.String r10 = "Save Data. Step 4 of 8."
                java.lang.String r11 = "CREATE INDEX IF NOT EXISTS idxC3 ON VLS(C3)"
                java.lang.String r12 = "Save Data. Step 3 of 8."
                java.lang.String r13 = "CREATE INDEX IF NOT EXISTS idxC2 ON VLS(C2)"
                java.lang.String r14 = "Save Data. Step 2 of 8."
                java.lang.String r15 = "CREATE INDEX IF NOT EXISTS idxC1 ON VLS(C1)"
                java.lang.String r16 = "Save Data. Step 1 of 8."
                java.lang.String r17 = "COMMIT TRANSACTION."
                r54 = r2
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r2 = r2.f459a
                java.lang.Boolean r2 = r2.d
                boolean r2 = r2.booleanValue()
                r18 = 0
                r19 = r3
                r3 = 1
                if (r3 != r2) goto L_0x0041
                java.lang.String[] r2 = new java.lang.String[r3]
                java.lang.String r20 = "Please wait. Diary backup is being done."
                r2[r18] = r20
                r1.publishProgress(r2)
                goto L_0x004a
            L_0x0041:
                java.lang.String[] r2 = new java.lang.String[r3]
                java.lang.String r20 = "Sila tunggu. Diary backup sedang dijalankan."
                r2[r18] = r20
                r1.publishProgress(r2)
            L_0x004a:
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r2 = r2.f459a
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q
                r3 = 0
                if (r2 != 0) goto L_0x0063
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r2 = r2.f459a
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q
                boolean r2 = r2.isOpen()
                if (r2 == 0) goto L_0x0076
            L_0x0063:
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r2 = r2.f459a
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q
                r2.close()
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r2 = r2.f459a
                r2.Q = r3
            L_0x0076:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r3 = r3.f459a
                java.lang.String r3 = r3.E
                r21 = r4
                java.lang.String r4 = "RepoProDiary.db"
                r22 = r5
                java.lang.String r5 = ""
                java.lang.String r3 = r3.replace(r4, r5)
                r2.append(r3)
                java.lang.String r3 = ".db"
                java.lang.String r3 = r4.replace(r3, r5)
                r2.append(r3)
                java.lang.String r3 = " - BACKUP "
                r2.append(r3)
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this
                java.text.SimpleDateFormat r3 = r3.f
                r23 = r6
                java.util.Date r6 = new java.util.Date
                r6.<init>()
                java.lang.String r3 = r3.format(r6)
                java.lang.String r3 = r3.toUpperCase()
                r2.append(r3)
                r3 = 12
                r6 = 15
                java.lang.String r3 = r4.substring(r3, r6)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r3 = r3.f459a
                java.lang.String r3 = r3.E
                com.repo.r.o(r3, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r3 = r3.f459a
                java.lang.String r3 = r3.E
                java.lang.String r3 = r3.replace(r4, r5)
                r2.append(r3)
                java.lang.String r3 = "Temp_"
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.repo.r.p(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r6 = "-journal"
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                com.repo.r.p(r3)
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r3 = r3.f459a
                java.lang.Boolean r3 = r3.d
                boolean r3 = r3.booleanValue()
                r6 = 1
                if (r6 != r3) goto L_0x0122
                java.lang.String[] r3 = new java.lang.String[r6]
                java.lang.String r20 = "Load Initial Data."
                r3[r18] = r20
                r1.publishProgress(r3)
                goto L_0x012b
            L_0x0122:
                java.lang.String[] r3 = new java.lang.String[r6]
                java.lang.String r6 = "Process Data Permulaan."
                r3[r18] = r6
                r1.publishProgress(r3)
            L_0x012b:
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r6 = r3.f459a
                java.lang.String r6 = r6.E
                r24 = r5
                r5 = 2131492886(0x7f0c0016, float:1.8609237E38)
                r25 = r7
                java.lang.String r7 = "Temp_RepoProDiary.db"
                java.lang.Boolean unused = r3.a(r6, r4, r7, r5)
                java.lang.Boolean r3 = com.repo.r.f760a
                boolean r4 = r3.booleanValue()
                r5 = 1
                if (r5 != r4) goto L_0x0151
                java.lang.String[] r4 = new java.lang.String[r5]
                java.lang.String r6 = "DECLARE VARIABLES."
                r4[r18] = r6
                r1.publishProgress(r4)
            L_0x0151:
                boolean r4 = r3.booleanValue()     // Catch:{ SQLiteException -> 0x0bad }
                if (r5 != r4) goto L_0x0160
                java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0bad }
                java.lang.String r5 = "CREATE/OPEN TEMP DB."
                r4[r18] = r5     // Catch:{ SQLiteException -> 0x0bad }
                r1.publishProgress(r4)     // Catch:{ SQLiteException -> 0x0bad }
            L_0x0160:
                r4 = 16
                r5 = 0
                org.sqlite.database.sqlite.SQLiteDatabase r4 = org.sqlite.database.sqlite.SQLiteDatabase.openDatabase(r2, r5, r4)     // Catch:{ SQLiteException -> 0x0bad }
                boolean r5 = r3.booleanValue()     // Catch:{ SQLiteException -> 0x0bad }
                r6 = 1
                if (r6 != r5) goto L_0x0177
                java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0bad }
                java.lang.String r6 = "DROP INDEX."
                r5[r18] = r6     // Catch:{ SQLiteException -> 0x0bad }
                r1.publishProgress(r5)     // Catch:{ SQLiteException -> 0x0bad }
            L_0x0177:
                boolean r5 = r3.booleanValue()     // Catch:{ SQLiteException -> 0x0bad }
                r6 = 1
                if (r6 != r5) goto L_0x0187
                java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0bad }
                java.lang.String r6 = "DELETE FROM PRS."
                r5[r18] = r6     // Catch:{ SQLiteException -> 0x0bad }
                r1.publishProgress(r5)     // Catch:{ SQLiteException -> 0x0bad }
            L_0x0187:
                r4.beginTransaction()     // Catch:{ SQLiteException -> 0x0bad }
                java.lang.String r5 = "DELETE FROM PRS;"
                r4.execSQL(r5)     // Catch:{ SQLiteException -> 0x0bad }
                r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0bad }
                r4.endTransaction()     // Catch:{ SQLiteException -> 0x0bad }
                java.lang.String r5 = "INSERT INTO PRS (C1,C2) VALUES (?,?)"
                org.sqlite.database.sqlite.SQLiteStatement r5 = r4.compileStatement(r5)     // Catch:{ SQLiteException -> 0x0bad }
                com.repo.CleanUpDiaryDataActivity r6 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x0bad }
                com.repo.MyDB r6 = r6.f459a     // Catch:{ SQLiteException -> 0x0bad }
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x0bad }
                r6.p(r7)     // Catch:{ SQLiteException -> 0x0bad }
                boolean r3 = r3.booleanValue()
                r6 = 1
                if (r6 != r3) goto L_0x01b6
                java.lang.String[] r3 = new java.lang.String[r6]
                java.lang.String r6 = "SELECT C1,C2 FROM PRS."
                r3[r18] = r6
                r1.publishProgress(r3)
            L_0x01b6:
                r4.beginTransaction()
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x0b67, all -> 0x0b63 }
                com.repo.MyDB r3 = r3.f459a     // Catch:{ SQLiteException -> 0x0b67, all -> 0x0b63 }
                org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.Q     // Catch:{ SQLiteException -> 0x0b67, all -> 0x0b63 }
                java.lang.String r6 = "SELECT C1,C2 FROM PRS"
                r7 = 0
                android.database.Cursor r3 = r3.rawQuery(r6, r7)     // Catch:{ SQLiteException -> 0x0b67, all -> 0x0b63 }
                if (r3 == 0) goto L_0x0218
                int r6 = r3.getCount()     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                if (r6 <= 0) goto L_0x0218
                boolean r6 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                if (r6 == 0) goto L_0x0218
                java.lang.String r6 = "C1"
                int r6 = r3.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                java.lang.String r7 = "C2"
                int r7 = r3.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
            L_0x01e2:
                r3.getString(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                r3.getString(r7)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                r5.clearBindings()     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                r26 = r2
                java.lang.String r2 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                r27 = r6
                r6 = 1
                r5.bindString(r6, r2)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                r2 = 2
                java.lang.String r6 = r3.getString(r7)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                r5.bindString(r2, r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                r5.executeInsert()     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                boolean r2 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                if (r2 != 0) goto L_0x0209
                goto L_0x021a
            L_0x0209:
                r2 = r26
                r6 = r27
                goto L_0x01e2
            L_0x020e:
                r0 = move-exception
                r2 = r0
                r14 = r4
                goto L_0x0ba4
            L_0x0213:
                r0 = move-exception
                r2 = r0
                r14 = r4
                goto L_0x0b6a
            L_0x0218:
                r26 = r2
            L_0x021a:
                if (r3 == 0) goto L_0x0225
                boolean r2 = r3.isClosed()     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
                if (r2 != 0) goto L_0x0225
                r3.close()     // Catch:{ SQLiteException -> 0x0213, all -> 0x020e }
            L_0x0225:
                r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0b67, all -> 0x0b63 }
                r4.endTransaction()
                if (r5 == 0) goto L_0x0230
                r5.close()
            L_0x0230:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this
                com.repo.MyDB r3 = r3.f459a
                java.lang.Boolean r3 = r3.d
                boolean r3 = r3.booleanValue()
                r5 = 1
                if (r5 != r3) goto L_0x024d
                java.lang.String[] r3 = new java.lang.String[r5]
                java.lang.String r6 = "Begin Data Processing."
                r3[r18] = r6
                r1.publishProgress(r3)
                goto L_0x0256
            L_0x024d:
                java.lang.String[] r3 = new java.lang.String[r5]
                java.lang.String r5 = "Process Data Bermula."
                r3[r18] = r5
                r1.publishProgress(r3)
            L_0x0256:
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x0a22, all -> 0x0a0a }
                com.repo.MyDB r3 = r3.f459a     // Catch:{ SQLiteException -> 0x0a22, all -> 0x0a0a }
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x0a22, all -> 0x0a0a }
                r3.o(r5)     // Catch:{ SQLiteException -> 0x0a22, all -> 0x0a0a }
                java.lang.String r3 = "INSERT INTO VLS VALUES(?,?,?,?,?,?,?,?,?,?,?)"
                org.sqlite.database.sqlite.SQLiteStatement r3 = r4.compileStatement(r3)     // Catch:{ SQLiteException -> 0x0a22, all -> 0x0a0a }
                r4.beginTransaction()     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                com.repo.CleanUpDiaryDataActivity r5 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                com.repo.MyDB r5 = r5.f459a     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                org.sqlite.database.sqlite.SQLiteDatabase r5 = r5.Q     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                java.lang.String r6 = "SELECT C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11 FROM VLS WHERE C3 <> '' ORDER BY rowid ASC"
                r7 = 0
                android.database.Cursor r5 = r5.rawQuery(r6, r7)     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                if (r5 == 0) goto L_0x0863
                int r6 = r5.getCount()     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                int r7 = r6.intValue()     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                if (r7 <= 0) goto L_0x0863
                boolean r7 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                if (r7 == 0) goto L_0x0863
                java.lang.String r7 = "C1"
                int r7 = r5.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                r27 = r2
                java.lang.String r2 = "C2"
                int r2 = r5.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x09f4, all -> 0x09de }
                r28 = r8
                java.lang.String r8 = "C3"
                int r8 = r5.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x085f, all -> 0x085b }
                r29 = r9
                java.lang.String r9 = "C4"
                int r9 = r5.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x0847, all -> 0x0833 }
                r30 = r10
                java.lang.String r10 = "C5"
                int r10 = r5.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x0830, all -> 0x082d }
                r31 = r11
                java.lang.String r11 = "C6"
                int r11 = r5.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x081a, all -> 0x0807 }
                r32 = r12
                java.lang.String r12 = "C7"
                int r12 = r5.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0804, all -> 0x0801 }
                r33 = r13
                java.lang.String r13 = "C8"
                int r13 = r5.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x07ef, all -> 0x07dd }
                r34 = r14
                java.lang.String r14 = "C9"
                int r14 = r5.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x07cb, all -> 0x07b9 }
                r35 = r15
                java.lang.String r15 = "C10"
                int r15 = r5.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x07a6, all -> 0x0793 }
                r36 = r3
                java.lang.String r3 = "C11"
                int r3 = r5.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x077f, all -> 0x076b }
            L_0x02e5:
                int r27 = r27.intValue()     // Catch:{ SQLiteException -> 0x077f, all -> 0x076b }
                r20 = 1
                int r27 = r27 + 1
                java.lang.Integer r27 = java.lang.Integer.valueOf(r27)     // Catch:{ SQLiteException -> 0x077f, all -> 0x076b }
                int r37 = r27.intValue()     // Catch:{ SQLiteException -> 0x077f, all -> 0x076b }
                int r37 = r37 % 100
                if (r37 != 0) goto L_0x0399
                r37 = r4
                com.repo.CleanUpDiaryDataActivity r4 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                com.repo.MyDB r4 = r4.f459a     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.Boolean r4 = r4.d     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                boolean r4 = r4.booleanValue()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r38 = r3
                r3 = 1
                if (r3 != r4) goto L_0x033d
                java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r3.<init>()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r39 = r15
                java.lang.String r15 = "Please wait. Cleaning up the diary now.\nRow: "
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = r27.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = " of "
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = r6.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = "."
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r4[r18] = r3     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r1.publishProgress(r4)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                goto L_0x039f
            L_0x033d:
                r39 = r15
                java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r3.<init>()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = "Sila tunggu. Cuci diary sedang dijalankan.\nBaris: "
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = r27.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = " daripada "
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = r6.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r15 = "."
                r3.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r4[r18] = r3     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r1.publishProgress(r4)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                goto L_0x039f
            L_0x036d:
                r0 = move-exception
                r2 = r0
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r3 = r36
                r14 = r37
                goto L_0x0ae6
            L_0x0383:
                r0 = move-exception
                r2 = r0
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r3 = r36
                r14 = r37
                goto L_0x0a38
            L_0x0399:
                r38 = r3
                r37 = r4
                r39 = r15
            L_0x039f:
                java.lang.String r3 = r5.getString(r7)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r3 = com.repo.r.l(r3)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r4 = r5.getString(r2)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r4 = com.repo.r.l(r4)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r15 = r5.getString(r8)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r15 = com.repo.r.l(r15)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r40 = r5.getString(r9)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r41 = r2
                java.lang.String r2 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r40 = r5.getString(r10)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r42 = r6
                java.lang.String r6 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r40 = r5.getString(r11)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r43 = r7
                java.lang.String r7 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r40 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r44 = r8
                java.lang.String r8 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r40 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r45 = r9
                java.lang.String r9 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r40 = r5.getString(r14)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r46 = r10
                java.lang.String r10 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r40 = r11
                r11 = r39
                java.lang.String r39 = r5.getString(r11)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r47 = r11
                java.lang.String r11 = com.repo.r.l(r39)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r39 = r12
                r12 = r38
                java.lang.String r38 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r48 = r12
                java.lang.String r12 = com.repo.r.l(r38)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                boolean r38 = com.repo.r.s(r15)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                if (r38 != 0) goto L_0x06f4
                r38 = r13
                com.repo.CleanUpDiaryDataActivity$c r13 = com.repo.CleanUpDiaryDataActivity.c.ONEROW     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r49 = r14
                com.repo.CleanUpDiaryDataActivity r14 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                com.repo.CleanUpDiaryDataActivity$c r14 = r14.g     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r50 = r5
                java.lang.String r5 = "'"
                if (r13 != r14) goto L_0x0443
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r14.<init>()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r51 = r12
                java.lang.String r12 = "SELECT C1 FROM VLS WHERE C3 = '"
                r14.append(r12)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r14.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r14.append(r5)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r12 = r14.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
            L_0x043d:
                r14 = r37
                r37 = r11
                r11 = 0
                goto L_0x0491
            L_0x0443:
                r51 = r12
                com.repo.CleanUpDiaryDataActivity$c r12 = com.repo.CleanUpDiaryDataActivity.c.MULTIROW     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                com.repo.CleanUpDiaryDataActivity r14 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                com.repo.CleanUpDiaryDataActivity$c r14 = r14.g     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                if (r12 != r14) goto L_0x046c
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r12.<init>()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r14 = "SELECT C1 FROM VLS WHERE C3 = '"
                r12.append(r14)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r12.append(r15)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r14 = "' AND C8 = '"
                r12.append(r14)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r12.append(r9)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                r12.append(r5)     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                java.lang.String r12 = r12.toString()     // Catch:{ SQLiteException -> 0x0383, all -> 0x036d }
                goto L_0x043d
            L_0x046c:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r12.<init>()     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r14 = "SELECT C1 FROM VLS WHERE C3 = '"
                r12.append(r14)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r12.append(r15)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r14 = "' AND C8 = '"
                r12.append(r14)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r12.append(r9)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r14 = "' AND C1 = '"
                r12.append(r14)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r12.append(r3)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                r12.append(r5)     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                java.lang.String r12 = r12.toString()     // Catch:{ SQLiteException -> 0x0756, all -> 0x0741 }
                goto L_0x043d
            L_0x0491:
                android.database.Cursor r12 = r14.rawQuery(r12, r11)     // Catch:{ SQLiteException -> 0x0614, all -> 0x05ff }
                if (r12 == 0) goto L_0x04c2
                boolean r11 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x04bc, all -> 0x04a8 }
                if (r11 == 0) goto L_0x04c2
                java.lang.String r11 = "C1"
                int r11 = r12.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x04bc, all -> 0x04a8 }
                java.lang.String r11 = r12.getString(r11)     // Catch:{ SQLiteException -> 0x04bc, all -> 0x04a8 }
                goto L_0x04c4
            L_0x04a8:
                r0 = move-exception
                r2 = r0
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r3 = r36
                goto L_0x0ae6
            L_0x04bc:
                r0 = move-exception
                r2 = r0
                r5 = r36
                goto L_0x0618
            L_0x04c2:
                r11 = r24
            L_0x04c4:
                if (r12 == 0) goto L_0x04cf
                boolean r52 = r12.isClosed()     // Catch:{ SQLiteException -> 0x04bc, all -> 0x04a8 }
                if (r52 != 0) goto L_0x04cf
                r12.close()     // Catch:{ SQLiteException -> 0x04bc, all -> 0x04a8 }
            L_0x04cf:
                boolean r12 = com.repo.r.s(r11)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                if (r12 != 0) goto L_0x05ac
                boolean r12 = com.repo.r.s(r9)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                if (r12 != 0) goto L_0x059a
                boolean r11 = com.repo.r.e(r3, r11)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r12 = 1
                if (r11 != r12) goto L_0x059a
                com.repo.CleanUpDiaryDataActivity r11 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                com.repo.CleanUpDiaryDataActivity$c r11 = r11.g     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                if (r13 != r11) goto L_0x0513
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                r11.<init>()     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                java.lang.String r12 = "DELETE FROM VLS WHERE C3 = '"
                r11.append(r12)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                r11.append(r15)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                r11.append(r5)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
            L_0x04fa:
                java.lang.String r5 = r11.toString()     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                goto L_0x055a
            L_0x04ff:
                r0 = move-exception
                r2 = r0
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r3 = r36
                goto L_0x0a38
            L_0x0513:
                com.repo.CleanUpDiaryDataActivity$c r11 = com.repo.CleanUpDiaryDataActivity.c.MULTIROW     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                com.repo.CleanUpDiaryDataActivity r12 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                com.repo.CleanUpDiaryDataActivity$c r12 = r12.g     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                if (r11 != r12) goto L_0x0536
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                r11.<init>()     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                java.lang.String r12 = "DELETE FROM VLS WHERE C3 = '"
                r11.append(r12)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                r11.append(r15)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                java.lang.String r12 = "' AND C8 = '"
                r11.append(r12)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                r11.append(r9)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                r11.append(r5)     // Catch:{ SQLiteException -> 0x04ff, all -> 0x04a8 }
                goto L_0x04fa
            L_0x0536:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r11.<init>()     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                java.lang.String r12 = "DELETE FROM VLS WHERE C3 = '"
                r11.append(r12)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r11.append(r15)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                java.lang.String r12 = "' AND C8 = '"
                r11.append(r12)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r11.append(r9)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                java.lang.String r12 = "' AND C1 = '"
                r11.append(r12)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r11.append(r3)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r11.append(r5)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                java.lang.String r5 = r11.toString()     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
            L_0x055a:
                r14.execSQL(r5)     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r36.clearBindings()     // Catch:{ SQLiteException -> 0x05ea, all -> 0x05ff }
                r5 = r36
                r11 = 1
                r5.bindString(r11, r3)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r3 = 2
                r5.bindString(r3, r4)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r3 = 3
                r5.bindString(r3, r15)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r3 = 4
                r5.bindString(r3, r2)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 5
                r5.bindString(r2, r6)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 6
                r5.bindString(r2, r7)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 7
                r5.bindString(r2, r8)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 8
                r5.bindString(r2, r9)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 9
                r5.bindString(r2, r10)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 10
                r11 = r37
                r5.bindString(r2, r11)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 11
                r12 = r51
                r5.bindString(r2, r12)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
            L_0x0596:
                r5.executeInsert()     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                goto L_0x059c
            L_0x059a:
                r5 = r36
            L_0x059c:
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                goto L_0x070c
            L_0x05ac:
                r5 = r36
                r11 = r37
                r12 = r51
                r5.clearBindings()     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r13 = 1
                r5.bindString(r13, r3)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r3 = 2
                r5.bindString(r3, r4)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r3 = 3
                r5.bindString(r3, r15)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r3 = 4
                r5.bindString(r3, r2)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 5
                r5.bindString(r2, r6)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 6
                r5.bindString(r2, r7)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 7
                r5.bindString(r2, r8)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 8
                r5.bindString(r2, r9)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 9
                r5.bindString(r2, r10)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 10
                r5.bindString(r2, r11)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                r2 = 11
                r5.bindString(r2, r12)     // Catch:{ SQLiteException -> 0x05e8, all -> 0x05e6 }
                goto L_0x0596
            L_0x05e6:
                r0 = move-exception
                goto L_0x0602
            L_0x05e8:
                r0 = move-exception
                goto L_0x05ed
            L_0x05ea:
                r0 = move-exception
                r5 = r36
            L_0x05ed:
                r2 = r0
                r3 = r5
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                goto L_0x0a38
            L_0x05ff:
                r0 = move-exception
                r5 = r36
            L_0x0602:
                r2 = r0
                r3 = r5
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                goto L_0x0ae6
            L_0x0614:
                r0 = move-exception
                r5 = r36
                r2 = r0
            L_0x0618:
                java.lang.String r3 = "dbCleanUpDiary"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                r4.<init>()     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.String r6 = "Error : dbCleanUpDiary 4 : "
                r4.append(r6)     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.String r6 = r2.getMessage()     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                r4.append(r6)     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                android.util.Log.e(r3, r4)     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                r3.<init>()     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.String r4 = "Error : dbCleanUpDiary 4 : "
                r3.append(r4)     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.String r2 = r2.getMessage()     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                r3.append(r2)     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x06e3, all -> 0x06d2 }
                java.lang.Boolean r3 = com.repo.r.f760a
                boolean r4 = r3.booleanValue()
                r6 = 1
                if (r6 != r4) goto L_0x0657
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r17
                r1.publishProgress(r4)
            L_0x0657:
                r14.endTransaction()
                if (r5 == 0) goto L_0x065f
                r5.close()
            L_0x065f:
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r16
                r1.publishProgress(r4)
                r4 = r35
                r14.execSQL(r4)
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r34
                r1.publishProgress(r4)
                r7 = r33
                r14.execSQL(r7)
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r32
                r1.publishProgress(r4)
                r8 = r31
                r14.execSQL(r8)
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r30
                r1.publishProgress(r4)
                r9 = r29
                r14.execSQL(r9)
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r28
                r1.publishProgress(r4)
                r10 = r25
                r14.execSQL(r10)
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r23
                r1.publishProgress(r4)
                r11 = r22
                r14.execSQL(r11)
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r21
                r1.publishProgress(r4)
                r12 = r19
                r14.execSQL(r12)
                java.lang.String[] r4 = new java.lang.String[r6]
                r4[r18] = r54
                r1.publishProgress(r4)
                java.lang.String r4 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r14.execSQL(r4)
                boolean r3 = r3.booleanValue()
                if (r6 != r3) goto L_0x06ce
                java.lang.String[] r3 = new java.lang.String[r6]
                java.lang.String r4 = "CLOSE."
                r3[r18] = r4
                r1.publishProgress(r3)
            L_0x06ce:
                r14.close()
                return r2
            L_0x06d2:
                r0 = move-exception
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                goto L_0x0a1e
            L_0x06e3:
                r0 = move-exception
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                goto L_0x0a36
            L_0x06f4:
                r50 = r5
                r38 = r13
                r49 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r5 = r36
                r14 = r37
            L_0x070c:
                boolean r2 = r50.moveToNext()     // Catch:{ SQLiteException -> 0x09db, all -> 0x09d9 }
                if (r2 != 0) goto L_0x0714
                goto L_0x0878
            L_0x0714:
                r35 = r4
                r36 = r5
                r33 = r7
                r31 = r8
                r29 = r9
                r25 = r10
                r22 = r11
                r19 = r12
                r4 = r14
                r13 = r38
                r12 = r39
                r11 = r40
                r2 = r41
                r6 = r42
                r7 = r43
                r8 = r44
                r9 = r45
                r10 = r46
                r15 = r47
                r3 = r48
                r14 = r49
                r5 = r50
                goto L_0x02e5
            L_0x0741:
                r0 = move-exception
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r5 = r36
                r14 = r37
                goto L_0x0a1e
            L_0x0756:
                r0 = move-exception
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r5 = r36
                r14 = r37
                goto L_0x0a36
            L_0x076b:
                r0 = move-exception
                r14 = r4
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r5 = r36
                goto L_0x0a1e
            L_0x077f:
                r0 = move-exception
                r14 = r4
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                r5 = r36
                goto L_0x0a36
            L_0x0793:
                r0 = move-exception
                r5 = r3
                r14 = r4
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                goto L_0x0ae5
            L_0x07a6:
                r0 = move-exception
                r5 = r3
                r14 = r4
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                r4 = r35
                goto L_0x0a08
            L_0x07b9:
                r0 = move-exception
                r5 = r3
                r14 = r4
                r4 = r15
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                goto L_0x0ae5
            L_0x07cb:
                r0 = move-exception
                r5 = r3
                r14 = r4
                r4 = r15
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                goto L_0x0a08
            L_0x07dd:
                r0 = move-exception
                r5 = r3
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                goto L_0x09f0
            L_0x07ef:
                r0 = move-exception
                r5 = r3
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                r7 = r33
                goto L_0x0a06
            L_0x0801:
                r0 = move-exception
                r5 = r3
                goto L_0x080b
            L_0x0804:
                r0 = move-exception
                r5 = r3
                goto L_0x081e
            L_0x0807:
                r0 = move-exception
                r5 = r3
                r32 = r12
            L_0x080b:
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                goto L_0x09f0
            L_0x081a:
                r0 = move-exception
                r5 = r3
                r32 = r12
            L_0x081e:
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                r8 = r31
                goto L_0x0a06
            L_0x082d:
                r0 = move-exception
                r5 = r3
                goto L_0x0837
            L_0x0830:
                r0 = move-exception
                r5 = r3
                goto L_0x084b
            L_0x0833:
                r0 = move-exception
                r5 = r3
                r30 = r10
            L_0x0837:
                r8 = r11
                r32 = r12
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                goto L_0x09f0
            L_0x0847:
                r0 = move-exception
                r5 = r3
                r30 = r10
            L_0x084b:
                r8 = r11
                r32 = r12
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r9 = r29
                goto L_0x0a06
            L_0x085b:
                r0 = move-exception
                r5 = r3
                goto L_0x09e2
            L_0x085f:
                r0 = move-exception
                r5 = r3
                goto L_0x09f8
            L_0x0863:
                r50 = r5
                r28 = r8
                r30 = r10
                r8 = r11
                r32 = r12
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r5 = r3
                r14 = r4
                r4 = r15
            L_0x0878:
                if (r50 == 0) goto L_0x0883
                boolean r2 = r50.isClosed()     // Catch:{ SQLiteException -> 0x09db, all -> 0x09d9 }
                if (r2 != 0) goto L_0x0883
                r50.close()     // Catch:{ SQLiteException -> 0x09db, all -> 0x09d9 }
            L_0x0883:
                r14.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x09db, all -> 0x09d9 }
                java.lang.Boolean r2 = com.repo.r.f760a
                boolean r3 = r2.booleanValue()
                r6 = 1
                if (r6 != r3) goto L_0x0896
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r17
                r1.publishProgress(r3)
            L_0x0896:
                r14.endTransaction()
                if (r5 == 0) goto L_0x089e
                r5.close()
            L_0x089e:
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r16
                r1.publishProgress(r3)
                r14.execSQL(r4)
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r34
                r1.publishProgress(r3)
                r14.execSQL(r7)
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r32
                r1.publishProgress(r3)
                r14.execSQL(r8)
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r30
                r1.publishProgress(r3)
                r14.execSQL(r9)
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r28
                r1.publishProgress(r3)
                r14.execSQL(r10)
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r23
                r1.publishProgress(r3)
                r14.execSQL(r11)
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r21
                r1.publishProgress(r3)
                r14.execSQL(r12)
                java.lang.String[] r3 = new java.lang.String[r6]
                r3[r18] = r54
                r1.publishProgress(r3)
                java.lang.String r3 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r14.execSQL(r3)
                boolean r3 = r2.booleanValue()
                if (r6 != r3) goto L_0x08ff
                java.lang.String[] r3 = new java.lang.String[r6]
                java.lang.String r4 = "CLOSE."
                r3[r18] = r4
                r1.publishProgress(r3)
            L_0x08ff:
                r14.close()
                boolean r3 = r2.booleanValue()     // Catch:{ Exception -> 0x09a7 }
                if (r6 != r3) goto L_0x0911
                java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ Exception -> 0x09a7 }
                java.lang.String r4 = "delete_File."
                r3[r18] = r4     // Catch:{ Exception -> 0x09a7 }
                r1.publishProgress(r3)     // Catch:{ Exception -> 0x09a7 }
            L_0x0911:
                com.repo.CleanUpDiaryDataActivity r3 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r3 = r3.f459a     // Catch:{ Exception -> 0x09a7 }
                java.lang.String r3 = r3.E     // Catch:{ Exception -> 0x09a7 }
                com.repo.r.p(r3)     // Catch:{ Exception -> 0x09a7 }
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x09a7 }
                r4 = r26
                r3.<init>(r4)     // Catch:{ Exception -> 0x09a7 }
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x09a7 }
                com.repo.CleanUpDiaryDataActivity r5 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r5 = r5.f459a     // Catch:{ Exception -> 0x09a7 }
                java.lang.String r5 = r5.E     // Catch:{ Exception -> 0x09a7 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x09a7 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x09a7 }
                r5 = 1
                if (r5 != r2) goto L_0x0940
                java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ Exception -> 0x09a7 }
                java.lang.String r5 = "rename_File."
                r2[r18] = r5     // Catch:{ Exception -> 0x09a7 }
                r1.publishProgress(r2)     // Catch:{ Exception -> 0x09a7 }
            L_0x0940:
                r3.renameTo(r4)     // Catch:{ Exception -> 0x09a7 }
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r2 = r2.f459a     // Catch:{ Exception -> 0x09a7 }
                java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x09a7 }
                r2.p(r3)     // Catch:{ Exception -> 0x09a7 }
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r2 = r2.f459a     // Catch:{ Exception -> 0x09a7 }
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q     // Catch:{ Exception -> 0x09a7 }
                if (r2 != 0) goto L_0x0966
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r2 = r2.f459a     // Catch:{ Exception -> 0x09a7 }
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q     // Catch:{ Exception -> 0x09a7 }
                boolean r2 = r2.isOpen()     // Catch:{ Exception -> 0x09a7 }
                if (r2 == 0) goto L_0x097a
            L_0x0966:
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r2 = r2.f459a     // Catch:{ Exception -> 0x09a7 }
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q     // Catch:{ Exception -> 0x09a7 }
                r2.close()     // Catch:{ Exception -> 0x09a7 }
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r2 = r2.f459a     // Catch:{ Exception -> 0x09a7 }
                r5 = 0
                r2.Q = r5     // Catch:{ Exception -> 0x09a7 }
            L_0x097a:
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r2 = r2.f459a     // Catch:{ Exception -> 0x09a7 }
                r2.p(r3)     // Catch:{ Exception -> 0x09a7 }
                com.repo.CleanUpDiaryDataActivity r2 = com.repo.CleanUpDiaryDataActivity.this     // Catch:{ Exception -> 0x09a7 }
                com.repo.MyDB r2 = r2.f459a     // Catch:{ Exception -> 0x09a7 }
                java.lang.Boolean r2 = r2.d     // Catch:{ Exception -> 0x09a7 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x09a7 }
                r3 = 1
                if (r3 != r2) goto L_0x099c
                java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ Exception -> 0x09a7 }
                java.lang.String r3 = "Finish, Your diary has been cleaned up."
                r2[r18] = r3     // Catch:{ Exception -> 0x09a7 }
                r1.publishProgress(r2)     // Catch:{ Exception -> 0x09a7 }
                goto L_0x09a6
            L_0x099c:
                r2 = 1
                java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x09a7 }
                java.lang.String r3 = "Selesai, Diary anda sudah dicuci."
                r2[r18] = r3     // Catch:{ Exception -> 0x09a7 }
                r1.publishProgress(r2)     // Catch:{ Exception -> 0x09a7 }
            L_0x09a6:
                return r24
            L_0x09a7:
                r0 = move-exception
                r2 = r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbCleanUpDiary 5 : "
                r3.append(r4)
                java.lang.String r4 = r2.getMessage()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "dbCleanUpDiary"
                android.util.Log.e(r4, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbCleanUpDiary 5 : "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
            L_0x09d1:
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                return r2
            L_0x09d9:
                r0 = move-exception
                goto L_0x0a1e
            L_0x09db:
                r0 = move-exception
                goto L_0x0a36
            L_0x09de:
                r0 = move-exception
                r5 = r3
                r28 = r8
            L_0x09e2:
                r30 = r10
                r8 = r11
                r32 = r12
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
            L_0x09f0:
                r14 = r4
                r4 = r15
                goto L_0x0ae5
            L_0x09f4:
                r0 = move-exception
                r5 = r3
                r28 = r8
            L_0x09f8:
                r30 = r10
                r8 = r11
                r32 = r12
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
            L_0x0a06:
                r14 = r4
                r4 = r15
            L_0x0a08:
                r2 = r0
                goto L_0x0a38
            L_0x0a0a:
                r0 = move-exception
                r28 = r8
                r30 = r10
                r8 = r11
                r32 = r12
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r5 = 0
                r14 = r4
                r4 = r15
            L_0x0a1e:
                r2 = r0
                r3 = r5
                goto L_0x0ae6
            L_0x0a22:
                r0 = move-exception
                r28 = r8
                r30 = r10
                r8 = r11
                r32 = r12
                r7 = r13
                r34 = r14
                r12 = r19
                r11 = r22
                r10 = r25
                r5 = 0
                r14 = r4
                r4 = r15
            L_0x0a36:
                r2 = r0
                r3 = r5
            L_0x0a38:
                java.lang.String r5 = "dbCleanUpDiary"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ae4 }
                r6.<init>()     // Catch:{ all -> 0x0ae4 }
                java.lang.String r13 = "Error : dbCleanUpDiary 4 : "
                r6.append(r13)     // Catch:{ all -> 0x0ae4 }
                java.lang.String r13 = r2.getMessage()     // Catch:{ all -> 0x0ae4 }
                r6.append(r13)     // Catch:{ all -> 0x0ae4 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0ae4 }
                android.util.Log.e(r5, r6)     // Catch:{ all -> 0x0ae4 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ae4 }
                r5.<init>()     // Catch:{ all -> 0x0ae4 }
                java.lang.String r6 = "Error : dbCleanUpDiary 4 : "
                r5.append(r6)     // Catch:{ all -> 0x0ae4 }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0ae4 }
                r5.append(r2)     // Catch:{ all -> 0x0ae4 }
                java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0ae4 }
                java.lang.Boolean r5 = com.repo.r.f760a
                boolean r6 = r5.booleanValue()
                r13 = 1
                if (r13 != r6) goto L_0x0a77
                java.lang.String[] r6 = new java.lang.String[r13]
                r6[r18] = r17
                r1.publishProgress(r6)
            L_0x0a77:
                r14.endTransaction()
                if (r3 == 0) goto L_0x0a7f
                r3.close()
            L_0x0a7f:
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r16
                r1.publishProgress(r3)
                r14.execSQL(r4)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r34
                r1.publishProgress(r3)
                r14.execSQL(r7)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r32
                r1.publishProgress(r3)
                r14.execSQL(r8)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r30
                r1.publishProgress(r3)
                r14.execSQL(r9)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r28
                r1.publishProgress(r3)
                r14.execSQL(r10)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r23
                r1.publishProgress(r3)
                r14.execSQL(r11)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r21
                r1.publishProgress(r3)
                r14.execSQL(r12)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r54
                r1.publishProgress(r3)
                java.lang.String r3 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r14.execSQL(r3)
                boolean r3 = r5.booleanValue()
                if (r13 != r3) goto L_0x0ae0
                java.lang.String[] r3 = new java.lang.String[r13]
                java.lang.String r4 = "CLOSE."
                r3[r18] = r4
                r1.publishProgress(r3)
            L_0x0ae0:
                r14.close()
                return r2
            L_0x0ae4:
                r0 = move-exception
            L_0x0ae5:
                r2 = r0
            L_0x0ae6:
                java.lang.Boolean r5 = com.repo.r.f760a
                boolean r6 = r5.booleanValue()
                r13 = 1
                if (r13 != r6) goto L_0x0af6
                java.lang.String[] r6 = new java.lang.String[r13]
                r6[r18] = r17
                r1.publishProgress(r6)
            L_0x0af6:
                r14.endTransaction()
                if (r3 == 0) goto L_0x0afe
                r3.close()
            L_0x0afe:
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r16
                r1.publishProgress(r3)
                r14.execSQL(r4)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r34
                r1.publishProgress(r3)
                r14.execSQL(r7)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r32
                r1.publishProgress(r3)
                r14.execSQL(r8)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r30
                r1.publishProgress(r3)
                r14.execSQL(r9)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r28
                r1.publishProgress(r3)
                r14.execSQL(r10)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r23
                r1.publishProgress(r3)
                r14.execSQL(r11)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r21
                r1.publishProgress(r3)
                r14.execSQL(r12)
                java.lang.String[] r3 = new java.lang.String[r13]
                r3[r18] = r54
                r1.publishProgress(r3)
                java.lang.String r3 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r14.execSQL(r3)
                boolean r3 = r5.booleanValue()
                if (r13 != r3) goto L_0x0b5f
                java.lang.String[] r3 = new java.lang.String[r13]
                java.lang.String r4 = "CLOSE."
                r3[r18] = r4
                r1.publishProgress(r3)
            L_0x0b5f:
                r14.close()
                throw r2
            L_0x0b63:
                r0 = move-exception
                r14 = r4
            L_0x0b65:
                r2 = r0
                goto L_0x0ba4
            L_0x0b67:
                r0 = move-exception
                r14 = r4
                r2 = r0
            L_0x0b6a:
                java.lang.String r3 = "dbUpdateDiary"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ba2 }
                r4.<init>()     // Catch:{ all -> 0x0ba2 }
                java.lang.String r6 = "Error : dbUpdateDiary 2 : "
                r4.append(r6)     // Catch:{ all -> 0x0ba2 }
                java.lang.String r6 = r2.getMessage()     // Catch:{ all -> 0x0ba2 }
                r4.append(r6)     // Catch:{ all -> 0x0ba2 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ba2 }
                android.util.Log.e(r3, r4)     // Catch:{ all -> 0x0ba2 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ba2 }
                r3.<init>()     // Catch:{ all -> 0x0ba2 }
                java.lang.String r4 = "Error : dbUpdateDiary 2 : "
                r3.append(r4)     // Catch:{ all -> 0x0ba2 }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0ba2 }
                r3.append(r2)     // Catch:{ all -> 0x0ba2 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0ba2 }
                r14.endTransaction()
                if (r5 == 0) goto L_0x0ba1
                r5.close()
            L_0x0ba1:
                return r2
            L_0x0ba2:
                r0 = move-exception
                goto L_0x0b65
            L_0x0ba4:
                r14.endTransaction()
                if (r5 == 0) goto L_0x0bac
                r5.close()
            L_0x0bac:
                throw r2
            L_0x0bad:
                r0 = move-exception
                r2 = r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbUpdateDiary 1 : "
                r3.append(r4)
                java.lang.String r4 = r2.getMessage()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "dbUpdateDiary"
                android.util.Log.e(r4, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbUpdateDiary 1 : "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
                goto L_0x09d1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.repo.CleanUpDiaryDataActivity.d.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (this.f465a.isShowing()) {
                this.f465a.dismiss();
            }
            if (true == str.startsWith("Error")) {
                r.t(CleanUpDiaryDataActivity.this, str);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f465a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == CleanUpDiaryDataActivity.this.f459a.d.booleanValue()) {
                progressDialog = this.f465a;
                str = "Please wait..";
            } else {
                progressDialog = this.f465a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f465a.setCancelable(false);
            this.f465a.show();
        }
    }

    /* access modifiers changed from: private */
    public Boolean a(String str, String str2, String str3, int i) {
        StringBuilder sb;
        String message;
        InputStream openRawResource = getResources().openRawResource(i);
        String replace = str.replace(str2, BuildConfig.FLAVOR);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(replace + str3);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    openRawResource.close();
                    return Boolean.TRUE;
                }
            }
        } catch (FileNotFoundException e2) {
            sb = new StringBuilder();
            sb.append("Error : CpyDbFileFrmRscToSDCard : ");
            message = e2.getMessage();
            sb.append(message);
            Log.e("CpyDbFileFrmRscToSDCard", sb.toString());
            return Boolean.FALSE;
        } catch (IOException e3) {
            sb = new StringBuilder();
            sb.append("Error : CpyDbFileFrmRscToSDCard : ");
            message = e3.getMessage();
            sb.append(message);
            Log.e("CpyDbFileFrmRscToSDCard", sb.toString());
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        new d(this, (a) null).execute(new String[]{BuildConfig.FLAVOR});
    }

    public void onCreate(Bundle bundle) {
        String str;
        Spinner spinner;
        String str2;
        super.onCreate(bundle);
        setContentView(R.layout.cleanupdiarydata);
        MyDB myDB = (MyDB) getApplicationContext();
        this.f459a = myDB;
        myDB.p(Boolean.FALSE);
        TextView textView = (TextView) findViewById(R.id.lblPassword);
        this.f460b = (TextView) findViewById(R.id.lblWarning);
        Button button = (Button) findViewById(R.id.btnCleanUpDiaryData);
        EditText editText = (EditText) findViewById(R.id.txtDiaryPassword);
        this.c = editText;
        editText.setKeyListener(new a());
        if (true == this.f459a.d.booleanValue()) {
            setTitle("CleanUp Diary");
            textView.setText("Please enter your diary password:");
            this.f460b.setText("Note, this will remove all duplicate PlateNo in your diary. You will only need to clean up your diary once in every 3 or 6 months. After cleaning up your diary, you can update your diary.");
            str = "CleanUp Diary Data";
        } else {
            setTitle("Cuci Diary");
            textView.setText("Sila masukkan password diary anda:");
            this.f460b.setText("Perhatian, tindakan ini akan membersihkan PlateNo yang bertindan dalam diary anda. Anda hanya perlu mencuci diary anda sekali dalam 3 atau 6 bulan. Selepas cuci diary, anda boleh kemaskini diary anda.");
            str = "Cuci Data Diary";
        }
        button.setText(str);
        this.d = (Spinner) findViewById(R.id.cboCleanUpType);
        if (true == this.f459a.d.booleanValue()) {
            ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.diarycleanuptype_en, 17367048);
            createFromResource.setDropDownViewResource(17367049);
            this.d.setAdapter(createFromResource);
            spinner = this.d;
            str2 = "Please choose...";
        } else {
            ArrayAdapter<CharSequence> createFromResource2 = ArrayAdapter.createFromResource(this, R.array.diarycleanuptype_bm, 17367048);
            createFromResource2.setDropDownViewResource(17367049);
            this.d.setAdapter(createFromResource2);
            spinner = this.d;
            str2 = "Sila pilih...";
        }
        spinner.setPrompt(str2);
        this.e = this.d.getSelectedItemPosition();
        this.d.setOnItemSelectedListener(new a());
        button.setOnClickListener(new b());
        this.c.requestFocus();
    }
}
