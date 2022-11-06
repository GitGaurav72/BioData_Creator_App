/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  k.b0.x.b.x0.c.k
 *  k.b0.x.b.x0.c.v$a
 */
package k.b0.x.b.x0.c;

import java.util.Collection;
import k.b0.x.b.x0.c.b;
import k.b0.x.b.x0.c.k;
import k.b0.x.b.x0.c.v;
import k.b0.x.b.x0.m.h1;

public interface v
extends b {
    @Override
    public k getContainingDeclaration();

    public v getInitialSignatureDescriptor();

    @Override
    public v getOriginal();

    public Collection<? extends v> getOverriddenDescriptors();

    public boolean isHiddenForResolutionEverywhereBesideSupercalls();

    public boolean isHiddenToOvercomeSignatureClash();

    public boolean isInfix();

    public boolean isInline();

    public boolean isOperator();

    public boolean isSuspend();

    public boolean isTailrec();

    public a<? extends v> newCopyBuilder();

    public v substitute(h1 var1);
}

