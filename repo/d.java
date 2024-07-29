package com.repo;

import java.util.Arrays;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f690a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f691b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f690a = charArray;
        int[] iArr = new int[256];
        f691b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            f691b[f690a[i]] = i;
        }
        f691b[61] = 0;
    }

    public static final byte[] a(String str) {
        int i;
        int i2;
        int length = str.length();
        int i3 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i4 = length - 1;
        int i5 = 0;
        while (i < i4 && f691b[str.charAt(i) & 255] < 0) {
            i5 = i + 1;
        }
        while (i4 > 0 && f691b[str.charAt(i4) & 255] < 0) {
            i4--;
        }
        int i6 = str.charAt(i4) == '=' ? str.charAt(i4 + -1) == '=' ? 2 : 1 : 0;
        int i7 = (i4 - i) + 1;
        if (length > 76) {
            i2 = (str.charAt(76) == 13 ? i7 / 78 : 0) << 1;
        } else {
            i2 = 0;
        }
        int i8 = (((i7 - i2) * 6) >> 3) - i6;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int[] iArr = f691b;
            int i12 = i + 1;
            int i13 = i12 + 1;
            int i14 = (iArr[str.charAt(i)] << 18) | (iArr[str.charAt(i12)] << 12);
            int i15 = i13 + 1;
            int i16 = i14 | (iArr[str.charAt(i13)] << 6);
            int i17 = i15 + 1;
            int i18 = i16 | iArr[str.charAt(i15)];
            int i19 = i10 + 1;
            bArr[i10] = (byte) (i18 >> 16);
            int i20 = i19 + 1;
            bArr[i19] = (byte) (i18 >> 8);
            int i21 = i20 + 1;
            bArr[i20] = (byte) i18;
            if (i2 <= 0 || (i11 = i11 + 1) != 19) {
                i = i17;
            } else {
                i = i17 + 2;
                i11 = 0;
            }
            i10 = i21;
        }
        if (i10 < i8) {
            int i22 = 0;
            while (i <= i4 - i6) {
                i3 |= f691b[str.charAt(i)] << (18 - (i22 * 6));
                i22++;
                i++;
            }
            int i23 = 16;
            while (i10 < i8) {
                bArr[i10] = (byte) (i3 >> i23);
                i23 -= 8;
                i10++;
            }
        }
        return bArr;
    }

    public static final char[] b(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        int i = 0;
        int length = bArr2 != null ? bArr2.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i2 = (length / 3) * 3;
        int i3 = length - 1;
        int i4 = ((i3 / 3) + 1) << 2;
        int i5 = i4 + (z ? ((i4 - 1) / 76) << 1 : 0);
        char[] cArr = new char[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i2) {
            int i9 = i6 + 1;
            int i10 = i9 + 1;
            byte b2 = ((bArr2[i6] & 255) << 16) | ((bArr2[i9] & 255) << 8);
            int i11 = i10 + 1;
            byte b3 = b2 | (bArr2[i10] & 255);
            int i12 = i7 + 1;
            char[] cArr2 = f690a;
            cArr[i7] = cArr2[(b3 >>> 18) & 63];
            int i13 = i12 + 1;
            cArr[i12] = cArr2[(b3 >>> 12) & 63];
            int i14 = i13 + 1;
            cArr[i13] = cArr2[(b3 >>> 6) & 63];
            i7 = i14 + 1;
            cArr[i14] = cArr2[b3 & 63];
            if (z && (i8 = i8 + 1) == 19 && i7 < i5 - 2) {
                int i15 = i7 + 1;
                cArr[i7] = 13;
                i7 = i15 + 1;
                cArr[i15] = 10;
                i8 = 0;
            }
            i6 = i11;
        }
        int i16 = length - i2;
        if (i16 > 0) {
            int i17 = (bArr2[i2] & 255) << 10;
            if (i16 == 2) {
                i = (bArr2[i3] & 255) << 2;
            }
            int i18 = i17 | i;
            char[] cArr3 = f690a;
            cArr[i5 - 4] = cArr3[i18 >> 12];
            cArr[i5 - 3] = cArr3[(i18 >>> 6) & 63];
            cArr[i5 - 2] = i16 == 2 ? cArr3[i18 & 63] : '=';
            cArr[i5 - 1] = '=';
        }
        return cArr;
    }

    public static final String c(byte[] bArr, boolean z) {
        return new String(b(bArr, z));
    }
}
