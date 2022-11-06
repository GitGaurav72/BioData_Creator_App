/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  e.p.a.c.c.k.d
 *  e.p.a.c.c.k.d$a
 *  e.p.a.c.c.k.d$b
 *  e.p.a.c.c.k.l.e
 *  e.p.a.c.c.k.l.k
 *  e.p.a.c.c.m.c
 *  e.p.a.c.c.m.f
 *  e.p.d.r.c.h
 *  e.p.d.r.c.h$a
 *  e.p.d.r.c.h$a$a
 *  java.lang.String
 */
package e.p.d.r.c;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.p.a.c.c.k.d;
import e.p.a.c.c.k.l.k;
import e.p.a.c.c.m.c;
import e.p.a.c.c.m.f;
import e.p.d.r.c.h;

public class e
extends f<h> {
    public e(Context context, Looper looper, c c2, d.a a2, d.b b2) {
        super(context, looper, 131, c2, (e.p.a.c.c.k.l.e)a2, (k)b2);
    }

    public int j() {
        return 12451000;
    }

    @Nullable
    public IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (iInterface != null && iInterface instanceof h) {
            return (h)iInterface;
        }
        return new h.a.a(iBinder);
    }

    @NonNull
    public String v() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @NonNull
    public String w() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    public boolean y() {
        return true;
    }
}

