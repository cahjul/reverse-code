package com.repo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.repo.r;
import java.util.List;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;

public class b extends BaseAdapter implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f675a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<c> f676b;
    private LayoutInflater c;
    /* access modifiers changed from: private */
    public MyDB d;
    private SpannableStringBuilder e = new SpannableStringBuilder();

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f678b;

        /* renamed from: com.repo.b$a$a  reason: collision with other inner class name */
        class C0025a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f679a;

            C0025a(Dialog dialog) {
                this.f679a = dialog;
            }

            public void onClick(View view) {
                a aVar = a.this;
                b.this.f(aVar.f677a.d());
                this.f679a.dismiss();
            }
        }

        /* renamed from: com.repo.b$a$b  reason: collision with other inner class name */
        class C0026b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f681a;

            C0026b(Dialog dialog) {
                this.f681a = dialog;
            }

            public void onClick(View view) {
                if (true == r.p(a.this.f677a.d()).booleanValue()) {
                    b.this.f676b.remove(a.this.f678b);
                    b.this.notifyDataSetChanged();
                }
                this.f681a.dismiss();
            }
        }

        class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f683a;

            c(Dialog dialog) {
                this.f683a = dialog;
            }

            public void onClick(View view) {
                this.f683a.dismiss();
            }
        }

        a(c cVar, int i) {
            this.f677a = cVar;
            this.f678b = i;
        }

        public void onClick(View view) {
            if (true != r.s(this.f677a.a())) {
                Dialog dialog = new Dialog(b.this.f675a);
                dialog.setContentView(R.layout.backupdiarydata_dialog);
                dialog.setCancelable(true);
                dialog.setTitle("BackUp Diary");
                ((TextView) dialog.findViewById(R.id.lblBackUpFileName)).setText(this.f677a.a());
                Button button = (Button) dialog.findViewById(R.id.btnUseThisBackUpFile);
                button.setText(true == b.this.d.d.booleanValue() ? "Use This BackUp Diary" : "Guna BackUp Diary Ini");
                button.setOnClickListener(new C0025a(dialog));
                Button button2 = (Button) dialog.findViewById(R.id.btnDeleteThisBackUpFile);
                button2.setText(true == b.this.d.d.booleanValue() ? "Delete This BackUp Diary" : "Padam BackUp Diary Ini");
                button2.setOnClickListener(new C0026b(dialog));
                ((Button) dialog.findViewById(R.id.btnExit)).setOnClickListener(new c(dialog));
                dialog.show();
            }
        }
    }

    /* renamed from: com.repo.b$b  reason: collision with other inner class name */
    class C0027b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f686b;
        final /* synthetic */ String c;

        C0027b(EditText editText, EditText editText2, String str) {
            this.f685a = editText;
            this.f686b = editText2;
            this.c = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            Context context;
            Context context2;
            String str2;
            EditText editText;
            String str3;
            Context context3;
            String str4;
            Context context4;
            String trim = this.f685a.getText().toString().toUpperCase().trim();
            String trim2 = this.f686b.getText().toString().toUpperCase().trim();
            if (true == trim.equals(BuildConfig.FLAVOR)) {
                if (true == b.this.d.d.booleanValue()) {
                    context4 = b.this.f675a;
                    str4 = "Please key in your diary password.";
                } else {
                    context4 = b.this.f675a;
                    str4 = "Sila masukkan password diary anda.";
                }
                r.v(context4, str4, 1);
            } else {
                if (true == trim2.equals(BuildConfig.FLAVOR)) {
                    if (true == b.this.d.d.booleanValue()) {
                        context3 = b.this.f675a;
                        str3 = "Please key in the backup diary password.";
                    } else {
                        context3 = b.this.f675a;
                        str3 = "Sila masukkan password diary backup";
                    }
                    r.v(context3, str3, 1);
                } else if (trim.equals(b.this.d.G)) {
                    String i2 = b.this.d.i(this.c);
                    if (trim2.equals(i2)) {
                        if (b.this.d.Q != null || b.this.d.Q.isOpen()) {
                            b.this.d.Q.close();
                            b.this.d.Q = null;
                        }
                        r.p(b.this.d.E);
                        if (true == r.o(this.c, b.this.d.E).booleanValue()) {
                            if (true == b.this.d.d.booleanValue()) {
                                context2 = b.this.f675a;
                                str2 = "Work done. You are now using the BackUp Diary.";
                            } else {
                                context2 = b.this.f675a;
                                str2 = "Kerja sudah selesai. Anda sekarang sedang menggunakan Diary BackUp.";
                            }
                            r.v(context2, str2, 1);
                            b.this.d.G = i2;
                            MyDB c2 = b.this.d;
                            Boolean bool = Boolean.FALSE;
                            c2.p(bool);
                            if (b.this.d.Q != null || b.this.d.Q.isOpen()) {
                                b.this.d.Q.close();
                                b.this.d.Q = null;
                            }
                            b.this.d.p(bool);
                            return;
                        }
                        if (true == b.this.d.d.booleanValue()) {
                            context = b.this.f675a;
                            str = "Error. Can't use the BackUp Diary.";
                        } else {
                            context = b.this.f675a;
                            str = "Masalah. Tidak dapat menggunakan Diary BackUp.";
                        }
                        r.v(context, str, 1);
                        return;
                    } else if (true == b.this.d.d.booleanValue()) {
                        r.v(b.this.f675a, "Your diary password is not correct.", 1);
                    } else {
                        r.v(b.this.f675a, "Password diary anda tidak betul.", 1);
                    }
                } else if (true == b.this.d.d.booleanValue()) {
                    r.v(b.this.f675a, "Your diary password is not correct.", 1);
                } else {
                    r.v(b.this.f675a, "Password diary anda tidak betul.", 1);
                }
                editText = this.f686b;
                editText.requestFocus();
            }
            editText = this.f685a;
            editText.requestFocus();
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public b(Activity activity, List<c> list) {
        this.f675a = activity;
        this.f676b = list;
        this.c = (LayoutInflater) activity.getSystemService("layout_inflater");
        this.d = (MyDB) activity.getApplicationContext();
    }

    private SpannableStringBuilder a(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder;
        ForegroundColorSpan foregroundColorSpan;
        int length;
        int length2;
        try {
            this.e.clear();
            this.e.clearSpans();
            SpannableStringBuilder spannableStringBuilder2 = this.e;
            spannableStringBuilder2.append(str + " | " + str2);
            int i = 0;
            if (r.e.REPOPRO_UI == r.f761b) {
                this.e.setSpan(new ForegroundColorSpan(-16711936), 0, str.length(), 256);
                this.e.setSpan(new ForegroundColorSpan(-1), str.length(), str.length() + 3, 256);
                spannableStringBuilder = this.e;
                foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#33B5E5"));
                i = str.length() + 3;
                length = str.length() + 3;
                length2 = str2.length();
            } else {
                spannableStringBuilder = this.e;
                foregroundColorSpan = new ForegroundColorSpan(-16711936);
                length = str.length() + 3;
                length2 = str2.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i, length + length2, 256);
        } catch (Exception e2) {
            this.e.clearSpans();
            Log.e("ColourTheFileInfoRow", "Error : ColourTheFileInfoRow : " + e2.getMessage());
        }
        return this.e;
    }

    /* access modifiers changed from: private */
    public void f(String str) {
        String str2;
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f675a);
        builder.setTitle("BackUp Diary Password");
        View inflate = ((LayoutInflater) this.f675a.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.diarypasswordsetup, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.txtPassword1);
        TextView textView = (TextView) inflate.findViewById(R.id.lblPassword1);
        EditText editText2 = (EditText) inflate.findViewById(R.id.txtPassword2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.lblPassword2);
        editText.setKeyListener(new a());
        editText2.setKeyListener(new a());
        if (true == this.d.d.booleanValue()) {
            textView.setText("Your diary password:");
            str2 = "Backup diary password:";
        } else {
            textView.setText("Password diary anda:");
            str2 = "Password diary backup:";
        }
        textView2.setText(str2);
        builder.setPositiveButton("Ok", new C0027b(editText, editText2, str));
        builder.setNegativeButton("Cancel", new c());
        builder.setView(inflate);
        builder.show();
    }

    public int getCount() {
        return this.f676b.size();
    }

    public Object getItem(int i) {
        return this.f676b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.c.inflate(R.layout.backupdiary_grid_item, viewGroup, false);
        }
        c cVar = this.f676b.get(i);
        if (cVar != null) {
            ((TextView) view.findViewById(R.id.lblFileName)).setText(cVar.a());
            ((TextView) view.findViewById(R.id.lblFileInfo)).setText(a(cVar.c(), cVar.b()));
            view.setOnClickListener(new a(cVar, i));
        }
        return view;
    }

    public void onClick(View view) {
    }
}
