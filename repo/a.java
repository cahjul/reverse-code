package com.repo;

import android.text.Editable;
import android.text.method.NumberKeyListener;
import android.view.View;

public class a extends NumberKeyListener {
    public void clearMetaKeyState(View view, Editable editable, int i) {
    }

    /* access modifiers changed from: protected */
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'e', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'E', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    }

    public int getInputType() {
        return 145;
    }
}
