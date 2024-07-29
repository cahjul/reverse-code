package com.repo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;
import org.sqlite.database.sqlite.SQLiteDatabase;
import org.sqlite.database.sqlite.SQLiteException;

public class FollowUpActivity extends Activity {
    /* access modifiers changed from: private */
    public int A;
    /* access modifiers changed from: private */
    public int B;
    /* access modifiers changed from: private */
    public int C;
    /* access modifiers changed from: private */
    public int D;
    /* access modifiers changed from: private */
    public int E;
    /* access modifiers changed from: private */
    public int F;
    private DatePickerDialog G = null;
    /* access modifiers changed from: private */
    public p H = p.LASTPAYMENT_DATE;
    private DatePickerDialog.OnDateSetListener I = new g();

    /* renamed from: a  reason: collision with root package name */
    private final int f495a = 100;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public MyDB f496b;
    /* access modifiers changed from: private */
    public EditText c;
    /* access modifiers changed from: private */
    public TextView d;
    /* access modifiers changed from: private */
    public EditText e;
    /* access modifiers changed from: private */
    public EditText f;
    /* access modifiers changed from: private */
    public TextView g;
    /* access modifiers changed from: private */
    public ListView h;
    private Button i;
    /* access modifiers changed from: private */
    public TextView j;
    private Button k;
    public int l = 0;
    /* access modifiers changed from: private */
    public int m = 1;
    /* access modifiers changed from: private */
    public int n = 0;
    private String o = BuildConfig.FLAVOR;
    private String p = BuildConfig.FLAVOR;
    private String q = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String r = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String s = BuildConfig.FLAVOR;
    private String t = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String u = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String v = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String w = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String x = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String y = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String z = BuildConfig.FLAVOR;

    class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f497a;

