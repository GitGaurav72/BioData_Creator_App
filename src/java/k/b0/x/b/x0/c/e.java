/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.c.b0
 *  k.b0.x.b.x0.c.f
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.r
 *  k.b0.x.b.x0.c.w
 *  k.b0.x.b.x0.j.a0.h
 */
package k.b0.x.b.x0.c;

import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.c.b0;
import k.b0.x.b.x0.c.d;
import k.b0.x.b.x0.c.f;
import k.b0.x.b.x0.c.g;
import k.b0.x.b.x0.c.i;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.r;
import k.b0.x.b.x0.c.w;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.j.a0.h;
import k.b0.x.b.x0.m.e1;
import k.b0.x.b.x0.m.m0;

public interface e
extends g,
i {
    public e getCompanionObjectDescriptor();

    public Collection<d> getConstructors();

    @Override
    public k getContainingDeclaration();

    @Override
    public List<z0> getDeclaredTypeParameters();

    @Override
    public m0 getDefaultType();

    public w<m0> getInlineClassRepresentation();

    public f getKind();

    public h getMemberScope(e1 var1);

    @Override
    public b0 getModality();

    @Override
    public e getOriginal();

    public Collection<e> getSealedSubclasses();

    public h getStaticScope();

    public q0 getThisAsReceiverParameter();

    public h getUnsubstitutedInnerClassesScope();

    public h getUnsubstitutedMemberScope();

    public d getUnsubstitutedPrimaryConstructor();

    @Override
    public r getVisibility();

    public boolean isCompanionObject();

    public boolean isData();

    public boolean isFun();

    public boolean isInline();

    public boolean isValue();
}

