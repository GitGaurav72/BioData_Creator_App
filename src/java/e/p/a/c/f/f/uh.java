/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  e.p.a.c.b.a
 *  e.p.a.c.f.f.rh
 *  e.p.a.c.f.f.th
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package e.p.a.c.f.f;

import android.os.Parcel;
import android.os.Parcelable;
import e.p.a.c.b.a;
import e.p.a.c.f.f.rh;
import e.p.a.c.f.f.th;
import java.util.ArrayList;
import java.util.List;

public final class uh
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n = a.x0((Parcel)parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < n) {
            int n2 = parcel.readInt();
            if ((char)n2 != '\u0002') {
                a.v0((Parcel)parcel, (int)n2);
                continue;
            }
            arrayList = a.N((Parcel)parcel, (int)n2, (Parcelable.Creator)rh.CREATOR);
        }
        a.R((Parcel)parcel, (int)n);
        return new th(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int n) {
        return new th[n];
    }
}

