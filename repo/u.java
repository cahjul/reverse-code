package com.repo;

import android.os.Process;

public class u {
    public static void a(boolean z) {
        if (z) {
            System.runFinalizersOnExit(true);
            System.exit(0);
            return;
        }
        Process.killProcess(Process.myPid());
    }
}
