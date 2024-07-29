package com.repo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.repo.r;
import org.sqlite.database.R;

public class SettingActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public MyDB f665a;

    /* renamed from: b  reason: collision with root package name */
    private SpannableStringBuilder f666b = new SpannableStringBuilder();
    /* access modifiers changed from: private */
    public Spinner c;
    private Spinner d;
    private Spinner e;
    /* access modifiers changed from: private */
    public CheckBox f;
    /* access modifiers changed from: private */
    public CheckBox g;
    /* access modifiers changed from: private */
    public CheckBox h;
    /* access modifiers changed from: private */
    public int i = 0;
    /* access modifiers changed from: private */
    public int j = 0;
    /* access modifiers changed from: private */
    public int k = 0;
    /* access modifiers changed from: private */
    public Intent l = new Intent();

    class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f668b;
        final /* synthetic */ TextView c;
        final /* synthetic */ TextView d;

        a(TextView textView, TextView textView2, TextView textView3, TextView textView4) {
            this.f667a = textView;
            this.f668b = textView2;
            this.c = textView3;
            this.d = textView4;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            CheckBox checkBox;
            if (SettingActivity.this.i != i) {
                MyDB d2 = SettingActivity.this.f665a;
                if (i == 0) {
                    d2.t("B", "0");
                    MyDB d3 = SettingActivity.this.f665a;
                    Boolean bool = Boolean.FALSE;
                    d3.d = bool;
                    this.f667a.setText(SettingActivity.this.a("Database Versi: " + SettingActivity.this.f665a.h, bool));
                    this.f668b.setText(SettingActivity.this.a("Software Versi: RepoPro 4.8", bool));
                    this.c.setText(SettingActivity.this.a("Model Jenis: " + SettingActivity.this.f665a.s, bool));
                    this.d.setText(SettingActivity.this.a("Platform Jenis: " + SettingActivity.this.f665a.t, bool));
                    SettingActivity.this.c.setPrompt("Sila pilih...");
                    SettingActivity.this.f.setText("Bunyikan bila carian no. kenderaan kena");
                    SettingActivity.this.g.setText("Perkataan berlainan warna");
                    checkBox = SettingActivity.this.h;
                    str = "Tayang keyboard preview";
                } else {
                    d2.t("B", "1");
                    SettingActivity.this.f665a.d = Boolean.TRUE;
                    Boolean bool2 = Boolean.FALSE;
                    this.f667a.setText(SettingActivity.this.a("Database Version: " + SettingActivity.this.f665a.h, bool2));
                    this.f668b.setText(SettingActivity.this.a("Software Version: RepoPro 4.8", bool2));
                    this.c.setText(SettingActivity.this.a("Model Type: " + SettingActivity.this.f665a.s, bool2));
                    this.d.setText(SettingActivity.this.a("Platform Type: " + SettingActivity.this.f665a.t, bool2));
                    SettingActivity.this.c.setPrompt("Please choose...");
                    SettingActivity.this.f.setText("Play sound when vehicle is found");
                    SettingActivity.this.g.setText("Multi colour text");
                    checkBox = SettingActivity.this.h;
                    str = "Show keyboard preview";
                }
                checkBox.setText(str);
                SettingActivity.this.l.putExtra("blnLanguageIsEnglish", SettingActivity.this.f665a.d);
                SettingActivity.this.l.putExtra("strKeyboardSize", SettingActivity.this.f665a.u);
                SettingActivity settingActivity = SettingActivity.this;
                settingActivity.setResult(-1, settingActivity.l);
            }
            int unused = SettingActivity.this.i = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            MyDB d;
            String str;
            if (SettingActivity.this.j != i) {
                if (6 == i) {
                    d = SettingActivity.this.f665a;
                    str = "90";
                } else if (5 == i) {
                    d = SettingActivity.this.f665a;
                    str = "80";
                } else if (4 == i) {
                    d = SettingActivity.this.f665a;
                    str = "70";
                } else if (3 == i) {
                    d = SettingActivity.this.f665a;
                    str = "60";
                } else if (2 == i) {
                    d = SettingActivity.this.f665a;
                    str = "50";
                } else if (1 == i) {
                    d = SettingActivity.this.f665a;
                    str = "40";
                } else {
                    d = SettingActivity.this.f665a;
                    str = "30";
                }
                d.t("VLANG", str);
                SettingActivity.this.f665a.u = str;
                SettingActivity.this.l.putExtra("blnLanguageIsEnglish", SettingActivity.this.f665a.d);
                SettingActivity.this.l.putExtra("strKeyboardSize", SettingActivity.this.f665a.u);
                SettingActivity settingActivity = SettingActivity.this;
                settingActivity.setResult(-1, settingActivity.l);
            }
            int unused = SettingActivity.this.j = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            MyDB d;
            String str;
            if (SettingActivity.this.k != i) {
                if (6 == i) {
                    d = SettingActivity.this.f665a;
                    str = "30";
                } else if (5 == i) {
                    d = SettingActivity.this.f665a;
                    str = "25";
                } else if (4 == i) {
                    d = SettingActivity.this.f665a;
                    str = "20";
                } else if (3 == i) {
                    d = SettingActivity.this.f665a;
                    str = "15";
                } else if (2 == i) {
                    d = SettingActivity.this.f665a;
                    str = "10";
                } else if (1 == i) {
                    d = SettingActivity.this.f665a;
                    str = "5";
                } else {
                    d = SettingActivity.this.f665a;
                    str = "1";
                }
                d.t("GMIN", str);
                SettingActivity.this.f665a.v = str;
                SettingActivity.this.l.putExtra("blnLanguageIsEnglish", SettingActivity.this.f665a.d);
                SettingActivity.this.l.putExtra("strKeyboardSize", SettingActivity.this.f665a.u);
                SettingActivity settingActivity = SettingActivity.this;
                settingActivity.setResult(-1, settingActivity.l);
            }
            int unused = SettingActivity.this.k = i;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class d implements CompoundButton.OnCheckedChangeListener {
        d() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MyDB myDB;
            String str;
            if (true == z) {
                SettingActivity.this.f665a.I = Boolean.TRUE;
                myDB = SettingActivity.this.f665a;
                str = "1";
            } else {
                SettingActivity.this.f665a.I = Boolean.FALSE;
                myDB = SettingActivity.this.f665a;
                str = "0";
            }
            myDB.t("SND", str);
        }
    }

    class e implements CompoundButton.OnCheckedChangeListener {
        e() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MyDB myDB;
            String str;
            if (true == z) {
                SettingActivity.this.f665a.K = Boolean.TRUE;
                myDB = SettingActivity.this.f665a;
                str = "1";
            } else {
                SettingActivity.this.f665a.K = Boolean.FALSE;
                myDB = SettingActivity.this.f665a;
                str = "0";
            }
            myDB.t("MCT", str);
        }
    }

    class f implements CompoundButton.OnCheckedChangeListener {
        f() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MyDB myDB;
            String str;
            if (true == z) {
                SettingActivity.this.f665a.L = Boolean.TRUE;
                myDB = SettingActivity.this.f665a;
                str = "1";
            } else {
                SettingActivity.this.f665a.L = Boolean.FALSE;
                myDB = SettingActivity.this.f665a;
                str = "0";
            }
            myDB.t("KPV", str);
        }
    }

    /* access modifiers changed from: private */
    public SpannableStringBuilder a(String str, Boolean bool) {
        try {
            this.f666b.clear();
            this.f666b.clearSpans();
            this.f666b.append(str);
            if (r.e.REPOPRO_UI == r.f761b) {
                int indexOf = str.indexOf(58) + 1;
                this.f666b.setSpan(new ForegroundColorSpan(-16711936), 0, indexOf, 256);
                this.f666b.setSpan(new ForegroundColorSpan(Color.parseColor("#33B5E5")), indexOf, str.length(), 256);
            }
        } catch (Exception e2) {
            this.f666b.clearSpans();
            Log.e("ColourTheTextSetting", "Error : ColourTheTextSetting : " + e2.getMessage());
        }
        return this.f666b;
    }

    public void onCreate(Bundle bundle) {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        String str4;
        StringBuilder sb4;
        String str5;
        CheckBox checkBox;
        String str6;
        CheckBox checkBox2;
        String str7;
        CheckBox checkBox3;
        super.onCreate(bundle);
        setContentView(R.layout.setting);
        MyDB myDB = (MyDB) getApplicationContext();
        this.f665a = myDB;
        Boolean bool = Boolean.FALSE;
        myDB.p(bool);
        ((TextView) findViewById(R.id.lblID)).setText(a("ID: " + this.f665a.k + this.f665a.l, bool));
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Device ID: ");
        sb5.append(this.f665a.i);
        ((TextView) findViewById(R.id.lblDeviceID)).setText(a(sb5.toString(), bool));
        TextView textView = (TextView) findViewById(R.id.lblDatabaseVersion);
        if (true == this.f665a.d.booleanValue()) {
            sb = new StringBuilder();
            str = "Database Version: ";
        } else {
            sb = new StringBuilder();
            str = "Database Versi: ";
        }
        sb.append(str);
        sb.append(this.f665a.h);
        textView.setText(a(sb.toString(), bool));
        TextView textView2 = (TextView) findViewById(R.id.lblSoftwareVersion);
        textView2.setText(a(true == this.f665a.d.booleanValue() ? "Software Version: RepoPro 4.8" : "Software Versi: RepoPro 4.8", bool));
        TextView textView3 = (TextView) findViewById(R.id.lblModelType);
        if (true == this.f665a.d.booleanValue()) {
            sb2 = new StringBuilder();
            str2 = "Model Type: ";
        } else {
            sb2 = new StringBuilder();
            str2 = "Model Jenis: ";
        }
        sb2.append(str2);
        sb2.append(this.f665a.s);
        textView3.setText(a(sb2.toString(), bool));
        TextView textView4 = (TextView) findViewById(R.id.lblPlatformType);
        if (true == this.f665a.d.booleanValue()) {
            sb3 = new StringBuilder();
            str3 = "Platform Type: ";
        } else {
            sb3 = new StringBuilder();
            str3 = "Platform Jenis: ";
        }
        sb3.append(str3);
        sb3.append(this.f665a.t);
        textView4.setText(a(sb3.toString(), bool));
        this.c = (Spinner) findViewById(R.id.cboLanguageType);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this, R.array.settinglanguagetype, 17367048);
        createFromResource.setDropDownViewResource(17367049);
        this.c.setAdapter(createFromResource);
        if (true == this.f665a.d.booleanValue()) {
            this.c.setPrompt("Please choose...");
            this.c.setSelection(1);
        } else {
            this.c.setPrompt("Sila pilih...");
            this.c.setSelection(0);
        }
        this.l.putExtra("blnLanguageIsEnglish", this.f665a.d);
        this.l.putExtra("strKeyboardSize", this.f665a.u);
        setResult(-1, this.l);
        this.i = this.c.getSelectedItemPosition();
        this.c.setOnItemSelectedListener(new a(textView, textView2, textView3, textView4));
        this.d = (Spinner) findViewById(R.id.cboKeyboardSize);
        if (true == this.f665a.d.booleanValue()) {
            ArrayAdapter<CharSequence> createFromResource2 = ArrayAdapter.createFromResource(this, R.array.keyboardsize_en, 17367048);
            createFromResource2.setDropDownViewResource(17367049);
            this.d.setAdapter(createFromResource2);
            this.d.setPrompt("Please choose...");
        } else {
            ArrayAdapter<CharSequence> createFromResource3 = ArrayAdapter.createFromResource(this, R.array.keyboardsize_bm, 17367048);
            createFromResource3.setDropDownViewResource(17367049);
            this.d.setAdapter(createFromResource3);
            this.d.setPrompt("Sila pilih...");
        }
        if (true == this.f665a.u.equals("90")) {
            this.d.setSelection(6);
        } else if (true == this.f665a.u.equals("80")) {
            this.d.setSelection(5);
        } else if (true == this.f665a.u.equals("70")) {
            this.d.setSelection(4);
        } else if (true == this.f665a.u.equals("60")) {
            this.d.setSelection(3);
        } else if (true == this.f665a.u.equals("50")) {
            this.d.setSelection(2);
        } else if (true == this.f665a.u.equals("40")) {
            this.d.setSelection(1);
        } else {
            this.d.setSelection(0);
        }
        this.j = this.d.getSelectedItemPosition();
        this.d.setOnItemSelectedListener(new b());
        this.e = (Spinner) findViewById(R.id.cboGpsMinDistance);
        ArrayAdapter<CharSequence> createFromResource4 = ArrayAdapter.createFromResource(this, R.array.gpsmindistance_en_bm, 17367048);
        createFromResource4.setDropDownViewResource(17367049);
        this.e.setAdapter(createFromResource4);
        if (true == this.f665a.d.booleanValue()) {
            this.e.setPrompt("Please choose...");
        } else {
            this.e.setPrompt("Sila pilih...");
        }
        if (true == this.f665a.v.equals("30")) {
            this.e.setSelection(6);
        } else if (true == this.f665a.v.equals("25")) {
            this.e.setSelection(5);
        } else if (true == this.f665a.v.equals("20")) {
            this.e.setSelection(4);
        } else if (true == this.f665a.v.equals("15")) {
            this.e.setSelection(3);
        } else if (true == this.f665a.v.equals("10")) {
            this.e.setSelection(2);
        } else if (true == this.f665a.v.equals("5")) {
            this.e.setSelection(1);
        } else {
            this.e.setSelection(0);
        }
        this.k = this.e.getSelectedItemPosition();
        this.e.setOnItemSelectedListener(new c());
        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        double width = (double) defaultDisplay.getWidth();
        double d2 = (double) displayMetrics.density;
        Double.isNaN(width);
        Double.isNaN(d2);
        int i2 = (int) ((width / d2) + 0.5d);
        double height = (double) defaultDisplay.getHeight();
        double d3 = (double) displayMetrics.density;
        Double.isNaN(height);
        Double.isNaN(d3);
        int i3 = (int) ((height / d3) + 0.5d);
        TextView textView5 = (TextView) findViewById(R.id.lblScreenInfo);
        if (true == this.f665a.d.booleanValue()) {
            sb4 = new StringBuilder();
            str4 = "Screen Info: ";
        } else {
            sb4 = new StringBuilder();
            str4 = "Skrin Info: ";
        }
        sb4.append(str4);
        sb4.append(Integer.toString(i2));
        sb4.append(" x ");
        sb4.append(Integer.toString(i3));
        textView5.setText(a(sb4.toString(), bool));
        this.f = (CheckBox) findViewById(R.id.chkPlaySoundWhenFound);
        if (true == this.f665a.I.booleanValue()) {
            this.f.setChecked(true);
        } else {
            this.f.setChecked(false);
        }
        if (true == this.f665a.d.booleanValue()) {
            checkBox = this.f;
            str5 = "Play sound when vehicle is found";
        } else {
            checkBox = this.f;
            str5 = "Bunyikan bila carian no. kenderaan kena";
        }
        checkBox.setText(str5);
        this.f.setOnCheckedChangeListener(new d());
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.chkMultiColourText);
        this.g = checkBox4;
        if (r.e.REPOPRO_UI == r.f761b) {
            if (true == this.f665a.K.booleanValue()) {
                this.g.setChecked(true);
            } else {
                this.g.setChecked(false);
            }
            if (true == this.f665a.d.booleanValue()) {
                checkBox3 = this.g;
                str7 = "Multi colour text";
            } else {
                checkBox3 = this.g;
                str7 = "Perkataan berlainan warna";
            }
            checkBox3.setText(str7);
            this.g.setOnCheckedChangeListener(new e());
        } else {
            checkBox4.setVisibility(8);
        }
        this.h = (CheckBox) findViewById(R.id.chkKeyboardPreview);
        if (true == this.f665a.L.booleanValue()) {
            this.h.setChecked(true);
        } else {
            this.h.setChecked(false);
        }
        if (true == this.f665a.d.booleanValue()) {
            checkBox2 = this.h;
            str6 = "Show keyboard preview";
        } else {
            checkBox2 = this.h;
            str6 = "Tayang keyboard preview";
        }
        checkBox2.setText(str6);
        this.h.setOnCheckedChangeListener(new f());
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
