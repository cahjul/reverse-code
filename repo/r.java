package com.repo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.sqlite.database.BuildConfig;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Boolean f760a = Boolean.FALSE;

    /* renamed from: b  reason: collision with root package name */
    public static final e f761b = e.REPOPRO_UI;
    public static d c = d.SIZE_480_800;
    public static c d = null;
    private static long e = 0;
    private static long f = 0;
    private static char[] g = new char[32];
    private static char[] h = new char[2];
    private static int i;
    private static boolean j = false;

    static class a implements DialogInterface.OnClickListener {
        a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static class b implements DialogInterface.OnClickListener {
        b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public enum c {
        IMEI,
        ANDROID_ID,
        GENERATED_ID,
        ANDROID_ID_COMBO
    }

    public enum d {
        SIZE_480_800,
        SIZE_600_800,
        SIZE_600_1024
    }

    public enum e {
        REPOPRO_UI,
        CARFINDER_UI,
        REPOMASTER_UI,
        REPODATABASE_UI,
        REPOMOTOR_UI
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        int length = str.length();
        int i2 = 65535;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = bytes[i3] & 255;
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = (i4 ^ i2) % 2;
                i2 >>= 1;
                i4 >>= 1;
                if (i6 == 1) {
                    i2 ^= 40961;
                }
            }
        }
        String hexString = Integer.toHexString(i2 ^ -1);
        return hexString.substring(hexString.length() - 2, hexString.length()) + hexString.substring(hexString.length() - 4, hexString.length() - 2);
    }

    public static String b(String str) {
        int[] iArr = {0, 1996959894, -301047508, -1727442502, 124634137, 1886057615, -379345611, -1637575261, 249268274, 2044508324, -522852066, -1747789432, 162941995, 2125561021, -407360249, -1866523247, 498536548, 1789927666, -205950648, -2067906082, 450548861, 1843258603, -187386543, -2083289657, 325883990, 1684777152, -43845254, -1973040660, 335633487, 1661365465, -99664541, -1928851979, 997073096, 1281953886, -715111964, -1570279054, 1006888145, 1258607687, -770865667, -1526024853, 901097722, 1119000684, -608450090, -1396901568, 853044451, 1172266101, -589951537, -1412350631, 651767980, 1373503546, -925412992, -1076862698, 565507253, 1454621731, -809855591, -1195530993, 671266974, 1594198024, -972236366, -1324619484, 795835527, 1483230225, -1050600021, -1234817731, 1994146192, 31158534, -1731059524, -271249366, 1907459465, 112637215, -1614814043, -390540237, 2013776290, 251722036, -1777751922, -519137256, 2137656763, 141376813, -1855689577, -429695999, 1802195444, 476864866, -2056965928, -228458418, 1812370925, 453092731, -2113342271, -183516073, 1706088902, 314042704, -1950435094, -54949764, 1658658271, 366619977, -1932296973, -69972891, 1303535960, 984961486, -1547960204, -725929758, 1256170817, 1037604311, -1529756563, -740887301, 1131014506, 879679996, -1385723834, -631195440, 1141124467, 855842277, -1442165665, -586318647, 1342533948, 654459306, -1106571248, -921952122, 1466479909, 544179635, -1184443383, -832445281, 1591671054, 702138776, -1328506846, -942167884, 1504918807, 783551873, -1212326853, -1061524307, -306674912, -1698712650, 62317068, 1957810842, -355121351, -1647151185, 81470997, 1943803523, -480048366, -1805370492, 225274430, 2053790376, -468791541, -1828061283, 167816743, 2097651377, -267414716, -2029476910, 503444072, 1762050814, -144550051, -2140837941, 426522225, 1852507879, -19653770, -1982649376, 282753626, 1742555852, -105259153, -1900089351, 397917763, 1622183637, -690576408, -1580100738, 953729732, 1340076626, -776247311, -1497606297, 1068828381, 1219638859, -670225446, -1358292148, 906185462, 1090812512, -547295293, -1469587627, 829329135, 1181335161, -882789492, -1134132454, 628085408, 1382605366, -871598187, -1156888829, 570562233, 1426400815, -977650754, -1296233688, 733239954, 1555261956, -1026031705, -1244606671, 752459403, 1541320221, -1687895376, -328994266, 1969922972, 40735498, -1677130071, -351390145, 1913087877, 83908371, -1782625662, -491226604, 2075208622, 213261112, -1831694693, -438977011, 2094854071, 198958881, -2032938284, -237706686, 1759359992, 534414190, -2118248755, -155638181, 1873836001, 414664567, -2012718362, -15766928, 1711684554, 285281116, -1889165569, -127750551, 1634467795, 376229701, -1609899400, -686959890, 1308918612, 956543938, -1486412191, -799009033, 1231636301, 1047427035, -1362007478, -640263460, 1088359270, 936918000, -1447252397, -558129467, 1202900863, 817233897, -1111625188, -893730166, 1404277552, 615818150, -1160759803, -841546093, 1423857449, 601450431, -1285129682, -1000256840, 1567103746, 711928724, -1274298825, -1022587231, 1510334235, 755167117};
        byte b2 = -1;
        for (byte b3 : str.getBytes()) {
            b2 = iArr[(b2 ^ b3) & 255] ^ (b2 >>> 8);
        }
        return String.format("%08X", new Object[]{Integer.valueOf(b2 ^ -1)});
    }

    public static String c(String str) {
        return (str != null && !str.equals(BuildConfig.FLAVOR) && str.length() >= 5) ? str.substring(2, str.length() - 2) : BuildConfig.FLAVOR;
    }

    public static String d(double d2) {
        return Double.toString(Double.valueOf(Double.parseDouble(new DecimalFormat("0.000").format(d2))).doubleValue());
    }

    public static boolean e(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        int parseInt = Integer.parseInt(str3.substring(0, 4));
        int parseInt2 = Integer.parseInt(str3.substring(5, 7));
        int parseInt3 = Integer.parseInt(str3.substring(8, 10));
        int parseInt4 = Integer.parseInt(str3.substring(11, 13));
        int parseInt5 = Integer.parseInt(str3.substring(14, 16));
        int parseInt6 = Integer.parseInt(str3.substring(17, 19));
        int parseInt7 = Integer.parseInt(str4.substring(0, 4));
        int parseInt8 = Integer.parseInt(str4.substring(5, 7));
        int parseInt9 = Integer.parseInt(str4.substring(8, 10));
        int parseInt10 = Integer.parseInt(str4.substring(11, 13));
        int parseInt11 = Integer.parseInt(str4.substring(14, 16));
        int parseInt12 = Integer.parseInt(str4.substring(17, 19));
        if (parseInt > parseInt7) {
            return true;
        }
        if (parseInt == parseInt7) {
            if (parseInt2 > parseInt8) {
                return true;
            }
            if (parseInt2 == parseInt8) {
                if (parseInt3 > parseInt9) {
                    return true;
                }
                if (parseInt3 == parseInt9) {
                    if (parseInt4 > parseInt10) {
                        return true;
                    }
                    if (parseInt4 == parseInt10) {
                        if (parseInt5 > parseInt11) {
                            return true;
                        }
                        return parseInt5 == parseInt11 && (parseInt6 > parseInt12 || parseInt6 == parseInt12);
                    }
                }
            }
        }
    }

    public static String f(String str) {
        StringBuilder sb;
        String str2;
        if (8 == str.length()) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = ".000";
        } else if (9 == str.length()) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "000";
        } else if (10 == str.length()) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "00";
        } else if (11 != str.length()) {
            return str;
        } else {
            sb = new StringBuilder();
            sb.append(str);
            str2 = "0";
        }
        sb.append(str2);
        return sb.toString();
    }

    @SuppressLint({"SdCardPath", "SdCardPath", "SdCardPath", "SdCardPath", "SdCardPath", "SdCardPath", "SdCardPath", "SdCardPath", "SdCardPath", "SdCardPath"})
    public static String g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        String sb2 = sb.toString();
        if (new File(sb2).isFile()) {
            return sb2;
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (new File(absolutePath + str2 + str).isFile()) {
            return absolutePath + str2 + str;
        }
        if (new File(absolutePath + str2 + "Download" + str2 + str).isFile()) {
            return absolutePath + str2 + "Download" + str2 + str;
        }
        if (new File(absolutePath + str2 + "sd" + str2 + str).isFile()) {
            return absolutePath + str2 + "sd" + str2 + str;
        }
        if (new File(absolutePath + str2 + "external_sd" + str2 + str).isFile()) {
            return absolutePath + str2 + "external_sd" + str2 + str;
        }
        if (new File(absolutePath + str2 + "_ExternalSD" + str2 + str).isFile()) {
            return absolutePath + str2 + "_ExternalSD" + str2 + str;
        }
        if (new File("/mnt/sdcard/sd/" + str).isFile()) {
            return "/mnt/sdcard/sd/" + str;
        }
        if (new File("/mnt/sdcard/external_sd/" + str).isFile()) {
            return "/mnt/sdcard/external_sd/" + str;
        }
        if (new File("/mnt/sdcard/_ExternalSD/" + str).isFile()) {
            return "/mnt/sdcard/_ExternalSD/" + str;
        }
        if (new File("/mnt/sdcard/" + str).isFile()) {
            return "/mnt/sdcard/" + str;
        }
        if (new File("/sdcard/_ExternalSD/" + str).isFile()) {
            return "/sdcard/_ExternalSD/" + str;
        }
        if (new File("/sdcard/external_sd/" + str).isFile()) {
            return "/sdcard/external_sd/" + str;
        }
        if (new File("/sdcard/sd/" + str).isFile()) {
            return "/sdcard/sd/" + str;
        }
        if (new File("/sdcard/" + str).isFile()) {
            return "/sdcard/" + str;
        }
        if (new File("/sdcard/download/" + str).isFile()) {
            return "/sdcard/download/" + str;
        }
        if (new File(absolutePath + str2 + "download" + str2 + str).isFile()) {
            return absolutePath + str2 + "download" + str2 + str;
        }
        if (new File(absolutePath + str2 + "sd/download" + str2 + str).isFile()) {
            return absolutePath + str2 + "sd/download" + str2 + str;
        }
        if (new File(absolutePath + str2 + "external_sd/download" + str2 + str).isFile()) {
            return absolutePath + str2 + "external_sd/download" + str2 + str;
        }
        if (new File(absolutePath + str2 + "_ExternalSD/download" + str2 + str).isFile()) {
            return absolutePath + str2 + "_ExternalSD/download" + str2 + str;
        }
        return "Error: " + str + " file NOT FOUND!!!\nRoot SDcard directory: " + absolutePath;
    }

    public static String h(String str, String str2, String str3) {
        String str4 = str.replace(str2, BuildConfig.FLAVOR) + str3;
        if (new File(str4).isFile()) {
            return str4;
        }
        return "Error: " + str4 + " file NOT FOUND!!!";
    }

    public static final String i(String str) {
        char[] cArr;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(q(str));
            byte[] digest = instance.digest();
            for (int i2 = 0; i2 < 16; i2++) {
                i = digest[i2] & 255;
                int i3 = 2;
                do {
                    int i4 = i;
                    int i5 = i4 & 15;
                    int i6 = i5 > 9 ? (i5 - 10) + 97 : i5 + 48;
                    cArr = h;
                    i3--;
                    cArr[i3] = (char) i6;
                    i = i4 >>> 4;
                } while (i3 > 0);
                char[] cArr2 = g;
                int i7 = i2 * 2;
                cArr2[i7] = cArr[0];
                cArr2[i7 + 1] = cArr[1];
            }
            return new String(g);
        } catch (NoSuchAlgorithmException e2) {
            Log.e("MDEncode", "Error : MDEncode : " + e2.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public static Boolean j(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            randomAccessFile.seek(0);
            byte[] bArr = new byte[30];
            randomAccessFile.read(bArr);
            if (2 == bArr[18] && 2 == bArr[19]) {
                randomAccessFile.seek(18);
                randomAccessFile.writeByte(1);
                randomAccessFile.writeByte(1);
            }
            randomAccessFile.seek(0);
            byte[] bArr2 = new byte[1500];
            randomAccessFile.read(bArr2);
            String str2 = new String(bArr2);
            if (true == str2.startsWith("REPO")) {
                randomAccessFile.seek(0);
                randomAccessFile.writeBytes("SQLite format 3");
                int i2 = 9;
                while (true) {
                    i2 = str2.indexOf("REPOdb", i2 + 6);
                    if (i2 < 0) {
                        break;
                    }
                    randomAccessFile.seek(0);
                    randomAccessFile.seek((long) i2);
                    randomAccessFile.writeBytes("sqlite");
                }
            }
            randomAccessFile.close();
            return Boolean.TRUE;
        } catch (IOException e2) {
            Log.e("MakeDataFileAndroidComp", "Error:" + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    public static int k(int i2) {
        if (i2 > 0) {
            return i2 + 1;
        }
        return 0;
    }

    public static String l(String str) {
        return true == s(str) ? BuildConfig.FLAVOR : (4 == str.length() && true == str.toUpperCase().equals("NULL")) ? BuildConfig.FLAVOR : str;
    }

    public static String m(String str) {
        try {
            if (str.length() > 0) {
                return "|" + str;
            }
        } catch (Exception unused) {
        }
        return BuildConfig.FLAVOR;
    }

    public static String n(String str) {
        if (true != str.startsWith("G") && true != str.startsWith("X")) {
            return str;
        }
        if (true == str.startsWith("GIM")) {
            str = "G1M" + str.substring(3, str.length());
        }
        if (true == str.startsWith("X111NAM")) {
            str = "XIIINAM" + str.substring(7, str.length());
        }
        if (true == str.startsWith("XO1C")) {
            str = "XOIC" + str.substring(4, str.length());
        }
        if (true == str.startsWith("X0IC")) {
            str = "XOIC" + str.substring(4, str.length());
        }
        if (true == str.startsWith("X01C")) {
            str = "XOIC" + str.substring(4, str.length());
        }
        if (true == str.startsWith("X1ASEAN")) {
            str = "XIASEAN" + str.substring(7, str.length());
        }
        if (true != str.startsWith("XXX1DB")) {
            return str;
        }
        return "XXXIDB" + str.substring(6, str.length());
    }

    public static Boolean o(String str, String str2) {
        StringBuilder sb;
        String message;
        try {
            File file = new File(str);
            File file2 = new File(str2);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return Boolean.TRUE;
                }
            }
        } catch (FileNotFoundException e2) {
            sb = new StringBuilder();
            sb.append("Could not copyFile. Error:");
            message = e2.getMessage();
            sb.append(message);
            Log.e("MY_DEBUG", sb.toString());
            return Boolean.FALSE;
        } catch (IOException e3) {
            sb = new StringBuilder();
            sb.append("Could not copyFile. Error:");
            message = e3.getMessage();
            sb.append(message);
            Log.e("MY_DEBUG", sb.toString());
            return Boolean.FALSE;
        }
    }

    public static Boolean p(String str) {
        try {
            return true == new File(str).delete() ? Boolean.TRUE : Boolean.FALSE;
        } catch (Exception e2) {
            Log.e("MY_DEBUG", "Could not deleteFile. Error:" + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    public static byte[] q(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[charArray.length];
        for (int i2 = 0; i2 < charArray.length; i2++) {
            bArr[i2] = (byte) (charArray[i2] & 127);
        }
        return bArr;
    }

    public static String r(String str) {
        if (!str.equals(BuildConfig.FLAVOR)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
            try {
                return new SimpleDateFormat("yyyy-MM-dd").format(simpleDateFormat.parse(str)).toUpperCase();
            } catch (ParseException e2) {
                Log.e("getSqlDate_fromDMY", "Error : getSqlDate_fromDMY : " + e2.getMessage());
            }
        }
        return "NULL";
    }

    public static boolean s(String str) {
        return str == null || str.length() == 0;
    }

    public static void t(Context context, String str) {
        AlertDialog create = new AlertDialog.Builder(context).create();
        create.setTitle("Error");
        create.setMessage(str);
        create.setButton("OK", new a());
        create.show();
    }

    public static void u(Context context, String str, String str2) {
        AlertDialog create = new AlertDialog.Builder(context).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setButton("OK", new b());
        create.show();
    }

    public static void v(Context context, String str, int i2) {
        Toast makeText = Toast.makeText(context, str, i2);
        makeText.setGravity(48, 0, 0);
        makeText.show();
    }
}
