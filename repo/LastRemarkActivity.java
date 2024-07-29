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

public class LastRemarkActivity extends Activity {
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
    private final int f544a = 100;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public MyDB f545b;
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
        final /* synthetic */ Drawable f546a;

        a(Drawable drawable) {
            this.f546a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (LastRemarkActivity.this.c.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((LastRemarkActivity.this.c.getWidth() - LastRemarkActivity.this.c.getPaddingRight()) - this.f546a.getIntrinsicWidth()))) {
                LastRemarkActivity.this.c.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.c.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f548a;

        b(Drawable drawable) {
            this.f548a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LastRemarkActivity.this.c.setCompoundDrawables((Drawable) null, (Drawable) null, LastRemarkActivity.this.c.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f548a, (Drawable) null);
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f550a;

        c(Drawable drawable) {
            this.f550a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (LastRemarkActivity.this.e.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((LastRemarkActivity.this.e.getWidth() - LastRemarkActivity.this.e.getPaddingRight()) - this.f550a.getIntrinsicWidth()))) {
                LastRemarkActivity.this.e.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f552a;

        d(Drawable drawable) {
            this.f552a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LastRemarkActivity.this.e.setCompoundDrawables((Drawable) null, (Drawable) null, LastRemarkActivity.this.e.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f552a, (Drawable) null);
        }
    }

    class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f554a;

        e(Drawable drawable) {
            this.f554a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (LastRemarkActivity.this.f.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((LastRemarkActivity.this.f.getWidth() - LastRemarkActivity.this.f.getPaddingRight()) - this.f554a.getIntrinsicWidth()))) {
                LastRemarkActivity.this.f.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.f.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class f implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f556a;

        f(Drawable drawable) {
            this.f556a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            LastRemarkActivity.this.f.setCompoundDrawables((Drawable) null, (Drawable) null, LastRemarkActivity.this.f.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f556a, (Drawable) null);
        }
    }

    class g implements DatePickerDialog.OnDateSetListener {
        g() {
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (p.LASTPAYMENT_DATE == LastRemarkActivity.this.H) {
                int unused = LastRemarkActivity.this.A = i;
                int unused2 = LastRemarkActivity.this.B = i2;
                int unused3 = LastRemarkActivity.this.C = i3;
                LastRemarkActivity.this.U();
                return;
            }
            int unused4 = LastRemarkActivity.this.D = i;
            int unused5 = LastRemarkActivity.this.E = i2;
            int unused6 = LastRemarkActivity.this.F = i3;
            LastRemarkActivity.this.T();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            LastRemarkActivity lastRemarkActivity = LastRemarkActivity.this;
            int i = lastRemarkActivity.l;
            lastRemarkActivity.c(Integer.valueOf(i > 0 ? i - 1 : 0));
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        public void onClick(View view) {
            LastRemarkActivity lastRemarkActivity;
            int i;
            LastRemarkActivity lastRemarkActivity2 = LastRemarkActivity.this;
            int i2 = lastRemarkActivity2.l + 1;
            lastRemarkActivity2.l = i2;
            if (i2 >= lastRemarkActivity2.m) {
                lastRemarkActivity = LastRemarkActivity.this;
                i = lastRemarkActivity.l - 1;
                lastRemarkActivity.l = i;
            } else {
                lastRemarkActivity = LastRemarkActivity.this;
                i = lastRemarkActivity.l;
            }
            lastRemarkActivity.c(Integer.valueOf(i));
        }
    }

    class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f561a;

        j(EditText editText) {
            this.f561a = editText;
        }

        public void onClick(View view) {
            LastRemarkActivity lastRemarkActivity;
            String str;
            String unused = LastRemarkActivity.this.r = this.f561a.getText().toString().toUpperCase().trim();
            if (LastRemarkActivity.this.r.equals(BuildConfig.FLAVOR)) {
                if (true == LastRemarkActivity.this.f545b.d.booleanValue()) {
                    lastRemarkActivity = LastRemarkActivity.this;
                    str = "Please keyin the PlateNo.";
                } else {
                    lastRemarkActivity = LastRemarkActivity.this;
                    str = "Sila masukkan PlateNo.";
                }
                r.v(lastRemarkActivity, str, 1);
                this.f561a.requestFocus();
                return;
            }
            LastRemarkActivity lastRemarkActivity2 = LastRemarkActivity.this;
            String unused2 = lastRemarkActivity2.v = lastRemarkActivity2.c.getText().toString().toUpperCase().trim();
            LastRemarkActivity lastRemarkActivity3 = LastRemarkActivity.this;
            String unused3 = lastRemarkActivity3.s = lastRemarkActivity3.d.getText().toString().toUpperCase().trim();
            LastRemarkActivity lastRemarkActivity4 = LastRemarkActivity.this;
            String unused4 = lastRemarkActivity4.u = lastRemarkActivity4.e.getText().toString().toUpperCase().trim();
            LastRemarkActivity lastRemarkActivity5 = LastRemarkActivity.this;
            String unused5 = lastRemarkActivity5.w = lastRemarkActivity5.f.getText().toString().toUpperCase().trim();
            LastRemarkActivity lastRemarkActivity6 = LastRemarkActivity.this;
            String unused6 = lastRemarkActivity6.y = r.r(lastRemarkActivity6.g.getText().toString().toUpperCase().trim());
            if (true == r.s(LastRemarkActivity.this.y)) {
                String unused7 = LastRemarkActivity.this.y = "NULL";
            }
            if (true == LastRemarkActivity.this.f545b.r(LastRemarkActivity.this.r).booleanValue()) {
                LastRemarkActivity.this.f545b.v(LastRemarkActivity.this.r, LastRemarkActivity.this.v, LastRemarkActivity.this.s, LastRemarkActivity.this.u, LastRemarkActivity.this.w, LastRemarkActivity.this.y);
            } else {
                LastRemarkActivity.this.f545b.n(LastRemarkActivity.this.r, LastRemarkActivity.this.v, LastRemarkActivity.this.s, LastRemarkActivity.this.u, LastRemarkActivity.this.w, LastRemarkActivity.this.y);
            }
            LastRemarkActivity.this.f545b.u("CLF", "0");
            this.f561a.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.c.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.d.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.e.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.f.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.g.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.c(0);
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f563a;

        k(EditText editText) {
            this.f563a = editText;
        }

        public void onClick(View view) {
            this.f563a.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.c.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.d.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.e.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.f.setText(BuildConfig.FLAVOR);
            LastRemarkActivity.this.g.setText(BuildConfig.FLAVOR);
        }
    }

    class l implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f566b;

        l(Drawable drawable, Drawable drawable2) {
            this.f565a = drawable;
            this.f566b = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (LastRemarkActivity.this.d.getCompoundDrawables()[2] == null || LastRemarkActivity.this.d.getCompoundDrawables()[0] == null || motionEvent.getAction() != 0) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((LastRemarkActivity.this.d.getWidth() - LastRemarkActivity.this.d.getPaddingRight()) - this.f565a.getIntrinsicWidth()))) {
                p unused = LastRemarkActivity.this.H = p.LASTPAYMENT_DATE;
                LastRemarkActivity.this.S();
                LastRemarkActivity.this.showDialog(0);
                LastRemarkActivity.this.d.setCompoundDrawables(this.f566b, (Drawable) null, this.f565a, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (LastRemarkActivity.this.d.getPaddingLeft() + this.f566b.getIntrinsicWidth()))) {
                LastRemarkActivity.this.d.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.d.setCompoundDrawables(this.f566b, (Drawable) null, this.f565a, (Drawable) null);
            }
            return false;
        }
    }

