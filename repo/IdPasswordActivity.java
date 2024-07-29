package com.repo;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;

public class IdPasswordActivity extends Activity implements View.OnKeyListener, KeyboardView.OnKeyboardActionListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public MyDB f528a;

    /* renamed from: b  reason: collision with root package name */
    private int f529b = 0;
    private EditText c;
    private SpannableStringBuilder d = new SpannableStringBuilder();
    /* access modifiers changed from: private */
    public Intent e = new Intent();

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f530a;

        a(EditText editText) {
            this.f530a = editText;
        }

        public void onClick(View view) {
            IdPasswordActivity idPasswordActivity;
            String str;
            IdPasswordActivity idPasswordActivity2;
            String str2;
            if (this.f530a.length() < 12) {
                if (true == IdPasswordActivity.this.f528a.d.booleanValue()) {
                    idPasswordActivity2 = IdPasswordActivity.this;
                    str2 = "The Database password entered must be 12 characters long";
                } else {
                    idPasswordActivity2 = IdPasswordActivity.this;
                    str2 = "Password Database yang dimasukkan mestilah 12 abjad";
                }
                r.v(idPasswordActivity2, str2, 1);
            } else if (this.f530a.getText().toString().equals(IdPasswordActivity.this.f528a.m)) {
                IdPasswordActivity.this.f528a.s("D", this.f530a.getText().toString());
                IdPasswordActivity.this.f528a.s("PID", IdPasswordActivity.this.f528a.i);
                MyDB c = IdPasswordActivity.this.f528a;
                String str3 = Build.MODEL;
                c.s("MI", str3);
                IdPasswordActivity.this.f528a.s = str3;
                MyDB c2 = IdPasswordActivity.this.f528a;
                String str4 = Build.VERSION.RELEASE;
                c2.s("PI", str4);
                IdPasswordActivity.this.f528a.t = str4;
                IdPasswordActivity.this.f528a.t("PURCT", "1");
                IdPasswordActivity.this.f528a.t("PSS", this.f530a.getText().toString());
                IdPasswordActivity.this.e.putExtra("blnIdPasswordResult", true);
                IdPasswordActivity idPasswordActivity3 = IdPasswordActivity.this;
                idPasswordActivity3.setResult(-1, idPasswordActivity3.e);
                IdPasswordActivity.this.finish();
            } else {
                if (true == IdPasswordActivity.this.f528a.d.booleanValue()) {
                    idPasswordActivity = IdPasswordActivity.this;
                    str = "The Database password entered is not correct";
                } else {
                    idPasswordActivity = IdPasswordActivity.this;
                    str = "Password Database yang dimasukkan adalah tidak betul";
                }
                r.v(idPasswordActivity, str, 1);
                this.f530a.requestFocus();
                IdPasswordActivity.this.e.putExtra("blnIdPasswordResult", false);
                IdPasswordActivity idPasswordActivity4 = IdPasswordActivity.this;
                idPasswordActivity4.setResult(0, idPasswordActivity4.e);
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            IdPasswordActivity.this.e.putExtra("blnIdPasswordResult", false);
            IdPasswordActivity idPasswordActivity = IdPasswordActivity.this;
            idPasswordActivity.setResult(0, idPasswordActivity.e);
            IdPasswordActivity.this.finish();
        }
    }

    class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f533a;

        c(TextView textView) {
            this.f533a = textView;
        }

        public void onClick(View view) {
            ((ClipboardManager) IdPasswordActivity.this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("myid", this.f533a.getText().toString().substring(3, this.f533a.length())));
        }
    }

    class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f535a;

        d(EditText editText) {
            this.f535a = editText;
        }

        public void onClick(View view) {
            EditText editText;
            String charSequence = ((ClipboardManager) IdPasswordActivity.this.getSystemService("clipboard")).getPrimaryClip().getItemAt(0).getText().toString();
            if (charSequence.length() >= 12) {
                editText = this.f535a;
                charSequence = charSequence.substring(charSequence.length() - 12, charSequence.length());
            } else {
                editText = this.f535a;
            }
            editText.setText(charSequence);
        }
    }

    class e implements InputFilter {
        e() {
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

    class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f538a;

        f(EditText editText) {
            this.f538a = editText;
        }

        public void onClick(View view) {
            IdPasswordActivity.this.f(this.f538a);
        }
    }

    class g implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Button f540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f541b;

        g(Button button, EditText editText) {
            this.f540a = button;
            this.f541b = editText;
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
                this.f541b.append(str);
                EditText editText = this.f541b;
                editText.setText(editText.getText().toString().toUpperCase());
                EditText editText2 = this.f541b;
                editText2.setSelection(editText2.getText().toString().length());
                return true;
            }
            this.f540a.performClick();
            return true;
        }
    }

    class h implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f542a;

        h(EditText editText) {
            this.f542a = editText;
        }

        public void onFocusChange(View view, boolean z) {
            if (true == z) {
                IdPasswordActivity.this.f(this.f542a);
            }
        }
    }

    /* access modifiers changed from: private */
    public void f(EditText editText) {
        KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
        int visibility = keyboardView.getVisibility();
        if (visibility == 4 || visibility == 8) {
            keyboardView.setVisibility(0);
        }
        this.c = editText;
    }

    public SpannableStringBuilder a(String str) {
        try {
            this.d.clear();
            this.d.clearSpans();
            SpannableStringBuilder spannableStringBuilder = this.d;
            spannableStringBuilder.append("ID:" + str);
            if (20 == str.length()) {
                this.d.setSpan(new ForegroundColorSpan(-16711936), 0, 3, 256);
                this.d.setSpan(new ForegroundColorSpan(Color.rgb(0, 255, 255)), 3, 7, 256);
                this.d.setSpan(new ForegroundColorSpan(-65536), 7, 11, 256);
                this.d.setSpan(new ForegroundColorSpan(Color.rgb(0, 255, 255)), 11, 15, 256);
                this.d.setSpan(new ForegroundColorSpan(-65536), 15, 19, 256);
                this.d.setSpan(new ForegroundColorSpan(Color.rgb(0, 255, 255)), 19, 23, 256);
            }
        } catch (Exception e2) {
            this.d.clearSpans();
            Log.e("ColourTheFindResult", "Error : ColorTheID : " + e2.getMessage());
        }
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        KeyboardView keyboardView = (KeyboardView) findViewById(R.id.keyboardView);
        keyboardView.setKeyboard(true == this.f528a.u.equals("90") ? new Keyboard(this, R.layout.keyboard90) : true == this.f528a.u.equals("80") ? new Keyboard(this, R.layout.keyboard80) : true == this.f528a.u.equals("70") ? new Keyboard(this, R.layout.keyboard70) : true == this.f528a.u.equals("60") ? new Keyboard(this, R.layout.keyboard60) : true == this.f528a.u.equals("50") ? new Keyboard(this, R.layout.keyboard50) : true == this.f528a.u.equals("40") ? new Keyboard(this, R.layout.keyboard40) : new Keyboard(this, R.layout.keyboard30));
        keyboardView.setEnabled(true);
        keyboardView.setPreviewEnabled(this.f528a.L.booleanValue());
        keyboardView.setOnKeyListener(this);
        keyboardView.setOnKeyboardActionListener(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
        int i = configuration.orientation;
    }

    public void onCreate(Bundle bundle) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        super.onCreate(bundle);
        setContentView(R.layout.idpassword);
        this.f528a = (MyDB) getApplicationContext();
        TextView textView = (TextView) findViewById(R.id.lblDatabaseVersion);
        TextView textView2 = (TextView) findViewById(R.id.lblID);
        TextView textView3 = (TextView) findViewById(R.id.lblDataPath);
        EditText editText = (EditText) findViewById(R.id.txtPassword);
        Button button = (Button) findViewById(R.id.btnOk);
        button.setOnClickListener(new a(editText));
        ((Button) findViewById(R.id.btnCancel)).setOnClickListener(new b());
        ((Button) findViewById(R.id.btnCopyIdToClipboard)).setOnClickListener(new c(textView2));
        ((Button) findViewById(R.id.btnPastePassword)).setOnClickListener(new d(editText));
        InputFilter[] inputFilterArr = {new e()};
        inputFilterArr[0] = new InputFilter.LengthFilter(12);
        editText.setFilters(inputFilterArr);
        editText.setInputType(0);
        b();
        editText.setOnClickListener(new f(editText));
        editText.setOnKeyListener(new g(button, editText));
        editText.setOnFocusChangeListener(new h(editText));
        ((TextView) findViewById(R.id.lblSoftwareType)).setText("RepoPro 4.8");
        MyDB myDB = this.f528a;
        if (true == myDB.g.equals(myDB.h)) {
            sb = new StringBuilder();
            sb.append("Data:");
            str = this.f528a.g;
        } else {
            sb = new StringBuilder();
            sb.append("Data:");
            sb.append(this.f528a.g);
            sb.append("[update ");
            sb.append(this.f528a.h);
            str = "]";
        }
        sb.append(str);
        textView.setText(sb.toString());
        textView3.setText(r.g("RepoProData.db"));
        MyDB myDB2 = this.f528a;
        if (true == myDB2.o.equals(myDB2.m)) {
            textView2.setText(a(this.f528a.k + this.f528a.l));
            editText.setText(this.f528a.o);
        } else if (true == this.f528a.n.equals("FACTORY") || true == this.f528a.n.equals(BuildConfig.FLAVOR)) {
            textView2.setText(a(this.f528a.k + this.f528a.l));
            editText.requestFocus();
        } else {
            textView2.setTextColor(-65536);
            if (true == this.f528a.d.booleanValue()) {
                sb2 = new StringBuilder();
                sb2.append("The database actually belong to:\nID:");
                sb2.append(this.f528a.j);
                sb2.append("\nModel:");
                sb2.append(this.f528a.s);
                sb2.append("\nOS:");
                sb2.append(this.f528a.t);
                str2 = "\n\nThis device:\nID:";
            } else {
                sb2 = new StringBuilder();
                sb2.append("Database ini sebenarnya kepunyaan:\nID:");
                sb2.append(this.f528a.j);
                sb2.append("\nModel:");
                sb2.append(this.f528a.s);
                sb2.append("\nOS:");
                sb2.append(this.f528a.t);
                str2 = "\n\nAlat ini:\nID:";
            }
            sb2.append(str2);
            sb2.append(this.f528a.i);
            sb2.append("\nModel:");
            sb2.append(Build.MODEL);
            sb2.append("\nOS:");
            sb2.append(Build.VERSION.RELEASE);
            textView2.setText(sb2.toString());
            button.setVisibility(8);
            editText.setVisibility(8);
            this.e.putExtra("blnIdPasswordResult", false);
            setResult(0, this.e);
        }
    }

    public void onKey(int i, int[] iArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("48", "0");
        hashMap.put("49", "1");
        hashMap.put("50", "2");
        hashMap.put("51", "3");
        hashMap.put("52", "4");
        hashMap.put("53", "5");
        hashMap.put("54", "6");
        hashMap.put("55", "7");
        hashMap.put("56", "8");
        hashMap.put("57", "9");
        hashMap.put("65", "A");
        hashMap.put("66", "B");
        hashMap.put("67", "C");
        hashMap.put("68", "D");
        hashMap.put("69", "E");
        hashMap.put("70", "F");
        hashMap.put("71", "G");
        hashMap.put("72", "H");
        hashMap.put("73", "I");
        hashMap.put("74", "J");
        hashMap.put("75", "K");
        hashMap.put("76", "L");
        hashMap.put("77", "M");
        hashMap.put("78", "N");
        hashMap.put("79", "O");
        hashMap.put("80", "P");
        hashMap.put("81", "Q");
        hashMap.put("82", "R");
        hashMap.put("83", "S");
        hashMap.put("84", "T");
        hashMap.put("85", "U");
        hashMap.put("86", "V");
        hashMap.put("87", "W");
        hashMap.put("88", "X");
        hashMap.put("89", "Y");
        hashMap.put("90", "Z");
        hashMap.put("8", "<Back");
        hashMap.put("32", " ");
        hashMap.put("46", ".");
        if (i != 8) {
            if (i != 32 && i != 46) {
                this.c.append((String) hashMap.get(String.valueOf(i)));
            }
        } else if (this.c.getText().toString().length() > 0) {
            EditText editText = this.c;
            editText.setText(editText.getText().toString().substring(0, this.c.getText().toString().length() - 1));
            EditText editText2 = this.c;
            editText2.setSelection(editText2.getText().toString().length());
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    public void onPress(int i) {
    }

    public void onRelease(int i) {
    }

    public void onText(CharSequence charSequence) {
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
