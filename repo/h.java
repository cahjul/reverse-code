package com.repo;

public abstract class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public int f708a;

    public h(int i) {
        this.f708a = i;
    }

    public byte[] c(String str) {
        int i = this.f708a;
        if (i == 0) {
            i = str.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = 0;
        }
        int i4 = 0;
        while (i2 < str.length()) {
            bArr[i4] = (byte) (bArr[i4] ^ ((byte) str.charAt(i2)));
            i2++;
            i4 = (i4 + 1) % bArr.length;
        }
        return bArr;
    }

    public void d(String str) {
        e(c(str));
    }

    public abstract void e(byte[] bArr);
}
