package com.repo;

public class i {
    public static void a(int[] iArr, int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 4) + i2;
            int i6 = i + i4;
            bArr[i5] = (byte) ((iArr[i6] >>> 24) & 255);
            bArr[i5 + 1] = (byte) ((iArr[i6] >>> 16) & 255);
            bArr[i5 + 2] = (byte) ((iArr[i6] >>> 8) & 255);
            bArr[i5 + 3] = (byte) (iArr[i6] & 255);
        }
    }

    public static void b(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 4) + i;
            iArr[i2 + i4] = (bArr[i5 + 3] & 255) | ((bArr[i5] & 255) << 24) | ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5 + 2] & 255) << 8);
        }
    }
}
