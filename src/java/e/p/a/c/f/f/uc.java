/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  e.p.a.c.b.a
 *  e.p.a.c.f.f.tc
 *  java.lang.Object
 *  java.lang.String
 */
package e.p.a.c.f.f;

import android.os.Parcel;
import android.os.Parcelable;
import e.p.a.c.b.a;
import e.p.a.c.f.f.tc;

public final class uc
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n = a.x0((Parcel)parcel);
        String string = null;
        while (parcel.dataPosition() < n) {
            int n2 = parcel.readInt();
            if ((char)n2 != '\u0001') {
                a.v0((Parcel)parcel, (int)n2);
                continue;
            }
            string = a.K((Parcel)parcel, (int)n2);
        }
        a.R((Parcel)parcel, (int)n);
        return new tc(string);
    }

    public final /* synthetic */ Object[] newArray(int n) {
        return new tc[n];
    }
}

