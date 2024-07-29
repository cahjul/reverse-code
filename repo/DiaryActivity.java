package com.repo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;
import org.sqlite.database.sqlite.SQLiteException;

public class DiaryActivity extends Activity {
    private String A = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String B = BuildConfig.FLAVOR;
    private String C = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public int D = 0;
    /* access modifiers changed from: private */
    public int E = 1;
    /* access modifiers changed from: private */
    public String F = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String G = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String H = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String I = BuildConfig.FLAVOR;
    private String J = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String K = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String L = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public Boolean M = Boolean.FALSE;

    /* renamed from: a  reason: collision with root package name */
    private final int f475a = 100;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public MyDB f476b;
    /* access modifiers changed from: private */
    public Button c;
    /* access modifiers changed from: private */
    public Spinner d;
    /* access modifiers changed from: private */
    public EditText e;
    /* access modifiers changed from: private */
    public String f = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public TextView g;
    /* access modifiers changed from: private */
    public Button h;
    /* access modifiers changed from: private */
    public TextView i;
    /* access modifiers changed from: private */
    public Button j;
    /* access modifiers changed from: private */
    public ListView k;
    private String l = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String m = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public int n = 0;
    /* access modifiers changed from: private */
    public String o = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String p = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String q = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String r = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String s = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String t = BuildConfig.FLAVOR;
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

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Spinner f477a;

        a(Spinner spinner) {
            this.f477a = spinner;
        }