    class m implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f568b;

        m(Drawable drawable, Drawable drawable2) {
            this.f567a = drawable;
            this.f568b = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (LastRemarkActivity.this.g.getCompoundDrawables()[2] == null || LastRemarkActivity.this.d.getCompoundDrawables()[0] == null || motionEvent.getAction() != 0) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((LastRemarkActivity.this.g.getWidth() - LastRemarkActivity.this.g.getPaddingRight()) - this.f567a.getIntrinsicWidth()))) {
                p unused = LastRemarkActivity.this.H = p.FOLLOWUP_DATE;
                LastRemarkActivity.this.R();
                LastRemarkActivity.this.showDialog(0);
                LastRemarkActivity.this.g.setCompoundDrawables(this.f568b, (Drawable) null, this.f567a, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (LastRemarkActivity.this.d.getPaddingLeft() + this.f568b.getIntrinsicWidth()))) {
                LastRemarkActivity.this.g.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.g.setCompoundDrawables(this.f568b, (Drawable) null, this.f567a, (Drawable) null);
            }
            return false;
        }
    }

    class n implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f570b;
        final /* synthetic */ Drawable c;

        n(EditText editText, Drawable drawable, Drawable drawable2) {
            this.f569a = editText;
            this.f570b = drawable;
            this.c = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f569a.getCompoundDrawables()[2] == null || motionEvent.getAction() != 1) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((this.f569a.getWidth() - this.f569a.getPaddingRight()) - this.f570b.getIntrinsicWidth()))) {
                this.f569a.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.c.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.d.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.e.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.f.setText(BuildConfig.FLAVOR);
                LastRemarkActivity.this.g.setText(BuildConfig.FLAVOR);
                this.f569a.setCompoundDrawables(this.c, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (this.f569a.getPaddingLeft() + this.c.getIntrinsicWidth()))) {
                LastRemarkActivity.this.b(this.f569a.getText().toString().toUpperCase().trim());
                this.f569a.setCompoundDrawables(this.c, (Drawable) null, this.f570b, (Drawable) null);
            }
            return false;
        }
    }

    class o implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f571a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f572b;
        final /* synthetic */ Drawable c;

        o(Drawable drawable, EditText editText, Drawable drawable2) {
            this.f571a = drawable;
            this.f572b = editText;
            this.c = drawable2;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f572b.setCompoundDrawables(this.c, (Drawable) null, this.f572b.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f571a, (Drawable) null);
        }
    }

    private enum p {
        LASTPAYMENT_DATE,
        FOLLOWUP_DATE
    }

    private class q extends AsyncTask<String, String, p> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f575a;

        private q() {
            this.f575a = new ProgressDialog(LastRemarkActivity.this);
        }

        /* synthetic */ q(LastRemarkActivity lastRemarkActivity, g gVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public p doInBackground(String... strArr) {
            String str = strArr[0];
            p pVar = null;
            try {
                Cursor rawQuery = LastRemarkActivity.this.f545b.R.rawQuery("SELECT COUNT(*) FROM VLS", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.getCount() == 0) {
                        int unused = LastRemarkActivity.this.n = 0;
                    } else {
                        if (rawQuery.moveToFirst()) {
                            int unused2 = LastRemarkActivity.this.n = rawQuery.getInt(0);
                        }
                        LastRemarkActivity lastRemarkActivity = LastRemarkActivity.this;
                        int unused3 = lastRemarkActivity.m = ((lastRemarkActivity.n + 100) - 1) / 100;
                        if (LastRemarkActivity.this.m < 1) {
                            int unused4 = LastRemarkActivity.this.m = 1;
                        }
                    }
                }
                if (rawQuery != null && !rawQuery.isClosed()) {
                    rawQuery.close();
                }
                if (true == LastRemarkActivity.this.f545b.d.booleanValue()) {
                    publishProgress(new String[]{"Please wait...."});
                } else {
                    publishProgress(new String[]{"Sila tunggu...."});
                }
                ArrayList arrayList = new ArrayList();
                Cursor rawQuery2 = LastRemarkActivity.this.f545b.R.rawQuery(str, (String[]) null);
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
                                    LastRemarkActivity lastRemarkActivity2 = LastRemarkActivity.this;
                                    String unused5 = lastRemarkActivity2.r = lastRemarkActivity2.f545b.U.g(rawQuery2.getString(columnIndex));
                                    LastRemarkActivity lastRemarkActivity3 = LastRemarkActivity.this;
                                    String unused6 = lastRemarkActivity3.v = lastRemarkActivity3.f545b.U.g(rawQuery2.getString(columnIndex2));
                                    LastRemarkActivity lastRemarkActivity4 = LastRemarkActivity.this;
                                    String unused7 = lastRemarkActivity4.s = lastRemarkActivity4.f545b.U.g(rawQuery2.getString(columnIndex3));
                                    LastRemarkActivity lastRemarkActivity5 = LastRemarkActivity.this;
                                    String unused8 = lastRemarkActivity5.u = lastRemarkActivity5.f545b.U.g(rawQuery2.getString(columnIndex4));
                                    LastRemarkActivity lastRemarkActivity6 = LastRemarkActivity.this;
                                    String unused9 = lastRemarkActivity6.w = lastRemarkActivity6.f545b.U.g(rawQuery2.getString(columnIndex5));
                                    String unused10 = LastRemarkActivity.this.x = rawQuery2.getString(columnIndex6);
                                    String unused11 = LastRemarkActivity.this.y = r.l(rawQuery2.getString(columnIndex7));
                                    String unused12 = LastRemarkActivity.this.z = rawQuery2.getString(columnIndex8);
                                    arrayList.add(new q(LastRemarkActivity.this.z, LastRemarkActivity.this.r, LastRemarkActivity.this.v, LastRemarkActivity.this.s, LastRemarkActivity.this.u, LastRemarkActivity.this.w, LastRemarkActivity.this.x, LastRemarkActivity.this.y));
                                } catch (IOException e) {
                                    Log.e("GetLastRmkDataFromDB", "Error : GetLastRmkDataFromDB : " + e.getMessage());
                                }
                            } while (rawQuery2.moveToNext());
                            LastRemarkActivity lastRemarkActivity7 = LastRemarkActivity.this;
                            pVar = new p(lastRemarkActivity7, arrayList, lastRemarkActivity7);
                        }
                    }
                }
                if (rawQuery2 != null && !rawQuery2.isClosed()) {
                    rawQuery2.close();
                }
            } catch (SQLiteException e2) {
                Log.e("GetLastRmkDataFromDB", "Could not read the VLS-LR table. Error:" + e2.getMessage());
            }
            return pVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(p pVar) {
            if (this.f575a.isShowing()) {
                this.f575a.dismiss();
            }
            LastRemarkActivity.this.h.setAdapter(pVar);
            TextView I = LastRemarkActivity.this.j;
            I.setText(Integer.toString((LastRemarkActivity.this.l * 100) + 1) + " to " + Integer.toString((LastRemarkActivity.this.l + 1) * 100) + " of " + Integer.toString(LastRemarkActivity.this.n));
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f575a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == LastRemarkActivity.this.f545b.d.booleanValue()) {
                progressDialog = this.f575a;
                str = "Please wait..";
            } else {
                progressDialog = this.f575a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f575a.setCancelable(false);
            this.f575a.show();
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
        this.f545b.q(Boolean.FALSE);
        SQLiteDatabase sQLiteDatabase = this.f545b.R;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM VLS WHERE C1 = '" + this.f545b.U.h(str) + "'", (String[]) null);
        if (rawQuery != null && rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
            try {
                this.c.setText(this.f545b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C2"))));
                this.d.setText(this.f545b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C3"))));
                this.e.setText(this.f545b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C4"))));
                this.f.setText(this.f545b.U.g(rawQuery.getString(rawQuery.getColumnIndex("C5"))));
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
        this.f545b.q(Boolean.FALSE);
        if (this.l > 0) {
            str = "SELECT *, rowid FROM VLS ORDER BY C6 DESC LIMIT 100 OFFSET " + Integer.toString(this.l * 100);
        } else {
            str = "SELECT *, rowid FROM VLS ORDER BY C6 DESC LIMIT 100";
        }
        this.o = str;
        new q(this, (g) null).execute(new String[]{this.o});
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lastremark);
        this.f545b = (MyDB) getApplicationContext();
        setTitle("Remark");
        EditText editText = (EditText) findViewById(R.id.txtPlateNo);
        TextView textView = (TextView) findViewById(R.id.lblArrearNo);
        this.c = (EditText) findViewById(R.id.txtArrearNo);
        this.d = (TextView) findViewById(R.id.lblLastPaymentDate);
        this.e = (EditText) findViewById(R.id.txtFinancier);
        this.f = (EditText) findViewById(R.id.txtRemark);
        this.g = (TextView) findViewById(R.id.lblFollowUpDate);
        Button button = (Button) findViewById(R.id.btnSave);
        Button button2 = (Button) findViewById(R.id.btnClear);
        ListView listView = (ListView) findViewById(R.id.lstRemark);
        this.h = listView;
        listView.setClickable(true);
        textView.setText(true == this.f545b.d.booleanValue() ? "Arrear" : "Bulan");
        this.j = (TextView) findViewById(R.id.lblPageCount);
        Button button3 = (Button) findViewById(R.id.btnPageDown);
        this.i = button3;
        button3.setOnClickListener(new h());
        Button button4 = (Button) findViewById(R.id.btnPageUp);
        this.k = button4;
        button4.setOnClickListener(new i());
        button.setOnClickListener(new j(editText));
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
