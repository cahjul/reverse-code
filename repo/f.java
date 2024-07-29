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
import java.io.File;
import java.util.Date;
import java.util.List;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;

public class f extends BaseAdapter implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f693a;

    /* renamed from: b  reason: collision with root package name */
    private ChooseDiaryActivity f694b;
    /* access modifiers changed from: private */
    public List<g> c;
    private LayoutInflater d;
    /* access modifiers changed from: private */
    public TextView e;
    /* access modifiers changed from: private */
    public MyDB f;
    private SpannableStringBuilder g = new SpannableStringBuilder();

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f696b;

        /* renamed from: com.repo.f$a$a  reason: collision with other inner class name */
        class C0028a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f697a;

            C0028a(Dialog dialog) {
                this.f697a = dialog;
            }

            public void onClick(View view) {
                a aVar = a.this;
                f.this.g(aVar.f695a.d(), a.this.f695a.c());
                this.f697a.dismiss();
            }
        }

        class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f699a;

            b(Dialog dialog) {
                this.f699a = dialog;
            }

            public void onClick(View view) {
                if (true == r.p(a.this.f695a.d()).booleanValue()) {
                    f.this.c.remove(a.this.f696b);
                    f.this.notifyDataSetChanged();
                }
                this.f699a.dismiss();
            }
        }

        class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f701a;

            c(Dialog dialog) {
                this.f701a = dialog;
            }

            public void onClick(View view) {
                this.f701a.dismiss();
            }
        }

        a(g gVar, int i) {
            this.f695a = gVar;
            this.f696b = i;
        }

        public void onClick(View view) {
            if (true != r.s(this.f695a.a())) {
                Dialog dialog = new Dialog(f.this.f693a);
                dialog.setContentView(R.layout.choosediarydata_dialog);
                dialog.setCancelable(true);
                if (true == f.this.f.d.booleanValue()) {
                    dialog.setTitle("Use This Diary");
                } else {
                    dialog.setTitle("Guna Diary Ini");
                }
                ((TextView) dialog.findViewById(R.id.lblChooseDiaryFileName)).setText(this.f695a.a());
                Button button = (Button) dialog.findViewById(R.id.btnChooseDiaryFile);
                if (true == f.this.f.d.booleanValue()) {
                    button.setText("Use This Diary");
                } else {
                    button.setText("Guna Diary Ini");
                }
                button.setOnClickListener(new C0028a(dialog));
                Button button2 = (Button) dialog.findViewById(R.id.btnDeleteChooseDiaryFile);
                button2.setText(true == f.this.f.d.booleanValue() ? "Delete This Diary" : "Padam Diary Ini");
                button2.setOnClickListener(new b(dialog));
                ((Button) dialog.findViewById(R.id.btnExit)).setOnClickListener(new c(dialog));
                dialog.show();
            }
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f703a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f704b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        b(EditText editText, EditText editText2, String str, String str2) {
            this.f703a = editText;
            this.f704b = editText2;
            this.c = str;
            this.d = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            Context context;
            Context b2;
            String str2;
            Context b3;
            String str3;
            EditText editText;
            String trim = this.f703a.getText().toString().toUpperCase().trim();
            String trim2 = this.f704b.getText().toString().toUpperCase().trim();
            if (true != trim.equals(BuildConfig.FLAVOR)) {
                if (true == trim2.equals(BuildConfig.FLAVOR)) {
                    if (true == f.this.f.d.booleanValue()) {
                        b2 = f.this.f693a;
                        str2 = "Please key in the chosen diary password.";
                    } else {
                        b2 = f.this.f693a;
                        str2 = "Sila masukkan password diary yang dipilih.";
                    }
                } else if (trim.equals(f.this.f.G)) {
                    String i2 = f.this.f.i(this.c);
                    if (trim2.equals(i2)) {
                        if (f.this.f.P != null || f.this.f.P.isOpen()) {
                            f.this.f.P.close();
                            f.this.f.P = null;
                        }
                        if (f.this.f.R != null || f.this.f.R.isOpen()) {
                            f.this.f.R.close();
                            f.this.f.R = null;
                        }
                        if (f.this.f.Q != null || f.this.f.Q.isOpen()) {
                            f.this.f.Q.close();
                            f.this.f.Q = null;
                        }
                        r.p(f.this.f.E);
                        if (true == r.o(this.c, f.this.f.E).booleanValue()) {
                            f.this.f.G = i2;
                            MyDB c2 = f.this.f;
                            Boolean bool = Boolean.FALSE;
                            c2.o(bool);
                            if (f.this.f.P != null || f.this.f.P.isOpen()) {
                                f.this.f.P.close();
                                f.this.f.P = null;
                            }
                            f.this.f.o(bool);
                            f.this.f.q(bool);
                            if (f.this.f.R != null || f.this.f.R.isOpen()) {
                                f.this.f.R.close();
                                f.this.f.R = null;
                            }
                            f.this.f.q(bool);
                            f.this.f.p(bool);
                            if (f.this.f.Q != null || f.this.f.Q.isOpen()) {
                                f.this.f.Q.close();
                                f.this.f.Q = null;
                            }
                            f.this.f.p(bool);
                            File file = new File(f.this.f.E);
                            new Date(file.lastModified());
                            double length = (double) file.length();
                            Double.isNaN(length);
                            double d2 = length / 1048576.0d;
                            if (true == f.this.f.d.booleanValue()) {
                                TextView f = f.this.e;
                                f.setText("Current diary file being used.\n" + f.this.f.E + "\n" + this.d + " | " + r.d(d2) + " MB");
                                context = f.this.f693a;
                                str = "Work done. You are now using the chosen diary.";
                            } else {
                                TextView f2 = f.this.e;
                                f2.setText("Diary file yang digunakan sekarang.\n" + f.this.f.E + "\n" + this.d + " | " + r.d(d2) + " MB");
                                context = f.this.f693a;
                                str = "Kerja sudah selesai. Anda sekarang sedang menggunakan diary yang dipilih.";
                            }
                        } else if (true == f.this.f.d.booleanValue()) {
                            context = f.this.f693a;
                            str = "Error. Can't use the chosen diary.";
                        } else {
                            context = f.this.f693a;
                            str = "Masalah. Tidak dapat menggunakan diary yang dipilih.";
                        }
                        r.v(context, str, 1);
                        return;
                    } else if (true == f.this.f.d.booleanValue()) {
                        b2 = f.this.f693a;
                        str2 = "Your chosen diary password is not correct.";
                    } else {
                        b2 = f.this.f693a;
                        str2 = "Password diary yang dipilih adalah tidak betul.";
                    }
                } else if (true == f.this.f.d.booleanValue()) {
                    b3 = f.this.f693a;
                    str3 = "Your diary password is not correct.";
                } else {
                    b3 = f.this.f693a;
                    str3 = "Password diary anda tidak betul.";
                }
                r.v(b2, str2, 1);
                editText = this.f704b;
                editText.requestFocus();
            } else if (true == f.this.f.d.booleanValue()) {
                b3 = f.this.f693a;
                str3 = "Please key in your diary password.";
            } else {
                b3 = f.this.f693a;
                str3 = "Sila masukkan password diary anda.";
            }
            r.v(b3, str3, 1);
            editText = this.f703a;
            editText.requestFocus();
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public f(Activity activity, List<g> list, ChooseDiaryActivity chooseDiaryActivity) {
        this.f693a = activity;
        this.c = list;
        this.d = (LayoutInflater) activity.getSystemService("layout_inflater");
        this.f = (MyDB) activity.getApplicationContext();
        this.f694b = chooseDiaryActivity;
        if (chooseDiaryActivity != null) {
            this.e = (TextView) chooseDiaryActivity.findViewById(R.id.lblChooseDiaryInfo);
        }
    }

    private SpannableStringBuilder a(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder;
        ForegroundColorSpan foregroundColorSpan;
        int length;
        int length2;
        try {
            this.g.clear();
            this.g.clearSpans();
            SpannableStringBuilder spannableStringBuilder2 = this.g;
            spannableStringBuilder2.append(str + " | " + str2);
            int i = 0;
            if (r.e.REPOPRO_UI == r.f761b) {
                this.g.setSpan(new ForegroundColorSpan(-16711936), 0, str.length(), 256);
                this.g.setSpan(new ForegroundColorSpan(-1), str.length(), str.length() + 3, 256);
                spannableStringBuilder = this.g;
                foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#33B5E5"));
                i = str.length() + 3;
                length = str.length() + 3;
                length2 = str2.length();
            } else {
                spannableStringBuilder = this.g;
                foregroundColorSpan = new ForegroundColorSpan(-16711936);
                length = str.length() + 3;
                length2 = str2.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i, length + length2, 256);
        } catch (Exception e2) {
            this.g.clearSpans();
            Log.e("ColourTheFileInfoRow", "Error : ColourTheFileInfoRow : " + e2.getMessage());
        }
        return this.g;
    }

    /* access modifiers changed from: private */
    public void g(String str, String str2) {
        String str3;
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f693a);
        builder.setTitle(true == this.f.d.booleanValue() ? "Entry Diary Password" : "Masukkan Password Diary");
        View inflate = ((LayoutInflater) this.f693a.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.diarypasswordsetup, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.txtPassword1);
        TextView textView = (TextView) inflate.findViewById(R.id.lblPassword1);
        EditText editText2 = (EditText) inflate.findViewById(R.id.txtPassword2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.lblPassword2);
        editText.setKeyListener(new a());
        editText2.setKeyListener(new a());
        if (true == this.f.d.booleanValue()) {
            textView.setText("Your diary password:");
            str3 = "Chosen diary password:";
        } else {
            textView.setText("Password diary anda:");
            str3 = "Password diary yang dipilih:";
        }
        textView2.setText(str3);
        builder.setPositiveButton("Ok", new b(editText, editText2, str, str2));
        builder.setNegativeButton("Cancel", new c());
        builder.setView(inflate);
        builder.show();
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int i) {
        return this.c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.d.inflate(R.layout.choosediary_grid_item, viewGroup, false);
        }
        g gVar = this.c.get(i);
        if (gVar != null) {
            ((TextView) view.findViewById(R.id.lblFileName)).setText(gVar.a());
            ((TextView) view.findViewById(R.id.lblFileInfo)).setText(a(gVar.c(), gVar.b()));
            view.setOnClickListener(new a(gVar, i));
        }
        return view;
    }

    public void onClick(View view) {
    }
}
