package com.repo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.repo.r;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;
import org.sqlite.database.sqlite.SQLiteException;

public class RepoActivity extends Activity implements View.OnKeyListener, KeyboardView.OnKeyboardActionListener {
    private Boolean A;
    private String A0;
    /* access modifiers changed from: private */
    public volatile int B;
    private String B0;
    /* access modifiers changed from: private */
    public volatile int C;
    private String C0;
    /* access modifiers changed from: private */
    public volatile Boolean D;
    private String D0;
    /* access modifiers changed from: private */
    public volatile Boolean E;
    private String E0;
    private volatile int F;
    private String F0;
    /* access modifiers changed from: private */
    public TextView G;
    private String G0;
    /* access modifiers changed from: private */
    public ReentrantLock H;
    private String H0;
    private LocationListener I;
    private String I0;
    private LocationManager J;
    /* access modifiers changed from: private */
    public String J0;
    private HandlerThread K;
    private MediaPlayer K0;
    private Geocoder L;
    private String L0;
    private TextView M;
    /* access modifiers changed from: private */
    public Boolean M0;
    /* access modifiers changed from: private */
    public TextView N;
    /* access modifiers changed from: private */
    public Integer N0;
    private TextView O;
    private DatePickerDialog.OnDateSetListener O0;
    /* access modifiers changed from: private */
    public EditText P;
    private TextView Q;
    /* access modifiers changed from: private */
    public TextView R;
    private TextView S;
    /* access modifiers changed from: private */
    public EditText T;
    private TextView U;
    /* access modifiers changed from: private */
    public EditText V;
    private TextView W;
    /* access modifiers changed from: private */
    public TextView X;
    private Button Y;
    /* access modifiers changed from: private */
    public TextView Z;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c1 f589a = c1.OPENDIARY;
    private String a0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public f1 f590b = f1.TABBUTTON_FIND;
    private String b0;
    private String c = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String c0;
    /* access modifiers changed from: private */
    public MyDB d;
    /* access modifiers changed from: private */
    public String d0;
    private Boolean e = Boolean.TRUE;
    /* access modifiers changed from: private */
    public String e0;
    private String f = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String f0;
    private ListView g;
    /* access modifiers changed from: private */
    public String g0;
    private List<o> h;
    private String h0;
    private n i;
    /* access modifiers changed from: private */
    public String i0;
    private Button j;
    /* access modifiers changed from: private */
    public int j0;
    private Button k;
    /* access modifiers changed from: private */
    public int k0;
    private EditText l;
    /* access modifiers changed from: private */
    public int l0;
    /* access modifiers changed from: private */
    public EditText m;
    /* access modifiers changed from: private */
    public int m0;
    /* access modifiers changed from: private */
    public EditText n;
    /* access modifiers changed from: private */
    public int n0;
    private TextView o;
    /* access modifiers changed from: private */
    public int o0;
    /* access modifiers changed from: private */
    public TextView p;
    private DatePickerDialog p0;
    private TextView q;
    /* access modifiers changed from: private */
    public d1 q0;
    private Button r;
    Dialog r0;
    private Button s;
    private SpannableStringBuilder s0;
    private Button t;
    private Integer t0;
    private RelativeLayout u;
    private Integer u0;
    private KeyboardView v;
    /* access modifiers changed from: private */
    public SimpleDateFormat v0;
    private View w;
    private Integer w0;
    /* access modifiers changed from: private */
    public Button x;
    private String x0;
    /* access modifiers changed from: private */
    public Boolean y;
    private String y0;
    /* access modifiers changed from: private */
    public Boolean z;
    private String z0;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            if (!RepoActivity.this.p.getText().toString().equals(BuildConfig.FLAVOR)) {
                RepoActivity.this.i1();
            }
        }
    }

    class a0 implements View.OnClickListener {
        a0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("CHANCELLOR", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(10);
            RepoActivity.this.r0.dismiss();
        }
    }

    class a1 implements View.OnClickListener {
        a1() {
        }

        public void onClick(View view) {
            f1 unused = RepoActivity.this.f590b = f1.TABBUTTON_HIT;
            Boolean unused2 = RepoActivity.this.t();
        }
    }

    class b implements InputFilter {
        b() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            while (i < i2) {
                if (!Character.isLetterOrDigit(charSequence.charAt(i))) {
                    return BuildConfig.FLAVOR;
                }
                i++;
            }
            return null;
        }
    }

    class b0 implements View.OnClickListener {
        b0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("IM4U", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(4);
            RepoActivity.this.r0.dismiss();
        }
    }

    class b1 implements View.OnClickListener {
        b1() {
        }

        public void onClick(View view) {
            RepoActivity.this.ShowLongPlateNoDialog(view);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            RepoActivity repoActivity = RepoActivity.this;
            repoActivity.g1(repoActivity.n);
        }
    }

    class c0 implements View.OnClickListener {
        c0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("JAGUH", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(5);
            RepoActivity.this.r0.dismiss();
        }
    }

    private enum c1 {
        NOACTION,
        OPENDIARY,
        OPENREMARK,
        CHANGEDIARYPASSWORD,
        CHANGEREMARKPASSWORD,
        UPDATEDIARY
    }

    class d implements View.OnKeyListener {
        d() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            String str;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i != 66) {
                switch (i) {
                    case 7:
                        str = "0";
                        break;
                    case 8:
                        str = "1";
                        break;
                    case 9:
                        str = "2";
                        break;
                    case 10:
                        str = "3";
                        break;
                    case 11:
                        str = "4";
                        break;
                    case 12:
                        str = "5";
                        break;
                    case 13:
                        str = "6";
                        break;
                    case 14:
                        str = "7";
                        break;
                    case 15:
                        str = "8";
                        break;
                    case 16:
                        str = "9";
                        break;
                    default:
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
                }
                RepoActivity.this.n.append(str);
                EditText y = RepoActivity.this.n;
                RepoActivity repoActivity = RepoActivity.this;
                y.setText(repoActivity.i(repoActivity.n.getText().toString().toUpperCase(), Boolean.FALSE), TextView.BufferType.EDITABLE);
                RepoActivity.this.n.setSelection(RepoActivity.this.n.getText().toString().length());
                return true;
            }
            RepoActivity repoActivity2 = RepoActivity.this;
            boolean unused = repoActivity2.u(repoActivity2.n.getText().toString().toUpperCase());
            RepoActivity.this.n.setText(BuildConfig.FLAVOR);
            RepoActivity.this.n.requestFocus();
            return true;
        }
    }

    class d0 implements View.OnClickListener {
        d0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("KRISS", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(5);
            RepoActivity.this.r0.dismiss();
        }
    }

    private enum d1 {
        LASTPAYMENT_DATE,
        FOLLOWUP_DATE
    }

    class e implements View.OnFocusChangeListener {
        e() {
        }

        public void onFocusChange(View view, boolean z) {
            if (true == z) {
                RepoActivity repoActivity = RepoActivity.this;
                repoActivity.g1(repoActivity.n);
            }
        }
    }

    class e0 implements View.OnClickListener {
        e0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("MALAYSIA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(8);
            RepoActivity.this.r0.dismiss();
        }
    }

    private class e1 implements LocationListener {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Location f608a;

            a(Location location) {
                this.f608a = location;
            }

            /* JADX INFO: finally extract failed */
            public void run() {
                try {
                    RepoActivity.this.H.lock();
                    RepoActivity.A(RepoActivity.this);
                    if (RepoActivity.this.B > 9) {
                        int unused = RepoActivity.this.B = 0;
                    }
                    RepoActivity.this.H.unlock();
                    TextView N = RepoActivity.this.G;
                    N.setText("U:" + String.valueOf(RepoActivity.this.B).trim());
                    RepoActivity.this.G.setTextColor(-16711936);
                    if (RepoActivity.this.p(this.f608a).booleanValue() && RepoActivity.this.y.booleanValue()) {
                        try {
                            RepoActivity.this.H.lock();
                            int unused2 = RepoActivity.this.C = 0;
                            Boolean unused3 = RepoActivity.this.E = Boolean.FALSE;
                            if (!RepoActivity.this.D.booleanValue()) {
                                Boolean unused4 = RepoActivity.this.E = Boolean.TRUE;
                            }
                            RepoActivity.this.H.unlock();
                            if (RepoActivity.this.E.booleanValue()) {
                                RepoActivity.this.m.setBackgroundColor(Color.rgb(195, 245, 174));
                                Boolean unused5 = RepoActivity.this.D = Boolean.TRUE;
                            }
                        } catch (Throwable th) {
                            RepoActivity.this.H.unlock();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    RepoActivity.this.H.unlock();
                    throw th2;
                }
            }
        }

        private e1() {
        }

        /* synthetic */ e1(RepoActivity repoActivity, s sVar) {
            this();
        }

        public void onLocationChanged(Location location) {
            RepoActivity.this.runOnUiThread(new a(location));
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    class f implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f610a;

        f(Drawable drawable) {
            this.f610a = drawable;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (RepoActivity.this.m.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((RepoActivity.this.m.getWidth() - RepoActivity.this.m.getPaddingRight()) - this.f610a.getIntrinsicWidth()))) {
                RepoActivity.this.m.setText(BuildConfig.FLAVOR);
                RepoActivity.this.m.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            return false;
        }
    }

    class f0 implements View.OnClickListener {
        f0() {
        }

        public void onClick(View view) {
            if (true == RepoActivity.this.y.booleanValue()) {
                RepoActivity repoActivity = RepoActivity.this;
                Boolean bool = Boolean.FALSE;
                Boolean unused = repoActivity.y = bool;
                RepoActivity.this.x.setTextColor(-65536);
                RepoActivity.this.m.setBackgroundColor(-1);
                Boolean unused2 = RepoActivity.this.D = bool;
                RepoActivity.this.G.setText("X:X");
                RepoActivity.this.G.setTextColor(-65536);
                if (RepoActivity.this.z.booleanValue()) {
                    RepoActivity.this.v();
                }
            } else {
                RepoActivity.this.l();
            }
            RepoActivity.this.n.requestFocus();
        }
    }

    private enum f1 {
        TABBUTTON_FIND,
        TABBUTTON_HIT,
        TABBUTTON_DIARY
    }

    class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f615a;

        g(Drawable drawable) {
            this.f615a = drawable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            RepoActivity.this.m.setCompoundDrawables((Drawable) null, (Drawable) null, RepoActivity.this.m.getText().toString().equals(BuildConfig.FLAVOR) ? null : this.f615a, (Drawable) null);
        }
    }

    class g0 implements View.OnClickListener {
        g0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("NAZA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(4);
            RepoActivity.this.r0.dismiss();
        }
    }

    private class g1 extends AsyncTask<String, String, String> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f618a;

        private g1() {
            this.f618a = new ProgressDialog(RepoActivity.this);
        }

        /* synthetic */ g1(RepoActivity repoActivity, s sVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (true == r.f760a.booleanValue()) {
                publishProgress(new String[]{"DECLARE VARIABLES."});
            }
            try {
                RepoActivity.this.d.R.beginTransaction();
                Cursor rawQuery = RepoActivity.this.d.P.rawQuery("SELECT C1 from VLC", (String[]) null);
                if (rawQuery != null && rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                    int columnIndex = rawQuery.getColumnIndex("C1");
                    do {
                        try {
                            String h = RepoActivity.this.d.U.h(RepoActivity.this.d.S.g(rawQuery.getString(columnIndex)));
                            RepoActivity.this.d.R.execSQL("DELETE FROM VLS WHERE C1 = '" + h + "';");
                        } catch (IOException e) {
                            Log.e("dbCleanUpLastRemark", "Error : dbCleanUpLastRemark : " + e.getMessage());
                            String str = "Error: CleanUpLR - " + e.getMessage();
                            if (true == r.f760a.booleanValue()) {
                                Log.d("dbCleanUpLastRemark", "COMMIT TRANSACTION.");
                            }
                            RepoActivity.this.d.R.endTransaction();
                            return str;
                        }
                    } while (rawQuery.moveToNext());
                }
                if (rawQuery != null) {
                    if (!rawQuery.isClosed()) {
                        rawQuery.close();
                    }
                }
                RepoActivity.this.d.R.execSQL("UPDATE PRS SET C2 = '1' WHERE C1 = 'CLF';");
                RepoActivity.this.d.R.setTransactionSuccessful();
                if (true == r.f760a.booleanValue()) {
                    Log.d("dbCleanUpLastRemark", "COMMIT TRANSACTION.");
                }
                RepoActivity.this.d.R.endTransaction();
                try {
                    MyDB P = RepoActivity.this.d;
                    Boolean bool = Boolean.TRUE;
                    P.q(bool);
                    if (RepoActivity.this.d.R != null || RepoActivity.this.d.R.isOpen()) {
                        RepoActivity.this.d.R.close();
                        RepoActivity.this.d.R = null;
                    }
                    RepoActivity.this.d.q(bool);
                    return BuildConfig.FLAVOR;
                } catch (Exception e2) {
                    return "Error: FinalStageLR - " + e2.getMessage();
                }
            } catch (SQLiteException e3) {
                Log.e("dbCleanUpLastRemark", "Error : dbCleanUpLastRemark : " + e3.getMessage());
                String str2 = "Error: ProcessLR - " + e3.getMessage();
                if (true == r.f760a.booleanValue()) {
                    Log.d("dbCleanUpLastRemark", "COMMIT TRANSACTION.");
                }
                RepoActivity.this.d.R.endTransaction();
                return str2;
            } catch (Throwable th) {
                if (true == r.f760a.booleanValue()) {
                    Log.d("dbCleanUpLastRemark", "COMMIT TRANSACTION.");
                }
                RepoActivity.this.d.R.endTransaction();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (this.f618a.isShowing()) {
                this.f618a.dismiss();
            }
            if (true == str.startsWith("Error")) {
                r.t(RepoActivity.this, str);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f618a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == RepoActivity.this.d.d.booleanValue()) {
                progressDialog = this.f618a;
                str = "Please wait..";
            } else {
                progressDialog = this.f618a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f618a.setCancelable(false);
            this.f618a.show();
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            RepoActivity repoActivity = RepoActivity.this;
            repoActivity.g1(repoActivity.m);
        }
    }

    class h0 implements View.OnClickListener {
        h0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("PATRIOT", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(7);
            RepoActivity.this.r0.dismiss();
        }
    }

    private class h1 extends AsyncTask<String, String, String> {

        /* renamed from: a  reason: collision with root package name */
        private final ProgressDialog f622a;

        private h1() {
            this.f622a = new ProgressDialog(RepoActivity.this);
        }

        /* synthetic */ h1(RepoActivity repoActivity, s sVar) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v33, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v37, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v38, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v39, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v60, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v61, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v62, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v63, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v64, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v67, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v68, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v69, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v70, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v71, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v72, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v73, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v74, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v76, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v78, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v80, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v81, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v82, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v83, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v84, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v85, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v86, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v87, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v88, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v89, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v90, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v91, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v92, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v93, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v97, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v98, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v99, resolved type: org.sqlite.database.sqlite.SQLiteStatement} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x0346  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0367  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0371  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x039f A[SYNTHETIC, Splitter:B:110:0x039f] */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x06f4 A[Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }, LOOP:2: B:137:0x0407->B:183:0x06f4, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:262:0x0897  */
        /* JADX WARNING: Removed duplicated region for block: B:265:0x08a3  */
        /* JADX WARNING: Removed duplicated region for block: B:268:0x0910  */
        /* JADX WARNING: Removed duplicated region for block: B:273:0x0922 A[Catch:{ Exception -> 0x09c1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:276:0x0951 A[Catch:{ Exception -> 0x09c1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:284:0x09ac A[Catch:{ Exception -> 0x09c1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:285:0x09b6 A[Catch:{ Exception -> 0x09c1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:312:0x0adc  */
        /* JADX WARNING: Removed duplicated region for block: B:315:0x0ae8  */
        /* JADX WARNING: Removed duplicated region for block: B:318:0x0b47  */
        /* JADX WARNING: Removed duplicated region for block: B:327:0x0ba3  */
        /* JADX WARNING: Removed duplicated region for block: B:330:0x0baf  */
        /* JADX WARNING: Removed duplicated region for block: B:333:0x0c0e  */
        /* JADX WARNING: Removed duplicated region for block: B:340:0x0c26  */
        /* JADX WARNING: Removed duplicated region for block: B:343:0x0c32  */
        /* JADX WARNING: Removed duplicated region for block: B:346:0x0c91  */
        /* JADX WARNING: Removed duplicated region for block: B:365:0x0cfc  */
        /* JADX WARNING: Removed duplicated region for block: B:377:0x0d46  */
        /* JADX WARNING: Removed duplicated region for block: B:382:0x0d51  */
        /* JADX WARNING: Removed duplicated region for block: B:389:0x02dc A[EDGE_INSN: B:389:0x02dc->B:83:0x02dc ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:390:0x06f2 A[EDGE_INSN: B:390:0x06f2->B:182:0x06f2 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0244  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0256  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x02dd A[Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e, all -> 0x0cef }, LOOP:1: B:78:0x0297->B:84:0x02dd, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0329 A[SYNTHETIC, Splitter:B:93:0x0329] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:308:0x0aa6=Splitter:B:308:0x0aa6, B:323:0x0b6d=Splitter:B:323:0x0b6d} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r52) {
            /*
                r51 = this;
                r1 = r51
                java.lang.String r2 = "Save Data. Step 7 of 8."
                java.lang.String r3 = "CREATE INDEX IF NOT EXISTS idxC9 ON VLS(C9)"
                java.lang.String r4 = "Save Data. Step 6 of 8."
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC8 ON VLS(C8)"
                java.lang.String r6 = "Save Data. Step 5 of 8."
                java.lang.String r7 = "CREATE INDEX IF NOT EXISTS idxC6 ON VLS(C6)"
                java.lang.String r8 = "Save Data. Step 4 of 8."
                java.lang.String r9 = "CREATE INDEX IF NOT EXISTS idxC3 ON VLS(C3)"
                java.lang.String r10 = "Save Data. Step 3 of 8."
                java.lang.String r11 = "CREATE INDEX IF NOT EXISTS idxC2 ON VLS(C2)"
                java.lang.String r12 = "Save Data. Step 2 of 8."
                java.lang.String r13 = "CREATE INDEX IF NOT EXISTS idxC1 ON VLS(C1)"
                java.lang.String r14 = "Save Data. Step 1 of 8."
                java.lang.String r15 = "dbUpdateDiary-cuci"
                r52 = r2
                java.lang.String r2 = "dbUpdateDiary"
                r16 = r2
                java.lang.String r2 = "COMMIT TRANSACTION."
                r17 = r3
                r3 = 1
                r18 = r4
                java.lang.String[] r4 = new java.lang.String[r3]
                java.lang.String r19 = "BackUp Data."
                r20 = 0
                r4[r20] = r19
                r1.publishProgress(r4)
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                org.sqlite.database.sqlite.SQLiteDatabase r4 = r4.Q
                r3 = 0
                if (r4 != 0) goto L_0x004f
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                org.sqlite.database.sqlite.SQLiteDatabase r4 = r4.Q
                boolean r4 = r4.isOpen()
                if (r4 == 0) goto L_0x0062
            L_0x004f:
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                org.sqlite.database.sqlite.SQLiteDatabase r4 = r4.Q
                r4.close()
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                r4.Q = r3
            L_0x0062:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this
                com.repo.MyDB r3 = r3.d
                java.lang.String r3 = r3.E
                r21 = r5
                java.lang.String r5 = "RepoProDiary.db"
                r22 = r6
                java.lang.String r6 = ""
                java.lang.String r3 = r3.replace(r5, r6)
                r4.append(r3)
                java.lang.String r3 = ".db"
                java.lang.String r3 = r5.replace(r3, r6)
                r4.append(r3)
                java.lang.String r3 = " - BACKUP "
                r4.append(r3)
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this
                java.text.SimpleDateFormat r3 = r3.v0
                r23 = r7
                java.util.Date r7 = new java.util.Date
                r7.<init>()
                java.lang.String r3 = r3.format(r7)
                java.lang.String r3 = r3.toUpperCase()
                r4.append(r3)
                r3 = 12
                r7 = 15
                java.lang.String r3 = r5.substring(r3, r7)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                java.lang.String r4 = r4.E
                com.repo.r.o(r4, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                java.lang.String r4 = r4.E
                java.lang.String r4 = r4.replace(r5, r6)
                r3.append(r4)
                java.lang.String r4 = "Temp_"
                r3.append(r4)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                com.repo.r.p(r3)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                java.lang.String r7 = "-journal"
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                com.repo.r.p(r4)
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                java.lang.Boolean r4 = r4.d
                boolean r4 = r4.booleanValue()
                r7 = 1
                if (r7 != r4) goto L_0x010e
                java.lang.String[] r4 = new java.lang.String[r7]
                java.lang.String r19 = "Load Initial Data."
                r4[r20] = r19
                r1.publishProgress(r4)
                goto L_0x0117
            L_0x010e:
                java.lang.String[] r4 = new java.lang.String[r7]
                java.lang.String r7 = "Process Data Permulaan."
                r4[r20] = r7
                r1.publishProgress(r4)
            L_0x0117:
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r7 = r4.d
                java.lang.String r7 = r7.E
                r24 = r8
                r8 = 2131492886(0x7f0c0016, float:1.8609237E38)
                r25 = r9
                java.lang.String r9 = "Temp_RepoProDiary.db"
                java.lang.Boolean unused = r4.k(r7, r5, r9, r8)
                java.lang.Boolean r4 = com.repo.r.f760a
                boolean r5 = r4.booleanValue()
                r7 = 1
                if (r7 != r5) goto L_0x013d
                java.lang.String[] r5 = new java.lang.String[r7]
                java.lang.String r8 = "DECLARE VARIABLES."
                r5[r20] = r8
                r1.publishProgress(r5)
            L_0x013d:
                boolean r5 = r4.booleanValue()     // Catch:{ SQLiteException -> 0x0d55 }
                if (r7 != r5) goto L_0x0153
                java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x014d }
                java.lang.String r7 = "CREATE/OPEN TEMP DB."
                r5[r20] = r7     // Catch:{ SQLiteException -> 0x014d }
                r1.publishProgress(r5)     // Catch:{ SQLiteException -> 0x014d }
                goto L_0x0153
            L_0x014d:
                r0 = move-exception
                r2 = r0
                r5 = r16
                goto L_0x0d59
            L_0x0153:
                r5 = 16
                r7 = 0
                org.sqlite.database.sqlite.SQLiteDatabase r5 = org.sqlite.database.sqlite.SQLiteDatabase.openDatabase(r3, r7, r5)     // Catch:{ SQLiteException -> 0x0d55 }
                boolean r7 = r4.booleanValue()     // Catch:{ SQLiteException -> 0x0d55 }
                r8 = 1
                if (r8 != r7) goto L_0x016a
                java.lang.String[] r7 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x014d }
                java.lang.String r8 = "DROP INDEX."
                r7[r20] = r8     // Catch:{ SQLiteException -> 0x014d }
                r1.publishProgress(r7)     // Catch:{ SQLiteException -> 0x014d }
            L_0x016a:
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC1;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC2;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC3;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC6;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC8;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC9;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC10;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DROP INDEX IF EXISTS idxC11;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                boolean r7 = r4.booleanValue()     // Catch:{ SQLiteException -> 0x0d55 }
                r8 = 1
                if (r8 != r7) goto L_0x01a2
                java.lang.String[] r7 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x014d }
                java.lang.String r8 = "DELETE FROM PRS."
                r7[r20] = r8     // Catch:{ SQLiteException -> 0x014d }
                r1.publishProgress(r7)     // Catch:{ SQLiteException -> 0x014d }
            L_0x01a2:
                r5.beginTransaction()     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "DELETE FROM PRS;"
                r5.execSQL(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                r5.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0d55 }
                r5.endTransaction()     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.String r7 = "INSERT INTO PRS (C1,C2) VALUES (?,?)"
                org.sqlite.database.sqlite.SQLiteStatement r7 = r5.compileStatement(r7)     // Catch:{ SQLiteException -> 0x0d55 }
                com.repo.RepoActivity r8 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0d55 }
                com.repo.MyDB r8 = r8.d     // Catch:{ SQLiteException -> 0x0d55 }
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x0d55 }
                r8.p(r9)     // Catch:{ SQLiteException -> 0x0d55 }
                boolean r4 = r4.booleanValue()
                r8 = 1
                if (r8 != r4) goto L_0x01d1
                java.lang.String[] r4 = new java.lang.String[r8]
                java.lang.String r8 = "SELECT C1,C2 FROM PRS."
                r4[r20] = r8
                r1.publishProgress(r4)
            L_0x01d1:
                r5.beginTransaction()
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0d0f, all -> 0x0d0b }
                com.repo.MyDB r4 = r4.d     // Catch:{ SQLiteException -> 0x0d0f, all -> 0x0d0b }
                org.sqlite.database.sqlite.SQLiteDatabase r4 = r4.Q     // Catch:{ SQLiteException -> 0x0d0f, all -> 0x0d0b }
                java.lang.String r8 = "SELECT C1,C2 FROM PRS"
                r9 = 0
                android.database.Cursor r4 = r4.rawQuery(r8, r9)     // Catch:{ SQLiteException -> 0x0d0f, all -> 0x0d0b }
                if (r4 == 0) goto L_0x022f
                int r9 = r4.getCount()     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                if (r9 <= 0) goto L_0x022f
                boolean r9 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                if (r9 == 0) goto L_0x022f
                java.lang.String r9 = "C1"
                int r9 = r4.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                java.lang.String r8 = "C2"
                int r8 = r4.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
            L_0x01fd:
                r7.clearBindings()     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                r26 = r3
                java.lang.String r3 = r4.getString(r9)     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                r27 = r9
                r9 = 1
                r7.bindString(r9, r3)     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                java.lang.String r3 = r4.getString(r8)     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                r9 = 2
                r7.bindString(r9, r3)     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                r7.executeInsert()     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                boolean r3 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                if (r3 != 0) goto L_0x021e
                goto L_0x0231
            L_0x021e:
                r3 = r26
                r9 = r27
                goto L_0x01fd
            L_0x0223:
                r0 = move-exception
                r2 = r0
                r3 = r5
                goto L_0x0d4c
            L_0x0228:
                r0 = move-exception
                r2 = r0
                r3 = r5
                r5 = r16
                goto L_0x0d14
            L_0x022f:
                r26 = r3
            L_0x0231:
                if (r4 == 0) goto L_0x023c
                boolean r3 = r4.isClosed()     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
                if (r3 != 0) goto L_0x023c
                r4.close()     // Catch:{ SQLiteException -> 0x0228, all -> 0x0223 }
            L_0x023c:
                r5.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0d0f, all -> 0x0d0b }
                r5.endTransaction()
                if (r7 == 0) goto L_0x0247
                r7.close()
            L_0x0247:
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this
                com.repo.MyDB r3 = r3.d
                java.lang.Boolean r3 = r3.d
                boolean r3 = r3.booleanValue()
                r4 = 1
                if (r4 != r3) goto L_0x0260
                java.lang.String[] r3 = new java.lang.String[r4]
                java.lang.String r7 = "Database initial process."
                r3[r20] = r7
                r1.publishProgress(r3)
                goto L_0x0269
            L_0x0260:
                java.lang.String[] r3 = new java.lang.String[r4]
                java.lang.String r4 = "Prosess persediaan database."
                r3[r20] = r4
                r1.publishProgress(r3)
            L_0x0269:
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                com.repo.MyDB r3 = r3.d     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.Q     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                r3.beginTransaction()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                com.repo.MyDB r3 = r3.d     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.P     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.String r4 = "SELECT C1 from VLC"
                r7 = 0
                android.database.Cursor r3 = r3.rawQuery(r4, r7)     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                if (r3 == 0) goto L_0x0327
                int r4 = r3.getCount()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                if (r4 <= 0) goto L_0x0327
                boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                if (r4 == 0) goto L_0x0327
                java.lang.String r4 = "C1"
                int r4 = r3.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
            L_0x0297:
                com.repo.RepoActivity r7 = com.repo.RepoActivity.this     // Catch:{ IOException -> 0x02e0 }
                com.repo.MyDB r7 = r7.d     // Catch:{ IOException -> 0x02e0 }
                com.repo.t r7 = r7.S     // Catch:{ IOException -> 0x02e0 }
                java.lang.String r8 = r3.getString(r4)     // Catch:{ IOException -> 0x02e0 }
                java.lang.String r7 = r7.g(r8)     // Catch:{ IOException -> 0x02e0 }
                com.repo.RepoActivity r8 = com.repo.RepoActivity.this     // Catch:{ IOException -> 0x02e0 }
                com.repo.MyDB r8 = r8.d     // Catch:{ IOException -> 0x02e0 }
                com.repo.t r8 = r8.U     // Catch:{ IOException -> 0x02e0 }
                java.lang.String r7 = r8.h(r7)     // Catch:{ IOException -> 0x02e0 }
                com.repo.RepoActivity r8 = com.repo.RepoActivity.this     // Catch:{ IOException -> 0x02e0 }
                com.repo.MyDB r8 = r8.d     // Catch:{ IOException -> 0x02e0 }
                org.sqlite.database.sqlite.SQLiteDatabase r8 = r8.Q     // Catch:{ IOException -> 0x02e0 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02e0 }
                r9.<init>()     // Catch:{ IOException -> 0x02e0 }
                r27 = r4
                java.lang.String r4 = "UPDATE VLS SET C1='',C2='0',C3='',C4='',C5='',C6='',C7='',C8='',C9='',C10='',C11='' WHERE C3='"
                r9.append(r4)     // Catch:{ IOException -> 0x02e0 }
                r9.append(r7)     // Catch:{ IOException -> 0x02e0 }
                java.lang.String r4 = "';"
                r9.append(r4)     // Catch:{ IOException -> 0x02e0 }
                java.lang.String r4 = r9.toString()     // Catch:{ IOException -> 0x02e0 }
                r8.execSQL(r4)     // Catch:{ IOException -> 0x02e0 }
                boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                if (r4 != 0) goto L_0x02dd
                goto L_0x0327
            L_0x02dd:
                r4 = r27
                goto L_0x0297
            L_0x02e0:
                r0 = move-exception
                r3 = r0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                r4.<init>()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.String r5 = "Error : dbUpdateDiary-cuci : "
                r4.append(r5)     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.String r5 = r3.getMessage()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                r4.append(r5)     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                android.util.Log.e(r15, r4)     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                r4.<init>()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.String r5 = "Error: dbUpdateDiary c-part - "
                r4.append(r5)     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.String r3 = r3.getMessage()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                r4.append(r3)     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.String r3 = r4.toString()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.Boolean r4 = com.repo.r.f760a
                boolean r4 = r4.booleanValue()
                r5 = 1
                if (r5 != r4) goto L_0x031b
                android.util.Log.d(r15, r2)
            L_0x031b:
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this
                com.repo.MyDB r2 = r2.d
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q
                r2.endTransaction()
                return r3
            L_0x0327:
                if (r3 == 0) goto L_0x0332
                boolean r4 = r3.isClosed()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                if (r4 != 0) goto L_0x0332
                r3.close()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
            L_0x0332:
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                com.repo.MyDB r3 = r3.d     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.Q     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                r3.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0ca2, all -> 0x0c9e }
                java.lang.Boolean r3 = com.repo.r.f760a
                boolean r3 = r3.booleanValue()
                r4 = 1
                if (r4 != r3) goto L_0x0349
                android.util.Log.d(r15, r2)
            L_0x0349:
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this
                com.repo.MyDB r3 = r3.d
                org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.Q
                r3.endTransaction()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this
                com.repo.MyDB r4 = r4.d
                java.lang.Boolean r4 = r4.d
                boolean r4 = r4.booleanValue()
                r7 = 1
                if (r7 != r4) goto L_0x0371
                java.lang.String[] r4 = new java.lang.String[r7]
                java.lang.String r8 = "Begin Data Processing."
                r4[r20] = r8
                r1.publishProgress(r4)
                goto L_0x037a
            L_0x0371:
                java.lang.String[] r4 = new java.lang.String[r7]
                java.lang.String r7 = "Process Data Bermula."
                r4[r20] = r7
                r1.publishProgress(r4)
            L_0x037a:
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0b54, IOException -> 0x0a8d, all -> 0x0a74 }
                com.repo.MyDB r4 = r4.d     // Catch:{ SQLiteException -> 0x0b54, IOException -> 0x0a8d, all -> 0x0a74 }
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x0b54, IOException -> 0x0a8d, all -> 0x0a74 }
                r4.o(r7)     // Catch:{ SQLiteException -> 0x0b54, IOException -> 0x0a8d, all -> 0x0a74 }
                java.lang.String r4 = "INSERT INTO VLS VALUES(?,?,?,?,?,?,?,?,?,?,?)"
                org.sqlite.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r4)     // Catch:{ SQLiteException -> 0x0b54, IOException -> 0x0a8d, all -> 0x0a74 }
                r5.beginTransaction()     // Catch:{ SQLiteException -> 0x0a5a, IOException -> 0x0a40, all -> 0x0a29 }
                com.repo.RepoActivity r7 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0a5a, IOException -> 0x0a40, all -> 0x0a29 }
                com.repo.MyDB r7 = r7.d     // Catch:{ SQLiteException -> 0x0a5a, IOException -> 0x0a40, all -> 0x0a29 }
                org.sqlite.database.sqlite.SQLiteDatabase r7 = r7.Q     // Catch:{ SQLiteException -> 0x0a5a, IOException -> 0x0a40, all -> 0x0a29 }
                java.lang.String r8 = "SELECT C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11 FROM VLS WHERE C3 <> '' ORDER BY rowid ASC"
                r9 = 0
                android.database.Cursor r7 = r7.rawQuery(r8, r9)     // Catch:{ SQLiteException -> 0x0a5a, IOException -> 0x0a40, all -> 0x0a29 }
                if (r7 == 0) goto L_0x0833
                int r8 = r7.getCount()     // Catch:{ SQLiteException -> 0x0819, IOException -> 0x07ff, all -> 0x07e7 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SQLiteException -> 0x0819, IOException -> 0x07ff, all -> 0x07e7 }
                int r9 = r8.intValue()     // Catch:{ SQLiteException -> 0x0819, IOException -> 0x07ff, all -> 0x07e7 }
                if (r9 <= 0) goto L_0x0833
                boolean r9 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0819, IOException -> 0x07ff, all -> 0x07e7 }
                if (r9 == 0) goto L_0x0833
                java.lang.String r9 = "C1"
                int r9 = r7.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x0819, IOException -> 0x07ff, all -> 0x07e7 }
                java.lang.String r15 = "C2"
                int r15 = r7.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x0819, IOException -> 0x07ff, all -> 0x07e7 }
                r27 = r3
                java.lang.String r3 = "C3"
                int r3 = r7.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x0819, IOException -> 0x07ff, all -> 0x07e7 }
                r28 = r10
                java.lang.String r10 = "C4"
                int r10 = r7.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x07e3, IOException -> 0x07df, all -> 0x07db }
                r29 = r11
                java.lang.String r11 = "C5"
                int r11 = r7.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x07c2, IOException -> 0x07a9, all -> 0x0792 }
                r30 = r12
                java.lang.String r12 = "C6"
                int r12 = r7.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x078e, IOException -> 0x078a, all -> 0x0786 }
                r31 = r13
                java.lang.String r13 = "C7"
                int r13 = r7.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x076e, IOException -> 0x0756, all -> 0x0740 }
                r32 = r14
                java.lang.String r14 = "C8"
                int r14 = r7.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x073c, IOException -> 0x0738, all -> 0x0734 }
                r33 = r2
                java.lang.String r2 = "C9"
                int r2 = r7.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x0732, IOException -> 0x0730, all -> 0x072e }
                r34 = r5
                java.lang.String r5 = "C10"
                int r5 = r7.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x072a, IOException -> 0x0726, all -> 0x0722 }
                r35 = r6
                java.lang.String r6 = "C11"
                int r6 = r7.getColumnIndex(r6)     // Catch:{ SQLiteException -> 0x072a, IOException -> 0x0726, all -> 0x0722 }
            L_0x0407:
                int r27 = r27.intValue()     // Catch:{ SQLiteException -> 0x072a, IOException -> 0x0726, all -> 0x0722 }
                r19 = 1
                int r27 = r27 + 1
                java.lang.Integer r27 = java.lang.Integer.valueOf(r27)     // Catch:{ SQLiteException -> 0x072a, IOException -> 0x0726, all -> 0x0722 }
                int r36 = r27.intValue()     // Catch:{ SQLiteException -> 0x072a, IOException -> 0x0726, all -> 0x0722 }
                int r36 = r36 % 100
                if (r36 != 0) goto L_0x04d0
                r36 = r4
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                com.repo.MyDB r4 = r4.d     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.Boolean r4 = r4.d     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                boolean r4 = r4.booleanValue()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r37 = r6
                r6 = 1
                if (r6 != r4) goto L_0x045f
                java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r6.<init>()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r38 = r5
                java.lang.String r5 = "Please wait. Updating the diary now.\nRow: "
                r6.append(r5)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r5 = r27.toString()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r6.append(r5)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r5 = " of "
                r6.append(r5)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r5 = r8.toString()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r6.append(r5)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r5 = "."
                r6.append(r5)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r5 = r6.toString()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r4[r20] = r5     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r1.publishProgress(r4)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                goto L_0x04d6
            L_0x045f:
                r38 = r5
                r4 = 1
                java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r4.<init>()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r6 = "Sila tunggu. Kemaskini diary sedang dijalankan.\nBaris: "
                r4.append(r6)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r6 = r27.toString()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r4.append(r6)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r6 = " daripada "
                r4.append(r6)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r6 = r8.toString()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r4.append(r6)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r6 = "."
                r4.append(r6)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r5[r20] = r4     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                r1.publishProgress(r5)     // Catch:{ SQLiteException -> 0x04ba, IOException -> 0x04a4, all -> 0x0490 }
                goto L_0x04d6
            L_0x0490:
                r0 = move-exception
                r2 = r0
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                r14 = r36
                goto L_0x0c1d
            L_0x04a4:
                r0 = move-exception
                r2 = r0
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                r14 = r36
                goto L_0x0aa6
            L_0x04ba:
                r0 = move-exception
                r2 = r0
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                r14 = r36
                goto L_0x0b6d
            L_0x04d0:
                r36 = r4
                r38 = r5
                r37 = r6
            L_0x04d6:
                java.lang.String r4 = r7.getString(r9)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r4 = com.repo.r.l(r4)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r5 = r7.getString(r15)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r5 = com.repo.r.l(r5)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r6 = r7.getString(r3)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r6 = com.repo.r.l(r6)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r39 = r7.getString(r10)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.r.l(r39)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r39 = r7.getString(r11)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.r.l(r39)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r39 = r7.getString(r12)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r39 = com.repo.r.l(r39)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r40 = r7.getString(r13)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r40 = r7.getString(r14)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r41 = r3
                java.lang.String r3 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r40 = r7.getString(r2)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r42 = r2
                java.lang.String r2 = com.repo.r.l(r40)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r40 = r8
                r8 = r38
                java.lang.String r38 = r7.getString(r8)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r43 = r8
                java.lang.String r8 = com.repo.r.l(r38)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r38 = r9
                r9 = r37
                java.lang.String r37 = r7.getString(r9)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r44 = r9
                java.lang.String r9 = com.repo.r.l(r37)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r37 = r10
                com.repo.RepoActivity r10 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r10 = r10.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r10 = r10.U     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r10 = r10.g(r6)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r45 = r11
                com.repo.RepoActivity r11 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r11 = r11.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r11 = r11.T     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r10 = r11.h(r10)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r10 = com.repo.r.i(r10)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.RepoActivity r11 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r11 = r11.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                org.sqlite.database.sqlite.SQLiteDatabase r11 = r11.P     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r46 = r12
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r12.<init>()     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r47 = r13
                java.lang.String r13 = "SELECT C2,C3,C4,C5 FROM VLD WHERE C1 = '"
                r12.append(r13)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r12.append(r10)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r10 = "'"
                r12.append(r10)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r10 = r12.toString()     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r12 = 0
                android.database.Cursor r10 = r11.rawQuery(r10, r12)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                if (r10 == 0) goto L_0x06d6
                int r11 = r10.getCount()     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                if (r11 <= 0) goto L_0x068b
                boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                if (r11 == 0) goto L_0x0680
                com.repo.RepoActivity r11 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r11 = r11.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r11 = r11.U     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.RepoActivity r12 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r12 = r12.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r12 = r12.S     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r13 = "C2"
                int r13 = r10.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r13 = r10.getString(r13)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r12 = r12.g(r13)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r12 = com.repo.r.c(r12)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r11 = r11.h(r12)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.RepoActivity r12 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r12 = r12.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r12 = r12.U     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.RepoActivity r13 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r13 = r13.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r13 = r13.S     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r48 = r14
                java.lang.String r14 = "C3"
                int r14 = r10.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r14 = r10.getString(r14)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r13 = r13.g(r14)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r12 = r12.h(r13)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.RepoActivity r13 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r13 = r13.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r13 = r13.S     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r14 = "C4"
                int r14 = r10.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r14 = r10.getString(r14)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r13 = r13.g(r14)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r13 = com.repo.r.c(r13)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.RepoActivity r14 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r14 = r14.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r14 = r14.U     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r49 = r15
                com.repo.RepoActivity r15 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.MyDB r15 = r15.d     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                com.repo.t r15 = r15.S     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r50 = r7
                java.lang.String r7 = "C5"
                int r7 = r10.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r7 = r10.getString(r7)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r7 = r15.g(r7)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r7 = com.repo.r.c(r7)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                java.lang.String r7 = r14.h(r7)     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r36.clearBindings()     // Catch:{ SQLiteException -> 0x071d, IOException -> 0x0718, all -> 0x0713 }
                r14 = r36
                r15 = 1
                r14.bindString(r15, r4)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                boolean r4 = com.repo.r.s(r39)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                if (r4 == 0) goto L_0x0634
                java.lang.String r2 = "2"
                r4 = 2
            L_0x0630:
                r14.bindString(r4, r2)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                goto L_0x064c
            L_0x0634:
                com.repo.RepoActivity r4 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                com.repo.MyDB r4 = r4.d     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                java.lang.String r4 = r4.h     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                boolean r2 = r4.equals(r2)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r4 = 1
                if (r4 != r2) goto L_0x0648
                r2 = 2
                r14.bindString(r2, r5)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                goto L_0x064c
            L_0x0648:
                java.lang.String r2 = "1"
                r4 = 2
                goto L_0x0630
            L_0x064c:
                r2 = 3
                r14.bindString(r2, r6)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 4
                r14.bindString(r2, r11)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 5
                r14.bindString(r2, r12)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 6
                r14.bindString(r2, r13)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 7
                r14.bindString(r2, r7)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 8
                r14.bindString(r2, r3)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 9
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                com.repo.MyDB r3 = r3.d     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                java.lang.String r3 = r3.h     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r14.bindString(r2, r3)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 10
                r14.bindString(r2, r8)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 11
                r14.bindString(r2, r9)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r14.executeInsert()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                goto L_0x0688
            L_0x0680:
                r50 = r7
                r48 = r14
                r49 = r15
                r14 = r36
            L_0x0688:
                r5 = r35
                goto L_0x06e0
            L_0x068b:
                r50 = r7
                r48 = r14
                r49 = r15
                r14 = r36
                r14.clearBindings()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 1
                r14.bindString(r2, r4)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                java.lang.String r2 = "0"
                r4 = 2
                r14.bindString(r4, r2)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 3
                r14.bindString(r2, r6)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 4
                r5 = r35
                r14.bindString(r2, r5)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 5
                r14.bindString(r2, r5)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 6
                r14.bindString(r2, r5)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 7
                r14.bindString(r2, r5)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 8
                r14.bindString(r2, r3)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 9
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                com.repo.MyDB r3 = r3.d     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                java.lang.String r3 = r3.h     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r14.bindString(r2, r3)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 10
                r14.bindString(r2, r8)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r2 = 11
                r14.bindString(r2, r9)     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                r14.executeInsert()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                goto L_0x06e1
            L_0x06d6:
                r50 = r7
                r48 = r14
                r49 = r15
                r5 = r35
                r14 = r36
            L_0x06e0:
                r4 = 2
            L_0x06e1:
                if (r10 == 0) goto L_0x06ec
                boolean r2 = r10.isClosed()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                if (r2 != 0) goto L_0x06ec
                r10.close()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
            L_0x06ec:
                boolean r2 = r50.moveToNext()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                if (r2 != 0) goto L_0x06f4
                goto L_0x0845
            L_0x06f4:
                r35 = r5
                r4 = r14
                r10 = r37
                r9 = r38
                r8 = r40
                r3 = r41
                r2 = r42
                r5 = r43
                r6 = r44
                r11 = r45
                r12 = r46
                r13 = r47
                r14 = r48
                r15 = r49
                r7 = r50
                goto L_0x0407
            L_0x0713:
                r0 = move-exception
                r14 = r36
                goto L_0x0852
            L_0x0718:
                r0 = move-exception
                r14 = r36
                goto L_0x0864
            L_0x071d:
                r0 = move-exception
                r14 = r36
                goto L_0x0878
            L_0x0722:
                r0 = move-exception
                r14 = r4
                goto L_0x0852
            L_0x0726:
                r0 = move-exception
                r14 = r4
                goto L_0x0864
            L_0x072a:
                r0 = move-exception
                r14 = r4
                goto L_0x0878
            L_0x072e:
                r0 = move-exception
                goto L_0x0745
            L_0x0730:
                r0 = move-exception
                goto L_0x075b
            L_0x0732:
                r0 = move-exception
                goto L_0x0773
            L_0x0734:
                r0 = move-exception
                r33 = r2
                goto L_0x0745
            L_0x0738:
                r0 = move-exception
                r33 = r2
                goto L_0x075b
            L_0x073c:
                r0 = move-exception
                r33 = r2
                goto L_0x0773
            L_0x0740:
                r0 = move-exception
                r33 = r2
                r32 = r14
            L_0x0745:
                r14 = r4
                r2 = r0
                r3 = r5
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                goto L_0x0c1d
            L_0x0756:
                r0 = move-exception
                r33 = r2
                r32 = r14
            L_0x075b:
                r14 = r4
                r2 = r0
                r3 = r5
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                goto L_0x0aa6
            L_0x076e:
                r0 = move-exception
                r33 = r2
                r32 = r14
            L_0x0773:
                r14 = r4
                r2 = r0
                r3 = r5
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                goto L_0x0b6d
            L_0x0786:
                r0 = move-exception
                r33 = r2
                goto L_0x0797
            L_0x078a:
                r0 = move-exception
                r33 = r2
                goto L_0x07ae
            L_0x078e:
                r0 = move-exception
                r33 = r2
                goto L_0x07c7
            L_0x0792:
                r0 = move-exception
                r33 = r2
                r30 = r12
            L_0x0797:
                r32 = r14
                r14 = r4
                r2 = r0
                r3 = r5
                r6 = r13
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                goto L_0x0c1d
            L_0x07a9:
                r0 = move-exception
                r33 = r2
                r30 = r12
            L_0x07ae:
                r32 = r14
                r14 = r4
                r2 = r0
                r3 = r5
                r6 = r13
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                goto L_0x0aa6
            L_0x07c2:
                r0 = move-exception
                r33 = r2
                r30 = r12
            L_0x07c7:
                r32 = r14
                r14 = r4
                r2 = r0
                r3 = r5
                r6 = r13
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                goto L_0x0b6d
            L_0x07db:
                r0 = move-exception
                r33 = r2
                goto L_0x07ec
            L_0x07df:
                r0 = move-exception
                r33 = r2
                goto L_0x0804
            L_0x07e3:
                r0 = move-exception
                r33 = r2
                goto L_0x081e
            L_0x07e7:
                r0 = move-exception
                r33 = r2
                r28 = r10
            L_0x07ec:
                r30 = r12
                r32 = r14
                r14 = r4
                r2 = r0
                r3 = r5
                r7 = r11
                r6 = r13
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                goto L_0x0c1d
            L_0x07ff:
                r0 = move-exception
                r33 = r2
                r28 = r10
            L_0x0804:
                r30 = r12
                r32 = r14
                r14 = r4
                r2 = r0
                r3 = r5
                r7 = r11
                r6 = r13
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                goto L_0x0aa6
            L_0x0819:
                r0 = move-exception
                r33 = r2
                r28 = r10
            L_0x081e:
                r30 = r12
                r32 = r14
                r14 = r4
                r2 = r0
                r3 = r5
                r7 = r11
                r6 = r13
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                goto L_0x0b6d
            L_0x0833:
                r33 = r2
                r34 = r5
                r5 = r6
                r50 = r7
                r28 = r10
                r29 = r11
                r30 = r12
                r31 = r13
                r32 = r14
                r14 = r4
            L_0x0845:
                if (r50 == 0) goto L_0x088b
                boolean r2 = r50.isClosed()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                if (r2 != 0) goto L_0x088b
                r50.close()     // Catch:{ SQLiteException -> 0x0877, IOException -> 0x0863, all -> 0x0851 }
                goto L_0x088b
            L_0x0851:
                r0 = move-exception
            L_0x0852:
                r2 = r0
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                goto L_0x0c1d
            L_0x0863:
                r0 = move-exception
            L_0x0864:
                r2 = r0
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                goto L_0x0aa6
            L_0x0877:
                r0 = move-exception
            L_0x0878:
                r2 = r0
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                goto L_0x0b6d
            L_0x088b:
                r34.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0a16, IOException -> 0x0a04, all -> 0x09f3 }
                java.lang.Boolean r2 = com.repo.r.f760a
                boolean r3 = r2.booleanValue()
                r4 = 1
                if (r4 != r3) goto L_0x089e
                java.lang.String[] r3 = new java.lang.String[r4]
                r3[r20] = r33
                r1.publishProgress(r3)
            L_0x089e:
                r34.endTransaction()
                if (r14 == 0) goto L_0x08a6
                r14.close()
            L_0x08a6:
                java.lang.String[] r3 = new java.lang.String[r4]
                r3[r20] = r32
                r1.publishProgress(r3)
                r6 = r31
                r3 = r34
                r3.execSQL(r6)
                java.lang.String[] r6 = new java.lang.String[r4]
                r6[r20] = r30
                r1.publishProgress(r6)
                r7 = r29
                r3.execSQL(r7)
                java.lang.String[] r6 = new java.lang.String[r4]
                r6[r20] = r28
                r1.publishProgress(r6)
                r8 = r25
                r3.execSQL(r8)
                java.lang.String[] r6 = new java.lang.String[r4]
                r6[r20] = r24
                r1.publishProgress(r6)
                r9 = r23
                r3.execSQL(r9)
                java.lang.String[] r6 = new java.lang.String[r4]
                r6[r20] = r22
                r1.publishProgress(r6)
                r10 = r21
                r3.execSQL(r10)
                java.lang.String[] r6 = new java.lang.String[r4]
                r6[r20] = r18
                r1.publishProgress(r6)
                r11 = r17
                r3.execSQL(r11)
                java.lang.String[] r6 = new java.lang.String[r4]
                r6[r20] = r52
                r1.publishProgress(r6)
                java.lang.String r6 = "CREATE INDEX IF NOT EXISTS idxC10 ON VLS(C10)"
                r3.execSQL(r6)
                java.lang.String[] r6 = new java.lang.String[r4]
                java.lang.String r7 = "Save Data. Step 8 of 8."
                r6[r20] = r7
                r1.publishProgress(r6)
                java.lang.String r6 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r3.execSQL(r6)
                boolean r6 = r2.booleanValue()
                if (r4 != r6) goto L_0x0919
                java.lang.String[] r6 = new java.lang.String[r4]
                java.lang.String r7 = "CLOSE."
                r6[r20] = r7
                r1.publishProgress(r6)
            L_0x0919:
                r3.close()
                boolean r3 = r2.booleanValue()     // Catch:{ Exception -> 0x09c1 }
                if (r4 != r3) goto L_0x092b
                java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ Exception -> 0x09c1 }
                java.lang.String r4 = "delete_File."
                r3[r20] = r4     // Catch:{ Exception -> 0x09c1 }
                r1.publishProgress(r3)     // Catch:{ Exception -> 0x09c1 }
            L_0x092b:
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r3 = r3.d     // Catch:{ Exception -> 0x09c1 }
                java.lang.String r3 = r3.E     // Catch:{ Exception -> 0x09c1 }
                com.repo.r.p(r3)     // Catch:{ Exception -> 0x09c1 }
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x09c1 }
                r4 = r26
                r3.<init>(r4)     // Catch:{ Exception -> 0x09c1 }
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x09c1 }
                com.repo.RepoActivity r6 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r6 = r6.d     // Catch:{ Exception -> 0x09c1 }
                java.lang.String r6 = r6.E     // Catch:{ Exception -> 0x09c1 }
                r4.<init>(r6)     // Catch:{ Exception -> 0x09c1 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x09c1 }
                r6 = 1
                if (r6 != r2) goto L_0x095a
                java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ Exception -> 0x09c1 }
                java.lang.String r6 = "rename_File."
                r2[r20] = r6     // Catch:{ Exception -> 0x09c1 }
                r1.publishProgress(r2)     // Catch:{ Exception -> 0x09c1 }
            L_0x095a:
                r3.renameTo(r4)     // Catch:{ Exception -> 0x09c1 }
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x09c1 }
                r2.p(r3)     // Catch:{ Exception -> 0x09c1 }
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q     // Catch:{ Exception -> 0x09c1 }
                if (r2 != 0) goto L_0x0980
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q     // Catch:{ Exception -> 0x09c1 }
                boolean r2 = r2.isOpen()     // Catch:{ Exception -> 0x09c1 }
                if (r2 == 0) goto L_0x0994
            L_0x0980:
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.Q     // Catch:{ Exception -> 0x09c1 }
                r2.close()     // Catch:{ Exception -> 0x09c1 }
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                r4 = 0
                r2.Q = r4     // Catch:{ Exception -> 0x09c1 }
            L_0x0994:
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                r2.p(r3)     // Catch:{ Exception -> 0x09c1 }
                com.repo.RepoActivity r2 = com.repo.RepoActivity.this     // Catch:{ Exception -> 0x09c1 }
                com.repo.MyDB r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                java.lang.Boolean r2 = r2.d     // Catch:{ Exception -> 0x09c1 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x09c1 }
                r3 = 1
                if (r3 != r2) goto L_0x09b6
                java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ Exception -> 0x09c1 }
                java.lang.String r3 = "Finish, Your diary has been updated."
                r2[r20] = r3     // Catch:{ Exception -> 0x09c1 }
                r1.publishProgress(r2)     // Catch:{ Exception -> 0x09c1 }
                goto L_0x09c0
            L_0x09b6:
                r2 = 1
                java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x09c1 }
                java.lang.String r3 = "Selesai, Diary anda sudah dikemaskini."
                r2[r20] = r3     // Catch:{ Exception -> 0x09c1 }
                r1.publishProgress(r2)     // Catch:{ Exception -> 0x09c1 }
            L_0x09c0:
                return r5
            L_0x09c1:
                r0 = move-exception
                r2 = r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbUpdateDiary 6 : "
                r3.append(r4)
                java.lang.String r4 = r2.getMessage()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r5 = r16
                android.util.Log.e(r5, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbUpdateDiary 6 : "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                return r2
            L_0x09f3:
                r0 = move-exception
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                goto L_0x0c1c
            L_0x0a04:
                r0 = move-exception
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                goto L_0x0a57
            L_0x0a16:
                r0 = move-exception
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r7 = r29
                r6 = r31
                r3 = r34
                goto L_0x0a71
            L_0x0a29:
                r0 = move-exception
                r33 = r2
                r3 = r5
                r28 = r10
                r7 = r11
                r30 = r12
                r6 = r13
                r32 = r14
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r14 = r4
                goto L_0x0c1c
            L_0x0a40:
                r0 = move-exception
                r33 = r2
                r3 = r5
                r28 = r10
                r7 = r11
                r30 = r12
                r6 = r13
                r32 = r14
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r14 = r4
            L_0x0a57:
                r2 = r0
                goto L_0x0aa6
            L_0x0a5a:
                r0 = move-exception
                r33 = r2
                r3 = r5
                r28 = r10
                r7 = r11
                r30 = r12
                r6 = r13
                r32 = r14
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r14 = r4
            L_0x0a71:
                r2 = r0
                goto L_0x0b6d
            L_0x0a74:
                r0 = move-exception
                r33 = r2
                r3 = r5
                r28 = r10
                r7 = r11
                r30 = r12
                r6 = r13
                r32 = r14
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r4 = 0
                r2 = r0
                r14 = r4
                goto L_0x0c1d
            L_0x0a8d:
                r0 = move-exception
                r33 = r2
                r3 = r5
                r28 = r10
                r7 = r11
                r30 = r12
                r6 = r13
                r32 = r14
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r4 = 0
                r2 = r0
                r14 = r4
            L_0x0aa6:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1b }
                r4.<init>()     // Catch:{ all -> 0x0c1b }
                java.lang.String r12 = "Error : dbUpdateDiary 5 : "
                r4.append(r12)     // Catch:{ all -> 0x0c1b }
                java.lang.String r12 = r2.getMessage()     // Catch:{ all -> 0x0c1b }
                r4.append(r12)     // Catch:{ all -> 0x0c1b }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0c1b }
                android.util.Log.e(r5, r4)     // Catch:{ all -> 0x0c1b }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1b }
                r4.<init>()     // Catch:{ all -> 0x0c1b }
                java.lang.String r5 = "Error : dbUpdateDiary 5 : "
                r4.append(r5)     // Catch:{ all -> 0x0c1b }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0c1b }
                r4.append(r2)     // Catch:{ all -> 0x0c1b }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0c1b }
                java.lang.Boolean r4 = com.repo.r.f760a
                boolean r5 = r4.booleanValue()
                r12 = 1
                if (r12 != r5) goto L_0x0ae3
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r33
                r1.publishProgress(r5)
            L_0x0ae3:
                r3.endTransaction()
                if (r14 == 0) goto L_0x0aeb
                r14.close()
            L_0x0aeb:
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r32
                r1.publishProgress(r5)
                r3.execSQL(r6)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r30
                r1.publishProgress(r5)
                r3.execSQL(r7)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r28
                r1.publishProgress(r5)
                r3.execSQL(r8)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r24
                r1.publishProgress(r5)
                r3.execSQL(r9)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r22
                r1.publishProgress(r5)
                r3.execSQL(r10)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r18
                r1.publishProgress(r5)
                r3.execSQL(r11)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r52
                r1.publishProgress(r5)
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC10 ON VLS(C10)"
                r3.execSQL(r5)
                java.lang.String[] r5 = new java.lang.String[r12]
                java.lang.String r6 = "Save Data. Step 8 of 8."
                r5[r20] = r6
                r1.publishProgress(r5)
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r3.execSQL(r5)
                boolean r4 = r4.booleanValue()
                if (r12 != r4) goto L_0x0b50
                java.lang.String[] r4 = new java.lang.String[r12]
                java.lang.String r5 = "CLOSE."
                r4[r20] = r5
                r1.publishProgress(r4)
            L_0x0b50:
                r3.close()
                return r2
            L_0x0b54:
                r0 = move-exception
                r33 = r2
                r3 = r5
                r28 = r10
                r7 = r11
                r30 = r12
                r6 = r13
                r32 = r14
                r5 = r16
                r11 = r17
                r10 = r21
                r9 = r23
                r8 = r25
                r4 = 0
                r2 = r0
                r14 = r4
            L_0x0b6d:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1b }
                r4.<init>()     // Catch:{ all -> 0x0c1b }
                java.lang.String r12 = "Error : dbUpdateDiary 4 : "
                r4.append(r12)     // Catch:{ all -> 0x0c1b }
                java.lang.String r12 = r2.getMessage()     // Catch:{ all -> 0x0c1b }
                r4.append(r12)     // Catch:{ all -> 0x0c1b }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0c1b }
                android.util.Log.e(r5, r4)     // Catch:{ all -> 0x0c1b }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1b }
                r4.<init>()     // Catch:{ all -> 0x0c1b }
                java.lang.String r5 = "Error : dbUpdateDiary 4 : "
                r4.append(r5)     // Catch:{ all -> 0x0c1b }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0c1b }
                r4.append(r2)     // Catch:{ all -> 0x0c1b }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0c1b }
                java.lang.Boolean r4 = com.repo.r.f760a
                boolean r5 = r4.booleanValue()
                r12 = 1
                if (r12 != r5) goto L_0x0baa
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r33
                r1.publishProgress(r5)
            L_0x0baa:
                r3.endTransaction()
                if (r14 == 0) goto L_0x0bb2
                r14.close()
            L_0x0bb2:
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r32
                r1.publishProgress(r5)
                r3.execSQL(r6)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r30
                r1.publishProgress(r5)
                r3.execSQL(r7)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r28
                r1.publishProgress(r5)
                r3.execSQL(r8)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r24
                r1.publishProgress(r5)
                r3.execSQL(r9)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r22
                r1.publishProgress(r5)
                r3.execSQL(r10)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r18
                r1.publishProgress(r5)
                r3.execSQL(r11)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r52
                r1.publishProgress(r5)
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC10 ON VLS(C10)"
                r3.execSQL(r5)
                java.lang.String[] r5 = new java.lang.String[r12]
                java.lang.String r6 = "Save Data. Step 8 of 8."
                r5[r20] = r6
                r1.publishProgress(r5)
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r3.execSQL(r5)
                boolean r4 = r4.booleanValue()
                if (r12 != r4) goto L_0x0c17
                java.lang.String[] r4 = new java.lang.String[r12]
                java.lang.String r5 = "CLOSE."
                r4[r20] = r5
                r1.publishProgress(r4)
            L_0x0c17:
                r3.close()
                return r2
            L_0x0c1b:
                r0 = move-exception
            L_0x0c1c:
                r2 = r0
            L_0x0c1d:
                java.lang.Boolean r4 = com.repo.r.f760a
                boolean r5 = r4.booleanValue()
                r12 = 1
                if (r12 != r5) goto L_0x0c2d
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r33
                r1.publishProgress(r5)
            L_0x0c2d:
                r3.endTransaction()
                if (r14 == 0) goto L_0x0c35
                r14.close()
            L_0x0c35:
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r32
                r1.publishProgress(r5)
                r3.execSQL(r6)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r30
                r1.publishProgress(r5)
                r3.execSQL(r7)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r28
                r1.publishProgress(r5)
                r3.execSQL(r8)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r24
                r1.publishProgress(r5)
                r3.execSQL(r9)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r22
                r1.publishProgress(r5)
                r3.execSQL(r10)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r18
                r1.publishProgress(r5)
                r3.execSQL(r11)
                java.lang.String[] r5 = new java.lang.String[r12]
                r5[r20] = r52
                r1.publishProgress(r5)
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC10 ON VLS(C10)"
                r3.execSQL(r5)
                java.lang.String[] r5 = new java.lang.String[r12]
                java.lang.String r6 = "Save Data. Step 8 of 8."
                r5[r20] = r6
                r1.publishProgress(r5)
                java.lang.String r5 = "CREATE INDEX IF NOT EXISTS idxC11 ON VLS(C11)"
                r3.execSQL(r5)
                boolean r4 = r4.booleanValue()
                if (r12 != r4) goto L_0x0c9a
                java.lang.String[] r4 = new java.lang.String[r12]
                java.lang.String r5 = "CLOSE."
                r4[r20] = r5
                r1.publishProgress(r4)
            L_0x0c9a:
                r3.close()
                throw r2
            L_0x0c9e:
                r0 = move-exception
                r3 = r2
            L_0x0ca0:
                r2 = r0
                goto L_0x0cf3
            L_0x0ca2:
                r0 = move-exception
                r33 = r2
                r5 = r16
                r2 = r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cef }
                r3.<init>()     // Catch:{ all -> 0x0cef }
                java.lang.String r4 = "Error : dbUpdateDiary 3 : "
                r3.append(r4)     // Catch:{ all -> 0x0cef }
                java.lang.String r4 = r2.getMessage()     // Catch:{ all -> 0x0cef }
                r3.append(r4)     // Catch:{ all -> 0x0cef }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0cef }
                android.util.Log.e(r5, r3)     // Catch:{ all -> 0x0cef }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cef }
                r3.<init>()     // Catch:{ all -> 0x0cef }
                java.lang.String r4 = "Error : dbUpdateDiary 3 : "
                r3.append(r4)     // Catch:{ all -> 0x0cef }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0cef }
                r3.append(r2)     // Catch:{ all -> 0x0cef }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0cef }
                java.lang.Boolean r3 = com.repo.r.f760a
                boolean r3 = r3.booleanValue()
                r4 = 1
                if (r4 != r3) goto L_0x0ce3
                r3 = r33
                android.util.Log.d(r15, r3)
            L_0x0ce3:
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this
                com.repo.MyDB r3 = r3.d
                org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.Q
                r3.endTransaction()
                return r2
            L_0x0cef:
                r0 = move-exception
                r3 = r33
                goto L_0x0ca0
            L_0x0cf3:
                java.lang.Boolean r4 = com.repo.r.f760a
                boolean r4 = r4.booleanValue()
                r5 = 1
                if (r5 != r4) goto L_0x0cff
                android.util.Log.d(r15, r3)
            L_0x0cff:
                com.repo.RepoActivity r3 = com.repo.RepoActivity.this
                com.repo.MyDB r3 = r3.d
                org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.Q
                r3.endTransaction()
                throw r2
            L_0x0d0b:
                r0 = move-exception
                r3 = r5
            L_0x0d0d:
                r2 = r0
                goto L_0x0d4c
            L_0x0d0f:
                r0 = move-exception
                r3 = r5
                r5 = r16
                r2 = r0
            L_0x0d14:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d4a }
                r4.<init>()     // Catch:{ all -> 0x0d4a }
                java.lang.String r6 = "Error : dbUpdateDiary 2 : "
                r4.append(r6)     // Catch:{ all -> 0x0d4a }
                java.lang.String r6 = r2.getMessage()     // Catch:{ all -> 0x0d4a }
                r4.append(r6)     // Catch:{ all -> 0x0d4a }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0d4a }
                android.util.Log.e(r5, r4)     // Catch:{ all -> 0x0d4a }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d4a }
                r4.<init>()     // Catch:{ all -> 0x0d4a }
                java.lang.String r5 = "Error : dbUpdateDiary 2 : "
                r4.append(r5)     // Catch:{ all -> 0x0d4a }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0d4a }
                r4.append(r2)     // Catch:{ all -> 0x0d4a }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0d4a }
                r3.endTransaction()
                if (r7 == 0) goto L_0x0d49
                r7.close()
            L_0x0d49:
                return r2
            L_0x0d4a:
                r0 = move-exception
                goto L_0x0d0d
            L_0x0d4c:
                r3.endTransaction()
                if (r7 == 0) goto L_0x0d54
                r7.close()
            L_0x0d54:
                throw r2
            L_0x0d55:
                r0 = move-exception
                r5 = r16
                r2 = r0
            L_0x0d59:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbUpdateDiary 1 : "
                r3.append(r4)
                java.lang.String r4 = r2.getMessage()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.e(r5, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error : dbUpdateDiary 1 : "
                r3.append(r4)
                java.lang.String r2 = r2.getMessage()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.repo.RepoActivity.h1.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (this.f622a.isShowing()) {
                this.f622a.dismiss();
            }
            if (true == str.startsWith("Error")) {
                r.t(RepoActivity.this, str);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(String... strArr) {
            this.f622a.setMessage(strArr[0]);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            String str;
            ProgressDialog progressDialog;
            if (true == RepoActivity.this.d.d.booleanValue()) {
                progressDialog = this.f622a;
                str = "Please wait..";
            } else {
                progressDialog = this.f622a;
                str = "Sila tunggu..";
            }
            progressDialog.setMessage(str);
            this.f622a.setCancelable(false);
            this.f622a.show();
        }
    }

    class i implements View.OnFocusChangeListener {
        i() {
        }

        public void onFocusChange(View view, boolean z) {
            if (true == z) {
                RepoActivity repoActivity = RepoActivity.this;
                repoActivity.g1(repoActivity.m);
            }
        }
    }

    class i0 implements View.OnClickListener {
        i0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("PERODUA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(7);
            RepoActivity.this.r0.dismiss();
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            RepoActivity repoActivity = RepoActivity.this;
            repoActivity.g1(repoActivity.P);
        }
    }

    class j0 implements View.OnClickListener {
        j0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("PERSONA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(7);
            RepoActivity.this.r0.dismiss();
        }
    }

    class k implements View.OnFocusChangeListener {
        k() {
        }

        public void onFocusChange(View view, boolean z) {
            if (true == z) {
                RepoActivity repoActivity = RepoActivity.this;
                repoActivity.g1(repoActivity.P);
            }
        }
    }

    class k0 implements View.OnClickListener {
        k0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("PROTON", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(6);
            RepoActivity.this.r0.dismiss();
        }
    }

    class l implements View.OnClickListener {
        l() {
        }

        public void onClick(View view) {
            RepoActivity repoActivity = RepoActivity.this;
            repoActivity.g1(repoActivity.T);
        }
    }

    class l0 implements View.OnClickListener {
        l0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("PUTRA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(5);
            RepoActivity.this.r0.dismiss();
        }
    }

    class m implements View.OnFocusChangeListener {
        m() {
        }

        public void onFocusChange(View view, boolean z) {
            if (true == z) {
                RepoActivity repoActivity = RepoActivity.this;
                repoActivity.g1(repoActivity.T);
            }
        }
    }

    class m0 implements View.OnClickListener {
        m0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("PUTRAJAYA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(9);
            RepoActivity.this.r0.dismiss();
        }
    }

    class n implements View.OnClickListener {
        n() {
        }

        public void onClick(View view) {
            RepoActivity repoActivity = RepoActivity.this;
            repoActivity.g1(repoActivity.V);
        }
    }

    class n0 implements View.OnClickListener {
        n0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("RIMAU", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(5);
            RepoActivity.this.r0.dismiss();
        }
    }

    class o implements View.OnFocusChangeListener {
        o() {
        }

        public void onFocusChange(View view, boolean z) {
            if (true == z) {
                RepoActivity repoActivity = RepoActivity.this;
                repoActivity.g1(repoActivity.V);
            }
        }
    }

    class o0 implements View.OnClickListener {
        o0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("SATRIA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(6);
            RepoActivity.this.r0.dismiss();
        }
    }

    class p implements MediaPlayer.OnCompletionListener {
        p() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            RepoActivity.this.o1();
        }
    }

    class p0 implements View.OnClickListener {
        p0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("SUKOM", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(5);
            RepoActivity.this.r0.dismiss();
        }
    }

    class q implements DialogInterface.OnClickListener {
        q() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (true == RepoActivity.this.d.f().booleanValue()) {
                RepoActivity.this.p.setText(BuildConfig.FLAVOR);
                RepoActivity.this.d.t("FH1", BuildConfig.FLAVOR);
            }
        }
    }

    class q0 implements View.OnClickListener {
        q0() {
        }

        public void onClick(View view) {
            RepoActivity repoActivity;
            String str;
            RepoActivity repoActivity2 = RepoActivity.this;
            String unused = repoActivity2.c0 = repoActivity2.N.getText().toString().toUpperCase().trim();
            if (RepoActivity.this.c0.equals(BuildConfig.FLAVOR)) {
                if (true == RepoActivity.this.d.d.booleanValue()) {
                    repoActivity = RepoActivity.this;
                    str = "Please keyin the PlateNo.";
                } else {
                    repoActivity = RepoActivity.this;
                    str = "Sila masukkan PlateNo.";
                }
                r.v(repoActivity, str, 1);
                RepoActivity.this.n.requestFocus();
                return;
            }
            RepoActivity repoActivity3 = RepoActivity.this;
            String unused2 = repoActivity3.f0 = repoActivity3.P.getText().toString().toUpperCase().trim();
            RepoActivity repoActivity4 = RepoActivity.this;
            String unused3 = repoActivity4.d0 = repoActivity4.R.getText().toString().toUpperCase().trim();
            RepoActivity repoActivity5 = RepoActivity.this;
            String unused4 = repoActivity5.e0 = repoActivity5.T.getText().toString().toUpperCase().trim();
            RepoActivity repoActivity6 = RepoActivity.this;
            String unused5 = repoActivity6.g0 = repoActivity6.V.getText().toString().toUpperCase().trim();
            RepoActivity repoActivity7 = RepoActivity.this;
            String unused6 = repoActivity7.i0 = r.r(repoActivity7.X.getText().toString().toUpperCase().trim());
            if (true == r.s(RepoActivity.this.i0)) {
                String unused7 = RepoActivity.this.i0 = "NULL";
            }
            if (true == RepoActivity.this.d.r(RepoActivity.this.c0).booleanValue()) {
                RepoActivity.this.d.v(RepoActivity.this.c0, RepoActivity.this.f0, RepoActivity.this.d0, RepoActivity.this.e0, RepoActivity.this.g0, RepoActivity.this.i0);
            } else {
                RepoActivity.this.d.n(RepoActivity.this.c0, RepoActivity.this.f0, RepoActivity.this.d0, RepoActivity.this.e0, RepoActivity.this.g0, RepoActivity.this.i0);
            }
            RepoActivity.this.d.u("CLF", "0");
            RepoActivity repoActivity8 = RepoActivity.this;
            String unused8 = repoActivity8.J0 = repoActivity8.v0.format(new Date());
            if (RepoActivity.this.J0.length() > 16) {
                RepoActivity repoActivity9 = RepoActivity.this;
                String unused9 = repoActivity9.J0 = repoActivity9.J0.substring(0, 16);
            }
            TextView j0 = RepoActivity.this.Z;
            j0.setText("Saved:" + RepoActivity.this.J0);
        }
    }

    class r implements DialogInterface.OnClickListener {
        r() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    class r0 implements View.OnClickListener {
        r0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("TIARA", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(5);
            RepoActivity.this.r0.dismiss();
        }
    }

    class s implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f644a;

        s(EditText editText) {
            this.f644a = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            RepoActivity repoActivity;
            Intent intent;
            RepoActivity repoActivity2;
            c1 c1Var = c1.OPENREMARK;
            if (c1Var == RepoActivity.this.f589a) {
                if (true != this.f644a.getText().toString().toUpperCase().equals(RepoActivity.this.d.H)) {
                    if (true == RepoActivity.this.d.d.booleanValue()) {
                        repoActivity = RepoActivity.this;
                        str = "Your Remark Password is not correct";
                    } else {
                        repoActivity = RepoActivity.this;
                        str = "Password Remark anda tidak betul";
                    }
                    r.v(repoActivity, str, 1);
                    return;
                } else if (c1Var == RepoActivity.this.f589a) {
                    repoActivity2 = RepoActivity.this;
                    intent = new Intent(RepoActivity.this, LastRemarkActivity.class);
                } else {
                    if (c1.CHANGEREMARKPASSWORD != RepoActivity.this.f589a) {
                        return;
                    }
                    RepoActivity.this.k1();
                    return;
                }
            } else if (true != this.f644a.getText().toString().toUpperCase().equals(RepoActivity.this.d.G)) {
                if (true == RepoActivity.this.d.d.booleanValue()) {
                    repoActivity = RepoActivity.this;
                    str = "Your Diary Password is not correct";
                } else {
                    repoActivity = RepoActivity.this;
                    str = "Password Diary anda tidak betul";
                }
                r.v(repoActivity, str, 1);
                return;
            } else if (c1.OPENDIARY == RepoActivity.this.f589a) {
                ((InputMethodManager) RepoActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(this.f644a.getWindowToken(), 0);
                repoActivity2 = RepoActivity.this;
                intent = new Intent(RepoActivity.this, DiaryActivity.class);
            } else {
                if (c1.CHANGEDIARYPASSWORD != RepoActivity.this.f589a) {
                    if (c1.UPDATEDIARY == RepoActivity.this.f589a) {
                        RepoActivity.this.T0();
                        return;
                    }
                    return;
                }
                RepoActivity.this.k1();
                return;
            }
            repoActivity2.startActivity(intent);
        }
    }

    class s0 implements View.OnClickListener {
        s0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("XIASEAN", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(7);
            RepoActivity.this.r0.dismiss();
        }
    }

    class t implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f647a;

        t(EditText editText) {
            this.f647a = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((InputMethodManager) RepoActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(this.f647a.getWindowToken(), 0);
        }
    }

    class t0 implements View.OnClickListener {
        t0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("XIIINAM", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(7);
            RepoActivity.this.r0.dismiss();
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        /* JADX INFO: finally extract failed */
        public void onClick(View view) {
            if (RepoActivity.this.y.booleanValue()) {
                try {
                    RepoActivity.this.H.lock();
                    RepoActivity.D0(RepoActivity.this);
                    RepoActivity repoActivity = RepoActivity.this;
                    Boolean bool = Boolean.FALSE;
                    Boolean unused = repoActivity.E = bool;
                    if (RepoActivity.this.C > 10) {
                        int unused2 = RepoActivity.this.C = 0;
                        Boolean unused3 = RepoActivity.this.E = Boolean.TRUE;
                    }
                    RepoActivity.this.H.unlock();
                    if (RepoActivity.this.E.booleanValue() && RepoActivity.this.D.booleanValue()) {
                        RepoActivity.this.m.setBackgroundColor(Color.rgb(239, 253, 95));
                        Boolean unused4 = RepoActivity.this.D = bool;
                        RepoActivity.this.G.setText("U:X");
                        RepoActivity.this.G.setTextColor(Color.rgb(239, 253, 95));
                    }
                } catch (Throwable th) {
                    RepoActivity.this.H.unlock();
                    throw th;
                }
            }
            RepoActivity repoActivity2 = RepoActivity.this;
            boolean unused5 = repoActivity2.u(repoActivity2.n.getText().toString().toUpperCase().trim());
            if (RepoActivity.this.n.length() > 6) {
                Integer unused6 = RepoActivity.this.N0;
                RepoActivity repoActivity3 = RepoActivity.this;
                Integer unused7 = repoActivity3.N0 = Integer.valueOf(repoActivity3.N0.intValue() + 1);
            }
            if (!RepoActivity.this.M0.booleanValue() && RepoActivity.this.N0.intValue() > 35) {
                RepoActivity.this.S0();
                Boolean unused8 = RepoActivity.this.M0 = Boolean.TRUE;
            }
            if (RepoActivity.this.N0.intValue() % 1000 == 0) {
                RepoActivity.this.S0();
            }
            RepoActivity.this.n.setText(BuildConfig.FLAVOR);
            RepoActivity.this.n.requestFocus();
        }
    }

    class u0 implements View.OnClickListener {
        u0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("XOIC", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(4);
            RepoActivity.this.r0.dismiss();
        }
    }

    class v implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f653b;

        v(EditText editText, EditText editText2) {
            this.f652a = editText;
            this.f653b = editText2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RepoActivity repoActivity;
            String str;
            EditText editText;
            String str2;
            RepoActivity repoActivity2;
            String trim = this.f652a.getText().toString().toUpperCase().trim();
            String trim2 = this.f653b.getText().toString().toUpperCase().trim();
            if (true == trim.equals(BuildConfig.FLAVOR)) {
                if (true == RepoActivity.this.d.d.booleanValue()) {
                    repoActivity2 = RepoActivity.this;
                    str2 = "Please key in a password in the first box";
                } else {
                    repoActivity2 = RepoActivity.this;
                    str2 = "Sila masukkan password dalam kotak pertama";
                }
                r.v(repoActivity2, str2, 1);
                editText = this.f652a;
            } else {
                if (true == trim2.equals(BuildConfig.FLAVOR)) {
                    if (true == RepoActivity.this.d.d.booleanValue()) {
                        repoActivity = RepoActivity.this;
                        str = "Please key in a password in the second box";
                    } else {
                        repoActivity = RepoActivity.this;
                        str = "Sila masukkan password dalam kotak kedua";
                    }
                } else if (true == trim.equals(trim2)) {
                    if (c1.CHANGEREMARKPASSWORD == RepoActivity.this.f589a) {
                        RepoActivity.this.d.u("D", trim);
                        RepoActivity.this.d.H = trim;
                        return;
                    }
                    RepoActivity.this.d.t("D", trim);
                    RepoActivity.this.d.G = trim;
                    RepoActivity.this.d.u("D", RepoActivity.this.d.G);
                    RepoActivity.this.d.H = RepoActivity.this.d.G;
                    return;
                } else if (true == RepoActivity.this.d.d.booleanValue()) {
                    repoActivity = RepoActivity.this;
                    str = "The password entered are both not the same, please try again";
                } else {
                    repoActivity = RepoActivity.this;
                    str = "Password yang dimasukkan adalah tidak sama, sila masukkan sekali lagi";
                }
                r.v(repoActivity, str, 1);
                editText = this.f653b;
            }
            editText.requestFocus();
        }
    }

    class v0 implements View.OnClickListener {
        v0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("XXVIIASEAN", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(10);
            RepoActivity.this.r0.dismiss();
        }
    }

    class w implements DialogInterface.OnClickListener {
        w() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    class w0 implements View.OnClickListener {
        w0() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("XXXIDB", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(6);
            RepoActivity.this.r0.dismiss();
        }
    }

    class x implements DatePickerDialog.OnDateSetListener {
        x() {
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (d1.LASTPAYMENT_DATE == RepoActivity.this.q0) {
                int unused = RepoActivity.this.j0 = i;
                int unused2 = RepoActivity.this.k0 = i2;
                int unused3 = RepoActivity.this.l0 = i3;
                RepoActivity.this.q1();
                return;
            }
            int unused4 = RepoActivity.this.m0 = i;
            int unused5 = RepoActivity.this.n0 = i2;
            int unused6 = RepoActivity.this.o0 = i3;
            RepoActivity.this.p1();
        }
    }

    class x0 implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f658a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f659b;

        x0(Drawable drawable, Drawable drawable2) {
            this.f658a = drawable;
            this.f659b = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (RepoActivity.this.R.getCompoundDrawables()[2] == null || RepoActivity.this.R.getCompoundDrawables()[0] == null || motionEvent.getAction() != 0) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((RepoActivity.this.R.getWidth() - RepoActivity.this.R.getPaddingRight()) - this.f658a.getIntrinsicWidth()))) {
                d1 unused = RepoActivity.this.q0 = d1.LASTPAYMENT_DATE;
                RepoActivity.this.m1();
                RepoActivity.this.showDialog(0);
                RepoActivity.this.R.setCompoundDrawables(this.f659b, (Drawable) null, this.f658a, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (RepoActivity.this.R.getPaddingLeft() + this.f659b.getIntrinsicWidth()))) {
                RepoActivity.this.R.setText(BuildConfig.FLAVOR);
                RepoActivity.this.R.setCompoundDrawables(this.f659b, (Drawable) null, this.f658a, (Drawable) null);
            }
            return false;
        }
    }

    class y implements View.OnClickListener {
        y() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("ASEANXV", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(7);
            RepoActivity.this.r0.dismiss();
        }
    }

    class y0 implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Drawable f661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f662b;

        y0(Drawable drawable, Drawable drawable2) {
            this.f661a = drawable;
            this.f662b = drawable2;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (RepoActivity.this.X.getCompoundDrawables()[2] == null || RepoActivity.this.R.getCompoundDrawables()[0] == null || motionEvent.getAction() != 0) {
                return false;
            }
            if (motionEvent.getX() > ((float) ((RepoActivity.this.X.getWidth() - RepoActivity.this.X.getPaddingRight()) - this.f661a.getIntrinsicWidth()))) {
                d1 unused = RepoActivity.this.q0 = d1.FOLLOWUP_DATE;
                RepoActivity.this.l1();
                RepoActivity.this.showDialog(0);
                RepoActivity.this.X.setCompoundDrawables(this.f662b, (Drawable) null, this.f661a, (Drawable) null);
            }
            if (motionEvent.getX() < ((float) (RepoActivity.this.R.getPaddingLeft() + this.f662b.getIntrinsicWidth()))) {
                RepoActivity.this.X.setText(BuildConfig.FLAVOR);
                RepoActivity.this.X.setCompoundDrawables(this.f662b, (Drawable) null, this.f661a, (Drawable) null);
            }
            return false;
        }
    }

    class z implements View.OnClickListener {
        z() {
        }

        public void onClick(View view) {
            RepoActivity.this.n.setText(RepoActivity.this.i("BAMBEE", Boolean.FALSE), TextView.BufferType.EDITABLE);
            RepoActivity.this.n.setSelection(6);
            RepoActivity.this.r0.dismiss();
        }
    }

    class z0 implements View.OnClickListener {
        z0() {
        }

        public void onClick(View view) {
            f1 unused = RepoActivity.this.f590b = f1.TABBUTTON_FIND;
            Boolean unused2 = RepoActivity.this.t();
        }
    }

    public RepoActivity() {
        Boolean bool = Boolean.FALSE;
        this.y = bool;
        this.z = bool;
        this.A = bool;
        this.B = 0;
        this.C = 0;
        this.D = bool;
        this.E = bool;
        this.F = 0;
        this.H = new ReentrantLock();
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.a0 = BuildConfig.FLAVOR;
        this.b0 = BuildConfig.FLAVOR;
        this.c0 = BuildConfig.FLAVOR;
        this.d0 = BuildConfig.FLAVOR;
        this.e0 = BuildConfig.FLAVOR;
        this.f0 = BuildConfig.FLAVOR;
        this.g0 = BuildConfig.FLAVOR;
        this.h0 = BuildConfig.FLAVOR;
        this.i0 = BuildConfig.FLAVOR;
        this.p0 = null;
        this.q0 = d1.LASTPAYMENT_DATE;
        this.s0 = new SpannableStringBuilder();
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.w0 = 0;
        this.x0 = BuildConfig.FLAVOR;
        this.y0 = BuildConfig.FLAVOR;
        this.z0 = BuildConfig.FLAVOR;
        this.A0 = BuildConfig.FLAVOR;
        this.B0 = BuildConfig.FLAVOR;
        this.C0 = BuildConfig.FLAVOR;
        this.D0 = BuildConfig.FLAVOR;
        this.E0 = BuildConfig.FLAVOR;
        this.F0 = BuildConfig.FLAVOR;
        this.G0 = BuildConfig.FLAVOR;
        this.H0 = BuildConfig.FLAVOR;
        this.I0 = BuildConfig.FLAVOR;
        this.J0 = BuildConfig.FLAVOR;
        this.L0 = BuildConfig.FLAVOR;
        this.M0 = bool;
        this.N0 = 0;
        this.O0 = new x();
    }

    static /* synthetic */ int A(RepoActivity repoActivity) {
        int i2 = repoActivity.B;
        repoActivity.B = i2 + 1;
        return i2;
    }

    static /* synthetic */ int D0(RepoActivity repoActivity) {
        int i2 = repoActivity.C;
        repoActivity.C = i2 + 1;
        return i2;
    }

    /* access modifiers changed from: private */
    public void S0() {
        MyDB myDB = this.d;
        myDB.w = myDB.k("CLF");
        if (!this.d.w.equals("1")) {
            if (true == r.f760a.booleanValue()) {
                Log.d("dbCleanUpLastRemark", "starting now.");
            }
            new g1(this, (s) null).execute(new String[]{BuildConfig.FLAVOR});
        }
    }

    /* access modifiers changed from: private */
    public void T0() {
        new h1(this, (s) null).execute(new String[]{BuildConfig.FLAVOR});
    }

    private void U0() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PSS','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private void V0() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private void W0() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private void X0() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private void Y0() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private void Z0() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('VLANG','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('VMIC','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('SOVN','1')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('NAC','2')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PURCT','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HRS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('MCT','1')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HSS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PSS','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private Boolean a() {
        StringBuilder sb;
        String message;
        String str;
        StringBuilder sb2;
        String str2 = BuildConfig.FLAVOR;
        try {
            Cursor rawQuery = this.d.P.rawQuery("SELECT * FROM VLD WHERE C1 = '" + r.i(this.d.T.h("COLUMN1")) + "'", (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.getCount() <= 0) {
                    r.u(this, "Problem", true == this.d.d.booleanValue() ? "The internal database date is not found." : "Tarikh dalaman database tidak dijumpai.");
                    return Boolean.FALSE;
                } else if (rawQuery.moveToFirst()) {
                    try {
                        if (!this.d.S.g(rawQuery.getString(rawQuery.getColumnIndex("C3"))).equals(this.d.g)) {
                            r.v(this, true == this.d.d.booleanValue() ? "The internal database date is not valid." : "Tarikh dalaman database adalah tidak betul.", 1);
                            return Boolean.FALSE;
                        }
                    } catch (IOException e2) {
                        Log.e("CheckDvcAuthorization", "Error : CheckDvcAuthorization : " + e2.getMessage());
                    }
                }
            }
            if (rawQuery != null && !rawQuery.isClosed()) {
                rawQuery.close();
            }
            try {
                String a2 = new j(this).a();
                String str3 = Build.MODEL;
                if (str3.length() >= 2) {
                    String upperCase = str3.replaceAll("[^a-zA-Z0-9]", str2).toUpperCase();
                    if (r.c.IMEI == r.d) {
                        sb2 = new StringBuilder();
                        sb2.append(upperCase.substring(0, 1));
                        sb2.append(upperCase.substring(upperCase.length() - 1, upperCase.length()));
                        sb2.append("T");
                    } else if (r.c.ANDROID_ID == r.d) {
                        sb2 = new StringBuilder();
                        sb2.append(upperCase.substring(0, 1));
                        sb2.append(upperCase.substring(upperCase.length() - 1, upperCase.length()));
                        sb2.append("A");
                    } else if (r.c.GENERATED_ID == r.d) {
                        sb2 = new StringBuilder();
                        sb2.append(upperCase.substring(0, 1));
                        sb2.append(upperCase.substring(upperCase.length() - 1, upperCase.length()));
                        sb2.append("G");
                    } else if (r.c.ANDROID_ID_COMBO == r.d) {
                        sb2 = new StringBuilder();
                        sb2.append(upperCase.substring(0, 1));
                        sb2.append(upperCase.substring(upperCase.length() - 1, upperCase.length()));
                        sb2.append("C");
                    }
                    str2 = sb2.toString();
                } else {
                    str2 = "XXX";
                }
                String e3 = e(str2);
                if (a2.length() == 0) {
                    r.u(this, "Problem", "Device Serial Number is empty!!!");
                    return Boolean.FALSE;
                }
                this.d.i = r.b(a2).toUpperCase() + e3;
                MyDB myDB = this.d;
                myDB.A = myDB.i;
                if (r.e.REPOPRO_UI == r.f761b) {
                    str = this.d.p + "A" + this.d.q + "A" + this.d.A;
                } else {
                    str = this.d.p + "N" + this.d.q + "A" + this.d.A;
                }
                myDB.k = str;
                MyDB myDB2 = this.d;
                myDB2.l = r.a(myDB2.k).toUpperCase();
                MyDB myDB3 = this.d;
                myDB3.m = f(myDB3.V.h(r.b(myDB3.k).toUpperCase()).toUpperCase());
                MyDB myDB4 = this.d;
                if (!myDB4.m.equals(myDB4.n)) {
                    Intent intent = new Intent();
                    intent.setClass(this, IdPasswordActivity.class);
                    startActivityForResult(intent, 1);
                    return Boolean.TRUE;
                }
                if (true == this.d.g().booleanValue()) {
                    startActivity(new Intent(this, FollowUpActivity.class));
                }
                return Boolean.TRUE;
            } catch (Exception e4) {
                sb = new StringBuilder();
                sb.append("Error:");
                message = e4.getMessage();
                sb.append(message);
                Log.e("CheckDvcAuthorization", sb.toString());
                return Boolean.FALSE;
            }
        } catch (SQLiteException e5) {
            sb = new StringBuilder();
            sb.append("Could not read the VLD table. Error:");
            message = e5.getMessage();
            sb.append(message);
            Log.e("CheckDvcAuthorization", sb.toString());
            return Boolean.FALSE;
        }
    }

    private void a1() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('NAC','2')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PURCT','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HRS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('MCT','1')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HSS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PSS','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private Boolean b() {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        TextView textView;
        String str;
        try {
            String format = this.v0.format(new Date());
            int parseInt = Integer.parseInt(this.d.h.substring(7, 11));
            int j2 = j(this.d.h.substring(3, 6));
            int parseInt2 = Integer.parseInt(this.d.h.substring(0, 2));
            int parseInt3 = Integer.parseInt(format.substring(0, 4));
            int parseInt4 = Integer.parseInt(format.substring(5, 7));
            int parseInt5 = Integer.parseInt(format.substring(8, 10));
            String str2 = Integer.toString(parseInt) + "-";
            if (j2 < 10) {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append("0");
                sb.append(Integer.toString(j2));
                sb.append("-");
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(Integer.toString(j2));
                sb.append("-");
            }
            String sb5 = sb.toString();
            if (parseInt2 < 10) {
                sb2 = new StringBuilder();
                sb2.append(sb5);
                sb2.append("0");
                sb2.append(Integer.toString(parseInt2));
            } else {
                sb2 = new StringBuilder();
                sb2.append(sb5);
                sb2.append(Integer.toString(parseInt2));
            }
            String sb6 = sb2.toString();
            String str3 = Integer.toString(parseInt3) + "-";
            if (parseInt4 < 10) {
                sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append("0");
                sb3.append(Integer.toString(parseInt4));
                sb3.append("-");
            } else {
                sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(Integer.toString(parseInt4));
                sb3.append("-");
            }
            String sb7 = sb3.toString();
            if (parseInt5 < 10) {
                sb4 = new StringBuilder();
                sb4.append(sb7);
                sb4.append("0");
                sb4.append(Integer.toString(parseInt5));
            } else {
                sb4 = new StringBuilder();
                sb4.append(sb7);
                sb4.append(Integer.toString(parseInt5));
            }
            String sb8 = sb4.toString();
            if (!m(parseInt, j2, parseInt2, parseInt3, parseInt4, parseInt5, 40).booleanValue()) {
                return Boolean.FALSE;
            }
            if (true == this.d.d.booleanValue()) {
                textView = this.o;
                str = "Sorry, your usage period has expired. Today's date is [" + sb8 + "]. It expires 40 days from the data date [" + sb6 + "].";
            } else {
                textView = this.o;
                str = "Maaf, tempoh penggunaan sudah pun habis. Tarikh hari ini ialah [" + sb8 + "]. Ianya tamat setelah 40 hari dari tarikh data [" + sb6 + "].";
            }
            textView.setText(str);
            n();
            this.v.setVisibility(8);
            invalidateOptionsMenu();
            return Boolean.TRUE;
        } catch (Exception e2) {
            Log.e("CheckDeviceExpiryDate", "Error:" + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    private void b1() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PURCT','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HRS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('MCT','1')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HSS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PSS','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private void c(String str) {
        Integer valueOf = Integer.valueOf(Integer.parseInt(str));
        if (valueOf.intValue() >= Integer.parseInt("15")) {
            return;
        }
        if (4 == valueOf.intValue()) {
            Z0();
        } else if (5 == valueOf.intValue()) {
            a1();
        } else if (6 == valueOf.intValue()) {
            b1();
        } else if (7 == valueOf.intValue()) {
            c1();
        } else if (8 == valueOf.intValue()) {
            d1();
        } else if (9 == valueOf.intValue()) {
            e1();
        } else if (10 == valueOf.intValue()) {
            U0();
        } else if (11 == valueOf.intValue()) {
            V0();
        } else if (12 == valueOf.intValue()) {
            W0();
        } else if (13 == valueOf.intValue()) {
            X0();
        } else if (14 == valueOf.intValue()) {
            Y0();
        } else {
            r.v(this, "Diary Version not correct => " + str, 1);
        }
    }

    private void c1() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HRS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('MCT','1')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HSS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PSS','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private void d(String str) {
        Integer valueOf = Integer.valueOf(Integer.parseInt(str));
        if (valueOf.intValue() >= Integer.parseInt("1002")) {
            return;
        }
        if (1001 == valueOf.intValue()) {
            f1();
            return;
        }
        r.v(this, "LastRemark Version not correct => " + str, 1);
    }

    private void d1() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('MCT','1')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HSS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PSS','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private String e(String str) {
        String str2 = BuildConfig.FLAVOR;
        for (char c2 : str.toCharArray()) {
            if ('O' == c2) {
                str2 = str2 + '0';
            } else {
                str2 = str2 + c2;
            }
        }
        return str2;
    }

    private void e1() {
        try {
            this.d.Q.beginTransaction();
            this.d.Q.execSQL("INSERT INTO PRS VALUES('HSS','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('PSS','')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('KPV','0')");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('EML','')");
            this.d.Q.execSQL("UPDATE PRS SET C2 = '15' WHERE C1 = 'DSV'");
            this.d.Q.execSQL("INSERT INTO PRS VALUES('GMIN','10')");
            this.d.Q.setTransactionSuccessful();
        } finally {
            this.d.Q.endTransaction();
        }
    }

    private String f(String str) {
        StringBuilder sb;
        char c2;
        StringBuilder sb2;
        String str2 = BuildConfig.FLAVOR;
        for (char c3 : str.toCharArray()) {
            if (true == Character.isLetter(c3)) {
                if ('O' == c3) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = 'K';
                } else if ('I' == c3) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = 'P';
                } else if ('S' == c3) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = 'M';
                } else if ('J' == c3) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = 'B';
                } else if ('W' == c3) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = 'F';
                } else {
                    sb2 = new StringBuilder();
                }
                sb.append(c2);
                str2 = sb.toString();
            } else {
                if (true != Character.isDigit(c3)) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = 'H';
                } else if ('0' == c3) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = '4';
                } else if ('1' == c3) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    c2 = '6';
                } else {
                    sb2 = new StringBuilder();
                }
                sb.append(c2);
                str2 = sb.toString();
            }
            sb2.append(str2);
            sb2.append(c3);
            str2 = sb2.toString();
        }
        return str2;
    }

    private void f1() {
        try {
            this.d.R.beginTransaction();
            this.d.R.execSQL("INSERT INTO PRS VALUES('CLF','0')");
            this.d.R.execSQL("UPDATE PRS SET C2 = '1002' WHERE C1 = 'DSV'");
            this.d.R.setTransactionSuccessful();
        } finally {
            this.d.R.endTransaction();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        if (r4.contains(r0) != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String g(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = ", MALAYSIA"
            boolean r1 = r4.contains(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0010
        L_0x000a:
            java.lang.String r4 = r4.replaceAll(r0, r2)
            goto L_0x00a3
        L_0x0010:
            java.lang.String r0 = ", PERLIS"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0019
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = ", PULAU LANGKAWI"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0022
            goto L_0x000a
        L_0x0022:
            java.lang.String r0 = ", LANGKAWI"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x002b
            goto L_0x000a
        L_0x002b:
            java.lang.String r0 = ", KEDAH"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0034
            goto L_0x000a
        L_0x0034:
            java.lang.String r0 = ", PULAU PINANG"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x003d
            goto L_0x000a
        L_0x003d:
            java.lang.String r0 = ", PENANG"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x000a
        L_0x0046:
            java.lang.String r0 = ", PERAK"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x004f
            goto L_0x000a
        L_0x004f:
            java.lang.String r0 = ", KELANTAN"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x000a
        L_0x0058:
            java.lang.String r0 = ", TERENGGANU"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0061
            goto L_0x000a
        L_0x0061:
            java.lang.String r0 = ", PAHANG"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x006a
            goto L_0x000a
        L_0x006a:
            java.lang.String r0 = ", SELANGOR"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0073
            goto L_0x000a
        L_0x0073:
            java.lang.String r0 = ", NEGERI SEMBILAN"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x007c
            goto L_0x000a
        L_0x007c:
            java.lang.String r0 = ", MELAKA"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0085
            goto L_0x000a
        L_0x0085:
            java.lang.String r0 = ", JOHOR"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x008f
            goto L_0x000a
        L_0x008f:
            java.lang.String r0 = ", SARAWAK"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0099
            goto L_0x000a
        L_0x0099:
            java.lang.String r0 = ", SABAH"
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x00a3
            goto L_0x000a
        L_0x00a3:
            int r0 = r4.length()
            r1 = 100
            if (r0 <= r1) goto L_0x00b2
            r0 = 0
            r1 = 99
            java.lang.String r4 = r4.substring(r0, r1)
        L_0x00b2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.repo.RepoActivity.g(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    public void g1(EditText editText) {
        KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
        int visibility = keyboardView.getVisibility();
        if (visibility == 4 || visibility == 8) {
            keyboardView.setVisibility(0);
        }
        this.l = editText;
    }

    private SpannableStringBuilder h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        String str13 = str;
        String str14 = str6;
        try {
            this.s0.clear();
            this.s0.clearSpans();
            int i2 = str5.length() > 0 ? 1 : 0;
            int i3 = str10.length() > 0 ? 1 : 0;
            if (str.length() > 0) {
                if (str6.length() > 0) {
                    int length = str.length() + 1 + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + r.k(str5.length());
                    SpannableStringBuilder spannableStringBuilder = this.s0;
                    spannableStringBuilder.append((str13 + r.m(str2) + r.m(str3) + r.m(str4) + r.m(str5)) + "\nRemark:" + str14 + r.m(str7) + r.m(str8) + r.m(str9) + r.m(str10) + r.m(str11) + r.m(str12));
                    this.s0.setSpan(new ForegroundColorSpan(-16711936), 0, str.length(), 256);
                    this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#33B5E5")), str.length(), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i2, 256);
                    this.s0.setSpan(new ForegroundColorSpan(-16711936), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i2, str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + r.k(str5.length()), 256);
                    int i4 = length + 7;
                    this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), length, i4, 256);
                    this.s0.setSpan(new ForegroundColorSpan(-65536), i4, str6.length() + i4, 256);
                    this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + i4, str6.length() + i4 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i3, 256);
                    this.s0.setSpan(new ForegroundColorSpan(-65536), str6.length() + i4 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i3, str6.length() + i4 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), 256);
                    this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + i4 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), i4 + str6.length() + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()) + r.k(str11.length()) + r.k(str12.length()), 256);
                    return this.s0;
                }
            }
            if (str.length() > 0) {
                this.s0.append(str13 + r.m(str2) + r.m(str3) + r.m(str4) + r.m(str5));
                this.s0.setSpan(new ForegroundColorSpan(-16711936), 0, str.length(), 256);
                this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#33B5E5")), str.length(), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i2, 256);
                this.s0.setSpan(new ForegroundColorSpan(-16711936), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i2, str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + r.k(str5.length()), 256);
            } else {
                this.s0.append("Remark:" + str14 + r.m(str7) + r.m(str8) + r.m(str9) + r.m(str10) + r.m(str11) + r.m(str12));
                this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), 0, 7, 256);
                this.s0.setSpan(new ForegroundColorSpan(-65536), 7, str6.length() + 7, 256);
                this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + 7, str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i3, 256);
                this.s0.setSpan(new ForegroundColorSpan(-65536), str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i3, str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), 256);
                this.s0.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()) + r.k(str11.length()) + r.k(str12.length()), 256);
            }
        } catch (Exception e2) {
            this.s0.clearSpans();
            Log.e("ColourTheFindResult", "Error : ColourTheFindResult : " + e2.getMessage());
        }
        return this.s0;
    }

    private boolean h1() {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
            for (int i2 = 0; i2 < allNetworkInfo.length; i2++) {
                if (allNetworkInfo[i2].getState() == NetworkInfo.State.CONNECTED) {
                    Log.v(getClass().getName(), allNetworkInfo[i2].toString());
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public SpannableStringBuilder i(String str, Boolean bool) {
        SpannableStringBuilder spannableStringBuilder;
        ForegroundColorSpan foregroundColorSpan;
        SpannableStringBuilder spannableStringBuilder2;
        ForegroundColorSpan foregroundColorSpan2;
        try {
            this.s0.clear();
            this.s0.clearSpans();
            this.s0.append(str);
            this.t0 = 0;
            this.u0 = 0;
            if (r.e.REPOPRO_UI == r.f761b) {
                if (!this.d.K.booleanValue()) {
                    return this.s0;
                }
                for (int i2 = 0; i2 < this.s0.length(); i2++) {
                    if (true == Character.isDigit(this.s0.charAt(i2))) {
                        Integer valueOf = Integer.valueOf(this.t0.intValue() + 1);
                        this.t0 = valueOf;
                        if (1 == valueOf.intValue()) {
                            if ('0' == this.s0.charAt(i2)) {
                                spannableStringBuilder = this.s0;
                                foregroundColorSpan = new ForegroundColorSpan(-65536);
                            } else if (true == bool.booleanValue()) {
                                spannableStringBuilder = this.s0;
                                foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#33B5E5"));
                            } else {
                                spannableStringBuilder = this.s0;
                                foregroundColorSpan = new ForegroundColorSpan(-16776961);
                            }
                        } else if (this.t0.intValue() > 4) {
                            if (true != str.startsWith("G1M")) {
                                spannableStringBuilder = this.s0;
                                foregroundColorSpan = new ForegroundColorSpan(-65536);
                            } else if (this.t0.intValue() > 5) {
                                spannableStringBuilder = this.s0;
                                foregroundColorSpan = new ForegroundColorSpan(-65536);
                            } else if (true == bool.booleanValue()) {
                                spannableStringBuilder = this.s0;
                                foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#33B5E5"));
                            } else {
                                spannableStringBuilder = this.s0;
                                foregroundColorSpan = new ForegroundColorSpan(-16776961);
                            }
                        } else if (true == bool.booleanValue()) {
                            spannableStringBuilder = this.s0;
                            foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#33B5E5"));
                        } else {
                            spannableStringBuilder = this.s0;
                            foregroundColorSpan = new ForegroundColorSpan(-16776961);
                        }
                    } else {
                        this.u0 = Integer.valueOf(this.u0.intValue() + 1);
                        if ('I' != this.s0.charAt(i2)) {
                            if ('O' != this.s0.charAt(i2)) {
                                if (1 == this.u0.intValue()) {
                                    if (!('F' == this.s0.charAt(i2) || 'U' == this.s0.charAt(i2) || 'V' == this.s0.charAt(i2))) {
                                        if ('Y' != this.s0.charAt(i2)) {
                                            if (true == bool.booleanValue()) {
                                                spannableStringBuilder = this.s0;
                                                foregroundColorSpan = new ForegroundColorSpan(Color.rgb(208, 32, 144));
                                            } else {
                                                spannableStringBuilder2 = this.s0;
                                                foregroundColorSpan2 = new ForegroundColorSpan(Color.rgb(99, 4, 96));
                                            }
                                        }
                                    }
                                    spannableStringBuilder = this.s0;
                                    foregroundColorSpan = new ForegroundColorSpan(-65536);
                                } else if (true == bool.booleanValue()) {
                                    spannableStringBuilder = this.s0;
                                    foregroundColorSpan = new ForegroundColorSpan(Color.rgb(208, 32, 144));
                                } else {
                                    spannableStringBuilder2 = this.s0;
                                    foregroundColorSpan2 = new ForegroundColorSpan(Color.rgb(99, 4, 96));
                                }
                                spannableStringBuilder2.setSpan(foregroundColorSpan2, i2, i2 + 1, 256);
                            }
                        }
                        spannableStringBuilder = this.s0;
                        foregroundColorSpan = new ForegroundColorSpan(Color.rgb(255, 140, 0));
                    }
                    spannableStringBuilder.setSpan(foregroundColorSpan, i2, i2 + 1, 256);
                }
            }
        } catch (Exception e2) {
            this.s0.clearSpans();
            Log.e("ColourThePlateNo", "Error : ColourThePlateNo : " + e2.getMessage());
        }
        return this.s0;
    }

    /* access modifiers changed from: private */
    public void i1() {
        String str;
        StringBuilder sb;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (true == this.d.d.booleanValue()) {
            builder.setTitle("Delete");
            sb = new StringBuilder();
            str = "Are you sure that you want to delete this row?\nPlateNo = ";
        } else {
            builder.setTitle("Padam");
            sb = new StringBuilder();
            str = "Adakah anda pasti yang anda ingin memadam baris ini?\nPlateNo = ";
        }
        sb.append(str);
        sb.append(this.p.getText().toString());
        builder.setMessage(sb.toString());
        builder.setPositiveButton("Yes", new q());
        builder.setNegativeButton("No", new r());
        builder.show();
    }

    private void j1() {
        String str;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        c1 c1Var = c1.OPENREMARK;
        c1 c1Var2 = this.f589a;
        if (c1Var == c1Var2 || c1.CHANGEREMARKPASSWORD == c1Var2) {
            builder.setTitle("Remark Password");
            str = true == this.d.d.booleanValue() ? "Please enter your remark password:" : "Sila masukkan password remark anda:";
        } else {
            builder.setTitle("Diary Password");
            str = true == this.d.d.booleanValue() ? "Please enter your diary password:" : "Sila masukkan password diary anda:";
        }
        builder.setMessage(str);
        EditText editText = new EditText(this);
        editText.setKeyListener(new a());
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        builder.setView(editText);
        builder.setPositiveButton("Ok", new s(editText));
        builder.setNegativeButton("Cancel", new t(editText));
        builder.show();
    }

    /* access modifiers changed from: private */
    public Boolean k(String str, String str2, String str3, int i2) {
        StringBuilder sb;
        String message;
        InputStream openRawResource = getResources().openRawResource(i2);
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
    public void k1() {
        String str;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = ((LayoutInflater) getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.diarypasswordsetup, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.txtPassword1);
        TextView textView = (TextView) inflate.findViewById(R.id.lblPassword1);
        EditText editText2 = (EditText) inflate.findViewById(R.id.txtPassword2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.lblPassword2);
        editText.setKeyListener(new a());
        editText2.setKeyListener(new a());
        if (c1.CHANGEREMARKPASSWORD == this.f589a) {
            builder.setTitle("Remark Password");
            if (true == this.d.d.booleanValue()) {
                textView.setText("Please enter your Remark password:");
                str = "Please enter your Remark password again:";
            } else {
                textView.setText("Sila masukkan password Remark anda:");
                str = "Sila masukkan password Remark anda sekali lagi:";
            }
        } else {
            builder.setTitle("Diary Password");
            if (true == this.d.d.booleanValue()) {
                textView.setText("Please enter your diary password:");
                str = "Please enter your diary password again:";
            } else {
                textView.setText("Sila masukkan password diary anda:");
                str = "Sila masukkan password diary anda sekali lagi:";
            }
        }
        textView2.setText(str);
        builder.setPositiveButton("Ok", new v(editText, editText2));
        builder.setNegativeButton("Cancel", new w());
        builder.setView(inflate);
        builder.show();
    }

    /* access modifiers changed from: private */
    public void l() {
        Boolean bool;
        try {
            this.z = Boolean.valueOf(this.J.isProviderEnabled("gps"));
        } catch (Exception unused) {
            this.z = Boolean.FALSE;
        }
        try {
            this.A = Boolean.valueOf(h1());
        } catch (Exception unused2) {
            this.A = Boolean.FALSE;
        }
        if (!this.A.booleanValue()) {
            r.v(this, true == this.d.d.booleanValue() ? "Please make sure the Internet is ON." : "Sila pastikan Internet dah ON.", 1);
        } else if (!this.z.booleanValue()) {
            r.v(this, true == this.d.d.booleanValue() ? "Please make sure the GPS is ON." : "Sila pastikan GPS dah ON.", 1);
        } else {
            try {
                if (this.K == null) {
                    HandlerThread handlerThread = new HandlerThread("locationHandlerThread");
                    this.K = handlerThread;
                    handlerThread.start();
                    this.J.requestLocationUpdates("gps", 0, (float) Integer.parseInt(this.d.v), this.I, this.K.getLooper());
                    this.y = Boolean.TRUE;
                    this.x.setTextColor(-16711936);
                    this.G.setText("T:S");
                    this.G.setTextColor(-16711936);
                    this.m.setBackgroundColor(Color.rgb(239, 253, 95));
                    bool = Boolean.FALSE;
                } else {
                    bool = Boolean.FALSE;
                    this.y = bool;
                    this.x.setTextColor(-65536);
                    this.G.setText("T:D");
                    this.G.setTextColor(-65536);
                    this.m.setBackgroundColor(Color.rgb(255, 192, 203));
                }
                this.D = bool;
            } catch (Exception unused3) {
                this.G.setText("T:X");
                this.G.setTextColor(-65536);
            }
        }
    }

    /* access modifiers changed from: private */
    public void l1() {
        String upperCase = this.X.getText().toString().toUpperCase();
        if (!upperCase.equals(BuildConfig.FLAVOR)) {
            try {
                Date parse = new SimpleDateFormat("dd MMM yyyy").parse(upperCase);
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                this.m0 = instance.get(1);
                this.n0 = instance.get(2);
                int i2 = instance.get(5);
                this.o0 = i2;
                DatePickerDialog datePickerDialog = this.p0;
                if (datePickerDialog != null) {
                    datePickerDialog.updateDate(this.m0, this.n0, i2);
                    this.p0.setTitle("FollowUp Date");
                }
            } catch (ParseException e2) {
                Log.e("parseFollowUpDate", "Error : parseFollowUpDate : " + e2.getMessage());
            }
        } else {
            DatePickerDialog datePickerDialog2 = this.p0;
            if (datePickerDialog2 != null) {
                datePickerDialog2.setTitle("FollowUp Date");
            }
        }
    }

    private Boolean m(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 < 2000) {
            i2 = 2000;
        }
        if (i5 < 2000) {
            i5 = 2000;
        }
        return ((long) ((((i5 - 2000) * 365) + r(i6 + -1)) + i7)) - ((long) ((((i2 - 2000) * 365) + r(i3 + -1)) + i4)) > ((long) i8) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* access modifiers changed from: private */
    public void m1() {
        String upperCase = this.R.getText().toString().toUpperCase();
        if (!upperCase.equals(BuildConfig.FLAVOR)) {
            try {
                Date parse = new SimpleDateFormat("dd MMM yyyy").parse(upperCase);
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                this.j0 = instance.get(1);
                this.k0 = instance.get(2);
                int i2 = instance.get(5);
                this.l0 = i2;
                DatePickerDialog datePickerDialog = this.p0;
                if (datePickerDialog != null) {
                    datePickerDialog.updateDate(this.j0, this.k0, i2);
                    this.p0.setTitle("LastPayment Date");
                }
            } catch (ParseException e2) {
                Log.e("parseLastPaymentDate", "Error : parseLastPaymentDate : " + e2.getMessage());
            }
        } else {
            DatePickerDialog datePickerDialog2 = this.p0;
            if (datePickerDialog2 != null) {
                datePickerDialog2.setTitle("LastPayment Date");
            }
        }
    }

    private void n() {
        this.e = Boolean.FALSE;
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.q.setVisibility(8);
        this.p.setVisibility(8);
        this.r.setVisibility(8);
        this.j.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setVisibility(8);
        this.x.setVisibility(8);
        this.k.setEnabled(false);
        this.k.setTextColor(-16777216);
        this.M.setVisibility(8);
        this.N.setVisibility(8);
        this.O.setVisibility(8);
        this.P.setVisibility(8);
        this.Q.setVisibility(8);
        this.R.setVisibility(8);
        this.S.setVisibility(8);
        this.T.setVisibility(8);
        this.U.setVisibility(8);
        this.V.setVisibility(8);
        this.W.setVisibility(8);
        this.X.setVisibility(8);
        this.Y.setVisibility(8);
        this.Z.setVisibility(8);
    }

    private void n1() {
        try {
            MediaPlayer create = MediaPlayer.create(this, R.raw.beep7);
            this.K0 = create;
            create.setLooping(false);
            this.K0.start();
            this.K0.setOnCompletionListener(new p());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public void o1() {
        MediaPlayer mediaPlayer = this.K0;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.K0 = null;
        }
    }

    /* access modifiers changed from: private */
    public Boolean p(Location location) {
        TextView textView;
        StringBuilder sb;
        String str;
        try {
            List<Address> fromLocation = this.L.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            String g2 = g((fromLocation == null || fromLocation.isEmpty()) ? BuildConfig.FLAVOR : fromLocation.get(0).getAddressLine(0).toUpperCase());
            DecimalFormat decimalFormat = new DecimalFormat("#.00000");
            String format = decimalFormat.format(location.getLatitude());
            String format2 = decimalFormat.format(location.getLongitude());
            this.m.setText(g2 + " [" + format + "|" + format2 + "]");
            return Boolean.TRUE;
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e("Geofence", e2.getMessage());
            textView = this.G;
            sb = new StringBuilder();
            str = "i:";
            sb.append(str);
            sb.append(String.valueOf(this.B).trim());
            textView.setText(sb.toString());
            this.G.setTextColor(-65536);
            this.m.setText("GPS(io) hang, ON OFF Wifi/restart HP");
            this.m.setBackgroundColor(Color.rgb(255, 192, 203));
            Boolean bool = Boolean.FALSE;
            this.D = bool;
            return bool;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            textView = this.G;
            sb = new StringBuilder();
            str = "a:";
            sb.append(str);
            sb.append(String.valueOf(this.B).trim());
            textView.setText(sb.toString());
            this.G.setTextColor(-65536);
            this.m.setText("GPS(io) hang, ON OFF Wifi/restart HP");
            this.m.setBackgroundColor(Color.rgb(255, 192, 203));
            Boolean bool2 = Boolean.FALSE;
            this.D = bool2;
            return bool2;
        }
    }

    /* access modifiers changed from: private */
    public void p1() {
        String str = Integer.toString(this.n0 + 1) + "/" + Integer.toString(this.o0) + "/" + Integer.toString(this.m0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            this.X.setText(simpleDateFormat2.format(parse).toUpperCase());
            this.b0 = simpleDateFormat3.format(parse).toUpperCase();
        } catch (ParseException e2) {
            Log.e("updateFollowUpDate", "Error : updateFollowUpDate : " + e2.getMessage());
        }
    }

    private void q() {
        Boolean bool;
        MyDB myDB;
        Boolean bool2;
        MyDB myDB2;
        Boolean bool3;
        MyDB myDB3;
        Boolean bool4;
        MyDB myDB4;
        MyDB myDB5;
        StringBuilder sb;
        TextView textView;
        String str;
        String str2;
        String str3 = "B";
        if (true == this.d.j(str3).equals("0")) {
            myDB = this.d;
            bool = Boolean.FALSE;
        } else {
            myDB = this.d;
            bool = Boolean.TRUE;
        }
        myDB.d = bool;
        MyDB myDB6 = this.d;
        myDB6.G = myDB6.j("D");
        if (true == this.d.j("SND").equals("0")) {
            myDB2 = this.d;
            bool2 = Boolean.FALSE;
        } else {
            myDB2 = this.d;
            bool2 = Boolean.TRUE;
        }
        myDB2.I = bool2;
        MyDB myDB7 = this.d;
        myDB7.J = Integer.valueOf(Integer.parseInt(myDB7.j("PURCT")));
        if (true == this.d.j("MCT").equals("0")) {
            myDB3 = this.d;
            bool3 = Boolean.FALSE;
        } else {
            myDB3 = this.d;
            bool3 = Boolean.TRUE;
        }
        myDB3.K = bool3;
        if (true == this.d.j("KPV").equals("0")) {
            myDB4 = this.d;
            bool4 = Boolean.FALSE;
        } else {
            myDB4 = this.d;
            bool4 = Boolean.TRUE;
        }
        myDB4.L = bool4;
        MyDB myDB8 = this.d;
        myDB8.o = myDB8.j("PSS");
        TextView textView2 = this.p;
        String j2 = this.d.j("FH1");
        Boolean bool5 = Boolean.TRUE;
        textView2.setText(i(j2, bool5));
        this.q.setText(i(this.d.j("FH2"), bool5));
        this.m.setText(this.d.j("LOC"));
        MyDB myDB9 = this.d;
        myDB9.u = myDB9.j("VLANG");
        if (this.d.u.equals("0")) {
            this.d.t("VLANG", "50");
            this.d.u = "50";
        }
        MyDB myDB10 = this.d;
        myDB10.D = myDB10.j("EML");
        MyDB myDB11 = this.d;
        myDB11.v = myDB11.j("GMIN");
        MyDB myDB12 = this.d;
        myDB12.g = myDB12.h("DV");
        MyDB myDB13 = this.d;
        String str4 = myDB13.g;
        myDB13.q = str4.substring(str4.length() - 2, this.d.g.length());
        String substring = this.d.g.substring(3, 6);
        if (true == substring.equals("JAN")) {
            myDB5 = this.d;
            str3 = "1";
        } else if (true == substring.equals("FEB")) {
            myDB5 = this.d;
            str3 = "2";
        } else if (true == substring.equals("MAR")) {
            myDB5 = this.d;
            str3 = "3";
        } else if (true == substring.equals("APR")) {
            myDB5 = this.d;
            str3 = "4";
        } else if (true == substring.equals("MAY")) {
            myDB5 = this.d;
            str3 = "5";
        } else if (true == substring.equals("JUN")) {
            myDB5 = this.d;
            str3 = "6";
        } else if (true == substring.equals("JUL")) {
            myDB5 = this.d;
            str3 = "7";
        } else if (true == substring.equals("AUG")) {
            myDB5 = this.d;
            str3 = "8";
        } else if (true == substring.equals("SEP")) {
            myDB5 = this.d;
            str3 = "9";
        } else if (true == substring.equals("OCT")) {
            myDB5 = this.d;
            str3 = "A";
        } else if (true == substring.equals("NOV")) {
            myDB5 = this.d;
        } else if (true == substring.equals("DEC")) {
            myDB5 = this.d;
            str3 = "C";
        } else {
            myDB5 = this.d;
            str3 = "F";
        }
        myDB5.p = str3;
        MyDB myDB14 = this.d;
        myDB14.B = r.f(myDB14.h("DVP"));
        MyDB myDB15 = this.d;
        myDB15.h = myDB15.h("DVR");
        MyDB myDB16 = this.d;
        if (true == myDB16.g.equals(myDB16.h)) {
            this.d.C = BuildConfig.FLAVOR;
            setTitle("RepoPro 4.8 | " + this.d.g);
            if (true == this.d.B.equals("FACTORY")) {
                textView = this.o;
                sb = new StringBuilder();
                sb.append("RepoPro 4.8 | ");
                sb.append(this.d.g);
                sb.append(System.getProperty("line.separator"));
                sb.append(this.c);
                textView.setText(sb.toString());
                MyDB myDB17 = this.d;
                myDB17.n = myDB17.h("D");
                MyDB myDB18 = this.d;
                myDB18.r = myDB18.h("CE");
                MyDB myDB19 = this.d;
                myDB19.j = myDB19.h("PID");
                MyDB myDB20 = this.d;
                myDB20.s = myDB20.h("MI").toUpperCase().trim();
                MyDB myDB21 = this.d;
                myDB21.t = myDB21.h("PI").toUpperCase().trim();
            }
            textView = this.o;
            sb = new StringBuilder();
            sb.append("RepoPro 4.8 | ");
            sb.append(this.d.g);
            str2 = "[patch ";
        } else {
            MyDB myDB22 = this.d;
            myDB22.C = myDB22.h;
            setTitle("RepoPro 4.8 | " + this.d.g + "[update " + this.d.h + "]");
            if (true == this.d.B.equals("FACTORY")) {
                textView = this.o;
                sb = new StringBuilder();
                sb.append("RepoPro 4.8 | ");
                sb.append(this.d.g);
                sb.append("[update ");
                str = this.d.h;
                sb.append(str);
                sb.append("]");
                sb.append(System.getProperty("line.separator"));
                sb.append(this.c);
                textView.setText(sb.toString());
                MyDB myDB172 = this.d;
                myDB172.n = myDB172.h("D");
                MyDB myDB182 = this.d;
                myDB182.r = myDB182.h("CE");
                MyDB myDB192 = this.d;
                myDB192.j = myDB192.h("PID");
                MyDB myDB202 = this.d;
                myDB202.s = myDB202.h("MI").toUpperCase().trim();
                MyDB myDB212 = this.d;
                myDB212.t = myDB212.h("PI").toUpperCase().trim();
            }
            textView = this.o;
            sb = new StringBuilder();
            sb.append("RepoPro 4.8 | ");
            sb.append(this.d.g);
            sb.append("[update ");
            sb.append(this.d.h);
            str2 = "][patch ";
        }
        sb.append(str2);
        str = this.d.B;
        sb.append(str);
        sb.append("]");
        sb.append(System.getProperty("line.separator"));
        sb.append(this.c);
        textView.setText(sb.toString());
        MyDB myDB1722 = this.d;
        myDB1722.n = myDB1722.h("D");
        MyDB myDB1822 = this.d;
        myDB1822.r = myDB1822.h("CE");
        MyDB myDB1922 = this.d;
        myDB1922.j = myDB1922.h("PID");
        MyDB myDB2022 = this.d;
        myDB2022.s = myDB2022.h("MI").toUpperCase().trim();
        MyDB myDB2122 = this.d;
        myDB2122.t = myDB2122.h("PI").toUpperCase().trim();
    }

    /* access modifiers changed from: private */
    public void q1() {
        String str = Integer.toString(this.k0 + 1) + "/" + Integer.toString(this.l0) + "/" + Integer.toString(this.j0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            this.R.setText(simpleDateFormat2.format(parse).toUpperCase());
            this.a0 = simpleDateFormat3.format(parse).toUpperCase();
        } catch (ParseException e2) {
            Log.e("updateLastPaymentDate", "Error : updateLastPaymentDate : " + e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public Boolean t() {
        try {
            if (f1.TABBUTTON_HIT == this.f590b) {
                this.m.requestFocus();
                this.s.setTypeface(Typeface.defaultFromStyle(0));
                this.s.setTextColor(Color.parseColor("#000000"));
                this.s.getBackground().setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
                this.o.setVisibility(8);
                this.u.setVisibility(8);
                this.v.setVisibility(8);
                this.w.setVisibility(8);
                this.M.setVisibility(8);
                this.N.setVisibility(8);
                this.O.setVisibility(8);
                this.P.setVisibility(8);
                this.Q.setVisibility(8);
                this.R.setVisibility(8);
                this.S.setVisibility(8);
                this.T.setVisibility(8);
                this.U.setVisibility(8);
                this.V.setVisibility(8);
                this.W.setVisibility(8);
                this.X.setVisibility(8);
                this.Y.setVisibility(8);
                this.Z.setVisibility(8);
                this.g.setVisibility(0);
                this.t.setTypeface(Typeface.defaultFromStyle(1));
                this.t.setTextColor(Color.parseColor("#FF0000"));
                this.t.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            } else {
                this.n.requestFocus();
                this.s.setTypeface(Typeface.defaultFromStyle(1));
                this.s.setTextColor(Color.parseColor("#FF0000"));
                this.s.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                this.o.setVisibility(0);
                this.u.setVisibility(0);
                this.v.setVisibility(0);
                this.w.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(0);
                this.O.setVisibility(0);
                this.P.setVisibility(0);
                this.Q.setVisibility(0);
                this.R.setVisibility(0);
                this.S.setVisibility(0);
                this.T.setVisibility(0);
                this.U.setVisibility(0);
                this.V.setVisibility(0);
                this.W.setVisibility(0);
                this.X.setVisibility(0);
                this.Y.setVisibility(0);
                this.Z.setVisibility(0);
                this.g.setVisibility(8);
                this.t.setTypeface(Typeface.defaultFromStyle(0));
                this.t.setTextColor(Color.parseColor("#000000"));
                this.t.getBackground().setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
            }
            return Boolean.TRUE;
        } catch (Exception e2) {
            Log.e("MyCustomTabBtnHandler", "Error:" + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x028e A[Catch:{ IOException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u(java.lang.String r30) {
        /*
            r29 = this;
            r14 = r29
            java.lang.String r1 = "'"
            java.lang.String r2 = "SearchPlateNo"
            java.lang.String r3 = ""
            r14.x0 = r3
            r14.y0 = r3
            r0 = r30
            boolean r4 = r0.equals(r3)
            r5 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.String r0 = "Please keyin the PlateNo"
            com.repo.r.v(r14, r0, r5)
            return r5
        L_0x001b:
            java.lang.Integer r4 = r14.w0
            int r4 = r4.intValue()
            r15 = 1
            int r4 = r4 + r15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14.w0 = r4
            int r4 = r4.intValue()
            int r4 = r4 % 30
            if (r4 != 0) goto L_0x003c
            java.lang.Boolean r4 = r29.b()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x003c
            return r5
        L_0x003c:
            java.lang.String r7 = com.repo.r.n(r30)
            android.widget.TextView r0 = r14.o
            r0.setText(r3)
            android.widget.TextView r0 = r14.N
            r0.setText(r7)
            android.widget.EditText r0 = r14.P
            r0.setText(r3)
            android.widget.TextView r0 = r14.R
            r0.setText(r3)
            android.widget.EditText r0 = r14.T
            r0.setText(r3)
            android.widget.EditText r0 = r14.V
            r0.setText(r3)
            android.widget.TextView r0 = r14.X
            r0.setText(r3)
            android.widget.TextView r0 = r14.Z
            r0.setText(r3)
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ SQLiteException -> 0x032c }
            r0.o(r4)     // Catch:{ SQLiteException -> 0x032c }
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            r0.p(r4)     // Catch:{ SQLiteException -> 0x032c }
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            r0.q(r4)     // Catch:{ SQLiteException -> 0x032c }
            android.widget.TextView r0 = r14.q     // Catch:{ SQLiteException -> 0x032c }
            android.widget.TextView r4 = r14.p     // Catch:{ SQLiteException -> 0x032c }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x032c }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x032c }
            android.text.SpannableStringBuilder r4 = r14.i(r4, r6)     // Catch:{ SQLiteException -> 0x032c }
            r0.setText(r4)     // Catch:{ SQLiteException -> 0x032c }
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r4 = "FH2"
            android.widget.TextView r8 = r14.q     // Catch:{ SQLiteException -> 0x032c }
            java.lang.CharSequence r8 = r8.getText()     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r8 = r8.toString()     // Catch:{ SQLiteException -> 0x032c }
            r0.t(r4, r8)     // Catch:{ SQLiteException -> 0x032c }
            android.widget.TextView r0 = r14.p     // Catch:{ SQLiteException -> 0x032c }
            android.text.SpannableStringBuilder r4 = r14.i(r7, r6)     // Catch:{ SQLiteException -> 0x032c }
            r0.setText(r4)     // Catch:{ SQLiteException -> 0x032c }
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r4 = "FH1"
            android.widget.TextView r6 = r14.p     // Catch:{ SQLiteException -> 0x032c }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r6 = r6.toString()     // Catch:{ SQLiteException -> 0x032c }
            r0.t(r4, r6)     // Catch:{ SQLiteException -> 0x032c }
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            com.repo.t r0 = r0.T     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r0 = r0.h(r7)     // Catch:{ SQLiteException -> 0x032c }
            r14.z0 = r0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r0 = com.repo.r.i(r0)     // Catch:{ SQLiteException -> 0x032c }
            r14.A0 = r0     // Catch:{ SQLiteException -> 0x032c }
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            org.sqlite.database.sqlite.SQLiteDatabase r0 = r0.P     // Catch:{ SQLiteException -> 0x032c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x032c }
            r4.<init>()     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r6 = "SELECT * FROM VLD WHERE C1 = '"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r6 = r14.A0     // Catch:{ SQLiteException -> 0x032c }
            r4.append(r6)     // Catch:{ SQLiteException -> 0x032c }
            r4.append(r1)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x032c }
            r6 = 0
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r8 = "C5"
            java.lang.String r9 = "C4"
            java.lang.String r10 = "C3"
            java.lang.String r11 = "Error : SearchPlateNo : "
            java.lang.String r12 = "C2"
            if (r4 == 0) goto L_0x01f2
            int r0 = r4.getCount()     // Catch:{ SQLiteException -> 0x032c }
            if (r0 <= 0) goto L_0x01cc
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x032c }
            if (r0 == 0) goto L_0x01f2
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x0155 }
            com.repo.t r0 = r0.S     // Catch:{ IOException -> 0x0155 }
            int r13 = r4.getColumnIndex(r12)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r13 = r4.getString(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = r0.g(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = com.repo.r.c(r0)     // Catch:{ IOException -> 0x0155 }
            r14.C0 = r0     // Catch:{ IOException -> 0x0155 }
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x0155 }
            com.repo.t r0 = r0.S     // Catch:{ IOException -> 0x0155 }
            int r13 = r4.getColumnIndex(r10)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r13 = r4.getString(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = r0.g(r13)     // Catch:{ IOException -> 0x0155 }
            r14.D0 = r0     // Catch:{ IOException -> 0x0155 }
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x0155 }
            com.repo.t r0 = r0.S     // Catch:{ IOException -> 0x0155 }
            int r13 = r4.getColumnIndex(r9)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r13 = r4.getString(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = r0.g(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = com.repo.r.c(r0)     // Catch:{ IOException -> 0x0155 }
            r14.E0 = r0     // Catch:{ IOException -> 0x0155 }
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x0155 }
            com.repo.t r0 = r0.S     // Catch:{ IOException -> 0x0155 }
            int r13 = r4.getColumnIndex(r8)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r13 = r4.getString(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = r0.g(r13)     // Catch:{ IOException -> 0x0155 }
            java.lang.String r0 = com.repo.r.c(r0)     // Catch:{ IOException -> 0x0155 }
            r14.B0 = r0     // Catch:{ IOException -> 0x0155 }
            goto L_0x016c
        L_0x0155:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x032c }
            r13.<init>()     // Catch:{ SQLiteException -> 0x032c }
            r13.append(r11)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x032c }
            r13.append(r0)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r0 = r13.toString()     // Catch:{ SQLiteException -> 0x032c }
            android.util.Log.e(r2, r0)     // Catch:{ SQLiteException -> 0x032c }
        L_0x016c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x032c }
            r0.<init>()     // Catch:{ SQLiteException -> 0x032c }
            r0.append(r7)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = r14.B0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = com.repo.r.m(r13)     // Catch:{ SQLiteException -> 0x032c }
            r0.append(r13)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = r14.C0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = com.repo.r.m(r13)     // Catch:{ SQLiteException -> 0x032c }
            r0.append(r13)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = r14.D0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = com.repo.r.m(r13)     // Catch:{ SQLiteException -> 0x032c }
            r0.append(r13)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = r14.E0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r13 = com.repo.r.m(r13)     // Catch:{ SQLiteException -> 0x032c }
            r0.append(r13)     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x032c }
            r14.x0 = r0     // Catch:{ SQLiteException -> 0x032c }
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r17 = "1"
            java.lang.String r13 = r14.C0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r15 = r14.D0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r5 = r14.E0     // Catch:{ SQLiteException -> 0x032c }
            java.lang.String r6 = r14.B0     // Catch:{ SQLiteException -> 0x032c }
            r27 = r3
            android.widget.EditText r3 = r14.m     // Catch:{ SQLiteException -> 0x032a }
            android.text.Editable r3 = r3.getText()     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r23 = r3.toString()     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            r16 = r0
            r18 = r7
            r19 = r13
            r20 = r15
            r21 = r5
            r22 = r6
            r16.m(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x032a }
            goto L_0x01f4
        L_0x01cc:
            r27 = r3
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r17 = "0"
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            java.lang.String r22 = ""
            android.widget.EditText r3 = r14.m     // Catch:{ SQLiteException -> 0x032a }
            android.text.Editable r3 = r3.getText()     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r23 = r3.toString()     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            r16 = r0
            r18 = r7
            r16.m(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x032a }
            goto L_0x01f4
        L_0x01f2:
            r27 = r3
        L_0x01f4:
            if (r4 == 0) goto L_0x01ff
            boolean r0 = r4.isClosed()     // Catch:{ SQLiteException -> 0x032a }
            if (r0 != 0) goto L_0x01ff
            r4.close()     // Catch:{ SQLiteException -> 0x032a }
        L_0x01ff:
            com.repo.MyDB r0 = r14.d     // Catch:{ SQLiteException -> 0x032a }
            org.sqlite.database.sqlite.SQLiteDatabase r0 = r0.R     // Catch:{ SQLiteException -> 0x032a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x032a }
            r3.<init>()     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r4 = "SELECT * FROM VLS WHERE C1 = '"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x032a }
            com.repo.MyDB r4 = r14.d     // Catch:{ SQLiteException -> 0x032a }
            com.repo.t r4 = r4.U     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r4 = r4.h(r7)     // Catch:{ SQLiteException -> 0x032a }
            r3.append(r4)     // Catch:{ SQLiteException -> 0x032a }
            r3.append(r1)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r1 = r3.toString()     // Catch:{ SQLiteException -> 0x032a }
            r3 = 0
            android.database.Cursor r1 = r0.rawQuery(r1, r3)     // Catch:{ SQLiteException -> 0x032a }
            if (r1 == 0) goto L_0x031e
            int r0 = r1.getCount()     // Catch:{ SQLiteException -> 0x032a }
            if (r0 <= 0) goto L_0x031e
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x032a }
            if (r0 == 0) goto L_0x031e
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x02cc }
            com.repo.t r0 = r0.U     // Catch:{ IOException -> 0x02cc }
            int r3 = r1.getColumnIndex(r12)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = r0.g(r3)     // Catch:{ IOException -> 0x02cc }
            r14.F0 = r0     // Catch:{ IOException -> 0x02cc }
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x02cc }
            com.repo.t r0 = r0.U     // Catch:{ IOException -> 0x02cc }
            int r3 = r1.getColumnIndex(r10)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = r0.g(r3)     // Catch:{ IOException -> 0x02cc }
            r14.G0 = r0     // Catch:{ IOException -> 0x02cc }
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x02cc }
            com.repo.t r0 = r0.U     // Catch:{ IOException -> 0x02cc }
            int r3 = r1.getColumnIndex(r9)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = r0.g(r3)     // Catch:{ IOException -> 0x02cc }
            r14.H0 = r0     // Catch:{ IOException -> 0x02cc }
            com.repo.MyDB r0 = r14.d     // Catch:{ IOException -> 0x02cc }
            com.repo.t r0 = r0.U     // Catch:{ IOException -> 0x02cc }
            int r3 = r1.getColumnIndex(r8)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = r0.g(r3)     // Catch:{ IOException -> 0x02cc }
            r14.I0 = r0     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = "C6"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x02cc }
            r14.J0 = r0     // Catch:{ IOException -> 0x02cc }
            int r0 = r0.length()     // Catch:{ IOException -> 0x02cc }
            r3 = 16
            if (r0 <= r3) goto L_0x0297
            java.lang.String r0 = r14.J0     // Catch:{ IOException -> 0x02cc }
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r3)     // Catch:{ IOException -> 0x02cc }
            r14.J0 = r0     // Catch:{ IOException -> 0x02cc }
        L_0x0297:
            android.widget.EditText r0 = r14.P     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r14.F0     // Catch:{ IOException -> 0x02cc }
            r0.setText(r3)     // Catch:{ IOException -> 0x02cc }
            android.widget.TextView r0 = r14.R     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r14.G0     // Catch:{ IOException -> 0x02cc }
            r0.setText(r3)     // Catch:{ IOException -> 0x02cc }
            android.widget.EditText r0 = r14.T     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r14.H0     // Catch:{ IOException -> 0x02cc }
            r0.setText(r3)     // Catch:{ IOException -> 0x02cc }
            android.widget.EditText r0 = r14.V     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r14.I0     // Catch:{ IOException -> 0x02cc }
            r0.setText(r3)     // Catch:{ IOException -> 0x02cc }
            android.widget.TextView r0 = r14.Z     // Catch:{ IOException -> 0x02cc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02cc }
            r3.<init>()     // Catch:{ IOException -> 0x02cc }
            java.lang.String r4 = "Saved:"
            r3.append(r4)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r4 = r14.J0     // Catch:{ IOException -> 0x02cc }
            r3.append(r4)     // Catch:{ IOException -> 0x02cc }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02cc }
            r0.setText(r3)     // Catch:{ IOException -> 0x02cc }
            goto L_0x02e3
        L_0x02cc:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x032a }
            r3.<init>()     // Catch:{ SQLiteException -> 0x032a }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x032a }
            r3.append(r0)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r0 = r3.toString()     // Catch:{ SQLiteException -> 0x032a }
            android.util.Log.e(r2, r0)     // Catch:{ SQLiteException -> 0x032a }
        L_0x02e3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x032a }
            r0.<init>()     // Catch:{ SQLiteException -> 0x032a }
            r0.append(r7)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = r14.F0     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = com.repo.r.m(r3)     // Catch:{ SQLiteException -> 0x032a }
            r0.append(r3)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = r14.G0     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = com.repo.r.m(r3)     // Catch:{ SQLiteException -> 0x032a }
            r0.append(r3)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = r14.H0     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = com.repo.r.m(r3)     // Catch:{ SQLiteException -> 0x032a }
            r0.append(r3)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = r14.I0     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = com.repo.r.m(r3)     // Catch:{ SQLiteException -> 0x032a }
            r0.append(r3)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = r14.J0     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r3 = com.repo.r.m(r3)     // Catch:{ SQLiteException -> 0x032a }
            r0.append(r3)     // Catch:{ SQLiteException -> 0x032a }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x032a }
            r14.y0 = r0     // Catch:{ SQLiteException -> 0x032a }
        L_0x031e:
            if (r1 == 0) goto L_0x0347
            boolean r0 = r1.isClosed()     // Catch:{ SQLiteException -> 0x032a }
            if (r0 != 0) goto L_0x0347
            r1.close()     // Catch:{ SQLiteException -> 0x032a }
            goto L_0x0347
        L_0x032a:
            r0 = move-exception
            goto L_0x032f
        L_0x032c:
            r0 = move-exception
            r27 = r3
        L_0x032f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Could not read the table. Error:"
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r2, r0)
        L_0x0347:
            java.lang.String r0 = r14.x0
            r1 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x035d
            java.lang.String r0 = r14.y0
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035a
            goto L_0x035d
        L_0x035a:
            r1 = 1
            goto L_0x0518
        L_0x035d:
            com.repo.MyDB r0 = r14.d
            java.lang.Boolean r0 = r0.I
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r2 != r0) goto L_0x036b
            r29.n1()
        L_0x036b:
            com.repo.MyDB r0 = r14.d
            java.lang.Boolean r0 = r0.d
            boolean r0 = r0.booleanValue()
            java.lang.String r3 = " ]"
            if (r2 != r0) goto L_0x039d
            android.widget.Button r0 = r14.t
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Hit[ "
            r4.append(r5)
            com.repo.n r5 = r14.i
            int r5 = r5.getCount()
            int r5 = r5 + r2
            java.lang.String r2 = java.lang.Integer.toString(r5)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r0.setText(r2)
            r5 = 1
            goto L_0x03c2
        L_0x039d:
            android.widget.Button r0 = r14.t
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Kena[ "
            r2.append(r4)
            com.repo.n r4 = r14.i
            int r4 = r4.getCount()
            r5 = 1
            int r4 = r4 + r5
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.setText(r2)
        L_0x03c2:
            java.lang.String r0 = r14.y0
            boolean r0 = r0.equals(r1)
            if (r5 != r0) goto L_0x0429
            android.widget.TextView r0 = r14.o
            java.lang.String r1 = r14.x0
            r0.setText(r1)
            java.util.List<com.repo.o> r0 = r14.h
            com.repo.o r1 = new com.repo.o
            java.lang.String r2 = r14.B0
            java.lang.String r3 = r14.C0
            java.lang.String r4 = r14.D0
            java.lang.String r5 = r14.E0
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            java.lang.String r27 = ""
            java.lang.String r28 = ""
            r16 = r1
            r17 = r7
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            r0.add(r2, r1)
            android.widget.TextView r0 = r14.o
            java.lang.String r3 = r14.B0
            java.lang.String r4 = r14.C0
            java.lang.String r5 = r14.D0
            java.lang.String r6 = r14.E0
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r15 = ""
            r1 = r29
            r2 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r15
        L_0x0420:
            android.text.SpannableStringBuilder r1 = r1.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.setText(r1)
            goto L_0x04cd
        L_0x0429:
            java.lang.String r0 = r14.x0
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0482
            java.util.List<com.repo.o> r0 = r14.h
            com.repo.o r1 = new com.repo.o
            java.lang.String r2 = r14.B0
            java.lang.String r3 = r14.C0
            java.lang.String r4 = r14.D0
            java.lang.String r5 = r14.E0
            java.lang.String r6 = r14.F0
            java.lang.String r8 = r14.G0
            java.lang.String r9 = r14.H0
            java.lang.String r10 = r14.I0
            java.lang.String r11 = r14.J0
            java.lang.String r25 = ""
            r16 = r1
            r17 = r7
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r7
            r23 = r6
            r24 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            r0.add(r2, r1)
            android.widget.TextView r0 = r14.o
            java.lang.String r3 = r14.B0
            java.lang.String r4 = r14.C0
            java.lang.String r5 = r14.D0
            java.lang.String r6 = r14.E0
            java.lang.String r8 = r14.F0
            java.lang.String r9 = r14.G0
            java.lang.String r11 = r14.H0
            java.lang.String r12 = r14.I0
            java.lang.String r13 = r14.J0
            java.lang.String r10 = ""
            r1 = r29
            r2 = r7
            goto L_0x0420
        L_0x0482:
            java.util.List<com.repo.o> r0 = r14.h
            com.repo.o r1 = new com.repo.o
            java.lang.String r2 = r14.F0
            java.lang.String r3 = r14.G0
            java.lang.String r4 = r14.H0
            java.lang.String r5 = r14.I0
            java.lang.String r6 = r14.J0
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            java.lang.String r25 = ""
            r16 = r1
            r22 = r7
            r23 = r2
            r24 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            r0.add(r2, r1)
            android.widget.TextView r0 = r14.o
            java.lang.String r8 = r14.F0
            java.lang.String r9 = r14.G0
            java.lang.String r11 = r14.H0
            java.lang.String r12 = r14.I0
            java.lang.String r13 = r14.J0
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r10 = ""
            r1 = r29
            goto L_0x0420
        L_0x04cd:
            android.widget.TextView r0 = r14.o
            int r0 = r0.length()
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 <= r1) goto L_0x04df
            android.widget.TextView r0 = r14.o
            r1 = 1094713344(0x41400000, float:12.0)
        L_0x04db:
            r0.setTextSize(r1)
            goto L_0x0511
        L_0x04df:
            android.widget.TextView r0 = r14.o
            int r0 = r0.length()
            r1 = 140(0x8c, float:1.96E-43)
            if (r0 <= r1) goto L_0x04ee
            android.widget.TextView r0 = r14.o
            r1 = 1096810496(0x41600000, float:14.0)
            goto L_0x04db
        L_0x04ee:
            android.widget.TextView r0 = r14.o
            int r0 = r0.length()
            r1 = 120(0x78, float:1.68E-43)
            if (r0 <= r1) goto L_0x04fd
            android.widget.TextView r0 = r14.o
            r1 = 1098907648(0x41800000, float:16.0)
            goto L_0x04db
        L_0x04fd:
            android.widget.TextView r0 = r14.o
            int r0 = r0.length()
            r1 = 100
            if (r0 <= r1) goto L_0x050c
            android.widget.TextView r0 = r14.o
            r1 = 1099956224(0x41900000, float:18.0)
            goto L_0x04db
        L_0x050c:
            android.widget.TextView r0 = r14.o
            r1 = 1101004800(0x41a00000, float:20.0)
            goto L_0x04db
        L_0x0511:
            com.repo.n r0 = r14.i
            r0.notifyDataSetChanged()
            goto L_0x035a
        L_0x0518:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.repo.RepoActivity.u(java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public void v() {
        try {
            this.J.removeUpdates(this.I);
            HandlerThread handlerThread = this.K;
            if (handlerThread != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    handlerThread.quitSafely();
                } else {
                    handlerThread.quit();
                }
                this.K = null;
                this.x.setTextColor(-65536);
                this.G.setText("E:S");
                this.G.setTextColor(-65536);
                this.m.setBackgroundColor(-1);
                this.D = Boolean.FALSE;
            }
        } catch (Exception unused) {
            this.x.setTextColor(-65536);
            this.G.setText("E:X");
            this.G.setTextColor(-65536);
            this.m.setBackgroundColor(-1);
            this.D = Boolean.FALSE;
        }
    }

    public void R0() {
        if (a.b.a.b.a.a(this, "android.permission.ACCESS_COARSE_LOCATION") + a.b.a.b.a.a(this, "android.permission.ACCESS_FINE_LOCATION") + a.b.a.b.a.a(this, "android.permission.ACCESS_NETWORK_STATE") + a.b.a.b.a.a(this, "android.permission.ACCESS_WIFI_STATE") + a.b.a.b.a.a(this, "android.permission.INTERNET") + a.b.a.b.a.a(this, "android.permission.READ_PHONE_STATE") + a.b.a.b.a.a(this, "android.permission.READ_EXTERNAL_STORAGE") + a.b.a.b.a.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 123);
            return;
        }
        o();
    }

    public void ShowLongPlateNoDialog(View view) {
        String str;
        Dialog dialog;
        this.r0.setContentView(R.layout.longplateno);
        if (true == this.d.d.booleanValue()) {
            dialog = this.r0;
            str = "Long PlateNo";
        } else {
            dialog = this.r0;
            str = "PlateNo Panjang";
        }
        dialog.setTitle(str);
        Button button = (Button) this.r0.findViewById(R.id.btnPUTRAJAYA);
        Button button2 = (Button) this.r0.findViewById(R.id.btnRIMAU);
        Button button3 = (Button) this.r0.findViewById(R.id.btnSATRIA);
        Button button4 = (Button) this.r0.findViewById(R.id.btnSUKOM);
        Button button5 = (Button) this.r0.findViewById(R.id.btnTIARA);
        Button button6 = (Button) this.r0.findViewById(R.id.btnXIASEAN);
        Button button7 = (Button) this.r0.findViewById(R.id.btnXIIINAM);
        Button button8 = (Button) this.r0.findViewById(R.id.btnXOIC);
        Button button9 = (Button) this.r0.findViewById(R.id.btnXXVIIASEAN);
        ((Button) this.r0.findViewById(R.id.btnASEANXV)).setOnClickListener(new y());
        ((Button) this.r0.findViewById(R.id.btnBAMBEE)).setOnClickListener(new z());
        ((Button) this.r0.findViewById(R.id.btnCHANCELLOR)).setOnClickListener(new a0());
        ((Button) this.r0.findViewById(R.id.btnIM4U)).setOnClickListener(new b0());
        ((Button) this.r0.findViewById(R.id.btnJAGUH)).setOnClickListener(new c0());
        ((Button) this.r0.findViewById(R.id.btnKRISS)).setOnClickListener(new d0());
        ((Button) this.r0.findViewById(R.id.btnMALAYSIA)).setOnClickListener(new e0());
        ((Button) this.r0.findViewById(R.id.btnNAZA)).setOnClickListener(new g0());
        ((Button) this.r0.findViewById(R.id.btnPATRIOT)).setOnClickListener(new h0());
        ((Button) this.r0.findViewById(R.id.btnPERODUA)).setOnClickListener(new i0());
        ((Button) this.r0.findViewById(R.id.btnPERSONA)).setOnClickListener(new j0());
        ((Button) this.r0.findViewById(R.id.btnPROTON)).setOnClickListener(new k0());
        ((Button) this.r0.findViewById(R.id.btnPUTRA)).setOnClickListener(new l0());
        button.setOnClickListener(new m0());
        button2.setOnClickListener(new n0());
        button3.setOnClickListener(new o0());
        button4.setOnClickListener(new p0());
        button5.setOnClickListener(new r0());
        button6.setOnClickListener(new s0());
        button7.setOnClickListener(new t0());
        button8.setOnClickListener(new u0());
        button9.setOnClickListener(new v0());
        ((Button) this.r0.findViewById(R.id.btnXXXIDB)).setOnClickListener(new w0());
        this.r0.show();
    }

    /* access modifiers changed from: package-private */
    public int j(String str) {
        if (str.equalsIgnoreCase("JAN")) {
            return 1;
        }
        if (str.equalsIgnoreCase("FEB")) {
            return 2;
        }
        if (str.equalsIgnoreCase("MAR")) {
            return 3;
        }
        if (str.equalsIgnoreCase("APR")) {
            return 4;
        }
        if (str.equalsIgnoreCase("MAY")) {
            return 5;
        }
        if (str.equalsIgnoreCase("JUN")) {
            return 6;
        }
        if (str.equalsIgnoreCase("JUL")) {
            return 7;
        }
        if (str.equalsIgnoreCase("AUG")) {
            return 8;
        }
        if (str.equalsIgnoreCase("SEP")) {
            return 9;
        }
        if (str.equalsIgnoreCase("OCT")) {
            return 10;
        }
        if (str.equalsIgnoreCase("NOV")) {
            return 11;
        }
        return str.equalsIgnoreCase("DEC") ? 12 : 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0207 A[Catch:{ SQLiteException -> 0x021a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
            r13 = this;
            java.lang.String r0 = "LastRemark.db"
            java.lang.String r1 = "RepoProDiary.db"
            java.lang.String r2 = "Error"
            java.lang.String r3 = "RepoProData.db"
            r4 = 1
            java.lang.String r5 = android.os.Environment.getExternalStorageState()     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r6 = "mounted"
            boolean r5 = r5.equals(r6)     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r5) goto L_0x020e
            java.lang.String r5 = com.repo.r.g(r3)     // Catch:{ SQLiteException -> 0x021a }
            r13.c = r5     // Catch:{ SQLiteException -> 0x021a }
            boolean r5 = r5.startsWith(r2)     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r5) goto L_0x002f
            android.widget.TextView r0 = r13.o     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            r0.setText(r1)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x002f:
            android.widget.TextView r5 = r13.o     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r6 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            r5.setText(r6)     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r5 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r.j(r5)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r5 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ SQLiteException -> 0x021a }
            r5.o(r6)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r5 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            org.sqlite.database.sqlite.SQLiteDatabase r7 = r5.P     // Catch:{ SQLiteException -> 0x021a }
            if (r7 != 0) goto L_0x0054
            java.lang.String r0 = "Error: Data Handle is NULL"
            com.repo.r.v(r13, r0, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x0054:
            java.lang.String r7 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r7 = com.repo.r.h(r7, r3, r1)     // Catch:{ SQLiteException -> 0x021a }
            r5.E = r7     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r5 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r5 = r5.E     // Catch:{ SQLiteException -> 0x021a }
            boolean r5 = r5.startsWith(r2)     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r7 = "Error: Diary Handle is NULL"
            java.lang.String r8 = "DSV"
            if (r4 != r5) goto L_0x00be
            java.lang.String r5 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            r9 = 2131492886(0x7f0c0016, float:1.8609237E38)
            r13.k(r5, r3, r1, r9)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r5 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r9 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = com.repo.r.h(r9, r3, r1)     // Catch:{ SQLiteException -> 0x021a }
            r5.E = r1     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r1.E     // Catch:{ SQLiteException -> 0x021a }
            boolean r1 = r1.startsWith(r2)     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r1) goto L_0x0094
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.E     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r.v(r13, r0, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x0094:
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r1.E     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r.j(r1)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            r1.p(r6)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            org.sqlite.database.sqlite.SQLiteDatabase r5 = r1.Q     // Catch:{ SQLiteException -> 0x021a }
            if (r5 != 0) goto L_0x00b0
            com.repo.r.v(r13, r7, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x00b0:
            java.lang.String r5 = r1.j(r8)     // Catch:{ SQLiteException -> 0x021a }
            r1.e = r5     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r1.e     // Catch:{ SQLiteException -> 0x021a }
        L_0x00ba:
            r13.c(r1)     // Catch:{ SQLiteException -> 0x021a }
            goto L_0x00e5
        L_0x00be:
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r1.E     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r.j(r1)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            r1.p(r6)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            org.sqlite.database.sqlite.SQLiteDatabase r5 = r1.Q     // Catch:{ SQLiteException -> 0x021a }
            if (r5 != 0) goto L_0x00da
            com.repo.r.v(r13, r7, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x00da:
            java.lang.String r5 = r1.j(r8)     // Catch:{ SQLiteException -> 0x021a }
            r1.e = r5     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r1.e     // Catch:{ SQLiteException -> 0x021a }
            goto L_0x00ba
        L_0x00e5:
            r13.q()     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r1.r     // Catch:{ SQLiteException -> 0x021a }
            double r9 = java.lang.Double.parseDouble(r1)     // Catch:{ SQLiteException -> 0x021a }
            r11 = 4624521277365393818(0x402d99999999999a, double:14.8)
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x0129
            com.repo.r$e r0 = com.repo.r.e.REPOPRO_UI     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r$e r1 = com.repo.r.f761b     // Catch:{ SQLiteException -> 0x021a }
            if (r0 != r1) goto L_0x0112
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.Boolean r0 = r0.d     // Catch:{ SQLiteException -> 0x021a }
            boolean r0 = r0.booleanValue()     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r0) goto L_0x010f
            java.lang.String r0 = "Please update your RepoPro Software, it is already obsolete."
        L_0x010b:
            com.repo.r.v(r13, r0, r4)     // Catch:{ SQLiteException -> 0x021a }
            goto L_0x0122
        L_0x010f:
            java.lang.String r0 = "Sila upgrade software RepoPro anda kerana ianya telah ketinggalan zaman."
            goto L_0x010b
        L_0x0112:
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.Boolean r0 = r0.d     // Catch:{ SQLiteException -> 0x021a }
            boolean r0 = r0.booleanValue()     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r0) goto L_0x011f
            java.lang.String r0 = "Please update your Repo Software, it is already obsolete."
            goto L_0x010b
        L_0x011f:
            java.lang.String r0 = "Sila upgrade software Repo anda kerana ianya telah ketinggalan zaman."
            goto L_0x010b
        L_0x0122:
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            r13.finish()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x0129:
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r5 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r5 = com.repo.r.h(r5, r3, r0)     // Catch:{ SQLiteException -> 0x021a }
            r1.F = r5     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r1.F     // Catch:{ SQLiteException -> 0x021a }
            boolean r1 = r1.startsWith(r2)     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r5 = ""
            java.lang.String r7 = "Error: LastRemark Handle is NULL"
            java.lang.String r9 = "D"
            if (r4 != r1) goto L_0x01b6
            java.lang.String r1 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            r10 = 2131492885(0x7f0c0015, float:1.8609235E38)
            r13.k(r1, r3, r0, r10)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r1 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r10 = r13.c     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = com.repo.r.h(r10, r3, r0)     // Catch:{ SQLiteException -> 0x021a }
            r1.F = r0     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.F     // Catch:{ SQLiteException -> 0x021a }
            boolean r0 = r0.startsWith(r2)     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r0) goto L_0x016d
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.F     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r.v(r13, r0, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x016d:
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.F     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r.j(r0)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            r0.q(r6)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            org.sqlite.database.sqlite.SQLiteDatabase r1 = r0.R     // Catch:{ SQLiteException -> 0x021a }
            if (r1 != 0) goto L_0x0189
            com.repo.r.v(r13, r7, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x0189:
            java.lang.String r1 = r0.k(r8)     // Catch:{ SQLiteException -> 0x021a }
            r0.f = r1     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.f     // Catch:{ SQLiteException -> 0x021a }
            r13.d(r0)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r0.k(r9)     // Catch:{ SQLiteException -> 0x021a }
            r0.H = r1     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.H     // Catch:{ SQLiteException -> 0x021a }
            boolean r0 = r0.equals(r5)     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r0) goto L_0x01fd
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r0.G     // Catch:{ SQLiteException -> 0x021a }
            r0.u(r9, r1)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r0.G     // Catch:{ SQLiteException -> 0x021a }
        L_0x01b3:
            r0.H = r1     // Catch:{ SQLiteException -> 0x021a }
            goto L_0x01fd
        L_0x01b6:
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.F     // Catch:{ SQLiteException -> 0x021a }
            com.repo.r.j(r0)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            r0.q(r6)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            org.sqlite.database.sqlite.SQLiteDatabase r1 = r0.R     // Catch:{ SQLiteException -> 0x021a }
            if (r1 != 0) goto L_0x01d2
            com.repo.r.v(r13, r7, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.n()     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x01d2:
            java.lang.String r1 = r0.k(r8)     // Catch:{ SQLiteException -> 0x021a }
            r0.f = r1     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.f     // Catch:{ SQLiteException -> 0x021a }
            r13.d(r0)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r0.k(r9)     // Catch:{ SQLiteException -> 0x021a }
            r0.H = r1     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r0 = r0.H     // Catch:{ SQLiteException -> 0x021a }
            boolean r0 = r0.equals(r5)     // Catch:{ SQLiteException -> 0x021a }
            if (r4 != r0) goto L_0x01fd
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r0.G     // Catch:{ SQLiteException -> 0x021a }
            r0.u(r9, r1)     // Catch:{ SQLiteException -> 0x021a }
            com.repo.MyDB r0 = r13.d     // Catch:{ SQLiteException -> 0x021a }
            java.lang.String r1 = r0.G     // Catch:{ SQLiteException -> 0x021a }
            goto L_0x01b3
        L_0x01fd:
            java.lang.Boolean r0 = r13.a()     // Catch:{ SQLiteException -> 0x021a }
            boolean r0 = r0.booleanValue()     // Catch:{ SQLiteException -> 0x021a }
            if (r0 != 0) goto L_0x0235
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            r13.finish()     // Catch:{ SQLiteException -> 0x021a }
            return
        L_0x020e:
            java.lang.String r0 = "SD card is not mounted!!!"
            com.repo.r.v(r13, r0, r4)     // Catch:{ SQLiteException -> 0x021a }
            r13.s()     // Catch:{ SQLiteException -> 0x021a }
            r13.finish()     // Catch:{ SQLiteException -> 0x021a }
            goto L_0x0235
        L_0x021a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not open the RepoProData.db database. Error:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "onCreate"
            android.util.Log.e(r1, r0)
        L_0x0235:
            r13.s()
            com.repo.MyDB r0 = r13.d
            java.lang.Boolean r0 = r0.d
            boolean r0 = r0.booleanValue()
            if (r4 != r0) goto L_0x025a
            android.widget.Button r0 = r13.j
            java.lang.String r1 = "Find"
            r0.setText(r1)
            android.widget.Button r0 = r13.k
            java.lang.String r2 = "<-Delete"
            r0.setText(r2)
            android.widget.Button r0 = r13.s
            r0.setText(r1)
            android.widget.Button r0 = r13.t
            java.lang.String r1 = "Hit"
            goto L_0x0271
        L_0x025a:
            android.widget.Button r0 = r13.j
            java.lang.String r1 = "Cari"
            r0.setText(r1)
            android.widget.Button r0 = r13.k
            java.lang.String r2 = "<-Padam"
            r0.setText(r2)
            android.widget.Button r0 = r13.s
            r0.setText(r1)
            android.widget.Button r0 = r13.t
            java.lang.String r1 = "Kena"
        L_0x0271:
            r0.setText(r1)
            com.repo.MyDB r0 = r13.d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.o(r1)
            com.repo.MyDB r0 = r13.d
            r0.q(r1)
            r0 = 2131165332(0x7f070094, float:1.7944878E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r13.g = r0
            r0.setClickable(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.h = r0
            com.repo.n r0 = new com.repo.n
            java.util.List<com.repo.o> r1 = r13.h
            r0.<init>(r13, r1)
            r13.i = r0
            android.widget.ListView r1 = r13.g
            r1.setAdapter(r0)
            r13.t()
            r13.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.repo.RepoActivity.o():void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        Button button;
        String str;
        StringBuilder sb;
        StringBuilder sb2;
        TextView textView;
        String str2;
        String str3;
        if (i2 != 1) {
            if (i2 == 2) {
                if (true == Boolean.valueOf(intent.getBooleanExtra("blnLanguageIsEnglish", false)).booleanValue()) {
                    this.k.setText("<-Delete");
                    this.j.setText("Find");
                    this.s.setText("Find");
                    button = this.t;
                    sb = new StringBuilder();
                    str = "Hit[ ";
                } else {
                    this.k.setText("<-Padam");
                    this.j.setText("Cari");
                    this.s.setText("Cari");
                    button = this.t;
                    sb = new StringBuilder();
                    str = "Kena[ ";
                }
                sb.append(str);
                sb.append(Integer.toString(this.i.getCount()));
                sb.append(" ]");
                button.setText(sb.toString());
                String stringExtra = intent.getStringExtra("strKeyboardSize");
                KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
                keyboardView.setKeyboard(true == stringExtra.equals("90") ? new Keyboard(this, R.layout.keyboard90) : true == stringExtra.equals("80") ? new Keyboard(this, R.layout.keyboard80) : true == stringExtra.equals("70") ? new Keyboard(this, R.layout.keyboard70) : true == stringExtra.equals("60") ? new Keyboard(this, R.layout.keyboard60) : true == stringExtra.equals("50") ? new Keyboard(this, R.layout.keyboard50) : true == stringExtra.equals("40") ? new Keyboard(this, R.layout.keyboard40) : new Keyboard(this, R.layout.keyboard30));
                keyboardView.setEnabled(true);
                keyboardView.setPreviewEnabled(this.d.L.booleanValue());
                keyboardView.setOnKeyListener(this);
                keyboardView.setOnKeyboardActionListener(this);
            } else if (i2 == 3) {
                MyDB myDB = this.d;
                myDB.B = r.f(myDB.h("DVP"));
                MyDB myDB2 = this.d;
                myDB2.h = myDB2.h("DVR");
                MyDB myDB3 = this.d;
                String str4 = "]";
                if (myDB3.g.equals(myDB3.h)) {
                    this.d.C = BuildConfig.FLAVOR;
                    setTitle("RepoPro 4.8 | " + this.d.g);
                    if (this.d.B.equals("FACTORY")) {
                        textView = this.o;
                        sb2 = new StringBuilder();
                        sb2.append("RepoPro 4.8 | ");
                        str4 = this.d.g;
                        sb2.append(str4);
                        sb2.append(System.getProperty("line.separator"));
                        sb2.append(this.c);
                        textView.setText(sb2.toString());
                    }
                    textView = this.o;
                    sb2 = new StringBuilder();
                    sb2.append("RepoPro 4.8 | ");
                    sb2.append(this.d.g);
                    str3 = "[patch ";
                } else {
                    MyDB myDB4 = this.d;
                    myDB4.C = myDB4.h;
                    setTitle("RepoPro 4.8 | " + this.d.g + "[update " + this.d.h + str4);
                    if (this.d.B.equals("FACTORY")) {
                        textView = this.o;
                        sb2 = new StringBuilder();
                        sb2.append("RepoPro 4.8 | ");
                        sb2.append(this.d.g);
                        sb2.append("[update ");
                        str2 = this.d.h;
                        sb2.append(str2);
                        sb2.append(str4);
                        sb2.append(System.getProperty("line.separator"));
                        sb2.append(this.c);
                        textView.setText(sb2.toString());
                    }
                    textView = this.o;
                    sb2 = new StringBuilder();
                    sb2.append("RepoPro 4.8 | ");
                    sb2.append(this.d.g);
                    sb2.append("[update ");
                    sb2.append(this.d.h);
                    str3 = "][patch ";
                }
                sb2.append(str3);
                str2 = this.d.B;
                sb2.append(str2);
                sb2.append(str4);
                sb2.append(System.getProperty("line.separator"));
                sb2.append(this.c);
                textView.setText(sb2.toString());
            }
        } else if (i3 != -1 || !Boolean.valueOf(intent.getBooleanExtra("blnIdPasswordResult", false)).booleanValue()) {
            finish();
        } else if (true == this.d.g().booleanValue()) {
            startActivity(new Intent(this, FollowUpActivity.class));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s();
        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        double height = (double) defaultDisplay.getHeight();
        double d2 = (double) displayMetrics.density;
        Double.isNaN(height);
        Double.isNaN(d2);
        int i2 = (int) ((height / d2) + 0.5d);
        if (i2 > 360 && i2 > 400) {
            if (i2 > 480) {
                this.q.setVisibility(0);
                this.r.setVisibility(0);
            } else if (true == this.d.u.equals("30") || true == this.d.u.equals("40") || true == this.d.u.equals("50")) {
                this.q.setVisibility(8);
                this.r.setVisibility(8);
            }
            this.p.setVisibility(0);
            this.k.setVisibility(0);
            return;
        }
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.p.setVisibility(8);
        this.k.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0412  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            android.view.Window r10 = r9.getWindow()
            r0 = 8
            r10.requestFeature(r0)
            r10 = 2131296288(0x7f090020, float:1.8210488E38)
            r9.setContentView(r10)
            android.app.ActionBar r10 = r9.getActionBar()
            if (r10 == 0) goto L_0x002c
            r1 = 16
            r10.setDisplayOptions(r1)
            r1 = 2131296256(0x7f090000, float:1.8210424E38)
            r10.setCustomView(r1)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.<init>(r2)
            r10.setBackgroundDrawable(r1)
        L_0x002c:
            android.content.Context r10 = r9.getApplicationContext()
            com.repo.MyDB r10 = (com.repo.MyDB) r10
            r9.d = r10
            r10.l()
            r10 = 2131165217(0x7f070021, float:1.7944645E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r9.j = r10
            r10 = 2131165295(0x7f07006f, float:1.7944803E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.o = r10
            r10 = 2131165385(0x7f0700c9, float:1.7944986E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r9.n = r10
            r10 = 2131165378(0x7f0700c2, float:1.7944971E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r9.m = r10
            r10 = 2131165293(0x7f07006d, float:1.79448E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.p = r10
            r10 = 2131165294(0x7f07006e, float:1.7944801E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.q = r10
            r10 = 2131165222(0x7f070026, float:1.7944655E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r9.r = r10
            r10 = 2131165213(0x7f07001d, float:1.7944637E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r9.k = r10
            r10 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r9.s = r10
            r10 = 2131165246(0x7f07003e, float:1.7944704E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r9.t = r10
            r10 = 2131165352(0x7f0700a8, float:1.7944919E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r9.u = r10
            r10 = 2131165278(0x7f07005e, float:1.7944769E38)
            android.view.View r10 = r9.findViewById(r10)
            android.inputmethodservice.KeyboardView r10 = (android.inputmethodservice.KeyboardView) r10
            r9.v = r10
            r10 = 2131165386(0x7f0700ca, float:1.7944988E38)
            android.view.View r10 = r9.findViewById(r10)
            r9.w = r10
            r10 = 2131165218(0x7f070022, float:1.7944647E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r9.x = r10
            r10 = 2131165299(0x7f070073, float:1.7944811E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.G = r10
            java.lang.Boolean r10 = r9.y
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00fc
            android.widget.Button r10 = r9.x
            r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r10.setTextColor(r1)
            android.widget.EditText r10 = r9.m
            r1 = 195(0xc3, float:2.73E-43)
            r2 = 245(0xf5, float:3.43E-43)
            r3 = 174(0xae, float:2.44E-43)
            int r1 = android.graphics.Color.rgb(r1, r2, r3)
            r10.setBackgroundColor(r1)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            goto L_0x010b
        L_0x00fc:
            android.widget.Button r10 = r9.x
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r10.setTextColor(r1)
            android.widget.EditText r10 = r9.m
            r1 = -1
            r10.setBackgroundColor(r1)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
        L_0x010b:
            r9.D = r10
            com.repo.RepoActivity$e1 r10 = new com.repo.RepoActivity$e1
            r1 = 0
            r10.<init>(r9, r1)
            r9.I = r10
            java.lang.String r10 = "location"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.location.LocationManager r10 = (android.location.LocationManager) r10
            r9.J = r10
            android.location.Geocoder r10 = new android.location.Geocoder
            android.content.Context r2 = r9.getBaseContext()
            java.util.Locale r3 = java.util.Locale.getDefault()
            r10.<init>(r2, r3)
            r9.L = r10
            android.location.LocationManager r10 = r9.J     // Catch:{ Exception -> 0x013d }
            java.lang.String r2 = "gps"
            boolean r10 = r10.isProviderEnabled(r2)     // Catch:{ Exception -> 0x013d }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x013d }
            r9.z = r10     // Catch:{ Exception -> 0x013d }
            goto L_0x013e
        L_0x013d:
        L_0x013e:
            r10 = 2131165319(0x7f070087, float:1.7944852E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.M = r10
            r10 = 2131165313(0x7f070081, float:1.794484E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.N = r10
            r10 = 2131165315(0x7f070083, float:1.7944844E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.O = r10
            r10 = 2131165374(0x7f0700be, float:1.7944963E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r9.P = r10
            r10 = 2131165318(0x7f070086, float:1.794485E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.Q = r10
            r10 = 2131165301(0x7f070075, float:1.7944815E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.R = r10
            java.lang.String r2 = ""
            r10.setText(r2)
            r10 = 2131165316(0x7f070084, float:1.7944846E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.S = r10
            r10 = 2131165376(0x7f0700c0, float:1.7944967E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r9.T = r10
            r10 = 2131165320(0x7f070088, float:1.7944854E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.U = r10
            r10 = 2131165384(0x7f0700c8, float:1.7944984E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r9.V = r10
            r10 = 2131165317(0x7f070085, float:1.7944848E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.W = r10
            r10 = 2131165296(0x7f070070, float:1.7944805E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.X = r10
            r10.setText(r2)
            r10 = 2131165238(0x7f070036, float:1.7944687E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r9.Y = r10
            r10 = 2131165303(0x7f070077, float:1.794482E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.Z = r10
            r10.setText(r2)
            android.app.Dialog r10 = new android.app.Dialog
            r10.<init>(r9)
            r9.r0 = r10
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            r2 = 1
            int r3 = r10.get(r2)
            r9.j0 = r3
            r3 = 2
            int r4 = r10.get(r3)
            r9.k0 = r4
            r4 = 5
            int r5 = r10.get(r4)
            r9.l0 = r5
            int r5 = r10.get(r2)
            r9.m0 = r5
            int r5 = r10.get(r3)
            r9.n0 = r5
            int r10 = r10.get(r4)
            r9.o0 = r10
            java.lang.String r10 = "RepoPro 4.8"
            r9.setTitle(r10)
            java.lang.String r10 = "window"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.view.WindowManager r10 = (android.view.WindowManager) r10
            android.view.Display r10 = r10.getDefaultDisplay()
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            r10.getMetrics(r4)
            int r10 = r10.getHeight()
            double r5 = (double) r10
            float r10 = r4.density
            double r7 = (double) r10
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r5 = r5 + r7
            int r10 = (int) r5
            r4 = 360(0x168, float:5.04E-43)
            r5 = 0
            if (r10 > r4) goto L_0x025b
        L_0x0246:
            android.widget.TextView r10 = r9.q
            r10.setVisibility(r0)
            android.widget.Button r10 = r9.r
            r10.setVisibility(r0)
            android.widget.TextView r10 = r9.p
            r10.setVisibility(r0)
            android.widget.Button r10 = r9.k
            r10.setVisibility(r0)
            goto L_0x02a7
        L_0x025b:
            r4 = 400(0x190, float:5.6E-43)
            if (r10 > r4) goto L_0x0260
            goto L_0x0246
        L_0x0260:
            r4 = 480(0x1e0, float:6.73E-43)
            if (r10 > r4) goto L_0x0293
            com.repo.MyDB r10 = r9.d
            java.lang.String r10 = r10.u
            java.lang.String r4 = "30"
            boolean r10 = r10.equals(r4)
            if (r2 == r10) goto L_0x0288
            com.repo.MyDB r10 = r9.d
            java.lang.String r10 = r10.u
            java.lang.String r4 = "40"
            boolean r10 = r10.equals(r4)
            if (r2 == r10) goto L_0x0288
            com.repo.MyDB r10 = r9.d
            java.lang.String r10 = r10.u
            java.lang.String r4 = "50"
            boolean r10 = r10.equals(r4)
            if (r2 != r10) goto L_0x0246
        L_0x0288:
            android.widget.TextView r10 = r9.q
            r10.setVisibility(r0)
            android.widget.Button r10 = r9.r
            r10.setVisibility(r0)
            goto L_0x029d
        L_0x0293:
            android.widget.TextView r10 = r9.q
            r10.setVisibility(r5)
            android.widget.Button r10 = r9.r
            r10.setVisibility(r5)
        L_0x029d:
            android.widget.TextView r10 = r9.p
            r10.setVisibility(r5)
            android.widget.Button r10 = r9.k
            r10.setVisibility(r5)
        L_0x02a7:
            android.widget.Button r10 = r9.j
            com.repo.RepoActivity$u r0 = new com.repo.RepoActivity$u
            r0.<init>()
            r10.setOnClickListener(r0)
            android.widget.Button r10 = r9.x
            com.repo.RepoActivity$f0 r0 = new com.repo.RepoActivity$f0
            r0.<init>()
            r10.setOnClickListener(r0)
            android.widget.Button r10 = r9.Y
            com.repo.RepoActivity$q0 r0 = new com.repo.RepoActivity$q0
            r0.<init>()
            r10.setOnClickListener(r0)
            android.content.res.Resources r10 = r9.getResources()
            r0 = 2131099651(0x7f060003, float:1.7811661E38)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r0)
            int r0 = r10.getIntrinsicWidth()
            int r4 = r10.getIntrinsicHeight()
            r10.setBounds(r5, r5, r0, r4)
            android.content.res.Resources r0 = r9.getResources()
            r4 = 2131099690(0x7f06002a, float:1.781174E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            int r4 = r0.getIntrinsicWidth()
            int r6 = r0.getIntrinsicHeight()
            r0.setBounds(r5, r5, r4, r6)
            android.widget.TextView r4 = r9.R
            r4.setCompoundDrawables(r0, r1, r10, r1)
            android.widget.TextView r4 = r9.R
            com.repo.RepoActivity$x0 r6 = new com.repo.RepoActivity$x0
            r6.<init>(r10, r0)
            r4.setOnTouchListener(r6)
            android.widget.TextView r4 = r9.X
            r4.setCompoundDrawables(r0, r1, r10, r1)
            android.widget.TextView r4 = r9.X
            com.repo.RepoActivity$y0 r6 = new com.repo.RepoActivity$y0
            r6.<init>(r10, r0)
            r4.setOnTouchListener(r6)
            android.widget.Button r10 = r9.s
            com.repo.RepoActivity$z0 r4 = new com.repo.RepoActivity$z0
            r4.<init>()
            r10.setOnClickListener(r4)
            android.widget.Button r10 = r9.t
            com.repo.RepoActivity$a1 r4 = new com.repo.RepoActivity$a1
            r4.<init>()
            r10.setOnClickListener(r4)
            android.widget.Button r10 = r9.r
            com.repo.RepoActivity$b1 r4 = new com.repo.RepoActivity$b1
            r4.<init>()
            r10.setOnClickListener(r4)
            android.widget.Button r10 = r9.k
            com.repo.RepoActivity$a r4 = new com.repo.RepoActivity$a
            r4.<init>()
            r10.setOnClickListener(r4)
            com.repo.RepoActivity$b r10 = new com.repo.RepoActivity$b
            r10.<init>()
            android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
            r2[r5] = r10
            android.text.InputFilter$LengthFilter r10 = new android.text.InputFilter$LengthFilter
            r4 = 15
            r10.<init>(r4)
            r2[r5] = r10
            android.widget.EditText r10 = r9.n
            r10.setFilters(r2)
            android.widget.EditText r10 = r9.n
            r10.setInputType(r5)
            android.widget.EditText r10 = r9.m
            r10.setInputType(r5)
            android.widget.EditText r10 = r9.P
            r10.setInputType(r5)
            android.widget.EditText r10 = r9.T
            r10.setInputType(r5)
            android.widget.EditText r10 = r9.V
            r10.setInputType(r5)
            android.widget.EditText r10 = r9.V
            r10.setSingleLine(r5)
            android.widget.EditText r10 = r9.V
            r10.setMaxLines(r3)
            android.widget.EditText r10 = r9.n
            com.repo.RepoActivity$c r2 = new com.repo.RepoActivity$c
            r2.<init>()
            r10.setOnClickListener(r2)
            android.widget.EditText r10 = r9.n
            com.repo.RepoActivity$d r2 = new com.repo.RepoActivity$d
            r2.<init>()
            r10.setOnKeyListener(r2)
            android.widget.EditText r10 = r9.n
            com.repo.RepoActivity$e r2 = new com.repo.RepoActivity$e
            r2.<init>()
            r10.setOnFocusChangeListener(r2)
            int r10 = r0.getIntrinsicWidth()
            int r2 = r0.getIntrinsicHeight()
            r0.setBounds(r5, r5, r10, r2)
            android.widget.EditText r10 = r9.m
            r10.setCompoundDrawables(r1, r1, r1, r1)
            android.widget.EditText r10 = r9.m
            com.repo.RepoActivity$f r1 = new com.repo.RepoActivity$f
            r1.<init>(r0)
            r10.setOnTouchListener(r1)
            android.widget.EditText r10 = r9.m
            com.repo.RepoActivity$g r1 = new com.repo.RepoActivity$g
            r1.<init>(r0)
            r10.addTextChangedListener(r1)
            android.widget.EditText r10 = r9.m
            com.repo.RepoActivity$h r0 = new com.repo.RepoActivity$h
            r0.<init>()
            r10.setOnClickListener(r0)
            android.widget.EditText r10 = r9.m
            com.repo.RepoActivity$i r0 = new com.repo.RepoActivity$i
            r0.<init>()
            r10.setOnFocusChangeListener(r0)
            android.widget.EditText r10 = r9.n
            r10.requestFocus()
            android.widget.EditText r10 = r9.P
            com.repo.RepoActivity$j r0 = new com.repo.RepoActivity$j
            r0.<init>()
            r10.setOnClickListener(r0)
            android.widget.EditText r10 = r9.P
            com.repo.RepoActivity$k r0 = new com.repo.RepoActivity$k
            r0.<init>()
            r10.setOnFocusChangeListener(r0)
            android.widget.EditText r10 = r9.T
            com.repo.RepoActivity$l r0 = new com.repo.RepoActivity$l
            r0.<init>()
            r10.setOnClickListener(r0)
            android.widget.EditText r10 = r9.T
            com.repo.RepoActivity$m r0 = new com.repo.RepoActivity$m
            r0.<init>()
            r10.setOnFocusChangeListener(r0)
            android.widget.EditText r10 = r9.V
            com.repo.RepoActivity$n r0 = new com.repo.RepoActivity$n
            r0.<init>()
            r10.setOnClickListener(r0)
            android.widget.EditText r10 = r9.V
            com.repo.RepoActivity$o r0 = new com.repo.RepoActivity$o
            r0.<init>()
            r10.setOnFocusChangeListener(r0)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 < r0) goto L_0x0412
            r9.R0()
            goto L_0x0415
        L_0x0412:
            r9.o()
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.repo.RepoActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i2) {
        DatePickerDialog datePickerDialog;
        String str;
        if (i2 != 0) {
            return null;
        }
        if (d1.LASTPAYMENT_DATE == this.q0) {
            datePickerDialog = new DatePickerDialog(this, this.O0, this.j0, this.k0, this.l0);
            this.p0 = datePickerDialog;
            str = "LastPayment Date";
        } else {
            datePickerDialog = new DatePickerDialog(this, this.O0, this.m0, this.n0, this.o0);
            this.p0 = datePickerDialog;
            str = "FollowUp Date";
        }
        datePickerDialog.setTitle(str);
        return this.p0;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            o1();
            this.d.c();
            v();
            this.I = null;
            this.J = null;
        } catch (Exception e2) {
            Log.e("onDestroy", "Could not close the database. Error:" + e2.getMessage());
        }
        u.a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01ef, code lost:
        if (r4 == r5) goto L_0x0181;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onKey(int r4, int[] r5) {
        /*
            r3 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r0 = "48"
            java.lang.String r1 = "0"
            r5.put(r0, r1)
            java.lang.String r0 = "49"
            java.lang.String r1 = "1"
            r5.put(r0, r1)
            java.lang.String r0 = "50"
            java.lang.String r1 = "2"
            r5.put(r0, r1)
            java.lang.String r0 = "51"
            java.lang.String r1 = "3"
            r5.put(r0, r1)
            java.lang.String r0 = "52"
            java.lang.String r1 = "4"
            r5.put(r0, r1)
            java.lang.String r0 = "53"
            java.lang.String r1 = "5"
            r5.put(r0, r1)
            java.lang.String r0 = "54"
            java.lang.String r1 = "6"
            r5.put(r0, r1)
            java.lang.String r0 = "55"
            java.lang.String r1 = "7"
            r5.put(r0, r1)
            java.lang.String r0 = "56"
            java.lang.String r1 = "8"
            r5.put(r0, r1)
            java.lang.String r0 = "57"
            java.lang.String r2 = "9"
            r5.put(r0, r2)
            java.lang.String r0 = "65"
            java.lang.String r2 = "A"
            r5.put(r0, r2)
            java.lang.String r0 = "66"
            java.lang.String r2 = "B"
            r5.put(r0, r2)
            java.lang.String r0 = "67"
            java.lang.String r2 = "C"
            r5.put(r0, r2)
            java.lang.String r0 = "68"
            java.lang.String r2 = "D"
            r5.put(r0, r2)
            java.lang.String r0 = "69"
            java.lang.String r2 = "E"
            r5.put(r0, r2)
            java.lang.String r0 = "70"
            java.lang.String r2 = "F"
            r5.put(r0, r2)
            java.lang.String r0 = "71"
            java.lang.String r2 = "G"
            r5.put(r0, r2)
            java.lang.String r0 = "72"
            java.lang.String r2 = "H"
            r5.put(r0, r2)
            java.lang.String r0 = "73"
            java.lang.String r2 = "I"
            r5.put(r0, r2)
            java.lang.String r0 = "74"
            java.lang.String r2 = "J"
            r5.put(r0, r2)
            java.lang.String r0 = "75"
            java.lang.String r2 = "K"
            r5.put(r0, r2)
            java.lang.String r0 = "76"
            java.lang.String r2 = "L"
            r5.put(r0, r2)
            java.lang.String r0 = "77"
            java.lang.String r2 = "M"
            r5.put(r0, r2)
            java.lang.String r0 = "78"
            java.lang.String r2 = "N"
            r5.put(r0, r2)
            java.lang.String r0 = "79"
            java.lang.String r2 = "O"
            r5.put(r0, r2)
            java.lang.String r0 = "80"
            java.lang.String r2 = "P"
            r5.put(r0, r2)
            java.lang.String r0 = "81"
            java.lang.String r2 = "Q"
            r5.put(r0, r2)
            java.lang.String r0 = "82"
            java.lang.String r2 = "R"
            r5.put(r0, r2)
            java.lang.String r0 = "83"
            java.lang.String r2 = "S"
            r5.put(r0, r2)
            java.lang.String r0 = "84"
            java.lang.String r2 = "T"
            r5.put(r0, r2)
            java.lang.String r0 = "85"
            java.lang.String r2 = "U"
            r5.put(r0, r2)
            java.lang.String r0 = "86"
            java.lang.String r2 = "V"
            r5.put(r0, r2)
            java.lang.String r0 = "87"
            java.lang.String r2 = "W"
            r5.put(r0, r2)
            java.lang.String r0 = "88"
            java.lang.String r2 = "X"
            r5.put(r0, r2)
            java.lang.String r0 = "89"
            java.lang.String r2 = "Y"
            r5.put(r0, r2)
            java.lang.String r0 = "90"
            java.lang.String r2 = "Z"
            r5.put(r0, r2)
            java.lang.String r0 = "<Back"
            r5.put(r1, r0)
            java.lang.String r0 = "13"
            java.lang.String r1 = "Cari"
            r5.put(r0, r1)
            java.lang.String r0 = "32"
            java.lang.String r1 = " "
            r5.put(r0, r1)
            java.lang.String r0 = "35"
            java.lang.String r1 = "#"
            r5.put(r0, r1)
            java.lang.String r0 = "37"
            java.lang.String r1 = "%"
            r5.put(r0, r1)
            java.lang.String r0 = "38"
            java.lang.String r1 = "&"
            r5.put(r0, r1)
            java.lang.String r0 = "45"
            java.lang.String r1 = "-"
            r5.put(r0, r1)
            java.lang.String r0 = "46"
            java.lang.String r1 = "."
            r5.put(r0, r1)
            java.lang.String r0 = "47"
            java.lang.String r1 = "/"
            r5.put(r0, r1)
            r0 = 8
            if (r4 == r0) goto L_0x01b9
            r0 = 13
            if (r4 == r0) goto L_0x01b3
            r0 = 32
            if (r4 == r0) goto L_0x0195
            r0 = 35
            if (r4 == r0) goto L_0x0195
            r0 = 58
            if (r4 == r0) goto L_0x0195
            r0 = 37
            if (r4 == r0) goto L_0x0195
            r0 = 38
            if (r4 == r0) goto L_0x0195
            switch(r4) {
                case 45: goto L_0x0195;
                case 46: goto L_0x0195;
                case 47: goto L_0x0195;
                default: goto L_0x015d;
            }
        L_0x015d:
            android.widget.EditText r0 = r3.P
            android.widget.EditText r1 = r3.l
            if (r0 != r1) goto L_0x016c
            r0 = 48
            if (r4 < r0) goto L_0x0203
            r0 = 57
            if (r4 > r0) goto L_0x0203
            goto L_0x01a3
        L_0x016c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.widget.EditText r5 = r3.l
            r5.append(r4)
            android.widget.EditText r4 = r3.n
            android.widget.EditText r5 = r3.l
            if (r4 != r5) goto L_0x0203
        L_0x0181:
            android.text.Editable r4 = r5.getText()
            java.lang.String r4 = r4.toString()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.text.SpannableStringBuilder r4 = r3.i(r4, r0)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.EDITABLE
            r5.setText(r4, r0)
            goto L_0x01f2
        L_0x0195:
            android.widget.EditText r0 = r3.m
            android.widget.EditText r1 = r3.l
            if (r0 == r1) goto L_0x01a3
            android.widget.EditText r0 = r3.T
            if (r0 == r1) goto L_0x01a3
            android.widget.EditText r0 = r3.V
            if (r0 != r1) goto L_0x0203
        L_0x01a3:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.widget.EditText r5 = r3.l
            r5.append(r4)
            goto L_0x0203
        L_0x01b3:
            android.widget.Button r4 = r3.j
            r4.performClick()
            goto L_0x0203
        L_0x01b9:
            android.widget.EditText r4 = r3.l
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0203
            android.widget.EditText r4 = r3.l
            android.text.Editable r5 = r4.getText()
            java.lang.String r5 = r5.toString()
            r0 = 0
            android.widget.EditText r1 = r3.l
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            int r1 = r1 + -1
            java.lang.String r5 = r5.substring(r0, r1)
            r4.setText(r5)
            android.widget.EditText r4 = r3.n
            android.widget.EditText r5 = r3.l
            if (r4 != r5) goto L_0x01f2
            goto L_0x0181
        L_0x01f2:
            android.widget.EditText r4 = r3.l
            android.text.Editable r5 = r4.getText()
            java.lang.String r5 = r5.toString()
            int r5 = r5.length()
            r4.setSelection(r5)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.repo.RepoActivity.onKey(int, int[]):void");
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        k1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0118, code lost:
        if (true == r13.d.H.equals(org.sqlite.database.BuildConfig.FLAVOR)) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x011c, code lost:
        j1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x015f, code lost:
        if (true == r13.d.G.equals(org.sqlite.database.BuildConfig.FLAVOR)) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x016d, code lost:
        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0186, code lost:
        startActivity(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0196, code lost:
        if (true == r13.d.H.equals(org.sqlite.database.BuildConfig.FLAVOR)) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01a6, code lost:
        if (true == r13.d.G.equals(org.sqlite.database.BuildConfig.FLAVOR)) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01aa, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r14) {
        /*
            r13 = this;
            java.lang.Boolean r0 = r13.y
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r1 != r0) goto L_0x0027
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r13.y = r0
            android.widget.Button r2 = r13.x
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2.setTextColor(r3)
            android.widget.EditText r2 = r13.m
            r3 = -1
            r2.setBackgroundColor(r3)
            r13.D = r0
            java.lang.Boolean r0 = r13.z
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
            r13.v()
        L_0x0027:
            int r14 = r14.getItemId()
            java.lang.String r0 = "input_method"
            r2 = 0
            r3 = 2
            java.lang.String r4 = ""
            switch(r14) {
                case 2131165335: goto L_0x019a;
                case 2131165336: goto L_0x018a;
                case 2131165337: goto L_0x017f;
                case 2131165338: goto L_0x0177;
                case 2131165339: goto L_0x0163;
                case 2131165340: goto L_0x0153;
                case 2131165341: goto L_0x0144;
                case 2131165342: goto L_0x0120;
                case 2131165343: goto L_0x0102;
                case 2131165344: goto L_0x00f3;
                case 2131165345: goto L_0x003f;
                case 2131165346: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x01aa
        L_0x0036:
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<com.repo.BackUpDiaryActivity> r0 = com.repo.BackUpDiaryActivity.class
            r14.<init>(r13, r0)
            goto L_0x0186
        L_0x003f:
            com.repo.RepoActivity$c1 r14 = com.repo.RepoActivity.c1.UPDATEDIARY
            r13.f589a = r14
            com.repo.MyDB r14 = r13.d
            java.lang.String r14 = r14.G
            boolean r14 = r14.equals(r4)
            if (r1 != r14) goto L_0x0052
        L_0x004d:
            r13.k1()
            goto L_0x016d
        L_0x0052:
            r13.j1()
            java.io.File r14 = new java.io.File
            com.repo.MyDB r5 = r13.d
            java.lang.String r5 = r5.E
            r14.<init>(r5)
            long r5 = r14.length()
            r7 = 2
            long r5 = r5 * r7
            double r5 = (double) r5
            r7 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r7
            android.os.StatFs r14 = new android.os.StatFs
            com.repo.MyDB r9 = r13.d
            java.lang.String r9 = r9.E
            java.lang.String r10 = "RepoProDiary.db"
            java.lang.String r4 = r9.replace(r10, r4)
            r14.<init>(r4)
            int r4 = r14.getAvailableBlocks()
            double r9 = (double) r4
            int r14 = r14.getBlockSize()
            double r11 = (double) r14
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r11)
            double r9 = r9 * r11
            double r9 = r9 / r7
            int r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r14 < 0) goto L_0x016d
            com.repo.MyDB r14 = r13.d
            java.lang.Boolean r14 = r14.d
            boolean r14 = r14.booleanValue()
            if (r1 != r14) goto L_0x00c6
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "Not enough space. Space needed = "
            r14.append(r4)
            java.lang.String r4 = com.repo.r.d(r5)
            r14.append(r4)
            java.lang.String r4 = "MB and free space = "
            r14.append(r4)
            java.lang.String r4 = com.repo.r.d(r9)
            r14.append(r4)
            java.lang.String r4 = "MB.\nPlease delete the old Diary BackUp files to get more free space before you update the Diary."
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            java.lang.String r4 = "Problem"
            goto L_0x00ee
        L_0x00c6:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "Tak cukup ruang kosong. Ruang yang diperlukan = "
            r14.append(r4)
            java.lang.String r4 = com.repo.r.d(r5)
            r14.append(r4)
            java.lang.String r4 = "MB dan ruang kosong = "
            r14.append(r4)
            java.lang.String r4 = com.repo.r.d(r9)
            r14.append(r4)
            java.lang.String r4 = "MB.\nSila padam file Diary BackUp yang lama untuk mendapatkan lagi ruang kosong sebelum anda kemaskini Diary."
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            java.lang.String r4 = "Masalah"
        L_0x00ee:
            com.repo.r.u(r13, r4, r14)
            goto L_0x016d
        L_0x00f3:
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            java.lang.Class<com.repo.SettingActivity> r0 = com.repo.SettingActivity.class
            r14.setClass(r13, r0)
            r13.startActivityForResult(r14, r3)
            goto L_0x01aa
        L_0x0102:
            com.repo.RepoActivity$c1 r14 = com.repo.RepoActivity.c1.OPENREMARK
            r13.f589a = r14
            com.repo.MyDB r14 = r13.d
            java.lang.String r14 = r14.G
            boolean r14 = r14.equals(r4)
            if (r1 != r14) goto L_0x011c
            com.repo.MyDB r14 = r13.d
            java.lang.String r14 = r14.H
            boolean r14 = r14.equals(r4)
            if (r1 != r14) goto L_0x011c
            goto L_0x004d
        L_0x011c:
            r13.j1()
            goto L_0x016d
        L_0x0120:
            com.repo.MyDB r14 = r13.d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.p(r0)
            com.repo.MyDB r14 = r13.d
            android.widget.EditText r0 = r13.m
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r0 = r0.trim()
            java.lang.String r3 = "LOC"
            r14.t(r3, r0)
            java.lang.System.exit(r2)
            goto L_0x01aa
        L_0x0144:
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            java.lang.Class<com.repo.OnlineServerActivity> r0 = com.repo.OnlineServerActivity.class
            r14.setClass(r13, r0)
            r0 = 3
            r13.startActivityForResult(r14, r0)
            goto L_0x01aa
        L_0x0153:
            com.repo.RepoActivity$c1 r14 = com.repo.RepoActivity.c1.OPENDIARY
            r13.f589a = r14
            com.repo.MyDB r14 = r13.d
            java.lang.String r14 = r14.G
            boolean r14 = r14.equals(r4)
            if (r1 != r14) goto L_0x011c
            goto L_0x004d
        L_0x0163:
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<com.repo.DeleteDiaryOldDataActivity> r4 = com.repo.DeleteDiaryOldDataActivity.class
            r14.<init>(r13, r4)
            r13.startActivity(r14)
        L_0x016d:
            java.lang.Object r14 = r13.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r14 = (android.view.inputmethod.InputMethodManager) r14
            r14.toggleSoftInput(r3, r2)
            goto L_0x01aa
        L_0x0177:
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<com.repo.CleanUpDiaryDataActivity> r0 = com.repo.CleanUpDiaryDataActivity.class
            r14.<init>(r13, r0)
            goto L_0x0186
        L_0x017f:
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<com.repo.ChooseDiaryActivity> r0 = com.repo.ChooseDiaryActivity.class
            r14.<init>(r13, r0)
        L_0x0186:
            r13.startActivity(r14)
            goto L_0x01aa
        L_0x018a:
            com.repo.RepoActivity$c1 r14 = com.repo.RepoActivity.c1.CHANGEREMARKPASSWORD
            r13.f589a = r14
            com.repo.MyDB r14 = r13.d
            java.lang.String r14 = r14.H
            boolean r14 = r14.equals(r4)
            if (r1 != r14) goto L_0x011c
            goto L_0x004d
        L_0x019a:
            com.repo.RepoActivity$c1 r14 = com.repo.RepoActivity.c1.CHANGEDIARYPASSWORD
            r13.f589a = r14
            com.repo.MyDB r14 = r13.d
            java.lang.String r14 = r14.G
            boolean r14 = r14.equals(r4)
            if (r1 != r14) goto L_0x011c
            goto L_0x004d
        L_0x01aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.repo.RepoActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        try {
            this.d.p(Boolean.FALSE);
            this.d.t("LOC", this.m.getText().toString().toUpperCase().trim());
            v();
        } catch (Exception e2) {
            Log.e("onPause", "Could not save location to the diary. Error:" + e2.getMessage());
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        String str;
        MenuItem findItem = menu.findItem(R.id.mnuOnlineServer);
        MenuItem findItem2 = menu.findItem(R.id.mnuDiary);
        MenuItem findItem3 = menu.findItem(R.id.mnuSetting);
        MenuItem findItem4 = menu.findItem(R.id.mnuChangeDiaryPassword);
        MenuItem findItem5 = menu.findItem(R.id.mnuChangeRemarkPassword);
        MenuItem findItem6 = menu.findItem(R.id.mnuUpdateDiary);
        MenuItem findItem7 = menu.findItem(R.id.mnuUseBackUpDiary);
        MenuItem findItem8 = menu.findItem(R.id.mnuRemark);
        MenuItem findItem9 = menu.findItem(R.id.mnuCleanUpDuplicatePlateNoInDiary);
        MenuItem findItem10 = menu.findItem(R.id.mnuDeleteDiaryOldData);
        MenuItem findItem11 = menu.findItem(R.id.mnuChooseDiary);
        MenuItem findItem12 = menu.findItem(R.id.mnuQuit);
        if (true == this.e.booleanValue()) {
            if (true == this.d.d.booleanValue()) {
                findItem4.setTitle("Change Diary Password");
                findItem5.setTitle("Change Remark Password");
                findItem6.setTitle("Update Diary");
                findItem7.setTitle("Use BackUp Diary");
                findItem9.setTitle("CleanUp Duplicate PlateNo in Diary");
                findItem10.setTitle("Delete Old Diary Data");
                findItem11.setTitle("Choose Diary File");
                str = "Quit";
            } else {
                findItem4.setTitle("Tukar Password Diary");
                findItem5.setTitle("Tukar Password Remark");
                findItem6.setTitle("Kemaskini Diary");
                findItem7.setTitle("Guna Diary BackUp");
                findItem9.setTitle("Cuci PlateNo Bertindan Dalam Diary");
                findItem10.setTitle("Padam Data Diary Lama");
                findItem11.setTitle("Pilih File Diary");
                str = "Keluar";
            }
            findItem12.setTitle(str);
        } else {
            findItem.setVisible(false);
            findItem2.setVisible(false);
            findItem3.setVisible(false);
            findItem4.setVisible(false);
            findItem5.setVisible(false);
            findItem6.setVisible(false);
            findItem7.setVisible(false);
            findItem8.setVisible(false);
            findItem9.setVisible(false);
            findItem10.setVisible(false);
            findItem11.setVisible(false);
        }
        return true;
    }

    public void onPress(int i2) {
    }

    public void onRelease(int i2) {
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 123 && iArr.length > 0) {
            boolean z2 = iArr[0] == 0;
            boolean z3 = iArr[1] == 0;
            boolean z4 = iArr[1] == 0;
            boolean z5 = iArr[1] == 0;
            boolean z6 = iArr[1] == 0;
            boolean z7 = iArr[1] == 0;
            boolean z8 = iArr[1] == 0;
            boolean z9 = iArr[1] == 0;
            if ((!z2 || !z3 || !z4 || !z5 || !z6 || !z7 || !z8 || !z9) && (!z8 || !z9)) {
                requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 123);
            } else {
                o();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.y.booleanValue()) {
            l();
        }
    }

    public void onText(CharSequence charSequence) {
    }

    /* access modifiers changed from: package-private */
    public int r(int i2) {
        if (1 == i2) {
            return 31;
        }
        if (2 == i2) {
            return 59;
        }
        if (3 == i2) {
            return 90;
        }
        if (4 == i2) {
            return 120;
        }
        if (5 == i2) {
            return 151;
        }
        if (6 == i2) {
            return 181;
        }
        if (7 == i2) {
            return 212;
        }
        if (8 == i2) {
            return 243;
        }
        if (9 == i2) {
            return 273;
        }
        if (10 == i2) {
            return 304;
        }
        if (11 == i2) {
            return 334;
        }
        return 12 == i2 ? 365 : 0;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
        keyboardView.setKeyboard(true == this.d.u.equals("90") ? new Keyboard(this, R.layout.keyboard90) : true == this.d.u.equals("80") ? new Keyboard(this, R.layout.keyboard80) : true == this.d.u.equals("70") ? new Keyboard(this, R.layout.keyboard70) : true == this.d.u.equals("60") ? new Keyboard(this, R.layout.keyboard60) : true == this.d.u.equals("50") ? new Keyboard(this, R.layout.keyboard50) : true == this.d.u.equals("40") ? new Keyboard(this, R.layout.keyboard40) : new Keyboard(this, R.layout.keyboard30));
        keyboardView.setEnabled(true);
        keyboardView.setPreviewEnabled(this.d.L.booleanValue());
        keyboardView.setOnKeyListener(this);
        keyboardView.setOnKeyboardActionListener(this);
    }

    public void swipeDown() {
    }

    public void swipeLeft() {
    }

    public void swipeRight() {
    }

    public void swipeUp() {
    }
}