        a(Drawable drawable) {
            this.f497a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (FollowUpActivity.this.c.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((FollowUpActivity.this.c.getWidth() - FollowUpActivity.this.c.getPaddingRight()) - this.f497a.getIntrinsicWidth()))) {
                FollowUpActivity.this.c.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.c.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f499a;

        b(Drawable drawable) {
            this.f499a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            FollowUpActivity.this.c.setCompoundDrawables((Drawable) null, (Drawable) null, FollowUpActivity.this.c.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f499a, (Drawable) null);
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f501a;

        c(Drawable drawable) {
            this.f501a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (FollowUpActivity.this.e.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((FollowUpActivity.this.e.getWidth() - FollowUpActivity.this.e.getPaddingRight()) - this.f501a.getIntrinsicWidth()))) {
                FollowUpActivity.this.e.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f503a;

        d(Drawable drawable) {
            this.f503a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            FollowUpActivity.this.e.setCompoundDrawables((Drawable) null, (Drawable) null, FollowUpActivity.this.e.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f503a, (Drawable) null);
        }
    }

    class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f505a;

        e(Drawable drawable) {
            this.f505a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (FollowUpActivity.this.f.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((FollowUpActivity.this.f.getWidth() - FollowUpActivity.this.f.getPaddingRight()) - this.f505a.getIntrinsicWidth()))) {
                FollowUpActivity.this.f.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.f.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class f implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f507a;

        f(Drawable drawable) {
            this.f507a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            FollowUpActivity.this.f.setCompoundDrawables((Drawable) null, (Drawable) null, FollowUpActivity.this.f.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f507a, (Drawable) null);
        }
    }

    class g implements DatePickerDialog.OnDateSetListener {
        g() {
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (p.LASTPAYMENT_DATE == FollowUpActivity.this.H) {
                int unused = FollowUpActivity.this.A = i;
                int unused2 = FollowUpActivity.this.B = i2;
                int unused3 = FollowUpActivity.this.C = i3;
                FollowUpActivity.this.U();
                return;
            }
            int unused4 = FollowUpActivity.this.D = i;
            int unused5 = FollowUpActivity.this.E = i2;
            int unused6 = FollowUpActivity.this.F = i3;
            FollowUpActivity.this.T();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            FollowUpActivity followUpActivity = FollowUpActivity.this;
            int i = followUpActivity.l;
            followUpActivity.c(Integer.valueOf(i > 0 ? i - 1 : 0));
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        public void onClick(View view) {
            FollowUpActivity followUpActivity;
            int i;
            FollowUpActivity followUpActivity2 = FollowUpActivity.this;
            int i2 = followUpActivity2.l + 1;
            followUpActivity2.l = i2;
            if (i2 >= followUpActivity2.m) {
                followUpActivity = FollowUpActivity.this;
                i = followUpActivity.l - 1;
                followUpActivity.l = i;
            } else {
                followUpActivity = FollowUpActivity.this;
                i = followUpActivity.l;
            }
            followUpActivity.c(Integer.valueOf(i));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            FollowUpActivity.this.f496b.a();
            FollowUpActivity.this.finish();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f513a;

        k(EditText editText) {
            this.f513a = editText;
        }

        public void onClick(View view) {
            FollowUpActivity followUpActivity;
            String str;
            String unused = FollowUpActivity.this.r = this.f513a.getText().toString().toUpperCase().trim();
            if (FollowUpActivity.this.r.equals(BuildConfig.FLAVOR)) {
                if (true == FollowUpActivity.this.f496b.d.booleanValue()) {
                    followUpActivity = FollowUpActivity.this;
                    str = "Please keyin the PlateNo.";
                } else {
                    followUpActivity = FollowUpActivity.this;
                    str = "Sila masukkan PlateNo.";
                }
                r.v(followUpActivity, str, 1);
                this.f513a.requestFocus();
                return;
            }
            FollowUpActivity followUpActivity2 = FollowUpActivity.this;
            String unused2 = followUpActivity2.v = followUpActivity2.c.getText().toString().toUpperCase().trim();
            FollowUpActivity followUpActivity3 = FollowUpActivity.this;
            String unused3 = followUpActivity3.s = followUpActivity3.d.getText().toString().toUpperCase().trim();
            FollowUpActivity followUpActivity4 = FollowUpActivity.this;
            String unused4 = followUpActivity4.u = followUpActivity4.e.getText().toString().toUpperCase().trim();
            FollowUpActivity followUpActivity5 = FollowUpActivity.this;
            String unused5 = followUpActivity5.w = followUpActivity5.f.getText().toString().toUpperCase().trim();
            FollowUpActivity followUpActivity6 = FollowUpActivity.this;
            String unused6 = followUpActivity6.y = r.r(followUpActivity6.g.getText().toString().toUpperCase().trim());
            if (true == r.s(FollowUpActivity.this.y)) {
                String unused7 = FollowUpActivity.this.y = "NULL";
            }
            if (true == FollowUpActivity.this.f496b.r(FollowUpActivity.this.r).booleanValue()) {
                FollowUpActivity.this.f496b.v(FollowUpActivity.this.r, FollowUpActivity.this.v, FollowUpActivity.this.s, FollowUpActivity.this.u, FollowUpActivity.this.w, FollowUpActivity.this.y);
            } else {
                FollowUpActivity.this.f496b.n(FollowUpActivity.this.r, FollowUpActivity.this.v, FollowUpActivity.this.s, FollowUpActivity.this.u, FollowUpActivity.this.w, FollowUpActivity.this.y);
            }
            FollowUpActivity.this.f496b.u("CLF", "0");
            this.f513a.setText(BuildConfig.FLAVOR);
            FollowUpActivity.this.c.setText(BuildConfig.FLAVOR);
            FollowUpActivity.this.d.setText(BuildConfig.FLAVOR);
            FollowUpActivity.this.e.setText(BuildConfig.FLAVOR);
            FollowUpActivity.this.f.setText(BuildConfig.FLAVOR);
            FollowUpActivity.this.g.setText(BuildConfig.FLAVOR);
            FollowUpActivity.this.c(0);
        }
    }

    class l implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f516b;

        l(Drawable drawable, Drawable drawable2) {
            this.f515a = drawable;
            this.f516b = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (FollowUpActivity.this.d.getCompoundDrawables()[2] == null || FollowUpActivity.this.d.getCompoundDrawables()[0] == null || motionEvent.getAction() != 0) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((FollowUpActivity.this.d.getWidth() - FollowUpActivity.this.d.getPaddingRight()) - this.f515a.getIntrinsicWidth()))) {
                p unused = FollowUpActivity.this.H = p.LASTPAYMENT_DATE;
                FollowUpActivity.this.S();
                FollowUpActivity.this.showDialog(0);
                FollowUpActivity.this.d.setCompoundDrawables(this.f516b, (Drawable) null, this.f515a, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (FollowUpActivity.this.d.getPaddingLeft() + this.f516b.getIntrinsicWidth()))) {
                FollowUpActivity.this.d.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.d.setCompoundDrawables(this.f516b, (Drawable) null, this.f515a, (Drawable) null);
            }
            return false;
        }
    }

    class m implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f518b;

        m(Drawable drawable, Drawable drawable2) {
            this.f517a = drawable;
            this.f518b = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (FollowUpActivity.this.g.getCompoundDrawables()[2] == null || FollowUpActivity.this.d.getCompoundDrawables()[0] == null || motionEvent.getAction() != 0) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((FollowUpActivity.this.g.getWidth() - FollowUpActivity.this.g.getPaddingRight()) - this.f517a.getIntrinsicWidth()))) {
                p unused = FollowUpActivity.this.H = p.FOLLOWUP_DATE;
                FollowUpActivity.this.R();
                FollowUpActivity.this.showDialog(0);
                FollowUpActivity.this.g.setCompoundDrawables(this.f518b, (Drawable) null, this.f517a, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (FollowUpActivity.this.d.getPaddingLeft() + this.f518b.getIntrinsicWidth()))) {
                FollowUpActivity.this.g.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.g.setCompoundDrawables(this.f518b, (Drawable) null, this.f517a, (Drawable) null);
            }
            return false;
        }
    }

    class n implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f520b;
        final /* synthetic */ Drawable c;

        n(EditText editText, Drawable drawable, Drawable drawable2) {
            this.f519a = editText;
            this.f520b = drawable;
            this.c = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f519a.getCompoundDrawables()[2] == null || motionEvent.getAction() != 1) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((this.f519a.getWidth() - this.f519a.getPaddingRight()) - this.f520b.getIntrinsicWidth()))) {
                this.f519a.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.c.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.d.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.e.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.f.setText(BuildConfig.FLAVOR);
                FollowUpActivity.this.g.setText(BuildConfig.FLAVOR);
                this.f519a.setCompoundDrawables(this.c, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (this.f519a.getPaddingLeft() + this.c.getIntrinsicWidth()))) {
                FollowUpActivity.this.b(this.f519a.getText().toString().toUpperCase().trim());
                this.f519a.setCompoundDrawables(this.c, (Drawable) null, this.f520b, (Drawable) null);
            }
            return false;
        }
    }

    class o implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f522b;
        final /* synthetic */ Drawable c;

        o(Drawable drawable, EditText editText, Drawable drawable2) {
            this.f521a = drawable;
            this.f522b = editText;
            this.c = drawable2;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f522b.setCompoundDrawables(this.c, (Drawable) null, this.f522b.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f521a, (Drawable) null);
        }
    }

    private enum p {
        LASTPAYMENT_DATE,
        FOLLOWUP_DATE
    }

    private class q extends AsyncTask<String, String, m> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f525a;

        private q() {
            this.f525a = new ProgressDialog(FollowUpActivity.this);
        }

        /* synthetic */ q(FollowUpActivity followUpActivity, g gVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public m doInBackground(String... strArr) {
            String str = strArr[0];
            m mVar = null;
            try {
                Cursor rawQuery = FollowUpActivity.this.f496b.R.rawQuery("SELECT COUNT(*) FROM VLS WHERE C7 <> 'NULL' AND C7 <= DATE('NOW')", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.getCount() == 0) {
                        int unused = FollowUpActivity.this.n = 0;
                    } else {
                        if (rawQuery.moveToFirst()) {
                            int unused2 = FollowUpActivity.this.n = rawQuery.getInt(0);
                        }
                        FollowUpActivity followUpActivity = FollowUpActivity.this;
                        int unused3 = followUpActivity.m = ((followUpActivity.n + 100) - 1) / 100;
                        if (FollowUpActivity.this.m < 1) {
                            int unused4 = FollowUpActivity.this.m = 1;
                        }
                    }
                }
                if (rawQuery != null && !rawQuery.isClosed()) {
                    rawQuery.close();
                }
                if (true == FollowUpActivity.this.f496b.d.booleanValue()) {
                    publishProgress(new String[]{"Please wait...."});
                } else {
                    publishProgress(new String[]{"Sila tunggu...."});
                }
                ArrayList arrayList = new ArrayList();
                Cursor rawQuery2 = FollowUpActivity.this.f496b.R.rawQuery(str, (String[]) null);
                if (rawQuery2 != null) {
                    if (rawQuery2.getCount() != 0) {
                        if (rawQuery2.moveToFirst()) {
                            int columnIndex = rawQuery2.getColumnIndex("C1");
                            int columnIndex2 = rawQuery2.getColumnIndex("C2");
                            int columnIndex3 = rawQuery2.getColumnIndex("C3");
                            int columnIndex4 = rawQuery2.getColumnIndex("C4");
                            int columnIndex5 = rawQuery2.getColumnIndex("C5");
                            int columnIndex6 = rawQuery2.getColumnIndex("C6");
                            int columnIndex7 = rawQuery2.getColumnIndex("C7");
                            int columnIndex8 = rawQuery2.getColumnIndex("rowid");
                            do {
                                try {
                                    FollowUpActivity followUpActivity2 = FollowUpActivity.this;
                                    String unused5 = followUpActivity2.r = followUpActivity2.f496b.U.g(rawQuery2.getString(columnIndex));
                                    FollowUpActivity followUpActivity3 = FollowUpActivity.this;
                                    String unused6 = followUpActivity3.v = followUpActivity3.f496b.U.g(rawQuery2.getString(columnIndex2));
                                    FollowUpActivity followUpActivity4 = FollowUpActivity.this;
                                    String unused7 = followUpActivity4.s = followUpActivity4.f496b.U.g(rawQuery2.getString(columnIndex3));
                                    FollowUpActivity followUpActivity5 = FollowUpActivity.this;
                                    String unused8 = followUpActivity5.u = followUpActivity5.f496b.U.g(rawQuery2.getString(columnIndex4));
                                    FollowUpActivity followUpActivity6 = FollowUpActivity.this;
                                    String unused9 = followUpActivity6.w = followUpActivity6.f496b.U.g(rawQuery2.getString(columnIndex5));
                                    String unused10 = FollowUpActivity.this.x = rawQuery2.getString(columnIndex6);
                                    String unused11 = FollowUpActivity.this.y = r.l(rawQuery2.getString(columnIndex7));
                                    String unused12 = FollowUpActivity.this.z = rawQuery2.getString(columnIndex8);
                                    arrayList.add(new q(FollowUpActivity.this.z, FollowUpActivity.this.r, FollowUpActivity.this.v, FollowUpActivity.this.s, FollowUpActivity.this.u, FollowUpActivity.this.w, FollowUpActivity.this.x, FollowUpActivity.this.y));
                                } catch (IOException e) {
                                    Log.e("GetLastRemarkDataFromDB", "Error : GetLastRemarkDataFromDB : " + e.getMessage());
                                }
                            } while (rawQuery2.moveToNext());
                            FollowUpActivity followUpActivity7 = FollowUpActivity.this;
                            mVar = new m(followUpActivity7, arrayList, followUpActivity7);
                        }
                    }
                }
                if (rawQuery2 != null && !rawQuery2.isClosed()) {
                    rawQuery2.close();
                }
            } catch (SQLiteException e2) {
                Log.e("GetLastRemarkDataFromDB", "Could not read the VLS-LR table. Error:" + e2.getMessage());
            }
            return mVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(m mVar) {
            if (this.f525a.isShowing()) {
                this.f525a.dismiss();
            }
            FollowUpActivity.this.h.setAdapter(mVar);
            TextView I = FollowUpActivity.this.j;
            I.setText(Integer.toString((FollowUpActivity.this.l * 100) + 1) + " to " + Integer.toString((FollowUpActivity.this.l + 1) * 100) + " of " + Integer.toString(FollowUpActivity.this.n));
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f525a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == FollowUpActivity.this.f496b.d.booleanValue()) {
                progressDialog = this.f525a;
                str = "Please wait..";
            } else {
                progressDialog = this.f525a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f525a.setCancelable(false);
            this.f525a.show();
        }
    }

    /* access modifiers changed from: private */
    public void R() {
        String upperCase = this.g.getText().toString().toUpperCase();
        if (!upperCase.equals(BuildConfig.FLAVOR)) {
            try {
                Date parse = new SimpleDateFormat("dd MMM yyyy").parse(upperCase);
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                this.D = instance.get(1);
                this.E = instance.get(2);
                int i2 = instance.get(5);
                this.F = i2;
                DatePickerDialog datePickerDialog = this.G;
                if (datePickerDialog != null) {
                    datePickerDialog.updateDate(this.D, this.E, i2);
                    this.G.setTitle("FollowUp Date");
                }
            } catch (ParseException e2) {
                Log.e("parseFollowUpDate", "Error : parseFollowUpDate : " + e2.getMessage());
            }
        } else {
            DatePickerDialog datePickerDialog2 = this.G;
            if (datePickerDialog2 != null) {
                datePickerDialog2.setTitle("FollowUp Date");
            }
        }
    }

    /* access modifiers changed from: private */
    public void S() {
        String upperCase = this.d.getText().toString().toUpperCase();
        if (!upperCase.equals(BuildConfig.FLAVOR)) {
            try {
                Date parse = new SimpleDateFormat("dd MMM yyyy").parse(upperCase);
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                this.A = instance.get(1);
                this.B = instance.get(2);
                int i2 = instance.get(5);
                this.C = i2;
                DatePickerDialog datePickerDialog = this.G;
                if (datePickerDialog != null) {
                    datePickerDialog.updateDate(this.A, this.B, i2);
                    this.G.setTitle("LastPayment Date");
                }
            } catch (ParseException e2) {
                Log.e("parseLastPaymentDate", "Error : parseLastPaymentDate : " + e2.getMessage());
            }
        } else {
            DatePickerDialog datePickerDialog2 = this.G;
            if (datePickerDialog2 != null) {
                datePickerDialog2.setTitle("LastPayment Date");
            }
        }
    }

    /* access modifiers changed from: private */
    public void T() {
        String str = Integer.toString(this.E + 1) + "/" + Integer.toString(this.F) + "/" + Integer.toString(this.D);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            this.g.setText(simpleDateFormat2.format(parse).toUpperCase());
            this.q = simpleDateFormat3.format(parse).toUpperCase();
        } catch (ParseException e2) {
            Log.e("updateFollowUpDate", "Error : updateFollowUpDate : " + e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void U() {
        String str = Integer.toString(this.B + 1) + "/" + Integer.toString(this.C) + "/" + Integer.toString(this.A);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            this.d.setText(simpleDateFormat2.format(parse).toUpperCase());
            this.p = simpleDateFormat3.format(parse).toUpperCase();
        } catch (ParseException e2) {
            Log.e("updateLastPaymentDate", "Error : updateLastPaymentDate : " + e2.getMessage());
        }
    }

    private String a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return new SimpleDateFormat("dd MMM yyyy").format(simpleDateFormat.parse(str)).toUpperCase();
        } catch (ParseException e2) {
            Log.e("GetFollowUpDateFormFmt", "Error : GetFollowUpDateFormFmt : " + e2.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public void b(String str) {
        this.f496b.q(Boolean.FALSE);
        SQLiteDatabase sQLiteDatabase = this.f496b.R;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM VLS WHERE C1 = '" + this.f496b.U.h(str) + "'", (String[]) null);
        if (rawQuery != null && rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
            try {
                this.c.setText(this.f496b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C2"))));
                this.d.setText(this.f496b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C3"))));
                this.e.setText(this.f496b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C4"))));
                this.f.setText(this.f496b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C5"))));
                this.g.setText(a(r.l(rawQuery.getString(rawQuery.getColumnIndex("C7")))));
            } catch (IOException e2) {
                Log.e("GetLastRmkPlateNoDtls", "Error : GetLastRmkPlateNoDtls : " + e2.getMessage());
            }
        }
        if (rawQuery != null && !rawQuery.isClosed()) {
            rawQuery.close();
        }
    }

    public void c(Integer num) {
        String str;
        this.l = num.intValue();
        this.f496b.q(Boolean.FALSE);
        if (this.l > 0) {
            str = "SELECT *, rowid FROM VLS WHERE C7 <> 'NULL' AND C7 <= DATE('NOW') ORDER BY C7 ASC LIMIT 100 OFFSET " + Integer.toString(this.l * 100);
        } else {
            str = "SELECT *, rowid FROM VLS WHERE C7 <> 'NULL' AND C7 <= DATE('NOW') ORDER BY C7 ASC LIMIT 100";
        }
        this.o = str;
        new q(this, (g) null).execute(new String[]{this.o});
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.followup);
        this.f496b = (MyDB) getApplicationContext();
        setTitle("FollowUp");
        Button button = (Button) findViewById(R.id.btnCancelAllFollowUp);
        EditText editText = (EditText) findViewById(R.id.txtPlateNo);
        TextView textView = (TextView) findViewById(R.id.lblArrearNo);
        this.c = (EditText) findViewById(R.id.txtArrearNo);
        this.d = (TextView) findViewById(R.id.lblLastPaymentDate);
        this.e = (EditText) findViewById(R.id.txtFinancier);
        this.f = (EditText) findViewById(R.id.txtRemark);
        this.g = (TextView) findViewById(R.id.lblFollowUpDate);
        Button button2 = (Button) findViewById(R.id.btnSave);
        Button button3 = (Button) findViewById(R.id.btnClear);
        ListView listView = (ListView) findViewById(R.id.lstFollowUp);
        this.h = listView;
        listView.setClickable(true);
        if (true == this.f496b.d.booleanValue()) {
            button.setText("Cancel All FollowUp");
            str = "Arrear";
        } else {
            button.setText("Cancel Semua FollowUp");
            str = "Bulan";
        }
        textView.setText(str);
        this.j = (TextView) findViewById(R.id.lblPageCount);
        Button button4 = (Button) findViewById(R.id.btnPageDown);
        this.i = button4;
        button4.setOnClickListener(new h());
        Button button5 = (Button) findViewById(R.id.btnPageUp);
        this.k = button5;
        button5.setOnClickListener(new i());
        button.setOnClickListener(new j());
        button2.setOnClickListener(new k(editText));
        Calendar instance = Calendar.getInstance();
        this.A = instance.get(1);
        this.B = instance.get(2);
        this.C = instance.get(5);
        this.D = instance.get(1);
        this.E = instance.get(2);
        this.F = instance.get(5);
        this.d.setText(BuildConfig.FLAVOR);
        this.g.setText(BuildConfig.FLAVOR);
        Drawable drawable = getResources().getDrawable(R.drawable.calendar_icon);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Drawable drawable2 = getResources().getDrawable(R.drawable.presence_offline);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.d.setCompoundDrawables(drawable2, (Drawable) null, drawable, (Drawable) null);
        this.d.setOnTouchListener(new l(drawable, drawable2));
        this.g.setCompoundDrawables(drawable2, (Drawable) null, drawable, (Drawable) null);
        this.g.setOnTouchListener(new m(drawable, drawable2));
        Drawable drawable3 = getResources().getDrawable(R.drawable.presence_offline);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        Drawable drawable4 = getResources().getDrawable(R.drawable.find);
        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), drawable4.getIntrinsicHeight());
        editText.setCompoundDrawables(drawable4, (Drawable) null, (Drawable) null, (Drawable) null);
        editText.setOnTouchListener(new n(editText, drawable3, drawable4));
        editText.addTextChangedListener(new o(drawable3, editText, drawable4));
        this.c.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.c.setOnTouchListener(new a(drawable3));
        this.c.addTextChangedListener(new b(drawable3));
        this.e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.e.setOnTouchListener(new c(drawable3));
        this.e.addTextChangedListener(new d(drawable3));
        this.f.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f.setOnTouchListener(new e(drawable3));
        this.f.addTextChangedListener(new f(drawable3));
        c(0);
        button2.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i2) {
        DatePickerDialog datePickerDialog;
        String str;
        if (i2 != 0) {
            return null;
        }
        if (p.LASTPAYMENT_DATE == this.H) {
            datePickerDialog = new DatePickerDialog(this, this.I, this.A, this.B, this.C);
            this.G = datePickerDialog;
            str = "LastPayment Date";
        } else {
            datePickerDialog = new DatePickerDialog(this, this.I, this.D, this.E, this.F);
            this.G = datePickerDialog;
            str = "FollowUp Date";
        }
        datePickerDialog.setTitle(str);
        return this.G;
    }
}
