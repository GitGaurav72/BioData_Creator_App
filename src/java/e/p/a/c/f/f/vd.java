/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  e.p.a.c.b.a
 *  e.p.a.c.f.f.ai
 *  e.p.a.c.f.f.ud
 *  e.p.d.o.n0
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package e.p.a.c.f.f;

import android.os.Parcel;
import android.os.Parcelable;
import e.p.a.c.b.a;
import e.p.a.c.f.f.ai;
import e.p.a.c.f.f.ud;
import e.p.d.o.n0;
import java.util.ArrayList;
import java.util.List;

public final class vd
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n = a.x0((Parcel)parcel);
        String string = null;
        ArrayList arrayList = null;
        n0 n02 = null;
        while (parcel.dataPosition() < n) {
            int n2 = parcel.readInt();
            char c = (char)n2;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        a.v0((Parcel)parcel, (int)n2);
                        continue;
                    }
                    n02 = (n0)a.J((Parcel)parcel, (int)n2, (Parcelable.Creator)n0.CREATOR);
                    continue;
                }
                arrayList = a.N((Parcel)parcel, (int)n2, (Parcelable.Creator)ai.CREATOR);
                continue;
            }
            string = a.K((Parcel)parcel, (int)n2);
        }
        a.R((Parcel)parcel, (int)n);
        return new ud(string, arrayList, n02);
    }

    public final /* synthetic */ Object[] newArray(int n) {
        return new ud[n];
    }
}

