package com.repo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;
import org.sqlite.database.sqlite.SQLiteDatabase;
import org.sqlite.database.sqlite.SQLiteException;

public class DeleteDiaryOldDataActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public MyDB f467a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public TextView f468b;
    /* access modifiers changed from: private */
    public TextView c;
    /* access modifiers changed from: private */
    public EditText d;
    /* access modifiers changed from: private */
    public String e = "2000-01-01";
    /* access modifiers changed from: private */
    public int f;
    /* access modifiers changed from: private */
    public int g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private DatePickerDialog.OnDateSetListener j = new a();

    class a implements DatePickerDialog.OnDateSetListener {
        a() {
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            int unused = DeleteDiaryOldDataActivity.this.f = i;
            int unused2 = DeleteDiaryOldDataActivity.this.g = i2;
            int unused3 = DeleteDiaryOldDataActivity.this.h = i3;
            DeleteDiaryOldDataActivity.this.m();
        }
    }

    class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f470a;

        b(Drawable drawable) {
            this.f470a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (DeleteDiaryOldDataActivity.this.c.getCompoundDrawables()[2] != null && motionEvent.getAction() == 0 && motionEvent.getX() > ((float) ((DeleteDiaryOldDataActivity.this.c.getWidth() - DeleteDiaryOldDataActivity.this.c.getPaddingRight()) - this.f470a.getIntrinsicWidth()))) {
                Drawable drawable = this.f470a;
                DeleteDiaryOldDataActivity.this.showDialog(0);
                DeleteDiaryOldDataActivity.this.c.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
            return false;
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            DeleteDiaryOldDataActivity deleteDiaryOldDataActivity;
            String str;
            if (true == DeleteDiaryOldDataActivity.this.d.getText().toString().toUpperCase().equals(DeleteDiaryOldDataActivity.this.f467a.G)) {
                DeleteDiaryOldDataActivity deleteDiaryOldDataActivity2 = DeleteDiaryOldDataActivity.this;
                Boolean unused = deleteDiaryOldDataActivity2.l(deleteDiaryOldDataActivity2.f467a.E, DeleteDiaryOldDataActivity.this.f467a.E.replace("RepoProDiary.db", BuildConfig.FLAVOR) + "RepoProDiary.db".replace(".db", BuildConfig.FLAVOR) + " - BACKUP " + DeleteDiaryOldDataActivity.this.i.format(new Date()).toUpperCase() + "RepoProDiary.db".substring(12, 15));
                new d(DeleteDiaryOldDataActivity.this, (a) null).execute(new String[]{DeleteDiaryOldDataActivity.this.e});
                return;
            }
            if (DeleteDiaryOldDataActivity.this.d.length() == 0) {
                if (true == DeleteDiaryOldDataActivity.this.f467a.d.booleanValue()) {
                    deleteDiaryOldDataActivity = DeleteDiaryOldDataActivity.this;
                    str = "Please keyin your Diary Password";
                } else {
                    deleteDiaryOldDataActivity = DeleteDiaryOldDataActivity.this;
                    str = "Sila masukkan Password Diary";
                }
            } else if (true == DeleteDiaryOldDataActivity.this.f467a.d.booleanValue()) {
                deleteDiaryOldDataActivity = DeleteDiaryOldDataActivity.this;
                str = "Your Diary Password is not correct";
            } else {
                deleteDiaryOldDataActivity = DeleteDiaryOldDataActivity.this;
                str = "Password Diary anda tidak betul";
            }
            r.v(deleteDiaryOldDataActivity, str, 1);
        }
    }

    private class d extends AsyncTask<String, String, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f473a;

        private d() {
            this.f473a = new ProgressDialog(DeleteDiaryOldDataActivity.this);
        }

        /* synthetic */ d(DeleteDiaryOldDataActivity deleteDiaryOldDataActivity, a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            String str = strArr[0];
            int i = 0;
            try {
                DeleteDiaryOldDataActivity.this.f467a.Q.beginTransaction();
                SQLiteDatabase sQLiteDatabase = DeleteDiaryOldDataActivity.this.f467a.Q;
                i = Integer.valueOf(sQLiteDatabase.delete("VLS", "C1 < '" + str + "'", (String[]) null));
                DeleteDiaryOldDataActivity.this.f467a.Q.setTransactionSuccessful();
            } catch (SQLiteException e) {
                Log.e("DeleteDiaryOldData", "Could not delete the Old Diary data. Error:" + e.getMessage());
            } catch (Throwable th) {
                DeleteDiaryOldDataActivity.this.f467a.Q.endTransaction();
                throw th;
            }
            DeleteDiaryOldDataActivity.this.f467a.Q.endTransaction();
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            String str;
            StringBuilder sb;
            TextView textView;
            if (true != DeleteDiaryOldDataActivity.this.f467a.d.booleanValue()) {
                textView = DeleteDiaryOldDataActivity.this.f468b;
                sb = new StringBuilder();
                sb.append(Integer.toString(num.intValue()));
                str = " baris data lama sudah dipadam. Tekan button 'Back' untuk keluar.";
            } else if (1 < num.intValue()) {
                textView = DeleteDiaryOldDataActivity.this.f468b;
                sb = new StringBuilder();
                sb.append(Integer.toString(num.intValue()));
                str = " rows of old data has been deleted. Press the 'Back' button to exit.";
            } else {
                textView = DeleteDiaryOldDataActivity.this.f468b;
                sb = new StringBuilder();
                sb.append(Integer.toString(num.intValue()));
                str = " row of old data has been deleted. Press the 'Back' button to exit.";
            }
            sb.append(str);
            textView.setText(sb.toString());
            if (this.f473a.isShowing()) {
                this.f473a.dismiss();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f473a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == DeleteDiaryOldDataActivity.this.f467a.d.booleanValue()) {
                progressDialog = this.f473a;
                str = "Please wait..";
            } else {
                progressDialog = this.f473a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f473a.setCancelable(false);
            this.f473a.show();
        }
    }

    /* access modifiers changed from: private */
    public Boolean l(String str, String str2) {
        StringBuilder sb;
        String message;
        try {
            File file = new File(str);
            File file2 = new File(str2);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return Boolean.TRUE;
                }
            }
        } catch (FileNotFoundException e2) {
            sb = new StringBuilder();
            sb.append("Could not copyFile. Error:");
            message = e2.getMessage();
            sb.append(message);
            Log.e("copyFile", sb.toString());
            return Boolean.FALSE;
        } catch (IOException e3) {
            sb = new StringBuilder();
            sb.append("Could not copyFile. Error:");
            message = e3.getMessage();
            sb.append(message);
            Log.e("copyFile", sb.toString());
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        String str = Integer.toString(this.g + 1) + "/" + Integer.toString(this.h) + "/" + Integer.toString(this.f);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            this.c.setText(simpleDateFormat2.format(parse).toUpperCase());
            this.e = simpleDateFormat3.format(parse).toUpperCase();
        } catch (ParseException e2) {
            Log.e("updateDatePicker", "Error : updateDatePicker : " + e2.getMessage());
        }
    }

    public void onCreate(Bundle bundle) {
        TextView textView;
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(R.layout.deletediaryolddata);
        MyDB myDB = (MyDB) getApplicationContext();
        this.f467a = myDB;
        myDB.p(Boolean.FALSE);
        TextView textView2 = (TextView) findViewById(R.id.lblPassword);
        this.f468b = (TextView) findViewById(R.id.lblWarning);
        this.c = (TextView) findViewById(R.id.lblDateToDelete);
        Button button = (Button) findViewById(R.id.btnDeleteDiaryOldData);
        EditText editText = (EditText) findViewById(R.id.txtDiaryPassword);
        this.d = editText;
        editText.setKeyListener(new a());
        this.c.setText("01-JAN-2000");
        if (true == this.f467a.d.booleanValue()) {
            str2 = "Delete Old Diary Data";
            setTitle(str2);
            textView2.setText("Please enter your diary password:");
            textView = this.f468b;
            str = "All data before the date below will be deleted!";
        } else {
            str2 = "Padam Data Diary Lama";
            setTitle(str2);
            textView2.setText("Sila masukkan password diary anda:");
            textView = this.f468b;
            str = "Semua data sebelum tarikh dibawah akan dipadamkan!";
        }
        textView.setText(str);
        button.setText(str2);
        Drawable drawable = getResources().getDrawable(R.drawable.calendar_icon);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.c.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.c.setOnTouchListener(new b(drawable));
        this.f = Integer.parseInt(this.e.substring(0, 4));
        this.g = Integer.parseInt(this.e.substring(5, 7)) - 1;
        this.h = Integer.parseInt(this.e.substring(8, 10));
        button.setOnClickListener(new c());
        this.d.requestFocus();
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i2) {
        if (i2 != 0) {
            return null;
        }
        return new DatePickerDialog(this, this.j, this.f, this.g, this.h);
    }
}
