package com.repo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;

public class p extends BaseAdapter implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f748a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public LastRemarkActivity f749b;
    /* access modifiers changed from: private */
    public List<q> c;
    private LayoutInflater d;
    /* access modifiers changed from: private */
    public MyDB e;
    private SpannableStringBuilder f = new SpannableStringBuilder();
    /* access modifiers changed from: private */
    public EditText g;
    /* access modifiers changed from: private */
    public EditText h;
    /* access modifiers changed from: private */
    public TextView i;
    /* access modifiers changed from: private */
    public EditText j;
    /* access modifiers changed from: private */
    public EditText k;
    /* access modifiers changed from: private */
    public TextView l;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f751b;

        /* renamed from: com.repo.p$a$a  reason: collision with other inner class name */
        class C0033a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f752a;

            C0033a(Dialog dialog) {
                this.f752a = dialog;
            }

            public void onClick(View view) {
                if (true == p.this.e.e(a.this.f750a.f()).booleanValue()) {
                    p.this.c.remove(a.this.f751b);
                    p.this.notifyDataSetChanged();
                    if (p.this.f749b != null) {
                        p.this.f749b.c(Integer.valueOf(p.this.f749b.l));
                    }
                }
                this.f752a.dismiss();
            }
        }

        class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f754a;

            b(Dialog dialog) {
                this.f754a = dialog;
            }

            public void onClick(View view) {
                this.f754a.dismiss();
            }
        }

        class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f756a;

            c(Dialog dialog) {
                this.f756a = dialog;
            }

            public void onClick(View view) {
                p.this.g.setText(a.this.f750a.f());
                p.this.h.setText(a.this.f750a.a());
                p.this.i.setText(a.this.f750a.d());
                p.this.j.setText(a.this.f750a.b());
                p.this.k.setText(a.this.f750a.g());
                TextView g = p.this.l;
                a aVar = a.this;
                g.setText(p.this.c(aVar.f750a.c()));
                this.f756a.dismiss();
            }
        }

        a(q qVar, int i) {
            this.f750a = qVar;
            this.f751b = i;
        }

        public void onClick(View view) {
            if (true != r.s(this.f750a.f())) {
                Dialog dialog = new Dialog(p.this.f748a);
                dialog.setContentView(R.layout.lastremarkdata_dialog);
                dialog.setCancelable(true);
                ((TextView) dialog.findViewById(R.id.lblLastRemarkData)).setText(p.this.b(this.f750a.f(), this.f750a.a(), this.f750a.d(), this.f750a.b(), Boolean.TRUE));
                Button button = (Button) dialog.findViewById(R.id.btnDeleteLastRemarkData);
                dialog.setTitle("Remark Data");
                button.setText(true == p.this.e.d.booleanValue() ? "Delete" : "Padam");
                button.setOnClickListener(new C0033a(dialog));
                ((Button) dialog.findViewById(R.id.btnExit)).setOnClickListener(new b(dialog));
                ((Button) dialog.findViewById(R.id.btnEditLastRemarkData)).setOnClickListener(new c(dialog));
                dialog.show();
            }
        }
    }

    public p(Activity activity, List<q> list, LastRemarkActivity lastRemarkActivity) {
        this.f748a = activity;
        this.c = list;
        this.d = (LayoutInflater) activity.getSystemService("layout_inflater");
        this.e = (MyDB) activity.getApplicationContext();
        this.f749b = lastRemarkActivity;
        if (lastRemarkActivity != null) {
            this.g = (EditText) lastRemarkActivity.findViewById(R.id.txtPlateNo);
            this.h = (EditText) this.f749b.findViewById(R.id.txtArrearNo);
            this.i = (TextView) this.f749b.findViewById(R.id.lblLastPaymentDate);
            this.j = (EditText) this.f749b.findViewById(R.id.txtFinancier);
            this.k = (EditText) this.f749b.findViewById(R.id.txtRemark);
            this.l = (TextView) this.f749b.findViewById(R.id.lblFollowUpDate);
        }
    }

    private SpannableStringBuilder a(String str, String str2, String str3, Boolean bool) {
        SpannableStringBuilder spannableStringBuilder;
        ForegroundColorSpan foregroundColorSpan;
        int length;
        try {
            this.f.clear();
            this.f.clearSpans();
            if (r.e.REPOPRO_UI == r.f761b) {
                if (str3.length() > 0) {
                    if (true == r.f760a.booleanValue()) {
                        SpannableStringBuilder spannableStringBuilder2 = this.f;
                        spannableStringBuilder2.append(str + "|" + str2 + "| FollowUp: " + str3);
                        this.f.setSpan(new ForegroundColorSpan(-16711936), 0, str.length() + 2 + str2.length(), 256);
                        this.f.setSpan(new ForegroundColorSpan(Color.parseColor("#33B5E5")), str.length() + 2 + str2.length(), str.length() + 13 + str2.length() + str3.length(), 256);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = this.f;
                        spannableStringBuilder3.append(str2 + "| FollowUp: " + str3);
                        this.f.setSpan(new ForegroundColorSpan(-16711936), 0, str2.length() + 1, 256);
                        this.f.setSpan(new ForegroundColorSpan(Color.parseColor("#33B5E5")), str2.length() + 1, str2.length() + 12 + str3.length(), 256);
                    }
                } else if (true == r.f760a.booleanValue()) {
                    SpannableStringBuilder spannableStringBuilder4 = this.f;
                    spannableStringBuilder4.append(str + "|" + str2);
                    this.f.setSpan(new ForegroundColorSpan(-16711936), 0, str.length() + 1 + str2.length(), 256);
                } else {
                    this.f.append(str2);
                    spannableStringBuilder = this.f;
                    foregroundColorSpan = new ForegroundColorSpan(-16711936);
                    length = str2.length();
                }
                return this.f;
            } else if (str3.length() > 0) {
                if (true == r.f760a.booleanValue()) {
                    SpannableStringBuilder spannableStringBuilder5 = this.f;
                    spannableStringBuilder5.append(str + "|" + str2 + "| FollowUp: " + str3);
                    this.f.setSpan(new ForegroundColorSpan(-16711936), 0, str.length() + 13 + str2.length() + str3.length(), 256);
                } else {
                    SpannableStringBuilder spannableStringBuilder6 = this.f;
                    spannableStringBuilder6.append(str2 + "| FollowUp: " + str3);
                    this.f.setSpan(new ForegroundColorSpan(-16711936), 0, str2.length() + 12 + str3.length(), 256);
                }
                return this.f;
            } else {
                this.f.append(str2);
                spannableStringBuilder = this.f;
                foregroundColorSpan = new ForegroundColorSpan(-16711936);
                length = str2.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, length, 256);
        } catch (Exception e2) {
            this.f.clearSpans();
            Log.e("ColourTheFollowUpRow", "Error : ColourTheFollowUpRow : " + e2.getMessage());
        }
        return this.f;
    }

    /* access modifiers changed from: private */
    public SpannableStringBuilder b(String str, String str2, String str3, String str4, Boolean bool) {
        SpannableStringBuilder spannableStringBuilder;
        ForegroundColorSpan foregroundColorSpan;
        int length;
        int k2;
        try {
            this.f.clear();
            this.f.clearSpans();
            SpannableStringBuilder spannableStringBuilder2 = this.f;
            spannableStringBuilder2.append(str + r.m(str2) + r.m(str3) + r.m(str4));
            int i2 = 0;
            if (r.e.REPOPRO_UI == r.f761b) {
                this.f.setSpan(new ForegroundColorSpan(-65536), 0, str.length(), 256);
                this.f.setSpan(new ForegroundColorSpan(-16711936), str.length(), str.length() + r.k(str2.length()) + r.k(str3.length()), 256);
                if (str4.length() > 0) {
                    spannableStringBuilder = this.f;
                    foregroundColorSpan = new ForegroundColorSpan(-65536);
                    i2 = str.length() + r.k(str2.length()) + r.k(str3.length()) + 1;
                    length = str.length() + r.k(str2.length()) + r.k(str3.length());
                    k2 = r.k(str4.length());
                }
                return this.f;
            }
            spannableStringBuilder = this.f;
            foregroundColorSpan = new ForegroundColorSpan(-1);
            length = str.length() + r.k(str2.length()) + r.k(str3.length());
            k2 = r.k(str4.length());
            spannableStringBuilder.setSpan(foregroundColorSpan, i2, length + k2, 256);
        } catch (Exception e2) {
            this.f.clearSpans();
            Log.e("ColourTheLastRemarkRow", "Error : ColourTheLastRemarkRow : " + e2.getMessage());
        }
        return this.f;
    }

    /* access modifiers changed from: private */
    public String c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return new SimpleDateFormat("dd MMM yyyy").format(simpleDateFormat.parse(str)).toUpperCase();
        } catch (ParseException e2) {
            Log.e("GetFollowUpDateFormFmt", "Error : GetFollowUpDateFormFmt : " + e2.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int i2) {
        return this.c.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        if (view == null) {
            view = this.d.inflate(R.layout.lastremark_grid_item, viewGroup, false);
        }
        q qVar = this.c.get(i2);
        if (qVar != null) {
            String f2 = qVar.f();
            String a2 = qVar.a();
            String d2 = qVar.d();
            String b2 = qVar.b();
            Boolean bool = Boolean.FALSE;
            ((TextView) view.findViewById(R.id.col1)).setText(b(f2, a2, d2, b2, bool));
            TextView textView = (TextView) view.findViewById(R.id.col2);
            TextView textView2 = (TextView) view.findViewById(R.id.col3);
            if (qVar.g().length() > 0) {
                textView.setText(qVar.g());
                charSequence = a(qVar.h(), qVar.e(), qVar.c(), bool);
            } else {
                textView.setText(a(qVar.h(), qVar.e(), qVar.c(), bool));
                charSequence = BuildConfig.FLAVOR;
            }
            textView2.setText(charSequence);
            view.setOnClickListener(new a(qVar, i2));
        }
        return view;
    }

    public void onClick(View view) {
    }
}