        public void onClick(View view) {
            DiaryActivity diaryActivity;
            String str;
            DiaryActivity diaryActivity2;
            String str2;
            DiaryActivity diaryActivity3;
            String str3;
            try {
                ((InputMethodManager) DiaryActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(DiaryActivity.this.e.getWindowToken(), 0);
                String unused = DiaryActivity.this.G = this.f477a.getSelectedItem().toString().trim();
                DiaryActivity diaryActivity4 = DiaryActivity.this;
                String unused2 = diaryActivity4.H = diaryActivity4.d.getSelectedItem().toString().trim();
                DiaryActivity diaryActivity5 = DiaryActivity.this;
                String unused3 = diaryActivity5.f = diaryActivity5.e.getText().toString().toUpperCase().trim();
                if (DiaryActivity.this.D > 0) {
                    diaryActivity = DiaryActivity.this;
                    str = " ORDER BY RowID DESC LIMIT 100 OFFSET " + Integer.toString(DiaryActivity.this.D * 100);
                } else {
                    diaryActivity = DiaryActivity.this;
                    str = " ORDER BY RowID DESC LIMIT 100";
                }
                String unused4 = diaryActivity.I = str;
                if (!DiaryActivity.this.G.equals("All")) {
                    if (!DiaryActivity.this.G.equals("Semua")) {
                        if (!DiaryActivity.this.G.equals("Found Only [New]")) {
                            if (!DiaryActivity.this.G.equals("Yang Kena Saja [Baru]")) {
                                if (!DiaryActivity.this.G.equals("Found Only")) {
                                    if (!DiaryActivity.this.G.equals("Yang Kena Saja")) {
                                        if (DiaryActivity.this.f.equals(BuildConfig.FLAVOR)) {
                                            if (!DiaryActivity.this.G.equals("Find the Location below") && !DiaryActivity.this.G.equals("Cari Lokasi di bawah") && !DiaryActivity.this.G.equals("Find the Location below [Found]") && !DiaryActivity.this.G.equals("Cari Lokasi di bawah [Kena]") && !DiaryActivity.this.G.equals("Find the Location below [New]")) {
                                                if (!DiaryActivity.this.G.equals("Cari Lokasi di bawah [Baru]")) {
                                                    if (true == DiaryActivity.this.f476b.d.booleanValue()) {
                                                        diaryActivity3 = DiaryActivity.this;
                                                        str3 = "Please key in the Plate No. in the find box first.";
                                                    } else {
                                                        diaryActivity3 = DiaryActivity.this;
                                                        str3 = "Masukkan Plate No. di dalam kotak carian dulu.";
                                                    }
                                                    r.v(diaryActivity3, str3, 0);
                                                    DiaryActivity.this.f476b.p(Boolean.FALSE);
                                                    String unused5 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                                    new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                                                }
                                            }
                                            if (true == DiaryActivity.this.f476b.d.booleanValue()) {
                                                diaryActivity3 = DiaryActivity.this;
                                                str3 = "Please key in the Location in the find box first.";
                                            } else {
                                                diaryActivity3 = DiaryActivity.this;
                                                str3 = "Masukkan Lokasi di dalam kotak carian dulu.";
                                            }
                                            r.v(diaryActivity3, str3, 0);
                                            DiaryActivity.this.f476b.p(Boolean.FALSE);
                                            String unused6 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                            new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                                        }
                                        if (!DiaryActivity.this.G.equals("Find the Location below")) {
                                            if (!DiaryActivity.this.G.equals("Cari Lokasi di bawah")) {
                                                if (!DiaryActivity.this.G.equals("Find the Location below [Found]")) {
                                                    if (!DiaryActivity.this.G.equals("Cari Lokasi di bawah [Kena]")) {
                                                        if (!DiaryActivity.this.G.equals("Find the Location below [New]")) {
                                                            if (!DiaryActivity.this.G.equals("Cari Lokasi di bawah [Baru]")) {
                                                                DiaryActivity diaryActivity6 = DiaryActivity.this;
                                                                String unused7 = diaryActivity6.x = diaryActivity6.f476b.U.h(DiaryActivity.this.f);
                                                                String unused8 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C3 = '" + DiaryActivity.this.x + "'";
                                                                diaryActivity2 = DiaryActivity.this;
                                                                str2 = "SELECT COUNT(*) FROM VLS WHERE C3 = '" + DiaryActivity.this.x + "'";
                                                                String unused9 = diaryActivity2.L = str2;
                                                                DiaryActivity.this.f476b.p(Boolean.FALSE);
                                                                String unused10 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                                                new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                                                            }
                                                        }
                                                        String unused11 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 = 2 AND C8 LIKE '%" + DiaryActivity.this.f + "%'";
                                                        diaryActivity2 = DiaryActivity.this;
                                                        str2 = "SELECT COUNT(*) FROM VLS WHERE C2 = 2 AND C8 LIKE '%" + DiaryActivity.this.f + "%'";
                                                        String unused12 = diaryActivity2.L = str2;
                                                        DiaryActivity.this.f476b.p(Boolean.FALSE);
                                                        String unused13 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                                        new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                                                    }
                                                }
                                                String unused14 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 >= 1 AND C8 LIKE '%" + DiaryActivity.this.f + "%'";
                                                diaryActivity2 = DiaryActivity.this;
                                                str2 = "SELECT COUNT(*) FROM VLS WHERE C2 >= 1 AND C8 LIKE '%" + DiaryActivity.this.f + "%'";
                                                String unused15 = diaryActivity2.L = str2;
                                                DiaryActivity.this.f476b.p(Boolean.FALSE);
                                                String unused16 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                                new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                                            }
                                        }
                                        String unused17 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C8 LIKE '%" + DiaryActivity.this.f + "%'";
                                        diaryActivity2 = DiaryActivity.this;
                                        str2 = "SELECT COUNT(*) FROM VLS WHERE C8 LIKE '%" + DiaryActivity.this.f + "%'";
                                        String unused18 = diaryActivity2.L = str2;
                                        DiaryActivity.this.f476b.p(Boolean.FALSE);
                                        String unused19 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                        new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                                    }
                                }
                                if (!DiaryActivity.this.H.equals("Any type of Financier")) {
                                    if (!DiaryActivity.this.H.equals("Apa-apa jenis Bank")) {
                                        if (DiaryActivity.this.H.contains("-")) {
                                            String unused20 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 > 0 AND C6 = '" + DiaryActivity.this.H + "'";
                                            diaryActivity2 = DiaryActivity.this;
                                            str2 = "SELECT COUNT(*) FROM VLS WHERE C2 > 0 AND C6 = '" + DiaryActivity.this.H + "'";
                                        } else {
                                            char charAt = DiaryActivity.this.H.charAt(DiaryActivity.this.H.length() - 1);
                                            String unused21 = DiaryActivity.this.K = DiaryActivity.this.H.substring(0, DiaryActivity.this.H.length() - 1) + ((char) (String.valueOf(charAt).codePointAt(0) + 1));
                                            String unused22 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 > 0 AND C6 >= '" + DiaryActivity.this.H + "' AND C6 < '" + DiaryActivity.this.K + "'";
                                            diaryActivity2 = DiaryActivity.this;
                                            str2 = "SELECT COUNT(*) FROM VLS WHERE C2 > 0 AND C6 >= '" + DiaryActivity.this.H + "' AND C6 < '" + DiaryActivity.this.K + "'";
                                        }
                                        String unused23 = diaryActivity2.L = str2;
                                        DiaryActivity.this.f476b.p(Boolean.FALSE);
                                        String unused24 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                        new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                                    }
                                }
                                String unused25 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 > 0";
                                diaryActivity2 = DiaryActivity.this;
                                str2 = "SELECT COUNT(*) FROM VLS WHERE C2 > 0";
                                String unused26 = diaryActivity2.L = str2;
                                DiaryActivity.this.f476b.p(Boolean.FALSE);
                                String unused27 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                            }
                        }
                        if (!DiaryActivity.this.H.equals("Any type of Financier")) {
                            if (!DiaryActivity.this.H.equals("Apa-apa jenis Bank")) {
                                if (DiaryActivity.this.H.contains("-")) {
                                    String unused28 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 = 2 AND C6 = '" + DiaryActivity.this.H + "'";
                                    diaryActivity2 = DiaryActivity.this;
                                    str2 = "SELECT COUNT(*) FROM VLS WHERE C2 = 2 AND C6 = '" + DiaryActivity.this.H + "'";
                                } else {
                                    char charAt2 = DiaryActivity.this.H.charAt(DiaryActivity.this.H.length() - 1);
                                    String unused29 = DiaryActivity.this.K = DiaryActivity.this.H.substring(0, DiaryActivity.this.H.length() - 1) + ((char) (String.valueOf(charAt2).codePointAt(0) + 1));
                                    String unused30 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 = 2 AND C6 >= '" + DiaryActivity.this.H + "' AND C6 < '" + DiaryActivity.this.K + "'";
                                    diaryActivity2 = DiaryActivity.this;
                                    str2 = "SELECT COUNT(*) FROM VLS WHERE C2 = 2 AND C6 >= '" + DiaryActivity.this.H + "' AND C6 < '" + DiaryActivity.this.K + "'";
                                }
                                String unused31 = diaryActivity2.L = str2;
                                DiaryActivity.this.f476b.p(Boolean.FALSE);
                                String unused32 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                                new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                            }
                        }
                        String unused33 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C2 = 2";
                        diaryActivity2 = DiaryActivity.this;
                        str2 = "SELECT COUNT(*) FROM VLS WHERE C2 = 2";
                        String unused34 = diaryActivity2.L = str2;
                        DiaryActivity.this.f476b.p(Boolean.FALSE);
                        String unused35 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                        new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                    }
                }
                if (!DiaryActivity.this.H.equals("Any type of Financier")) {
                    if (!DiaryActivity.this.H.equals("Apa-apa jenis Bank")) {
                        if (DiaryActivity.this.H.contains("-")) {
                            String unused36 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C6 = '" + DiaryActivity.this.H + "'";
                            diaryActivity2 = DiaryActivity.this;
                            str2 = "SELECT COUNT(*) FROM VLS WHERE C6 = '" + DiaryActivity.this.H + "'";
                        } else {
                            char charAt3 = DiaryActivity.this.H.charAt(DiaryActivity.this.H.length() - 1);
                            String unused37 = DiaryActivity.this.K = DiaryActivity.this.H.substring(0, DiaryActivity.this.H.length() - 1) + ((char) (String.valueOf(charAt3).codePointAt(0) + 1));
                            String unused38 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS WHERE C6 >= '" + DiaryActivity.this.H + "' AND C6 < '" + DiaryActivity.this.K + "'";
                            diaryActivity2 = DiaryActivity.this;
                            str2 = "SELECT COUNT(*) FROM VLS WHERE C6 >= '" + DiaryActivity.this.H + "' AND C6 < '" + DiaryActivity.this.K + "'";
                        }
                        String unused39 = diaryActivity2.L = str2;
                        DiaryActivity.this.f476b.p(Boolean.FALSE);
                        String unused40 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                        new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
                    }
                }
                String unused41 = DiaryActivity.this.F = "SELECT *, rowid FROM VLS";
                diaryActivity2 = DiaryActivity.this;
                str2 = "SELECT COUNT(*) FROM VLS";
                String unused42 = diaryActivity2.L = str2;
                DiaryActivity.this.f476b.p(Boolean.FALSE);
                String unused43 = DiaryActivity.this.F = DiaryActivity.this.F + DiaryActivity.this.I;
                new k(DiaryActivity.this, (b) null).execute(new String[]{DiaryActivity.this.F, DiaryActivity.this.L});
            } catch (Exception e) {
                Log.e("onCreate", "Error:" + e.getMessage());
            }
        }
    }

