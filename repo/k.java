package com.repo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.repo.r;
import java.util.List;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;

public class k extends BaseAdapter implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f711a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<l> f712b;
    private LayoutInflater c;
    /* access modifiers changed from: private */
    public MyDB d;
    private SpannableStringBuilder e = new SpannableStringBuilder();
    /* access modifiers changed from: private */
    public String[] f = new String[2];

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f714b;

        /* renamed from: com.repo.k$a$a  reason: collision with other inner class name */
        class C0029a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f715a;

            C0029a(Dialog dialog) {
                this.f715a = dialog;
            }

            public void onClick(View view) {
                if (true == k.this.d.d(a.this.f713a.h()).booleanValue()) {
                    ((l) k.this.f712b.get(a.this.f714b)).m("0");
                    ((l) k.this.f712b.get(a.this.f714b)).p(BuildConfig.FLAVOR);
                    ((l) k.this.f712b.get(a.this.f714b)).j(BuildConfig.FLAVOR);
                    ((l) k.this.f712b.get(a.this.f714b)).n(BuildConfig.FLAVOR);
                    ((l) k.this.f712b.get(a.this.f714b)).q(BuildConfig.FLAVOR);
                    ((l) k.this.f712b.get(a.this.f714b)).k(BuildConfig.FLAVOR);
                    ((l) k.this.f712b.get(a.this.f714b)).o(BuildConfig.FLAVOR);
                    ((l) k.this.f712b.get(a.this.f714b)).l(BuildConfig.FLAVOR);
                    k.this.notifyDataSetChanged();
                }
                this.f715a.dismiss();
            }
        }

        class b implements View.OnClickListener {
            b() {
            }

            public void onClick(View view) {
                k.this.d.M = a.this.f713a.g();
                k.this.d.N = Double.valueOf(Double.parseDouble(k.this.f[0]));
                k.this.d.O = Double.valueOf(Double.parseDouble(k.this.f[1]));
                k.this.f711a.startActivity(new Intent(k.this.f711a, ShowMapActivity.class));
            }
        }

        class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f718a;

            c(Dialog dialog) {
                this.f718a = dialog;
            }

            public void onClick(View view) {
                this.f718a.dismiss();
            }
        }

        a(l lVar, int i) {
            this.f713a = lVar;
            this.f714b = i;
        }

        public void onClick(View view) {
            if (true != r.s(this.f713a.g())) {
                Dialog dialog = new Dialog(k.this.f711a);
                dialog.setContentView(R.layout.diarydata_dialog);
                dialog.setCancelable(true);
                ((TextView) dialog.findViewById(R.id.lblDiaryData)).setText(k.this.a(this.f713a.g(), this.f713a.a(), this.f713a.e(), this.f713a.i(), this.f713a.b(), Boolean.TRUE));
                dialog.setTitle("Diary Data");
                Button button = (Button) dialog.findViewById(R.id.btnDeleteDiaryData);
                button.setText(true == k.this.d.d.booleanValue() ? "Delete" : "Padam");
                button.setOnClickListener(new C0029a(dialog));
                Button button2 = (Button) dialog.findViewById(R.id.btnShowMap);
                button2.setOnClickListener(new b());
                TextView textView = (TextView) dialog.findViewById(R.id.lblLocation);
                k kVar = k.this;
                String[] unused = kVar.f = kVar.i(this.f713a.f());
                if (k.this.f[0] == null) {
                    textView.setText(BuildConfig.FLAVOR);
                    textView.setVisibility(8);
                    button2.setEnabled(false);
                    button2.setVisibility(8);
                } else if (k.this.f[0].length() > 0) {
                    textView.setText(this.f713a.f());
                    textView.setTextColor(Color.rgb(255, 255, 0));
                }
                ((Button) dialog.findViewById(R.id.btnExit)).setOnClickListener(new c(dialog));
                dialog.show();
            }
        }
    }

    public k(Activity activity, List<l> list) {
        this.f711a = activity;
        this.f712b = list;
        this.c = (LayoutInflater) activity.getSystemService("layout_inflater");
        this.d = (MyDB) activity.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public SpannableStringBuilder a(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        SpannableStringBuilder spannableStringBuilder;
        ForegroundColorSpan foregroundColorSpan;
        int length;
        try {
            this.e.clear();
            this.e.clearSpans();
            String str6 = r.m(str2) + r.m(str3) + r.m(str4) + r.m(str5);
            int length2 = str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length());
            int length3 = str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + r.k(str5.length());
            if (r.e.REPOPRO_UI == r.f761b) {
                if (str5.length() > 0) {
                    this.e.append(str + str6);
                    this.e.setSpan(new ForegroundColorSpan(-65536), 0, str.length(), 256);
                    if (true == bool.booleanValue()) {
                        this.e.setSpan(new ForegroundColorSpan(-1), str.length(), length2 + 1, 256);
                    } else {
                        this.e.setSpan(new ForegroundColorSpan(-16777216), str.length(), length2 + 1, 256);
                    }
                    this.e.setSpan(new ForegroundColorSpan(-65536), length2 + 1, length3, 256);
                    return this.e;
                }
                this.e.append(str);
                spannableStringBuilder = this.e;
                foregroundColorSpan = new ForegroundColorSpan(-1);
                length = str.length();
            } else if (str5.length() > 0) {
                this.e.append(str + str6);
                this.e.setSpan(new ForegroundColorSpan(-16776961), 0, length3, 256);
                return this.e;
            } else {
                this.e.append(str);
                spannableStringBuilder = this.e;
                foregroundColorSpan = new ForegroundColorSpan(-1);
                length = str.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, length, 256);
        } catch (Exception e2) {
            this.e.clearSpans();
            Log.e("ColourTheDiaryRow", "Error : ColourTheDiaryRow : " + e2.getMessage());
        }
        return this.e;
    }

    /* access modifiers changed from: private */
    public String[] i(String str) {
        int indexOf;
        String[] strArr = new String[2];
        try {
            int length = str.length();
            if (length > 3) {
                int i = length - 1;
                if (str.substring(i, length).equals("]") && (indexOf = str.indexOf("[")) > 1) {
                    String substring = str.substring(indexOf + 1, i);
                    int indexOf2 = substring.indexOf("|");
                    strArr[0] = substring.substring(0, indexOf2);
                    strArr[1] = substring.substring(indexOf2 + 1, substring.length());
                }
            }
        } catch (Exception unused) {
        }
        return strArr;
    }

    public int getCount() {
        return this.f712b.size();
    }

    public Object getItem(int i) {
        return this.f712b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        String str2;
        int i2;
        int rgb;
        if (view == null) {
            view = this.c.inflate(R.layout.diary_grid_item, viewGroup, false);
        }
        l lVar = this.f712b.get(i);
        if (lVar != null) {
            ((TextView) view.findViewById(R.id.col1)).setText(a(lVar.g(), lVar.a(), lVar.e(), lVar.i(), lVar.b(), Boolean.FALSE));
            TextView textView = (TextView) view.findViewById(R.id.col2);
            TextView textView2 = (TextView) view.findViewById(R.id.col3);
            if (lVar.f().length() <= 0) {
                str = BuildConfig.FLAVOR;
            } else if (true == r.f760a.booleanValue()) {
                str = lVar.h() + "|" + lVar.f();
            } else {
                str = lVar.f();
            }
            textView.setText(str);
            if (true == r.f760a.booleanValue()) {
                str2 = lVar.h() + "|" + lVar.c();
            } else {
                str2 = lVar.c();
            }
            textView2.setText(str2);
            if (true == lVar.d().equals("0")) {
                ((ImageView) view.findViewById(R.id.icoHitStatus)).setImageResource(R.drawable.wrong_small);
                view.setBackgroundColor(-16777216);
                textView.setTextColor(Color.rgb(255, 255, 0));
                rgb = Color.rgb(0, 255, 0);
            } else {
                if (true == lVar.d().equals("1")) {
                    ((ImageView) view.findViewById(R.id.icoHitStatus)).setImageResource(R.drawable.correct_small);
                    i2 = Color.rgb(255, 250, 205);
                } else {
                    ((ImageView) view.findViewById(R.id.icoHitStatus)).setImageResource(R.drawable.wrongcorrect_small);
                    i2 = Color.rgb(254, 200, 216);
                }
                view.setBackgroundColor(i2);
                textView.setTextColor(Color.rgb(255, 0, 255));
                rgb = Color.rgb(0, 0, 128);
            }
            textView2.setTextColor(rgb);
            view.setOnClickListener(new a(lVar, i));
        }
        return view;
    }

    public void onClick(View view) {
    }
}
