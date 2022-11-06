/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.List
 *  k.b0.x.b.x0.c.a$a
 *  k.b0.x.b.x0.c.o
 *  k.b0.x.b.x0.c.w0
 *  k.b0.x.b.x0.m.f0
 */
package k.b0.x.b.x0.c;

import java.util.Collection;
import java.util.List;
import k.b0.x.b.x0.c.a;
import k.b0.x.b.x0.c.e1;
import k.b0.x.b.x0.c.l;
import k.b0.x.b.x0.c.o;
import k.b0.x.b.x0.c.q0;
import k.b0.x.b.x0.c.w0;
import k.b0.x.b.x0.c.z0;
import k.b0.x.b.x0.m.f0;

public interface a
extends l,
o,
w0<a> {
    public q0 getDispatchReceiverParameter();

    public q0 getExtensionReceiverParameter();

    public a getOriginal();

    public Collection<? extends a> getOverriddenDescriptors();

    public f0 getReturnType();

    public List<z0> getTypeParameters();

    public <V> V getUserData(a<V> var1);

    public List<e1> getValueParameters();

    public boolean hasSynthesizedParameterNames();
}

