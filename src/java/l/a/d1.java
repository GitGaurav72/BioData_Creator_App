/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  l.a.a1
 *  l.a.n
 */
package l.a;

import l.a.a1;
import l.a.f1;
import l.a.n;
import l.a.o;
import l.a.r;

public class d1
extends f1
implements r {
    public final boolean l;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public d1(a1 var1_1) {
        block3 : {
            var2_2 = true;
            super(var2_2);
            this.I(var1_1);
            var3_3 = this.E();
            var4_4 = var3_3 instanceof o != false ? (o)var3_3 : null;
            if (var4_4 == null) lbl-1000: // 2 sources:
            {
                do {
                    var2_2 = false;
                    break block3;
                    break;
                } while (true);
            }
            while (!(var5_5 = var4_4.x()).B()) {
                var6_6 = var5_5.E();
                var4_4 = var6_6 instanceof o != false ? (o)var6_6 : null;
                if (var4_4 != null) continue;
                ** continue;
lbl15: // 1 sources:
                ** GOTO lbl-1000
            }
        }
        this.l = var2_2;
    }

    @Override
    public boolean B() {
        return this.l;
    }

    @Override
    public boolean C() {
        return true;
    }
}

