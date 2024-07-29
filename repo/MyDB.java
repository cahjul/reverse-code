package com.repo;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.sqlite.database.BuildConfig;
import org.sqlite.database.sqlite.SQLiteDatabase;
import org.sqlite.database.sqlite.SQLiteException;

public class MyDB extends Application {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public Boolean I;
    public Integer J;
    public Boolean K;
    public Boolean L;
    public String M;
    public Double N;
    public Double O;
    public SQLiteDatabase P;
    public SQLiteDatabase Q;
    public SQLiteDatabase R;
    public t S;
    public t T;
    public t U;
    public t V;

    /* renamed from: a  reason: collision with root package name */
    private Context f577a = null;

    /* renamed from: b  reason: collision with root package name */
    private SimpleDateFormat f578b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public String c = "http://repopro.me";
    public Boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public MyDB() {
        Boolean bool = Boolean.TRUE;
        this.d = bool;
        this.e = BuildConfig.FLAVOR;
        this.f = BuildConfig.FLAVOR;
        this.g = BuildConfig.FLAVOR;
        this.h = BuildConfig.FLAVOR;
        this.i = BuildConfig.FLAVOR;
        this.j = BuildConfig.FLAVOR;
        this.k = BuildConfig.FLAVOR;
        this.l = BuildConfig.FLAVOR;
        this.m = BuildConfig.FLAVOR;
        this.n = BuildConfig.FLAVOR;
        this.o = BuildConfig.FLAVOR;
        this.p = BuildConfig.FLAVOR;
        this.q = BuildConfig.FLAVOR;
        this.r = BuildConfig.FLAVOR;
        this.s = BuildConfig.FLAVOR;
        this.t = BuildConfig.FLAVOR;
        this.u = BuildConfig.FLAVOR;
        this.v = BuildConfig.FLAVOR;
        this.w = BuildConfig.FLAVOR;
        this.x = BuildConfig.FLAVOR;
        this.y = BuildConfig.FLAVOR;
        this.z = BuildConfig.FLAVOR;
        this.A = BuildConfig.FLAVOR;
        this.B = BuildConfig.FLAVOR;
        this.C = BuildConfig.FLAVOR;
        this.D = BuildConfig.FLAVOR;
        this.E = BuildConfig.FLAVOR;
        this.F = BuildConfig.FLAVOR;
        this.G = BuildConfig.FLAVOR;
        this.H = BuildConfig.FLAVOR;
        this.I = bool;
        this.J = 1;
        this.K = bool;
        this.L = Boolean.FALSE;
        this.M = BuildConfig.FLAVOR;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
    }

    public Boolean a() {
        boolean z2 = false;
        Integer num = 0;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C7", "NULL");
            num = Integer.valueOf(this.R.update("VLS", contentValues, "C7 <> 'NULL' AND C7 <= DATE('NOW')", (String[]) null));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not cancel all followup in the VLS-LR table. Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public Boolean b(String str) {
        boolean z2 = false;
        Integer num = 0;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C7", "NULL");
            num = Integer.valueOf(this.R.update("VLS", contentValues, "C1 = ?", new String[]{this.U.h(str)}));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not cancel followup in the VLS-LR table. For PlateNo=" + str + ". Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public void c() {
        try {
            SQLiteDatabase sQLiteDatabase = this.P;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.P.close();
                this.P = null;
            }
            SQLiteDatabase sQLiteDatabase2 = this.Q;
            if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                this.Q.close();
                this.Q = null;
            }
            SQLiteDatabase sQLiteDatabase3 = this.R;
            if (sQLiteDatabase3 != null && sQLiteDatabase3.isOpen()) {
                this.R.close();
                this.R = null;
            }
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not close all the database. Error:" + e2.getMessage());
        }
    }