    class b implements View.OnFocusChangeListener {
        b() {
        }

        public void onFocusChange(View view, boolean z) {
            if (view != DiaryActivity.this.e) {
                return;
            }
            if (z) {
                ((InputMethodManager) DiaryActivity.this.getSystemService("input_method")).toggleSoftInput(2, 0);
            } else {
                ((InputMethodManager) DiaryActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(DiaryActivity.this.e.getWindowToken(), 0);
            }
        }
    }

    class c implements TextWatcher {
        c() {
        }

        public void afterTextChanged(Editable editable) {
            if (true == DiaryActivity.this.M.booleanValue()) {
                DiaryActivity.this.a(0);
                DiaryActivity.this.g.setText(BuildConfig.FLAVOR);
                DiaryActivity.this.c.setVisibility(0);
                DiaryActivity.this.h.setVisibility(8);
                DiaryActivity.this.i.setVisibility(8);
                DiaryActivity.this.j.setVisibility(8);
                DiaryActivity.this.k.setAdapter((ListAdapter) null);
                Boolean unused = DiaryActivity.this.M = Boolean.FALSE;
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class d implements View.OnKeyListener {
        d() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            String str;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (i) {
                case 29:
                    str = "A";
                    break;
                case 30:
                    str = "B";
                    break;
                case 31:
                    str = "C";
                    break;
                case 32:
                    str = "D";
                    break;
                case 33:
                    str = "E";
                    break;
                case 34:
                    str = "F";
                    break;
                case 35:
                    str = "G";
                    break;
                case 36:
                    str = "H";
                    break;
                case 37:
                    str = "I";
                    break;
                case 38:
                    str = "J";
                    break;
                case 39:
                    str = "K";
                    break;
                case 40:
                    str = "L";
                    break;
                case 41:
                    str = "M";
                    break;
                case 42:
                    str = "N";
                    break;
                case 43:
                    str = "O";
                    break;
                case 44:
                    str = "P";
                    break;
                case 45:
                    str = "Q";
                    break;
                case 46:
                    str = "R";
                    break;
                case 47:
                    str = "S";
                    break;
                case 48:
                    str = "T";
                    break;
                case 49:
                    str = "U";
                    break;
                case 50:
                    str = "V";
                    break;
                case 51:
                    str = "W";
                    break;
                case 52:
                    str = "X";
                    break;
                case 53:
                    str = "Y";
                    break;
                case 54:
                    str = "Z";
                    break;
                default:
                    return false;
            }
            DiaryActivity.this.e.append(str);
            DiaryActivity.this.e.setText(DiaryActivity.this.e.getText().toString().toUpperCase());
            DiaryActivity.this.e.setSelection(DiaryActivity.this.e.getText().toString().length());
            return true;
        }
    }

    class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f482a;

        e(Drawable drawable) {
            this.f482a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (DiaryActivity.this.e.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((DiaryActivity.this.e.getWidth() - DiaryActivity.this.e.getPaddingRight()) - this.f482a.getIntrinsicWidth()))) {
                DiaryActivity.this.e.setText(BuildConfig.FLAVOR);
                DiaryActivity.this.e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class f implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f484a;

        f(Drawable drawable) {
            this.f484a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DiaryActivity.this.e.setCompoundDrawables((Drawable) null, (Drawable) null, DiaryActivity.this.e.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f484a, (Drawable) null);
        }
    }

    class g implements AdapterView.OnItemSelectedListener {
        g() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (DiaryActivity.this.n != i) {
                DiaryActivity.this.a(0);
                DiaryActivity.this.g.setText(BuildConfig.FLAVOR);
                DiaryActivity.this.c.setVisibility(0);
                DiaryActivity.this.h.setVisibility(8);
                DiaryActivity.this.i.setVisibility(8);
                DiaryActivity.this.j.setVisibility(8);
                DiaryActivity.this.k.setAdapter((ListAdapter) null);
            }
            int unused = DiaryActivity.this.n = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class h implements AdapterView.OnItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Spinner f487a;

        h(Spinner spinner) {
            this.f487a = spinner;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            DiaryActivity diaryActivity;
            if (DiaryActivity.this.n != i) {
                String unused = DiaryActivity.this.G = this.f487a.getSelectedItem().toString();
                boolean z = false;
                DiaryActivity.this.a(0);
                DiaryActivity.this.g.setText(BuildConfig.FLAVOR);
                DiaryActivity.this.c.setVisibility(0);
                DiaryActivity.this.h.setVisibility(8);
                DiaryActivity.this.i.setVisibility(8);
                DiaryActivity.this.j.setVisibility(8);
                DiaryActivity.this.k.setAdapter((ListAdapter) null);
                if (DiaryActivity.this.G.equals("Find the Plate No. below") || DiaryActivity.this.G.equals("Cari Plate No. di bawah") || DiaryActivity.this.G.equals("Find the Location below") || DiaryActivity.this.G.equals("Cari Lokasi di bawah") || DiaryActivity.this.G.equals("Find the Location below [Found]") || DiaryActivity.this.G.equals("Cari Lokasi di bawah [Kena]") || DiaryActivity.this.G.equals("Find the Location below [New]") || DiaryActivity.this.G.equals("Cari Lokasi di bawah [Baru]")) {
                    DiaryActivity.this.d.setVisibility(8);
                    DiaryActivity.this.e.setVisibility(0);
                    diaryActivity = DiaryActivity.this;
                    z = true;
                } else {
                    DiaryActivity.this.d.setVisibility(0);
                    DiaryActivity.this.e.setVisibility(8);
                    diaryActivity = DiaryActivity.this;
                }
                diaryActivity.i0(z);
            }
            int unused2 = DiaryActivity.this.n = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class i implements View.OnClickListener {
        i() {
        }

        public void onClick(View view) {
            if (DiaryActivity.this.D > 0) {
                DiaryActivity diaryActivity = DiaryActivity.this;
                diaryActivity.a(Integer.valueOf(diaryActivity.D - 1));
                DiaryActivity.this.c.performClick();
                return;
            }
            DiaryActivity.this.a(0);
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            DiaryActivity diaryActivity = DiaryActivity.this;
            int unused = diaryActivity.D = diaryActivity.D + 1;
            if (DiaryActivity.this.D >= DiaryActivity.this.E) {
                DiaryActivity diaryActivity2 = DiaryActivity.this;
                int unused2 = diaryActivity2.D = diaryActivity2.D - 1;
                DiaryActivity diaryActivity3 = DiaryActivity.this;
                diaryActivity3.a(Integer.valueOf(diaryActivity3.D));
                return;
            }
            DiaryActivity diaryActivity4 = DiaryActivity.this;
            diaryActivity4.a(Integer.valueOf(diaryActivity4.D));
            DiaryActivity.this.c.performClick();
        }
    }

    private class k extends AsyncTask<String, String, k> {

        /* renamed from: a  reason: collision with root package name */
        private String f491a;

        /* renamed from: b  reason: collision with root package name */
        private final ProgressDialog f492b;

        private k() {
            this.f491a = BuildConfig.FLAVOR;
            this.f492b = new ProgressDialog(DiaryActivity.this);
        }

        /* synthetic */ k(DiaryActivity diaryActivity, b bVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            if (true == com.repo.DiaryActivity.A(r1.c).d.booleanValue()) goto L_0x0037;
         */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x02a1 A[LOOP:0: B:58:0x016f->B:78:0x02a1, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x02a9 A[SYNTHETIC, Splitter:B:81:0x02a9] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0298 A[EDGE_INSN: B:89:0x0298->B:76:0x0298 ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.repo.k doInBackground(java.lang.String... r28) {
            /*
                r27 = this;
                r1 = r27
                java.lang.String r2 = "Error : GetDiaryDataFromDB : "
                java.lang.String r3 = "GetDiaryDataFromDB"
                r0 = 0
                r4 = r28[r0]
                r5 = 1
                r6 = r28[r5]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                r8 = 0
                com.repo.DiaryActivity r9 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.MyDB r9 = r9.f476b     // Catch:{ SQLiteException -> 0x02b3 }
                org.sqlite.database.sqlite.SQLiteDatabase r9 = r9.Q     // Catch:{ SQLiteException -> 0x02b3 }
                android.database.Cursor r6 = r9.rawQuery(r6, r8)     // Catch:{ SQLiteException -> 0x02b3 }
                if (r6 == 0) goto L_0x00e5
                int r9 = r6.getCount()     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r10 = "0 row"
                java.lang.String r11 = "0 baris"
                if (r9 != 0) goto L_0x003f
                com.repo.DiaryActivity r7 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                com.repo.MyDB r7 = r7.f476b     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.Boolean r7 = r7.d     // Catch:{ SQLiteException -> 0x00e2 }
                boolean r7 = r7.booleanValue()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r5 != r7) goto L_0x003b
            L_0x0037:
                r1.f491a = r10     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x00e5
            L_0x003b:
                r1.f491a = r11     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x00e5
            L_0x003f:
                boolean r9 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r9 == 0) goto L_0x004d
                int r7 = r6.getInt(r0)     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x00e2 }
            L_0x004d:
                com.repo.DiaryActivity r9 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                int r12 = r7.intValue()     // Catch:{ SQLiteException -> 0x00e2 }
                int r12 = r12 + 100
                int r12 = r12 - r5
                int r12 = r12 / 100
                int unused = r9.E = r12     // Catch:{ SQLiteException -> 0x00e2 }
                com.repo.DiaryActivity r9 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                int r9 = r9.E     // Catch:{ SQLiteException -> 0x00e2 }
                if (r9 >= r5) goto L_0x0068
                com.repo.DiaryActivity r9 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                int unused = r9.E = r5     // Catch:{ SQLiteException -> 0x00e2 }
            L_0x0068:
                int r9 = r7.intValue()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r9 != 0) goto L_0x007d
                com.repo.DiaryActivity r7 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                com.repo.MyDB r7 = r7.f476b     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.Boolean r7 = r7.d     // Catch:{ SQLiteException -> 0x00e2 }
                boolean r7 = r7.booleanValue()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r5 != r7) goto L_0x003b
                goto L_0x0037
            L_0x007d:
                com.repo.DiaryActivity r9 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.Boolean unused = r9.M = r10     // Catch:{ SQLiteException -> 0x00e2 }
                int r9 = r7.intValue()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r5 != r9) goto L_0x00a0
                com.repo.DiaryActivity r7 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                com.repo.MyDB r7 = r7.f476b     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.Boolean r7 = r7.d     // Catch:{ SQLiteException -> 0x00e2 }
                boolean r7 = r7.booleanValue()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r5 != r7) goto L_0x009d
                java.lang.String r7 = "1 row"
            L_0x009a:
                r1.f491a = r7     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x00e5
            L_0x009d:
                java.lang.String r7 = "1 baris"
                goto L_0x009a
            L_0x00a0:
                com.repo.DiaryActivity r9 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                com.repo.MyDB r9 = r9.f476b     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.Boolean r9 = r9.d     // Catch:{ SQLiteException -> 0x00e2 }
                boolean r9 = r9.booleanValue()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r5 != r9) goto L_0x00c8
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e2 }
                r9.<init>()     // Catch:{ SQLiteException -> 0x00e2 }
                int r7 = r7.intValue()     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ SQLiteException -> 0x00e2 }
                r9.append(r7)     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r7 = " rows"
                r9.append(r7)     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r7 = r9.toString()     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x009a
            L_0x00c8:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e2 }
                r9.<init>()     // Catch:{ SQLiteException -> 0x00e2 }
                int r7 = r7.intValue()     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ SQLiteException -> 0x00e2 }
                r9.append(r7)     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r7 = " baris"
                r9.append(r7)     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r7 = r9.toString()     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x009a
            L_0x00e2:
                r0 = move-exception
                goto L_0x02b5
            L_0x00e5:
                if (r6 == 0) goto L_0x00f0
                boolean r7 = r6.isClosed()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r7 != 0) goto L_0x00f0
                r6.close()     // Catch:{ SQLiteException -> 0x00e2 }
            L_0x00f0:
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.MyDB r6 = r6.f476b     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.Boolean r6 = r6.d     // Catch:{ SQLiteException -> 0x02b3 }
                boolean r6 = r6.booleanValue()     // Catch:{ SQLiteException -> 0x02b3 }
                if (r5 != r6) goto L_0x0108
                java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r6 = "Please wait...."
                r5[r0] = r6     // Catch:{ SQLiteException -> 0x00e2 }
                r1.publishProgress(r5)     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x0111
            L_0x0108:
                java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r6 = "Sila tunggu...."
                r5[r0] = r6     // Catch:{ SQLiteException -> 0x02b3 }
                r1.publishProgress(r5)     // Catch:{ SQLiteException -> 0x02b3 }
            L_0x0111:
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02b3 }
                r5.<init>()     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.MyDB r0 = r0.f476b     // Catch:{ SQLiteException -> 0x02b3 }
                org.sqlite.database.sqlite.SQLiteDatabase r0 = r0.Q     // Catch:{ SQLiteException -> 0x02b3 }
                android.database.Cursor r4 = r0.rawQuery(r4, r8)     // Catch:{ SQLiteException -> 0x02b3 }
                if (r4 == 0) goto L_0x02a6
                int r0 = r4.getCount()     // Catch:{ SQLiteException -> 0x02b3 }
                if (r0 != 0) goto L_0x0133
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x00e2 }
                java.lang.String r2 = ""
                java.lang.String unused = r0.m = r2     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x02a6
            L_0x0133:
                boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x02b3 }
                if (r0 == 0) goto L_0x02a6
                java.lang.String r0 = "C1"
                int r6 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "C2"
                int r7 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "C3"
                int r9 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "C4"
                int r10 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "C5"
                int r11 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "C6"
                int r12 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "C7"
                int r13 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "C8"
                int r14 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = "rowid"
                int r15 = r4.getColumnIndex(r0)     // Catch:{ SQLiteException -> 0x02b3 }
            L_0x016f:
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.o = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.p = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r9)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.x = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r10)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.y = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.z = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = com.repo.r.l(r8)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.t = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.B = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = com.repo.r.l(r8)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.v = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r8 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String unused = r0.w = r8     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x0221 }
                com.repo.MyDB r8 = r0.f476b     // Catch:{ IOException -> 0x0221 }
                com.repo.t r8 = r8.U     // Catch:{ IOException -> 0x0221 }
                r16 = r6
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x021f }
                java.lang.String r6 = r6.x     // Catch:{ IOException -> 0x021f }
                java.lang.String r6 = r8.g(r6)     // Catch:{ IOException -> 0x021f }
                java.lang.String unused = r0.q = r6     // Catch:{ IOException -> 0x021f }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x021f }
                com.repo.MyDB r6 = r0.f476b     // Catch:{ IOException -> 0x021f }
                com.repo.t r6 = r6.U     // Catch:{ IOException -> 0x021f }
                com.repo.DiaryActivity r8 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x021f }
                java.lang.String r8 = r8.y     // Catch:{ IOException -> 0x021f }
                java.lang.String r6 = r6.g(r8)     // Catch:{ IOException -> 0x021f }
                java.lang.String unused = r0.r = r6     // Catch:{ IOException -> 0x021f }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x021f }
                com.repo.MyDB r6 = r0.f476b     // Catch:{ IOException -> 0x021f }
                com.repo.t r6 = r6.U     // Catch:{ IOException -> 0x021f }
                com.repo.DiaryActivity r8 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x021f }
                java.lang.String r8 = r8.z     // Catch:{ IOException -> 0x021f }
                java.lang.String r6 = r6.g(r8)     // Catch:{ IOException -> 0x021f }
                java.lang.String unused = r0.s = r6     // Catch:{ IOException -> 0x021f }
                com.repo.DiaryActivity r0 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x021f }
                com.repo.MyDB r6 = r0.f476b     // Catch:{ IOException -> 0x021f }
                com.repo.t r6 = r6.U     // Catch:{ IOException -> 0x021f }
                com.repo.DiaryActivity r8 = com.repo.DiaryActivity.this     // Catch:{ IOException -> 0x021f }
                java.lang.String r8 = r8.B     // Catch:{ IOException -> 0x021f }
                java.lang.String r6 = r6.g(r8)     // Catch:{ IOException -> 0x021f }
                java.lang.String unused = r0.u = r6     // Catch:{ IOException -> 0x021f }
                goto L_0x023a
            L_0x021f:
                r0 = move-exception
                goto L_0x0224
            L_0x0221:
                r0 = move-exception
                r16 = r6
            L_0x0224:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x02b3 }
                r6.<init>()     // Catch:{ SQLiteException -> 0x02b3 }
                r6.append(r2)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x02b3 }
                r6.append(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = r6.toString()     // Catch:{ SQLiteException -> 0x02b3 }
                android.util.Log.e(r3, r0)     // Catch:{ SQLiteException -> 0x02b3 }
            L_0x023a:
                com.repo.l r0 = new com.repo.l     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r18 = r6.w     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r19 = r6.p     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r20 = r6.q     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r21 = r6.u     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r22 = r6.r     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r23 = r6.s     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r24 = r6.t     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r25 = r6.v     // Catch:{ Exception -> 0x027b }
                com.repo.DiaryActivity r6 = com.repo.DiaryActivity.this     // Catch:{ Exception -> 0x027b }
                java.lang.String r26 = r6.o     // Catch:{ Exception -> 0x027b }
                r17 = r0
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x027b }
                r5.add(r0)     // Catch:{ Exception -> 0x027b }
                goto L_0x0292
            L_0x027b:
                r0 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x02b3 }
                r6.<init>()     // Catch:{ SQLiteException -> 0x02b3 }
                r6.append(r2)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x02b3 }
                r6.append(r0)     // Catch:{ SQLiteException -> 0x02b3 }
                java.lang.String r0 = r6.toString()     // Catch:{ SQLiteException -> 0x02b3 }
                android.util.Log.e(r3, r0)     // Catch:{ SQLiteException -> 0x02b3 }
            L_0x0292:
                boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x02b3 }
                if (r0 != 0) goto L_0x02a1
                com.repo.k r0 = new com.repo.k     // Catch:{ SQLiteException -> 0x02b3 }
                com.repo.DiaryActivity r2 = com.repo.DiaryActivity.this     // Catch:{ SQLiteException -> 0x02b3 }
                r0.<init>(r2, r5)     // Catch:{ SQLiteException -> 0x02b3 }
                r8 = r0
                goto L_0x02a7
            L_0x02a1:
                r6 = r16
                r8 = 0
                goto L_0x016f
            L_0x02a6:
                r8 = 0
            L_0x02a7:
                if (r4 == 0) goto L_0x02cd
                boolean r0 = r4.isClosed()     // Catch:{ SQLiteException -> 0x00e2 }
                if (r0 != 0) goto L_0x02cd
                r4.close()     // Catch:{ SQLiteException -> 0x00e2 }
                goto L_0x02cd
            L_0x02b3:
                r0 = move-exception
                r8 = 0
            L_0x02b5:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Could not read the VLS-D table. Error:"
                r2.append(r4)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                android.util.Log.e(r3, r0)
            L_0x02cd:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.repo.DiaryActivity.k.doInBackground(java.lang.String[]):com.repo.k");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(k kVar) {
            if (this.f492b.isShowing()) {
                this.f492b.dismiss();
            }
            DiaryActivity.this.k.setAdapter(kVar);
            DiaryActivity.this.g.setText(this.f491a);
            if (true == this.f491a.startsWith("0")) {
                DiaryActivity.this.c.setVisibility(0);
                DiaryActivity.this.h.setVisibility(8);
                DiaryActivity.this.i.setVisibility(8);
                DiaryActivity.this.j.setVisibility(8);
                return;
            }
            DiaryActivity.this.c.setVisibility(8);
            DiaryActivity.this.h.setVisibility(0);
            DiaryActivity.this.i.setVisibility(0);
            DiaryActivity.this.j.setVisibility(0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f492b.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == DiaryActivity.this.f476b.d.booleanValue()) {
                progressDialog = this.f492b;
                str = "Please wait..";
            } else {
                progressDialog = this.f492b;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f492b.setCancelable(false);
            this.f492b.show();
        }
    }

    private class l extends AsyncTask<Void, String, ArrayAdapter<String>> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f493a;

        private l() {
            this.f493a = new ProgressDialog(DiaryActivity.this);
        }

        /* synthetic */ l(DiaryActivity diaryActivity, b bVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayAdapter<String> doInBackground(Void... voidArr) {
            ArrayAdapter<String> arrayAdapter = null;
            try {
                ArrayList arrayList = new ArrayList();
                Cursor rawQuery = DiaryActivity.this.f476b.P.rawQuery("SELECT C1 FROM FLD ORDER BY rowid ASC", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.getCount() != 0) {
                        arrayList.add(true == DiaryActivity.this.f476b.d.booleanValue() ? "Any type of Financier" : "Apa-apa jenis Bank");
                        if (rawQuery.moveToFirst()) {
                            int columnIndex = rawQuery.getColumnIndex("C1");
                            do {
                                try {
                                    String c = r.c(DiaryActivity.this.f476b.S.g(rawQuery.getString(columnIndex)));
                                    if (true == c.contains("-")) {
                                        c = "      " + c;
                                    }
                                    arrayList.add(c);
                                } catch (IOException e) {
                                    Log.e("GetFinancierDataFromDB", "Error : GetFinancierDataFromDB : " + e.getMessage());
                                }
                            } while (rawQuery.moveToNext());
                            arrayAdapter = new ArrayAdapter<>(DiaryActivity.this, 17367048, arrayList);
                        }
                    }
                }
                if (rawQuery != null && !rawQuery.isClosed()) {
                    rawQuery.close();
                }
            } catch (SQLiteException e2) {
                Log.e("GetFinancierDataFromDB", "Could not read the FLD table. Error:" + e2.getMessage());
            }
            return arrayAdapter;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(ArrayAdapter<String> arrayAdapter) {
            if (this.f493a.isShowing()) {
                this.f493a.dismiss();
            }
            DiaryActivity.this.d.setAdapter(arrayAdapter);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f493a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == DiaryActivity.this.f476b.d.booleanValue()) {
                progressDialog = this.f493a;
                str = "Please wait..";
            } else {
                progressDialog = this.f493a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f493a.setCancelable(false);
            this.f493a.show();
        }
    }

    /* access modifiers changed from: private */
    public void a(Integer num) {
        this.D = num.intValue();
        TextView textView = this.i;
        textView.setText(Integer.toString((this.D * 100) + 1) + " to " + Integer.toString((this.D + 1) * 100));
    }

    public void i0(boolean z2) {
        this.e.setCursorVisible(z2);
        this.e.setFocusable(z2);
        this.e.setFocusableInTouchMode(z2);
        if (z2) {
            this.e.requestFocus();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        Button button;
        super.onCreate(bundle);
        setContentView(R.layout.diary);
        this.f476b = (MyDB) getApplicationContext();
        this.g = (TextView) findViewById(R.id.lblDataCount);
        this.i = (TextView) findViewById(R.id.lblPageCount);
        a(0);
        this.g.setText(BuildConfig.FLAVOR);
        EditText editText = (EditText) findViewById(R.id.txtFindPlateNoBelow);
        this.e = editText;
        editText.setVisibility(8);
        this.e.setOnFocusChangeListener(new b());
        this.e.addTextChangedListener(new c());
        this.e.setOnKeyListener(new d());
        Drawable drawable = getResources().getDrawable(R.drawable.presence_offline);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.e.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.e.setOnTouchListener(new e(drawable));
        this.e.addTextChangedListener(new f(drawable));
        this.d = (Spinner) findViewById(R.id.cboFinancier);
        if (true == this.f476b.d.booleanValue()) {
            this.d.setPrompt("Please choose...");
        } else {
            this.d.setPrompt("Sila pilih...");
        }
        this.f476b.o(Boolean.FALSE);
        new l(this, (b) null).execute(new Void[0]);
        this.n = this.d.getSelectedItemPosition();
        this.d.setOnItemSelectedListener(new g());
        Spinner spinner = (Spinner) findViewById(R.id.cboDataType);
        if (true == this.f476b.d.booleanValue()) {
            spinner.setPrompt("Please choose...");
        } else {
            spinner.setPrompt("Sila pilih...");
        }
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, true == this.f476b.d.booleanValue() ? R.array.diarydatatype_en : R.array.diarydatatype_bm, 17367048);
        createFromResource.setDropDownViewResource(17367049);
        spinner.setAdapter(createFromResource);
        this.n = spinner.getSelectedItemPosition();
        spinner.setOnItemSelectedListener(new h(spinner));
        Button button2 = (Button) findViewById(R.id.btnPageDown);
        this.h = button2;
        button2.setOnClickListener(new i());
        Button button3 = (Button) findViewById(R.id.btnPageUp);
        this.j = button3;
        button3.setOnClickListener(new j());
        ListView listView = (ListView) findViewById(R.id.lstDiary);
        this.k = listView;
        listView.setClickable(true);
        Button button4 = (Button) findViewById(R.id.btnShow);
        this.c = button4;
        button4.setOnClickListener(new a(spinner));
        if (true == this.f476b.d.booleanValue()) {
            button = this.c;
            str = "Show";
        } else {
            button = this.c;
            str = "Paparkan";
        }
        button.setText(str);
        this.c.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
    }
}
