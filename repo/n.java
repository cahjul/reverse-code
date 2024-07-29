package com.repo;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
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
import android.widget.TextView;
import java.util.List;
import org.sqlite.database.R;

public class n extends BaseAdapter implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f734a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Activity f735b;
    /* access modifiers changed from: private */
    public TextView c;
    /* access modifiers changed from: private */
    public List<o> d;
    private LayoutInflater e;
    /* access modifiers changed from: private */
    public MyDB f;
    private SpannableStringBuilder g = new SpannableStringBuilder();

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f737b;

        /* renamed from: com.repo.n$a$a  reason: collision with other inner class name */
        class C0031a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f738a;

            /* renamed from: com.repo.n$a$a$a  reason: collision with other inner class name */
            class C0032a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Button f740a;

                C0032a(Button button) {
                    this.f740a = button;
                }

                public void run() {
                    String str;
                    Button button;
                    String str2;
                    StringBuilder sb;
                    if (true == n.this.f.d.booleanValue()) {
                        if (n.this.d.size() > 0) {
                            button = this.f740a;
                            sb = new StringBuilder();
                            str2 = "Hit[ ";
                        } else {
                            button = this.f740a;
                            str = "Hit";
                            button.setText(str);
                        }
                    } else if (n.this.d.size() > 0) {
                        button = this.f740a;
                        sb = new StringBuilder();
                        str2 = "Kena[ ";
                    } else {
                        button = this.f740a;
                        str = "Kena";
                        button.setText(str);
                    }
                    sb.append(str2);
                    sb.append(Integer.toString(n.this.d.size()));
                    sb.append(" ]");
                    str = sb.toString();
                    button.setText(str);
                }
            }

            C0031a(Dialog dialog) {
                this.f738a = dialog;
            }

            public void onClick(View view) {
                n.this.d.remove(a.this.f737b);
                n.this.notifyDataSetChanged();
                try {
                    n.this.f735b.runOnUiThread(new C0032a((Button) n.this.f735b.findViewById(R.id.btnTabHit)));
                } catch (Exception e) {
                    Log.e("btnDeleteFoundVehicle", "Error : btnDeleteFoundVehicle : " + e.getMessage());
                }
                this.f738a.dismiss();
            }
        }

        class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f742a;

            b(Dialog dialog) {
                this.f742a = dialog;
            }

            public void onClick(View view) {
                this.f742a.dismiss();
            }
        }

        class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Dialog f744a;

            c(Dialog dialog) {
                this.f744a = dialog;
            }

            public void onClick(View view) {
                ((ClipboardManager) n.this.f735b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("simple text", n.this.c.getText().toString()));
                this.f744a.dismiss();
            }
        }

        a(o oVar, int i) {
            this.f736a = oVar;
            this.f737b = i;
        }

        public void onClick(View view) {
            String str;
            Dialog dialog = new Dialog(n.this.f734a);
            dialog.setContentView(R.layout.foundvehicledata_dialog);
            dialog.setCancelable(true);
            TextView unused = n.this.c = (TextView) dialog.findViewById(R.id.lblFoundVehicle);
            n.this.c.setText(n.this.a(this.f736a.d(), this.f736a.a(), this.f736a.c(), this.f736a.e(), this.f736a.b(), this.f736a.j(), this.f736a.f(), this.f736a.h(), this.f736a.l(), this.f736a.g(), this.f736a.k(), this.f736a.i()));
            Button button = (Button) dialog.findViewById(R.id.btnDeleteFoundVehicle);
            if (true == n.this.f.d.booleanValue()) {
                dialog.setTitle("Found vehicle");
                str = "Delete";
            } else {
                dialog.setTitle("Kenderaan yang kena");
                str = "Padam";
            }
            button.setText(str);
            button.setOnClickListener(new C0031a(dialog));
            ((Button) dialog.findViewById(R.id.btnExitFoundVehicle)).setOnClickListener(new b(dialog));
            ((Button) dialog.findViewById(R.id.btnCopyFoundVehicle)).setOnClickListener(new c(dialog));
            dialog.show();
        }
    }

    public n(Activity activity, List<o> list) {
        this.f734a = activity;
        this.f735b = activity;
        this.d = list;
        this.e = (LayoutInflater) activity.getSystemService("layout_inflater");
        this.f = (MyDB) activity.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public SpannableStringBuilder a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        String str13 = str;
        String str14 = str6;
        try {
            this.g.clear();
            this.g.clearSpans();
            int i = str5.length() > 0 ? 1 : 0;
            int i2 = str10.length() > 0 ? 1 : 0;
            if (str.length() > 0) {
                if (str6.length() > 0) {
                    int length = str.length() + 1 + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + r.k(str5.length());
                    SpannableStringBuilder spannableStringBuilder = this.g;
                    spannableStringBuilder.append((str13 + r.m(str2) + r.m(str3) + r.m(str4) + r.m(str5)) + "\nRemark:" + str14 + r.m(str7) + r.m(str8) + r.m(str9) + r.m(str10) + r.m(str11) + r.m(str12));
                    this.g.setSpan(new ForegroundColorSpan(-16711936), 0, str.length(), 256);
                    this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#33B5E5")), str.length(), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i, 256);
                    this.g.setSpan(new ForegroundColorSpan(-16711936), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i, str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + r.k(str5.length()), 256);
                    int i3 = length + 7;
                    this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), length, i3, 256);
                    this.g.setSpan(new ForegroundColorSpan(-65536), i3, str6.length() + i3, 256);
                    this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + i3, str6.length() + i3 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i2, 256);
                    this.g.setSpan(new ForegroundColorSpan(-65536), str6.length() + i3 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i2, str6.length() + i3 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), 256);
                    this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + i3 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), i3 + str6.length() + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()) + r.k(str11.length()) + r.k(str12.length()), 256);
                    return this.g;
                }
            }
            if (str.length() > 0) {
                this.g.append(str13 + r.m(str2) + r.m(str3) + r.m(str4) + r.m(str5));
                this.g.setSpan(new ForegroundColorSpan(-16711936), 0, str.length(), 256);
                this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#33B5E5")), str.length(), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i, 256);
                this.g.setSpan(new ForegroundColorSpan(-16711936), str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + i, str.length() + r.k(str2.length()) + r.k(str3.length()) + r.k(str4.length()) + r.k(str5.length()), 256);
            } else {
                this.g.append("Remark:" + str14 + r.m(str7) + r.m(str8) + r.m(str9) + r.m(str10) + r.m(str11) + r.m(str12));
                this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), 0, 7, 256);
                this.g.setSpan(new ForegroundColorSpan(-65536), 7, str6.length() + 7, 256);
                this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + 7, str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i2, 256);
                this.g.setSpan(new ForegroundColorSpan(-65536), str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + i2, str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), 256);
                this.g.setSpan(new ForegroundColorSpan(Color.parseColor("#FF00FF")), str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()), str6.length() + 7 + r.k(str7.length()) + r.k(str8.length()) + r.k(str9.length()) + r.k(str10.length()) + r.k(str11.length()) + r.k(str12.length()), 256);
            }
        } catch (Exception e2) {
            this.g.clearSpans();
            Log.e("ColourTheLastRemarkRow", "Error : ColourTheLastRemarkRow : " + e2.getMessage());
        }
        return this.g;
    }

    public int getCount() {
        return this.d.size();
    }

    public Object getItem(int i) {
        return this.d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = i;
        View inflate = view == null ? this.e.inflate(R.layout.foundvehicle_grid_item, viewGroup, false) : view;
        o oVar = this.d.get(i2);
        if (oVar != null) {
            ((TextView) inflate.findViewById(R.id.col1)).setText(a(oVar.d(), oVar.a(), oVar.c(), oVar.e(), oVar.b(), oVar.j(), oVar.f(), oVar.h(), oVar.l(), oVar.g(), oVar.k(), oVar.i()));
            View view2 = inflate;
            view2.setOnClickListener(new a(oVar, i2));
            return view2;
        }
        return inflate;
    }

    public void onClick(View view) {
    }
}
