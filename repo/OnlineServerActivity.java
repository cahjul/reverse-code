package com.repo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import b.a.a.e;
import b.a.a.p;
import b.a.a.u;
import b.a.a.w.k;
import b.a.a.w.n;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.R;
import org.sqlite.database.sqlite.SQLiteDatabase;

public class OnlineServerActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public MyDB f579a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public TextView f580b;
    private Button c;
    private Button d;
    /* access modifiers changed from: private */
    public TextView e;
    private EditText f;
    private TextView g;
    int h = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
    int i = 3;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            OnlineServerActivity.this.a("1");
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            OnlineServerActivity.this.a("2");
        }
    }

    class c implements p.b<JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f583a;

        class a implements p.b<JSONObject> {
            a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:116:0x04e1 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:124:0x053f A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:126:0x0544 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:128:0x0549 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:136:0x05a7 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:138:0x05cd A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:175:0x068a A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:183:0x06e8 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:185:0x06ed A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:187:0x06f2 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:195:0x0750 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:197:0x0772 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:203:0x07af A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:211:0x080d A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:213:0x0812 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:215:0x0817 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:223:0x0875 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Removed duplicated region for block: B:225:0x0897 A[Catch:{ JSONException -> 0x0954 }] */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:113:0x04d2=Splitter:B:113:0x04d2, B:170:0x065b=Splitter:B:170:0x065b} */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(org.json.JSONObject r23) {
                /*
                    r22 = this;
                    r1 = r22
                    r2 = r23
                    java.lang.String r3 = "D"
                    java.lang.String r4 = "DVP"
                    java.lang.String r5 = "ReplyType"
                    java.lang.String r6 = ": step 11: Updating local database... done"
                    java.lang.String r7 = ": step 11: Update database tempatan... selesai"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "Get Data = "
                    r8.append(r9)
                    r8.append(r2)
                    java.lang.String r8 = r8.toString()
                    java.lang.String r9 = "LOG_VOLLEY"
                    android.util.Log.i(r9, r8)
                    java.lang.String r8 = "EndData"
                    java.lang.String r8 = r2.getString(r8)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r9 = "DataComplete"
                    boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x0954 }
                    r9 = -65536(0xffffffffffff0000, float:NaN)
                    java.lang.String r10 = "Server Online "
                    r11 = 1
                    if (r11 != r8) goto L_0x0927
                    java.lang.String r8 = r2.getString(r5)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r12 = "Data"
                    boolean r8 = r8.equals(r12)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r12 = "BeginData"
                    if (r11 != r8) goto L_0x08c5
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r8 = "DataVersionPatch"
                    java.lang.String r8 = r2.getString(r8)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r8 = com.repo.r.f(r8)     // Catch:{ JSONException -> 0x0954 }
                    r5.z = r8     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0954 }
                    r5.o(r8)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r8 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r8 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r8 = r8.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r8 = r8.h(r4)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r8 = com.repo.r.f(r8)     // Catch:{ JSONException -> 0x0954 }
                    r5.B = r8     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r5 = r5.B     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r8 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r8 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r8 = r8.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r8 = r8.z     // Catch:{ JSONException -> 0x0954 }
                    boolean r5 = r5.equals(r8)     // Catch:{ JSONException -> 0x0954 }
                    r8 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                    if (r11 != r5) goto L_0x00d3
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r2 = r2.d     // Catch:{ JSONException -> 0x0954 }
                    boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x0954 }
                    if (r11 != r2) goto L_0x00bb
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r3 = "You are using the latest data."
                L_0x00b7:
                    r2.setText(r3)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x00c6
                L_0x00bb:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r3 = "Data yang anda pakai adalah yang terbaru."
                    goto L_0x00b7
                L_0x00c6:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    r2.setTextColor(r8)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x0959
                L_0x00d3:
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r5 = r5.d     // Catch:{ JSONException -> 0x0954 }
                    boolean r5 = r5.booleanValue()     // Catch:{ JSONException -> 0x0954 }
                    if (r11 != r5) goto L_0x0107
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r5 = r5.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r9.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r9.append(r10)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r13 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r13 = r13.f583a     // Catch:{ JSONException -> 0x0954 }
                    r9.append(r13)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r13 = ": step 10: Updating local database... please wait"
                    r9.append(r13)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x0954 }
                L_0x0103:
                    r5.setText(r9)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x0128
                L_0x0107:
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r5 = r5.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r9.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r9.append(r10)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r13 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r13 = r13.f583a     // Catch:{ JSONException -> 0x0954 }
                    r9.append(r13)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r13 = ": step 10: Update database tempatan... sila tunggu"
                    r9.append(r13)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x0103
                L_0x0128:
                    com.repo.OnlineServerActivity$c r9 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0652, all -> 0x0647 }
                    com.repo.OnlineServerActivity r9 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0652, all -> 0x0647 }
                    com.repo.MyDB r9 = r9.f579a     // Catch:{ SQLiteException -> 0x0652, all -> 0x0647 }
                    org.sqlite.database.sqlite.SQLiteDatabase r9 = r9.P     // Catch:{ SQLiteException -> 0x0652, all -> 0x0647 }
                    java.lang.String r13 = "UPDATE VLD SET C2=?,C3=?,C4=?,C5=? WHERE C1=?"
                    org.sqlite.database.sqlite.SQLiteStatement r9 = r9.compileStatement(r13)     // Catch:{ SQLiteException -> 0x0652, all -> 0x0647 }
                    com.repo.OnlineServerActivity$c r13 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0641, all -> 0x063b }
                    com.repo.OnlineServerActivity r13 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0641, all -> 0x063b }
                    com.repo.MyDB r13 = r13.f579a     // Catch:{ SQLiteException -> 0x0641, all -> 0x063b }
                    org.sqlite.database.sqlite.SQLiteDatabase r13 = r13.P     // Catch:{ SQLiteException -> 0x0641, all -> 0x063b }
                    java.lang.String r14 = "INSERT INTO VLD VALUES(?,?,?,?,?)"
                    org.sqlite.database.sqlite.SQLiteStatement r13 = r13.compileStatement(r14)     // Catch:{ SQLiteException -> 0x0641, all -> 0x063b }
                    com.repo.OnlineServerActivity$c r14 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0634, all -> 0x062d }
                    com.repo.OnlineServerActivity r14 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0634, all -> 0x062d }
                    com.repo.MyDB r14 = r14.f579a     // Catch:{ SQLiteException -> 0x0634, all -> 0x062d }
                    org.sqlite.database.sqlite.SQLiteDatabase r14 = r14.P     // Catch:{ SQLiteException -> 0x0634, all -> 0x062d }
                    java.lang.String r15 = "DELETE FROM VLD WHERE C1=?"
                    org.sqlite.database.sqlite.SQLiteStatement r14 = r14.compileStatement(r15)     // Catch:{ SQLiteException -> 0x0634, all -> 0x062d }
                    com.repo.OnlineServerActivity$c r15 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity r15 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.MyDB r15 = r15.f579a     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    org.sqlite.database.sqlite.SQLiteDatabase r15 = r15.P     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    java.lang.String r8 = "INSERT INTO VLC (C1) SELECT ? WHERE NOT EXISTS (SELECT 1 FROM VLC WHERE C1=?)"
                    org.sqlite.database.sqlite.SQLiteStatement r8 = r15.compileStatement(r8)     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity$c r15 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity r15 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.MyDB r15 = r15.f579a     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    org.sqlite.database.sqlite.SQLiteDatabase r15 = r15.P     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    java.lang.String r5 = "DELETE FROM VLC WHERE C1=?"
                    org.sqlite.database.sqlite.SQLiteStatement r5 = r15.compileStatement(r5)     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity$c r15 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity r15 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.MyDB r15 = r15.f579a     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    org.sqlite.database.sqlite.SQLiteDatabase r15 = r15.P     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    r15.beginTransaction()     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity$c r15 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity r15 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.MyDB r15 = r15.f579a     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    org.sqlite.database.sqlite.SQLiteDatabase r15 = r15.R     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    java.lang.String r11 = "DELETE FROM VLS WHERE C1=?"
                    org.sqlite.database.sqlite.SQLiteStatement r11 = r15.compileStatement(r11)     // Catch:{ SQLiteException -> 0x0626, all -> 0x061e }
                    com.repo.OnlineServerActivity$c r15 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0617, all -> 0x0611 }
                    com.repo.OnlineServerActivity r15 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0617, all -> 0x0611 }
                    com.repo.MyDB r15 = r15.f579a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0611 }
                    org.sqlite.database.sqlite.SQLiteDatabase r15 = r15.R     // Catch:{ SQLiteException -> 0x0617, all -> 0x0611 }
                    r15.beginTransaction()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0611 }
                    org.json.JSONArray r2 = r2.getJSONArray(r12)     // Catch:{ SQLiteException -> 0x0617, all -> 0x0611 }
                    r12 = 0
                L_0x01a7:
                    int r15 = r2.length()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0611 }
                    if (r12 >= r15) goto L_0x035a
                    org.json.JSONObject r15 = r2.getJSONObject(r12)     // Catch:{ SQLiteException -> 0x0353, all -> 0x034c }
                    r23 = r2
                    java.lang.String r2 = "A"
                    java.lang.String r2 = r15.getString(r2)     // Catch:{ SQLiteException -> 0x0353, all -> 0x034c }
                    r16 = r7
                    java.lang.String r7 = "B"
                    java.lang.String r7 = r15.getString(r7)     // Catch:{ SQLiteException -> 0x0344, all -> 0x033c }
                    r17 = r6
                    java.lang.String r6 = "C"
                    java.lang.String r6 = r15.getString(r6)     // Catch:{ SQLiteException -> 0x0333, all -> 0x032a }
                    r18 = r10
                    java.lang.String r10 = r15.getString(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r19 = r4
                    java.lang.String r4 = "E"
                    java.lang.String r4 = r15.getString(r4)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r20 = r12
                    java.lang.String r12 = "F"
                    java.lang.String r12 = r15.getString(r12)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    boolean r15 = r12.equals(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r21 = r3
                    r3 = 1
                    if (r3 != r15) goto L_0x01f3
                    r14.clearBindings()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r14.bindString(r3, r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r14.executeInsert()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    goto L_0x0306
                L_0x01f3:
                    java.lang.String r3 = "X"
                    boolean r3 = r12.equals(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r15 = 1
                    if (r15 != r3) goto L_0x024f
                    r11.clearBindings()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r11.bindString(r15, r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r11.executeInsert()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ IOException -> 0x0231 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ IOException -> 0x0231 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ IOException -> 0x0231 }
                    com.repo.t r3 = r3.U     // Catch:{ IOException -> 0x0231 }
                    java.lang.String r2 = r3.g(r2)     // Catch:{ IOException -> 0x0231 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ IOException -> 0x0231 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ IOException -> 0x0231 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ IOException -> 0x0231 }
                    com.repo.t r3 = r3.S     // Catch:{ IOException -> 0x0231 }
                    java.lang.String r2 = r3.h(r2)     // Catch:{ IOException -> 0x0231 }
                    r8.clearBindings()     // Catch:{ IOException -> 0x0231 }
                    r3 = 1
                    r8.bindString(r3, r2)     // Catch:{ IOException -> 0x0231 }
                    r3 = 2
                    r8.bindString(r3, r2)     // Catch:{ IOException -> 0x0231 }
                    r8.executeInsert()     // Catch:{ IOException -> 0x0231 }
                    goto L_0x0306
                L_0x0231:
                    r0 = move-exception
                    r2 = r0
                    java.lang.String r3 = "LastRmkCprep"
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r4.<init>()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r6 = "Error : LastRmkCprep : "
                    r4.append(r6)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r2 = r2.getMessage()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r4.append(r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r2 = r4.toString()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                L_0x024a:
                    android.util.Log.e(r3, r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    goto L_0x0306
                L_0x024f:
                    java.lang.String r3 = "Z"
                    boolean r3 = r12.equals(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r12 = 1
                    if (r12 != r3) goto L_0x029a
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ IOException -> 0x0280 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ IOException -> 0x0280 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ IOException -> 0x0280 }
                    com.repo.t r3 = r3.U     // Catch:{ IOException -> 0x0280 }
                    java.lang.String r2 = r3.g(r2)     // Catch:{ IOException -> 0x0280 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ IOException -> 0x0280 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ IOException -> 0x0280 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ IOException -> 0x0280 }
                    com.repo.t r3 = r3.S     // Catch:{ IOException -> 0x0280 }
                    java.lang.String r2 = r3.h(r2)     // Catch:{ IOException -> 0x0280 }
                    r5.clearBindings()     // Catch:{ IOException -> 0x0280 }
                    r3 = 1
                    r5.bindString(r3, r2)     // Catch:{ IOException -> 0x0280 }
                    r5.executeInsert()     // Catch:{ IOException -> 0x0280 }
                    goto L_0x0306
                L_0x0280:
                    r0 = move-exception
                    r2 = r0
                    java.lang.String r3 = "ClnCprep"
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r4.<init>()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r6 = "Error : ClnCprep : "
                    r4.append(r6)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r2 = r2.getMessage()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r4.append(r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r2 = r4.toString()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    goto L_0x024a
                L_0x029a:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.P     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r12.<init>()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r15 = "SELECT C2,C3,C4,C5 FROM VLD WHERE C1 = '"
                    r12.append(r15)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r12.append(r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r15 = "'"
                    r12.append(r15)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r12 = r12.toString()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r15 = 0
                    android.database.Cursor r3 = r3.rawQuery(r12, r15)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    if (r3 == 0) goto L_0x02fb
                    int r12 = r3.getCount()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r15 = 3
                    if (r12 <= 0) goto L_0x02e2
                    r9.clearBindings()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r12 = 1
                    r9.bindString(r12, r7)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r7 = 2
                    r9.bindString(r7, r6)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r9.bindString(r15, r10)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r6 = 4
                    r9.bindString(r6, r4)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r4 = 5
                    r9.bindString(r4, r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r9.executeInsert()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    goto L_0x02fb
                L_0x02e2:
                    r13.clearBindings()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r12 = 1
                    r13.bindString(r12, r2)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r2 = 2
                    r13.bindString(r2, r7)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r13.bindString(r15, r6)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r2 = 4
                    r13.bindString(r2, r10)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r2 = 5
                    r13.bindString(r2, r4)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r13.executeInsert()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                L_0x02fb:
                    if (r3 == 0) goto L_0x0306
                    boolean r2 = r3.isClosed()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    if (r2 != 0) goto L_0x0306
                    r3.close()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                L_0x0306:
                    int r12 = r20 + 1
                    r2 = r23
                    r7 = r16
                    r6 = r17
                    r10 = r18
                    r4 = r19
                    r3 = r21
                    goto L_0x01a7
                L_0x0316:
                    r0 = move-exception
                    r2 = r0
                    r6 = r16
                    r5 = r17
                    r4 = r18
                    goto L_0x07a0
                L_0x0320:
                    r0 = move-exception
                    r2 = r0
                    r6 = r16
                    r5 = r17
                    r4 = r18
                    goto L_0x065b
                L_0x032a:
                    r0 = move-exception
                    r2 = r0
                    r4 = r10
                    r6 = r16
                    r5 = r17
                    goto L_0x07a0
                L_0x0333:
                    r0 = move-exception
                    r2 = r0
                    r4 = r10
                    r6 = r16
                    r5 = r17
                    goto L_0x065b
                L_0x033c:
                    r0 = move-exception
                    r2 = r0
                    r5 = r6
                    r4 = r10
                    r6 = r16
                    goto L_0x07a0
                L_0x0344:
                    r0 = move-exception
                    r2 = r0
                    r5 = r6
                    r4 = r10
                    r6 = r16
                    goto L_0x065b
                L_0x034c:
                    r0 = move-exception
                    r2 = r0
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    goto L_0x07a0
                L_0x0353:
                    r0 = move-exception
                    r2 = r0
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    goto L_0x065b
                L_0x035a:
                    r19 = r4
                    r17 = r6
                    r16 = r7
                    r18 = r10
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r2.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r2.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = r3.z     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = com.repo.r.f(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r4 = r19
                    r2.s(r4, r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = r3.z     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r2.B = r3     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r2 = r2.g     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = r3.h     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    boolean r2 = r2.equals(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = "FACTORY"
                    java.lang.String r4 = "]"
                    r5 = 1
                    if (r5 != r2) goto L_0x0432
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r5 = ""
                    r2.C = r5     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r2 = r2.B     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    boolean r2 = r2.equals(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r3 = 1
                    if (r3 != r2) goto L_0x03fe
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    android.widget.TextView r2 = r2.e     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r3 = r3.g     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                L_0x03f9:
                    r2.setText(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    goto L_0x04d2
                L_0x03fe:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    android.widget.TextView r2 = r2.e     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r3.<init>()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r5 = r5.g     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r3.append(r5)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r5 = "[patch "
                    r3.append(r5)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r5 = r5.B     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r3.append(r5)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r3.append(r4)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    goto L_0x03f9
                L_0x0432:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r5 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r5 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r5 = r5.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r5 = r5.h     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r2.C = r5     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r2 = r2.B     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    boolean r2 = r2.equals(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = "[update "
                    r5 = 1
                    if (r5 != r2) goto L_0x048c
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    android.widget.TextView r2 = r2.e     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r5.<init>()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity$c r6 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r6 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r6 = r6.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r6 = r6.g     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r5.append(r6)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r5.append(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r3 = r3.h     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r5.append(r3)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    r5.append(r4)     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x0320, all -> 0x0316 }
                    goto L_0x03f9
                L_0x048c:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    android.widget.TextView r2 = r2.e     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r5.<init>()     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r6 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r6 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r6 = r6.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r6 = r6.g     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r5.append(r6)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r5.append(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = r3.h     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r5.append(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = "][patch "
                    r5.append(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = r3.B     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r5.append(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r5.append(r4)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    java.lang.String r3 = r5.toString()     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                    r2.setText(r3)     // Catch:{ SQLiteException -> 0x0609, all -> 0x0600 }
                L_0x04d2:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    r2.endTransaction()     // Catch:{ JSONException -> 0x0954 }
                    if (r11 == 0) goto L_0x04e4
                    r11.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x04e4:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0954 }
                    r2.q(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    if (r2 != 0) goto L_0x050d
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    boolean r2 = r2.isOpen()     // Catch:{ JSONException -> 0x0954 }
                    if (r2 == 0) goto L_0x0525
                L_0x050d:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    r2.close()     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r4 = 0
                    r2.R = r4     // Catch:{ JSONException -> 0x0954 }
                L_0x0525:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r2.q(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    r2.endTransaction()     // Catch:{ JSONException -> 0x0954 }
                    if (r9 == 0) goto L_0x0542
                    r9.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x0542:
                    if (r13 == 0) goto L_0x0547
                    r13.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x0547:
                    if (r14 == 0) goto L_0x054c
                    r14.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x054c:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r2.o(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    if (r2 != 0) goto L_0x0573
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    boolean r2 = r2.isOpen()     // Catch:{ JSONException -> 0x0954 }
                    if (r2 == 0) goto L_0x058b
                L_0x0573:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    r2.close()     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r4 = 0
                    r2.P = r4     // Catch:{ JSONException -> 0x0954 }
                L_0x058b:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r2.o(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r2 = r2.d     // Catch:{ JSONException -> 0x0954 }
                    boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x0954 }
                    r3 = 1
                    if (r3 != r2) goto L_0x05cd
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r3.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r4 = r18
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r4 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r4.f583a     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    r5 = r17
                    r3.append(r5)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0954 }
                L_0x05c9:
                    r2.setText(r3)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x05f0
                L_0x05cd:
                    r4 = r18
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r3.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r4 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r4.f583a     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    r6 = r16
                    r3.append(r6)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x05c9
                L_0x05f0:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    r3 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                L_0x05fb:
                    r2.setTextColor(r3)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x0959
                L_0x0600:
                    r0 = move-exception
                    r6 = r16
                    r5 = r17
                    r4 = r18
                    goto L_0x079f
                L_0x0609:
                    r0 = move-exception
                    r6 = r16
                    r5 = r17
                    r4 = r18
                    goto L_0x061b
                L_0x0611:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    goto L_0x079f
                L_0x0617:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                L_0x061b:
                    r2 = r0
                    goto L_0x065b
                L_0x061e:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    r11 = 0
                    goto L_0x07a0
                L_0x0626:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    r11 = 0
                    goto L_0x065b
                L_0x062d:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    r11 = 0
                    goto L_0x064f
                L_0x0634:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    r11 = 0
                    goto L_0x065a
                L_0x063b:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    goto L_0x064d
                L_0x0641:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    goto L_0x0658
                L_0x0647:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    r9 = 0
                L_0x064d:
                    r11 = 0
                    r13 = 0
                L_0x064f:
                    r14 = 0
                    goto L_0x07a0
                L_0x0652:
                    r0 = move-exception
                    r5 = r6
                    r6 = r7
                    r4 = r10
                    r2 = r0
                    r9 = 0
                L_0x0658:
                    r11 = 0
                    r13 = 0
                L_0x065a:
                    r14 = 0
                L_0x065b:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ all -> 0x079e }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ all -> 0x079e }
                    android.widget.TextView r3 = r3.f580b     // Catch:{ all -> 0x079e }
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x079e }
                    r7.<init>()     // Catch:{ all -> 0x079e }
                    java.lang.String r8 = "Error : dbUpdateDiary 3 : "
                    r7.append(r8)     // Catch:{ all -> 0x079e }
                    java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x079e }
                    r7.append(r2)     // Catch:{ all -> 0x079e }
                    java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x079e }
                    r3.setText(r2)     // Catch:{ all -> 0x079e }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    r2.endTransaction()     // Catch:{ JSONException -> 0x0954 }
                    if (r11 == 0) goto L_0x068d
                    r11.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x068d:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0954 }
                    r2.q(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    if (r2 != 0) goto L_0x06b6
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    boolean r2 = r2.isOpen()     // Catch:{ JSONException -> 0x0954 }
                    if (r2 == 0) goto L_0x06ce
                L_0x06b6:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.R     // Catch:{ JSONException -> 0x0954 }
                    r2.close()     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r7 = 0
                    r2.R = r7     // Catch:{ JSONException -> 0x0954 }
                L_0x06ce:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r2.q(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    r2.endTransaction()     // Catch:{ JSONException -> 0x0954 }
                    if (r9 == 0) goto L_0x06eb
                    r9.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x06eb:
                    if (r13 == 0) goto L_0x06f0
                    r13.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x06f0:
                    if (r14 == 0) goto L_0x06f5
                    r14.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x06f5:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r2.o(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    if (r2 != 0) goto L_0x071c
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    boolean r2 = r2.isOpen()     // Catch:{ JSONException -> 0x0954 }
                    if (r2 == 0) goto L_0x0734
                L_0x071c:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r2 = r2.P     // Catch:{ JSONException -> 0x0954 }
                    r2.close()     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r7 = 0
                    r2.P = r7     // Catch:{ JSONException -> 0x0954 }
                L_0x0734:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    r2.o(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r2 = r2.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r2 = r2.d     // Catch:{ JSONException -> 0x0954 }
                    boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x0954 }
                    r3 = 1
                    if (r3 != r2) goto L_0x0772
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r3.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r4 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r4.f583a     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r5)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0954 }
                L_0x076e:
                    r2.setText(r3)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x0791
                L_0x0772:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r3.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r4 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r4.f583a     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r6)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x076e
                L_0x0791:
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    r3 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                    goto L_0x05fb
                L_0x079e:
                    r0 = move-exception
                L_0x079f:
                    r2 = r0
                L_0x07a0:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.R     // Catch:{ JSONException -> 0x0954 }
                    r3.endTransaction()     // Catch:{ JSONException -> 0x0954 }
                    if (r11 == 0) goto L_0x07b2
                    r11.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x07b2:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0954 }
                    r3.q(r7)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.R     // Catch:{ JSONException -> 0x0954 }
                    if (r3 != 0) goto L_0x07db
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.R     // Catch:{ JSONException -> 0x0954 }
                    boolean r3 = r3.isOpen()     // Catch:{ JSONException -> 0x0954 }
                    if (r3 == 0) goto L_0x07f3
                L_0x07db:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.R     // Catch:{ JSONException -> 0x0954 }
                    r3.close()     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    r8 = 0
                    r3.R = r8     // Catch:{ JSONException -> 0x0954 }
                L_0x07f3:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    r3.q(r7)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.P     // Catch:{ JSONException -> 0x0954 }
                    r3.endTransaction()     // Catch:{ JSONException -> 0x0954 }
                    if (r9 == 0) goto L_0x0810
                    r9.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x0810:
                    if (r13 == 0) goto L_0x0815
                    r13.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x0815:
                    if (r14 == 0) goto L_0x081a
                    r14.close()     // Catch:{ JSONException -> 0x0954 }
                L_0x081a:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    r3.o(r7)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.P     // Catch:{ JSONException -> 0x0954 }
                    if (r3 != 0) goto L_0x0841
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.P     // Catch:{ JSONException -> 0x0954 }
                    boolean r3 = r3.isOpen()     // Catch:{ JSONException -> 0x0954 }
                    if (r3 == 0) goto L_0x0859
                L_0x0841:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    org.sqlite.database.sqlite.SQLiteDatabase r3 = r3.P     // Catch:{ JSONException -> 0x0954 }
                    r3.close()     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    r8 = 0
                    r3.P = r8     // Catch:{ JSONException -> 0x0954 }
                L_0x0859:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    r3.o(r7)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.MyDB r3 = r3.f579a     // Catch:{ JSONException -> 0x0954 }
                    java.lang.Boolean r3 = r3.d     // Catch:{ JSONException -> 0x0954 }
                    boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x0954 }
                    r7 = 1
                    if (r7 != r3) goto L_0x0897
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r3 = r3.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r6.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r6.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r4 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r4.f583a     // Catch:{ JSONException -> 0x0954 }
                    r6.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    r6.append(r5)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r6.toString()     // Catch:{ JSONException -> 0x0954 }
                L_0x0893:
                    r3.setText(r4)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x08b6
                L_0x0897:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r3 = r3.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r5.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r5.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r4 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r4.f583a     // Catch:{ JSONException -> 0x0954 }
                    r5.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    r5.append(r6)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x0893
                L_0x08b6:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r3 = r3.f580b     // Catch:{ JSONException -> 0x0954 }
                    r4 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                    r3.setTextColor(r4)     // Catch:{ JSONException -> 0x0954 }
                    throw r2     // Catch:{ JSONException -> 0x0954 }
                L_0x08c5:
                    java.lang.String r3 = r2.getString(r5)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = "Error"
                    boolean r3 = r3.equals(r4)     // Catch:{ JSONException -> 0x0954 }
                    r4 = 1
                    if (r4 != r3) goto L_0x08fe
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r3 = r3.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r4.<init>()     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r5 = "Error: "
                    r4.append(r5)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r2 = r2.getString(r12)     // Catch:{ JSONException -> 0x0954 }
                    r4.append(r2)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r2 = r4.toString()     // Catch:{ JSONException -> 0x0954 }
                    r3.setText(r2)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                L_0x08fa:
                    r2.setTextColor(r9)     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x0959
                L_0x08fe:
                    com.repo.OnlineServerActivity$c r3 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r3 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r3 = r3.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r4.<init>()     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r5 = "Online Server Response is not documented: "
                    r4.append(r5)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r2 = r2.getString(r12)     // Catch:{ JSONException -> 0x0954 }
                    r4.append(r2)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r2 = r4.toString()     // Catch:{ JSONException -> 0x0954 }
                    r3.setText(r2)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x08fa
                L_0x0927:
                    r4 = r10
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0954 }
                    r3.<init>()     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r4 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = r4.f583a     // Catch:{ JSONException -> 0x0954 }
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r4 = ": ERROR 2.1: Harware status reply is malformed: !DataComplete"
                    r3.append(r4)     // Catch:{ JSONException -> 0x0954 }
                    java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0954 }
                    r2.setText(r3)     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity$c r2 = com.repo.OnlineServerActivity.c.this     // Catch:{ JSONException -> 0x0954 }
                    com.repo.OnlineServerActivity r2 = com.repo.OnlineServerActivity.this     // Catch:{ JSONException -> 0x0954 }
                    android.widget.TextView r2 = r2.f580b     // Catch:{ JSONException -> 0x0954 }
                    goto L_0x08fa
                L_0x0954:
                    r0 = move-exception
                    r2 = r0
                    r2.printStackTrace()
                L_0x0959:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.repo.OnlineServerActivity.c.a.a(org.json.JSONObject):void");
            }
        }

        class b implements p.a {
            b() {
            }

            public void a(u uVar) {
                uVar.printStackTrace();
            }
        }

        c(String str) {
            this.f583a = str;
        }

        /* renamed from: b */
        public void a(JSONObject jSONObject) {
            TextView c;
            TextView c2;
            String str;
            StringBuilder sb;
            Log.i("LOG_VOLLEY", "Post Data = " + jSONObject);
            try {
                OnlineServerActivity.this.f580b.setText("Server Online " + this.f583a + ": step 4");
                if (true != jSONObject.getString("EndData").equals("DataComplete")) {
                    OnlineServerActivity.this.f580b.setText("Server Online " + this.f583a + ": ERROR 3.1: Harware status reply is malformed: !DataComplete");
                    c = OnlineServerActivity.this.f580b;
                } else if (true == jSONObject.getString("ReplyType").equals("Challenge")) {
                    OnlineServerActivity.this.f579a.x = jSONObject.getString("BeginData");
                    Log.i("LOG_VOLLEY", "strChallengeNumber = " + OnlineServerActivity.this.f579a.x);
                    OnlineServerActivity.this.f579a.y = r.i(OnlineServerActivity.this.f579a.A + "-" + OnlineServerActivity.this.f579a.x).toUpperCase();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("strTestMd5 = ");
                    sb2.append(OnlineServerActivity.this.f579a.y);
                    Log.i("LOG_VOLLEY", sb2.toString());
                    if (true == OnlineServerActivity.this.f579a.d.booleanValue()) {
                        c2 = OnlineServerActivity.this.f580b;
                        str = "Server Online " + this.f583a + ": step 8 : downloading data... please wait";
                    } else {
                        c2 = OnlineServerActivity.this.f580b;
                        str = "Server Online " + this.f583a + ": step 8 : sedang download data... sila tunggu";
                    }
                    c2.setText(str);
                    if (true == this.f583a.equals("1")) {
                        sb = new StringBuilder();
                        sb.append(OnlineServerActivity.this.f579a.c);
                        sb.append("/app/repo/dataUpdate/");
                        sb.append(OnlineServerActivity.this.f579a.A);
                        sb.append("/");
                        sb.append(OnlineServerActivity.this.f579a.y);
                    } else {
                        sb = new StringBuilder();
                        sb.append(OnlineServerActivity.this.f579a.c);
                        sb.append("/app2/repo/dataUpdate/");
                        sb.append(OnlineServerActivity.this.f579a.A);
                        sb.append("/");
                        sb.append(OnlineServerActivity.this.f579a.y);
                    }
                    k kVar = new k(0, sb.toString(), (JSONObject) null, new a(), new b());
                    kVar.L(false);
                    kVar.J(new e(OnlineServerActivity.this.h, 1, 1.0f));
                    n.a(OnlineServerActivity.this).a(kVar);
                    return;
                } else if (true == jSONObject.getString("ReplyType").equals("Error")) {
                    OnlineServerActivity.this.f580b.setText("Error: " + jSONObject.getString("BeginData"));
                    c = OnlineServerActivity.this.f580b;
                } else if (true == jSONObject.getString("ReplyType").equals("Blocked")) {
                    String string = jSONObject.getString("BeginData");
                    if (string.indexOf("SYSTEM ERROR") >= 0) {
                        r.v(OnlineServerActivity.this, string, 1);
                        OnlineServerActivity.this.f580b.setText("SYSTEM ERROR");
                    } else {
                        OnlineServerActivity.this.f580b.setText("Blocked: " + jSONObject.getString("BeginData"));
                    }
                    c = OnlineServerActivity.this.f580b;
                } else {
                    OnlineServerActivity.this.f580b.setText("Online Server Response is not documented: " + jSONObject.getString("BeginData"));
                    c = OnlineServerActivity.this.f580b;
                }
                c.setTextColor(-65536);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    class d implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f587a;

        d(String str) {
            this.f587a = str;
        }

        public void a(u uVar) {
            TextView textView;
            StringBuilder sb;
            String str;
            uVar.printStackTrace();
            if (true == OnlineServerActivity.this.f579a.d.booleanValue()) {
                textView = OnlineServerActivity.this.f580b;
                sb = new StringBuilder();
                sb.append("Error: Server Online ");
                sb.append(this.f587a);
                str = " is down.";
            } else {
                textView = OnlineServerActivity.this.f580b;
                sb = new StringBuilder();
                sb.append("Error: Server Online ");
                sb.append(this.f587a);
                str = " sudah down.";
            }
            sb.append(str);
            textView.setText(sb.toString());
            OnlineServerActivity.this.f580b.setTextColor(-65536);
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        String str2;
        StringBuilder sb;
        this.f580b.setTextColor(Color.parseColor("#4DE1FF"));
        TextView textView = this.f580b;
        textView.setText("Server Online " + str + ": start");
        if (true == str.equals("1")) {
            sb = new StringBuilder();
            sb.append(this.f579a.c);
            str2 = "/app/repo/dataUpdate";
        } else {
            sb = new StringBuilder();
            sb.append(this.f579a.c);
            str2 = "/app2/repo/dataUpdate";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        this.f579a.D = this.f.getText().toString().trim();
        HashMap hashMap = new HashMap();
        hashMap.put("HardwareID", this.f579a.A);
        hashMap.put("Email", this.f579a.D);
        hashMap.put("OSVersion", "Android " + Build.VERSION.RELEASE);
        hashMap.put("DataVersion", this.f579a.g);
        hashMap.put("DataVersionUpdate", this.f579a.C);
        hashMap.put("DataVersionPatch", r.f(this.f579a.B));
        TextView textView2 = this.f580b;
        textView2.setText("Server Online " + str + ": step 1");
        k kVar = new k(1, sb2, new JSONObject(hashMap), new c(str), new d(str));
        kVar.J(new e(this.h, 1, 1.0f));
        n.a(this).a(kVar);
    }

    public void onCreate(Bundle bundle) {
        TextView textView;
        String str;
        TextView textView2;
        String str2;
        StringBuilder sb;
        String str3;
        super.onCreate(bundle);
        setContentView(R.layout.onlineserver);
        MyDB myDB = (MyDB) getApplicationContext();
        this.f579a = myDB;
        myDB.p(Boolean.FALSE);
        TextView textView3 = (TextView) findViewById(R.id.lblOnlineStatus);
        this.f580b = textView3;
        textView3.setText(".......");
        this.c = (Button) findViewById(R.id.btnOnlineServer1);
        this.d = (Button) findViewById(R.id.btnOnlineServer2);
        this.e = (TextView) findViewById(R.id.lblOnlineDataVersion);
        MyDB myDB2 = this.f579a;
        if (true == myDB2.g.equals(myDB2.h)) {
            MyDB myDB3 = this.f579a;
            myDB3.C = BuildConfig.FLAVOR;
            if (true == myDB3.B.equals("FACTORY")) {
                textView = this.e;
                str = this.f579a.g;
            } else {
                textView = this.e;
                str = this.f579a.g + "[patch " + this.f579a.B + "]";
            }
        } else {
            MyDB myDB4 = this.f579a;
            myDB4.C = myDB4.h;
            if (true == myDB4.B.equals("FACTORY")) {
                textView = this.e;
                sb = new StringBuilder();
                sb.append(this.f579a.g);
                sb.append("[update ");
                str3 = this.f579a.h;
            } else {
                textView = this.e;
                sb = new StringBuilder();
                sb.append(this.f579a.g);
                sb.append("[update ");
                sb.append(this.f579a.h);
                sb.append("][patch ");
                str3 = this.f579a.B;
            }
            sb.append(str3);
            sb.append("]");
            str = sb.toString();
        }
        textView.setText(str);
        EditText editText = (EditText) findViewById(R.id.txtOnlineEmail);
        this.f = editText;
        editText.setText(this.f579a.j("EML"));
        this.g = (TextView) findViewById(R.id.lblOnlineEmail);
        if (true == this.f579a.d.booleanValue()) {
            textView2 = this.g;
            str2 = "Put in your email [example abc@gmail.com] if you want to receive a notice when the latest Fresh RO daily update is given out. Make sure your HP has internet connection to download the Fresh RO.";
        } else {
            textView2 = this.g;
            str2 = "Masukkan email anda [contoh abc@gmail.com] jika anda ingin dapat notis bila keluar data update Fresh RO harian yang terbaru. Pastikan HP anda ada sambungan internet untuk download Fresh RO.";
        }
        textView2.setText(str2);
        this.c.setOnClickListener(new a());
        this.d.setOnClickListener(new b());
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            this.f579a.D = this.f.getText().toString().trim();
            MyDB myDB = this.f579a;
            myDB.t("EML", myDB.D);
        } catch (Exception e2) {
            Log.e("onDestroy", "Could not save setting to diary. Error:" + e2.getMessage());
        }
    }
}