    public Boolean d(String str) {
        boolean z2 = false;
        Integer num = 0;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C1", BuildConfig.FLAVOR);
            contentValues.put("C2", "0");
            contentValues.put("C3", BuildConfig.FLAVOR);
            contentValues.put("C4", BuildConfig.FLAVOR);
            contentValues.put("C5", BuildConfig.FLAVOR);
            contentValues.put("C6", BuildConfig.FLAVOR);
            contentValues.put("C7", BuildConfig.FLAVOR);
            contentValues.put("C8", BuildConfig.FLAVOR);
            contentValues.put("C9", BuildConfig.FLAVOR);
            contentValues.put("C10", BuildConfig.FLAVOR);
            contentValues.put("C11", BuildConfig.FLAVOR);
            num = Integer.valueOf(this.Q.update("VLS", contentValues, "rowid = ?", new String[]{str}));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not delete the VLS-D table. For RowID=" + str + ". Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public Boolean e(String str) {
        boolean z2 = false;
        Integer num = 0;
        try {
            num = Integer.valueOf(this.R.delete("VLS", "C1 = ?", new String[]{this.U.h(str)}));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not delete the VLS-LR table. For PlateNo=" + str + ". Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public Boolean f() {
        boolean z2 = false;
        Integer num = 0;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C1", BuildConfig.FLAVOR);
            contentValues.put("C2", "0");
            contentValues.put("C3", BuildConfig.FLAVOR);
            contentValues.put("C4", BuildConfig.FLAVOR);
            contentValues.put("C5", BuildConfig.FLAVOR);
            contentValues.put("C6", BuildConfig.FLAVOR);
            contentValues.put("C7", BuildConfig.FLAVOR);
            contentValues.put("C8", BuildConfig.FLAVOR);
            contentValues.put("C9", BuildConfig.FLAVOR);
            contentValues.put("C10", BuildConfig.FLAVOR);
            contentValues.put("C11", BuildConfig.FLAVOR);
            num = Integer.valueOf(this.Q.update("VLS", contentValues, "rowid = (SELECT rowid FROM VLS ORDER BY rowid DESC LIMIT 1)", (String[]) null));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not delete the VLS-D table for the latest PlateNo. Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public Boolean g() {
        Boolean bool = Boolean.FALSE;
        try {
            Cursor rawQuery = this.R.rawQuery("SELECT COUNT(*) FROM VLS WHERE C7 <> 'NULL' AND C7 <= DATE('NOW')", (String[]) null);
            if (rawQuery != null && rawQuery.getCount() > 0 && rawQuery.moveToFirst() && rawQuery.getInt(0) > 0) {
                bool = Boolean.TRUE;
            }
            if (rawQuery != null && !rawQuery.isClosed()) {
                rawQuery.close();
            }
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not get the followup due from the VLS-LR table. Error:" + e2.getMessage());
        }
        return bool;
    }

    public String h(String str) {
        String str2;
        try {
            SQLiteDatabase sQLiteDatabase = this.P;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM PRD WHERE C1 = '" + str + "'", (String[]) null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                try {
                    str2 = this.S.g(rawQuery.getString(rawQuery.getColumnIndex("C2")));
                } catch (IOException e2) {
                    Log.e("GetDataSetting", "Error : GetDataSetting : " + e2.getMessage());
                }
                if (rawQuery != null && !rawQuery.isClosed()) {
                    rawQuery.close();
                }
                return str2;
            }
            str2 = BuildConfig.FLAVOR;
            rawQuery.close();
            return str2;
        } catch (SQLiteException e3) {
            Context context = this.f577a;
            r.t(context, "Could not read the PRD table. SettingType=" + str + ". Error:" + e3.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public String i(String str) {
        String str2 = BuildConfig.FLAVOR;
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(str, (SQLiteDatabase.CursorFactory) null, 16);
            Cursor rawQuery = openDatabase.rawQuery("SELECT C2 FROM PRS WHERE C1 = 'D'", (String[]) null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                try {
                    str2 = this.U.g(rawQuery.getString(rawQuery.getColumnIndex("C2")));
                } catch (IOException e2) {
                    Log.e("GetDiaryPswdGvnFilePath", "Error : GetDiaryPswdGvnFilePath : " + e2.getMessage());
                }
            }
            if (rawQuery != null && !rawQuery.isClosed()) {
                rawQuery.close();
            }
            if (openDatabase.isOpen()) {
                openDatabase.close();
            }
        } catch (SQLiteException e3) {
            Context context = this.f577a;
            r.t(context, "Could not open the " + str + " database. Error:" + e3.getMessage());
        }
        return str2;
    }

    public String j(String str) {
        String str2;
        try {
            SQLiteDatabase sQLiteDatabase = this.Q;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM PRS WHERE C1 = '" + str + "'", (String[]) null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                try {
                    if (!str.equals("EML")) {
                        if (!str.equals("SU") && !str.equals("FH1") && !str.equals("FH2") && !str.equals("FH3") && !str.equals("LOC") && !str.equals("D")) {
                            if (!str.equals("PSS")) {
                                str2 = rawQuery.getString(rawQuery.getColumnIndex("C2"));
                                if (rawQuery != null && !rawQuery.isClosed()) {
                                    rawQuery.close();
                                }
                                return str2;
                            }
                        }
                    }
                    str2 = this.U.g(rawQuery.getString(rawQuery.getColumnIndex("C2")));
                } catch (IOException e2) {
                    Log.e("GetDiarySetting", "Error : GetDiarySetting : " + e2.getMessage());
                }
                rawQuery.close();
                return str2;
            }
            str2 = BuildConfig.FLAVOR;
            rawQuery.close();
            return str2;
        } catch (SQLiteException e3) {
            Context context = this.f577a;
            r.t(context, "Could not read the PRS-D table. SettingType=" + str + ". Error:" + e3.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public String k(String str) {
        String str2;
        try {
            SQLiteDatabase sQLiteDatabase = this.R;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM PRS WHERE C1 = '" + str + "'", (String[]) null);
            if (rawQuery != null && rawQuery.moveToFirst()) {
                try {
                    str2 = str.equals("D") ? this.U.g(rawQuery.getString(rawQuery.getColumnIndex("C2"))) : rawQuery.getString(rawQuery.getColumnIndex("C2"));
                } catch (IOException e2) {
                    Log.e("GetLastRemarkSetting", "Error : GetLastRemarkSetting : " + e2.getMessage());
                }
                if (rawQuery != null && !rawQuery.isClosed()) {
                    rawQuery.close();
                }
                return str2;
            }
            str2 = BuildConfig.FLAVOR;
            rawQuery.close();
            return str2;
        } catch (SQLiteException e3) {
            Context context = this.f577a;
            r.t(context, "Could not read the PRS-LR table. SettingType=" + str + ". Error:" + e3.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public void l() {
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        for (int i2 = 0; i2 < 5; i2++) {
            str2 = str2 + "UQIb07407esys41418210250257297123423".charAt(12 - (i2 * 3));
        }
        String str3 = "M28sXBTXBo35a35RZSdZSvrwdrwEckckbiwu";
        for (int i3 = 0; i3 < 5; i3++) {
            str3 = str3 + "B11RTHXTHdETNETwxddgeoepyvoamxzlixon".charAt(12 - (i3 * 3));
        }
        for (int i4 = 0; i4 < 9; i4++) {
            str2 = str2 + "x34pBPEBPNsuxDHoDH7vlevlt56563091182".charAt(24 - (i4 * 3));
        }
        for (int i5 = 0; i5 < 9; i5++) {
            str3 = str3 + "418l18243cFOnFOh50G50Ahgyhg944812458".charAt(24 - (i5 * 3));
        }
        for (int i6 = 0; i6 < 10; i6++) {
            str2 = str2 + "932XBKPBKK48T48qECHvh9vh3gtKgt882579".charAt(i6 * 3);
        }
        for (int i7 = 0; i7 < 10; i7++) {
            str3 = str3 + "buz952x52T86I86APVFPVgibFibcSNSNAGYX".charAt(i7 * 3);
        }
        String str4 = str;
        for (int i8 = 0; i8 < 5; i8++) {
            str4 = str4 + "755LHTQ62K62oKKKKNSFYMSVARJVDOUXKQYJ".charAt(12 - (i8 * 3));
        }
        String str5 = "nMTcMTT82E82fokxYXPYXirc9rc325901381";
        for (int i9 = 0; i9 < 5; i9++) {
            str5 = str5 + "wJCQch9MTQMT8eyeyumpcnbhumsrszboprvi".charAt(12 - (i9 * 3));
        }
        for (int i10 = 0; i10 < 9; i10++) {
            str4 = str4 + "W53MavjSBESBI15f15vUSjUS0mwmwwnbbjcc".charAt(24 - (i10 * 3));
        }
        for (int i11 = 0; i11 < 9; i11++) {
            str5 = str5 + "YKXW73w73qmox27127gpgNpgj34342241345".charAt(24 - (i11 * 3));
        }
        for (int i12 = 0; i12 < 10; i12++) {
            str4 = str4 + "QimH06r06EleU13Y13JUN2UN8FAfFAxfvcwx".charAt(i12 * 3);
        }
        for (int i13 = 0; i13 < 10; i13++) {
            str5 = str5 + "5UFQUFbnjrXWKXWEpbnpbmpbY32b32661739".charAt(i13 * 3);
        }
        String str6 = str;
        for (int i14 = 0; i14 < 5; i14++) {
            str6 = str6 + "GsgsrdVdt7".charAt(8 - (i14 * 2));
        }
        String str7 = "5MXSedyedBOP5OPgufefblmwgoxxrhwqivra";
        for (int i15 = 0; i15 < 5; i15++) {
            str7 = str7 + "iccdMOletxetboglogx24424lYP318273349".charAt(12 - (i15 * 3));
        }
        for (int i16 = 0; i16 < 9; i16++) {
            str6 = str6 + "VLPG4duq3791B7914fmg3866LPVCgPVCrAIH".charAt(32 - (i16 * 4));
        }
        for (int i17 = 0; i17 < 9; i17++) {
            str7 = str7 + "xMK6WW0WW1WW9pb0pb1320rsSrsHrsJXOYMM".charAt(24 - (i17 * 3));
        }
        for (int i18 = 0; i18 < 10; i18++) {
            str6 = str6 + "4gh7gh1XL4XLnXLP39B39TBDPBDBLP".charAt(27 - (i18 * 3));
        }
        for (int i19 = 0; i19 < 10; i19++) {
            str7 = str7 + "z15d15moavoaV22v22Fxj7xjcIWJIWcdtgAW".charAt(i19 * 3);
        }
        for (int i20 = 0; i20 < 5; i20++) {
            str = str + "R5m6wTB1dH".charAt(8 - (i20 * 2));
        }
        String str8 = "f73I73MNNENNI80808548541151641561416";
        for (int i21 = 0; i21 < 5; i21++) {
            str8 = str8 + "wnfbnfCxrF68x68CbjFbjl75o75lspbsuxei".charAt(12 - (i21 * 3));
        }
        for (int i22 = 0; i22 < 9; i22++) {
            str = str + "vkcrWwddj143x547nTVBLGVMclfsTxge3154".charAt(32 - (i22 * 4));
        }
        for (int i23 = 0; i23 < 9; i23++) {
            str8 = str8 + "gHIlynwyngjzxjzP02L024TJ9TJ818VBOPPR".charAt(24 - (i23 * 3));
        }
        for (int i24 = 0; i24 < 10; i24++) {
            str = str + "wCYn87E39CEU486jsn053sifiDClwx".charAt(27 - (i24 * 3));
        }
        for (int i25 = 0; i25 < 10; i25++) {
            str8 = str8 + "x74474GeyGey781813675932312731124146".charAt(i25 * 3);
        }
        "SrUr949dmURMs4141K48T48qECHvlt56Utd8" + "v0Wv";
        this.T = new t(str2);
        this.S = new t(str4);
        this.U = new t(str);
        this.V = new t(str6);
        this.f577a = getApplicationContext();
        System.loadLibrary("sqliteX");
    }

    public Boolean m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str2;
        Long l2 = 0L;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C1", this.f578b.format(new Date()));
            String str12 = str;
            contentValues.put("C2", str);
            contentValues.put("C3", this.U.h(str2));
            String str13 = str3;
            contentValues.put("C4", this.U.h(str3));
            String str14 = str4;
            contentValues.put("C5", this.U.h(str4));
            String str15 = str5;
            contentValues.put("C6", str5);
            String str16 = str6;
            contentValues.put("C7", this.U.h(str6));
            contentValues.put("C8", str7);
            contentValues.put("C9", str8);
            contentValues.put("C10", str9);
            contentValues.put("C11", str10);
            l2 = Long.valueOf(this.Q.insert("VLS", (String) null, contentValues));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not insert into the VLS-D table. For PlateNo=" + str2 + ". Error:" + e2.getMessage());
        }
        return Boolean.valueOf(l2.longValue() > 0);
    }

    public Boolean n(String str, String str2, String str3, String str4, String str5, String str6) {
        Long l2 = 0L;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C1", this.U.h(str));
            contentValues.put("C2", this.U.h(str2));
            contentValues.put("C3", this.U.h(str3));
            contentValues.put("C4", this.U.h(str4));
            contentValues.put("C5", this.U.h(str5));
            contentValues.put("C6", this.f578b.format(new Date()));
            contentValues.put("C7", str6);
            l2 = Long.valueOf(this.R.insert("VLS", (String) null, contentValues));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not insert into the VLS-LR table. For PlateNo=" + str + ". Error:" + e2.getMessage());
        }
        return Boolean.valueOf(l2.longValue() > 0);
    }

    public SQLiteDatabase o(Boolean bool) {
        try {
            SQLiteDatabase sQLiteDatabase = this.P;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return this.P;
            }
            this.P = SQLiteDatabase.openDatabase(r.g("RepoProData.db"), (SQLiteDatabase.CursorFactory) null, 16);
            return this.P;
        } catch (SQLiteException e2) {
            if (!bool.booleanValue()) {
                Context context = this.f577a;
                r.t(context, "Could not open the RepoProData.db database. Error:" + e2.getMessage());
            }
        }
    }

    public SQLiteDatabase p(Boolean bool) {
        try {
            SQLiteDatabase sQLiteDatabase = this.Q;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return this.Q;
            }
            this.Q = SQLiteDatabase.openDatabase(this.E, (SQLiteDatabase.CursorFactory) null, 16);
            return this.Q;
        } catch (SQLiteException e2) {
            if (!bool.booleanValue()) {
                Context context = this.f577a;
                r.t(context, "Could not open the RepoProDiary.db database. Error:" + e2.getMessage());
            }
        }
    }

    public SQLiteDatabase q(Boolean bool) {
        try {
            SQLiteDatabase sQLiteDatabase = this.R;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return this.R;
            }
            this.R = SQLiteDatabase.openDatabase(r.g("LastRemark.db"), (SQLiteDatabase.CursorFactory) null, 16);
            return this.R;
        } catch (SQLiteException e2) {
            if (!bool.booleanValue()) {
                Context context = this.f577a;
                r.t(context, "Could not open the LastRemark.db database. Error:" + e2.getMessage());
            }
        }
    }

    public Boolean r(String str) {
        Boolean bool = Boolean.FALSE;
        try {
            SQLiteDatabase sQLiteDatabase = this.R;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM VLS WHERE C1 = '" + this.U.h(str) + "'", (String[]) null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                bool = Boolean.TRUE;
            }
            if (rawQuery != null && !rawQuery.isClosed()) {
                rawQuery.close();
            }
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not read the VLS-LR table. For PlateNo=" + str + ". Error:" + e2.getMessage());
        }
        return bool;
    }

    public Boolean s(String str, String str2) {
        boolean z2 = false;
        Integer num = 0;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C2", this.S.h(str2));
            SQLiteDatabase sQLiteDatabase = this.P;
            num = Integer.valueOf(sQLiteDatabase.update("PRD", contentValues, "C1 = '" + str + "'", (String[]) null));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not set the PRD table. SettingType=" + str + ". Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean t(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "EML"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r4 = "C2"
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "SU"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "FH1"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "FH2"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "FH3"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "LOC"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "D"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "PSS"
            boolean r3 = r7.equals(r3)     // Catch:{ SQLiteException -> 0x007c }
            if (r3 == 0) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            r2.put(r4, r8)     // Catch:{ SQLiteException -> 0x007c }
            goto L_0x0058
        L_0x0051:
            com.repo.t r3 = r6.U     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r8 = r3.h(r8)     // Catch:{ SQLiteException -> 0x007c }
            goto L_0x004d
        L_0x0058:
            org.sqlite.database.sqlite.SQLiteDatabase r8 = r6.Q     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r3 = "PRS"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x007c }
            r4.<init>()     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r5 = "C1 = '"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x007c }
            r4.append(r7)     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r5 = "'"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x007c }
            r5 = 0
            int r8 = r8.update(r3, r2, r4, r5)     // Catch:{ SQLiteException -> 0x007c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ SQLiteException -> 0x007c }
            goto L_0x009f
        L_0x007c:
            r8 = move-exception
            android.content.Context r2 = r6.f577a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not set the PRS-D table. SettingType="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ". Error:"
            r3.append(r7)
            java.lang.String r7 = r8.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.repo.r.t(r2, r7)
        L_0x009f:
            int r7 = r1.intValue()
            if (r7 <= 0) goto L_0x00a6
            r0 = 1
        L_0x00a6:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.repo.MyDB.t(java.lang.String, java.lang.String):java.lang.Boolean");
    }

    public Boolean u(String str, String str2) {
        boolean z2 = false;
        Integer num = 0;
        ContentValues contentValues = new ContentValues();
        try {
            if (str.equals("D")) {
                str2 = this.U.h(str2);
            }
            contentValues.put("C2", str2);
            SQLiteDatabase sQLiteDatabase = this.R;
            num = Integer.valueOf(sQLiteDatabase.update("PRS", contentValues, "C1 = '" + str + "'", (String[]) null));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not set the PRS-LR table. SettingType=" + str + ". Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public Boolean v(String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z2 = false;
        Integer num = 0;
        ContentValues contentValues = new ContentValues();
        try {
            contentValues.put("C2", this.U.h(str2));
            contentValues.put("C3", this.U.h(str3));
            contentValues.put("C4", this.U.h(str4));
            contentValues.put("C5", this.U.h(str5));
            contentValues.put("C6", this.f578b.format(new Date()));
            contentValues.put("C7", str6);
            num = Integer.valueOf(this.R.update("VLS", contentValues, "C1 = ?", new String[]{this.U.h(str)}));
        } catch (SQLiteException e2) {
            Context context = this.f577a;
            r.t(context, "Could not update the VLS-LR table. For PlateNo=" + str + ". Error:" + e2.getMessage());
        }
        if (num.intValue() > 0) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
