/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Member
 *  k.b0.f
 *  k.x.b.l
 */
package k.b0.x.b.x0.c.m1.b;

import java.lang.reflect.Member;
import k.b0.f;
import k.x.b.l;
import k.x.c.g;
import k.x.c.i;
import k.x.c.w;

public final class m
extends g
implements l<Member, Boolean> {
    public static final m k = new m();

    public m() {
        super(1);
    }

    public final String getName() {
        return "isSynthetic";
    }

    public final f getOwner() {
        return w.a(Member.class);
    }

    public final String getSignature() {
        return "isSynthetic()Z";
    }

    public Object invoke(Object object) {
        Member member = (Member)object;
        i.e((Object)member, "p0");
        return member.isSynthetic();
    }
}

