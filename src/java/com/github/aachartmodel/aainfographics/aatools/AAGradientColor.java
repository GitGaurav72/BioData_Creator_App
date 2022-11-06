/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  k.g
 *  k.i
 *  k.s.i
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.aachartmodel.aainfographics.aatools;

import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection;
import java.util.Map;
import k.g;
import k.s.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b6\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b[\u0010\\J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\b\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\n\u0010\u0005J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\u0005J\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\f\u0010\u0005J\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\r\u0010\u0005J\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0005J\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0005J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0005J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0005J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0005J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0005J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0005J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0005J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0005J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0005J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0005J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0005J\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0005J#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b \u0010!J!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0004\u0010!J!\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0006\u0010!J!\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0007\u0010!J!\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\b\u0010!J!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\t\u0010!J!\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\n\u0010!J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u000b\u0010!J!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\f\u0010!J!\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\r\u0010!J!\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u000e\u0010!J!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u000f\u0010!J!\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0010\u0010!J!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0011\u0010!J!\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0012\u0010!J!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0013\u0010!J!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0014\u0010!J!\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0015\u0010!J!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0016\u0010!J!\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0017\u0010!J!\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0018\u0010!J!\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u0019\u0010!J!\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001a\u0010!J!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001b\u0010!J!\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001c\u0010!J)\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003\u00a2\u0006\u0004\b$\u0010%J1\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003\u00a2\u0006\u0004\b$\u0010&J/\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010'\u00a2\u0006\u0004\b$\u0010)R%\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0005R%\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0005R%\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0005R%\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u0005R%\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010\u0005R%\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\u0005R%\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010\u0005R%\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010\u0005R%\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010\u0005R%\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b>\u0010\u0005R%\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b@\u0010\u0005R%\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bA\u0010+\u001a\u0004\bB\u0010\u0005R%\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bC\u0010+\u001a\u0004\bD\u0010\u0005R%\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bE\u0010+\u001a\u0004\bF\u0010\u0005R%\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bG\u0010+\u001a\u0004\bH\u0010\u0005R%\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010\u0005R%\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bK\u0010+\u001a\u0004\bL\u0010\u0005R%\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bM\u0010+\u001a\u0004\bN\u0010\u0005R%\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bO\u0010+\u001a\u0004\bP\u0010\u0005R%\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bQ\u0010+\u001a\u0004\bR\u0010\u0005R%\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bS\u0010+\u001a\u0004\bT\u0010\u0005R%\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bU\u0010+\u001a\u0004\bV\u0010\u0005R%\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bW\u0010+\u001a\u0004\bX\u0010\u0005R%\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006@\u0006\u00a2\u0006\f\n\u0004\bY\u0010+\u001a\u0004\bZ\u0010\u0005\u00a8\u0006]"}, d2={"Lcom/github/aachartmodel/aainfographics/aatools/AAGradientColor;", "", "", "", "oceanBlueColor", "()Ljava/util/Map;", "sanguineColor", "lusciousLimeColor", "purpleLakeColor", "freshPapayaColor", "ultramarineColor", "pinkSugarColor", "lemonDrizzleColor", "victoriaPurpleColor", "springGreensColor", "mysticMauveColor", "reflexSilverColor", "neonGlowColor", "berrySmoothieColor", "newLeafColor", "cottonCandyColor", "pixieDustColor", "fizzyPeachColor", "sweetDreamColor", "firebrickColor", "wroughtIronColor", "deepSeaColor", "coastalBreezeColor", "eveningDelightColor", "Lcom/github/aachartmodel/aainfographics/aatools/AALinearGradientDirection;", "direction", "", "linearGradientMap", "(Lcom/github/aachartmodel/aainfographics/aatools/AALinearGradientDirection;)Ljava/util/Map;", "startColor", "endColor", "linearGradient", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "(Lcom/github/aachartmodel/aainfographics/aatools/AALinearGradientDirection;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "", "stopsArr", "(Lcom/github/aachartmodel/aainfographics/aatools/AALinearGradientDirection;[Ljava/lang/Object;)Ljava/util/Map;", "EveningDelight", "Ljava/util/Map;", "getEveningDelight", "WroughtIron", "getWroughtIron", "PinkSugar", "getPinkSugar", "Firebrick", "getFirebrick", "LusciousLime", "getLusciousLime", "SweetDream", "getSweetDream", "Sanguine", "getSanguine", "CoastalBreeze", "getCoastalBreeze", "PixieDust", "getPixieDust", "BerrySmoothie", "getBerrySmoothie", "MysticMauve", "getMysticMauve", "PurpleLake", "getPurpleLake", "ReflexSilver", "getReflexSilver", "NeonGlow", "getNeonGlow", "FizzyPeach", "getFizzyPeach", "VictoriaPurple", "getVictoriaPurple", "Ultramarine", "getUltramarine", "NewLeaf", "getNewLeaf", "SpringGreens", "getSpringGreens", "CottonCandy", "getCottonCandy", "DeepSea", "getDeepSea", "FreshPapaya", "getFreshPapaya", "OceanBlue", "getOceanBlue", "LemonDrizzle", "getLemonDrizzle", "<init>", "()V", "charts_release"}, k=1, mv={1, 4, 0})
public final class AAGradientColor {
    private static final Map<String, Object> BerrySmoothie;
    private static final Map<String, Object> CoastalBreeze;
    private static final Map<String, Object> CottonCandy;
    private static final Map<String, Object> DeepSea;
    private static final Map<String, Object> EveningDelight;
    private static final Map<String, Object> Firebrick;
    private static final Map<String, Object> FizzyPeach;
    private static final Map<String, Object> FreshPapaya;
    public static final AAGradientColor INSTANCE;
    private static final Map<String, Object> LemonDrizzle;
    private static final Map<String, Object> LusciousLime;
    private static final Map<String, Object> MysticMauve;
    private static final Map<String, Object> NeonGlow;
    private static final Map<String, Object> NewLeaf;
    private static final Map<String, Object> OceanBlue;
    private static final Map<String, Object> PinkSugar;
    private static final Map<String, Object> PixieDust;
    private static final Map<String, Object> PurpleLake;
    private static final Map<String, Object> ReflexSilver;
    private static final Map<String, Object> Sanguine;
    private static final Map<String, Object> SpringGreens;
    private static final Map<String, Object> SweetDream;
    private static final Map<String, Object> Ultramarine;
    private static final Map<String, Object> VictoriaPurple;
    private static final Map<String, Object> WroughtIron;

    public static {
        AAGradientColor aAGradientColor;
        INSTANCE = aAGradientColor = new AAGradientColor();
        OceanBlue = aAGradientColor.oceanBlueColor();
        Sanguine = aAGradientColor.sanguineColor();
        LusciousLime = aAGradientColor.lusciousLimeColor();
        PurpleLake = aAGradientColor.purpleLakeColor();
        FreshPapaya = aAGradientColor.freshPapayaColor();
        Ultramarine = aAGradientColor.ultramarineColor();
        PinkSugar = aAGradientColor.pinkSugarColor();
        LemonDrizzle = aAGradientColor.lemonDrizzleColor();
        VictoriaPurple = aAGradientColor.victoriaPurpleColor();
        SpringGreens = aAGradientColor.springGreensColor();
        MysticMauve = aAGradientColor.mysticMauveColor();
        ReflexSilver = aAGradientColor.reflexSilverColor();
        NeonGlow = aAGradientColor.neonGlowColor();
        BerrySmoothie = aAGradientColor.berrySmoothieColor();
        NewLeaf = aAGradientColor.newLeafColor();
        CottonCandy = aAGradientColor.cottonCandyColor();
        PixieDust = aAGradientColor.pixieDustColor();
        FizzyPeach = aAGradientColor.fizzyPeachColor();
        SweetDream = aAGradientColor.sweetDreamColor();
        Firebrick = aAGradientColor.firebrickColor();
        WroughtIron = aAGradientColor.wroughtIronColor();
        DeepSea = aAGradientColor.deepSeaColor();
        CoastalBreeze = aAGradientColor.coastalBreezeColor();
        EveningDelight = aAGradientColor.eveningDelightColor();
    }

    private AAGradientColor() {
    }

    private final Map<String, Object> berrySmoothieColor() {
        return this.berrySmoothieColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> coastalBreezeColor() {
        return this.coastalBreezeColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> cottonCandyColor() {
        return this.cottonCandyColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> deepSeaColor() {
        return this.deepSeaColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> eveningDelightColor() {
        return this.eveningDelightColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> firebrickColor() {
        return this.firebrickColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> fizzyPeachColor() {
        return this.fizzyPeachColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> freshPapayaColor() {
        return this.freshPapayaColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> lemonDrizzleColor() {
        return this.lemonDrizzleColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Integer> linearGradientMap(AALinearGradientDirection aALinearGradientDirection) {
        int n = aALinearGradientDirection.ordinal();
        Integer n2 = 1;
        Integer n3 = 0;
        switch (n) {
            default: {
                throw new g();
            }
            case 7: {
                k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n3), new k.i((Object)"y1", (Object)n3), new k.i((Object)"x2", (Object)n2), new k.i((Object)"y2", (Object)n2)};
                return i.H((k.i[])arri);
            }
            case 6: {
                k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n2), new k.i((Object)"y1", (Object)n3), new k.i((Object)"x2", (Object)n3), new k.i((Object)"y2", (Object)n2)};
                return i.H((k.i[])arri);
            }
            case 5: {
                k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n3), new k.i((Object)"y1", (Object)n2), new k.i((Object)"x2", (Object)n2), new k.i((Object)"y2", (Object)n3)};
                return i.H((k.i[])arri);
            }
            case 4: {
                k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n2), new k.i((Object)"y1", (Object)n2), new k.i((Object)"x2", (Object)n3), new k.i((Object)"y2", (Object)n3)};
                return i.H((k.i[])arri);
            }
            case 3: {
                k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n3), new k.i((Object)"y1", (Object)n3), new k.i((Object)"x2", (Object)n2), new k.i((Object)"y2", (Object)n3)};
                return i.H((k.i[])arri);
            }
            case 2: {
                k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n2), new k.i((Object)"y1", (Object)n3), new k.i((Object)"x2", (Object)n3), new k.i((Object)"y2", (Object)n3)};
                return i.H((k.i[])arri);
            }
            case 1: {
                k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n3), new k.i((Object)"y1", (Object)n3), new k.i((Object)"x2", (Object)n3), new k.i((Object)"y2", (Object)n2)};
                return i.H((k.i[])arri);
            }
            case 0: 
        }
        k.i[] arri = new k.i[]{new k.i((Object)"x1", (Object)n3), new k.i((Object)"y1", (Object)n2), new k.i((Object)"x2", (Object)n3), new k.i((Object)"y2", (Object)n3)};
        return i.H((k.i[])arri);
    }

    private final Map<String, Object> lusciousLimeColor() {
        return this.lusciousLimeColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> mysticMauveColor() {
        return this.mysticMauveColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> neonGlowColor() {
        return this.neonGlowColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> newLeafColor() {
        return this.newLeafColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> oceanBlueColor() {
        return this.oceanBlueColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> pinkSugarColor() {
        return this.pinkSugarColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> pixieDustColor() {
        return this.pixieDustColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> purpleLakeColor() {
        return this.purpleLakeColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> reflexSilverColor() {
        return this.reflexSilverColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> sanguineColor() {
        return this.sanguineColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> springGreensColor() {
        return this.springGreensColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> sweetDreamColor() {
        return this.sweetDreamColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> ultramarineColor() {
        return this.ultramarineColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> victoriaPurpleColor() {
        return this.victoriaPurpleColor(AALinearGradientDirection.ToTop);
    }

    private final Map<String, Object> wroughtIronColor() {
        return this.wroughtIronColor(AALinearGradientDirection.ToTop);
    }

    public final Map<String, Object> berrySmoothieColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#8E78FF", "#FC7D7B");
    }

    public final Map<String, Object> coastalBreezeColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#00B7FF", "#FFFFC7");
    }

    public final Map<String, Object> cottonCandyColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#FCA5F1", "#B5FFFF");
    }

    public final Map<String, Object> deepSeaColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#4F00BC", "#29ABE2");
    }

    public final Map<String, Object> eveningDelightColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#93278F", "#00A99D");
    }

    public final Map<String, Object> firebrickColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#45145A", "#FF5300");
    }

    public final Map<String, Object> fizzyPeachColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#F24645", "#EBC08D");
    }

    public final Map<String, Object> freshPapayaColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#ED1C24", "#FCEE21");
    }

    public final Map<String, Object> getBerrySmoothie() {
        return BerrySmoothie;
    }

    public final Map<String, Object> getCoastalBreeze() {
        return CoastalBreeze;
    }

    public final Map<String, Object> getCottonCandy() {
        return CottonCandy;
    }

    public final Map<String, Object> getDeepSea() {
        return DeepSea;
    }

    public final Map<String, Object> getEveningDelight() {
        return EveningDelight;
    }

    public final Map<String, Object> getFirebrick() {
        return Firebrick;
    }

    public final Map<String, Object> getFizzyPeach() {
        return FizzyPeach;
    }

    public final Map<String, Object> getFreshPapaya() {
        return FreshPapaya;
    }

    public final Map<String, Object> getLemonDrizzle() {
        return LemonDrizzle;
    }

    public final Map<String, Object> getLusciousLime() {
        return LusciousLime;
    }

    public final Map<String, Object> getMysticMauve() {
        return MysticMauve;
    }

    public final Map<String, Object> getNeonGlow() {
        return NeonGlow;
    }

    public final Map<String, Object> getNewLeaf() {
        return NewLeaf;
    }

    public final Map<String, Object> getOceanBlue() {
        return OceanBlue;
    }

    public final Map<String, Object> getPinkSugar() {
        return PinkSugar;
    }

    public final Map<String, Object> getPixieDust() {
        return PixieDust;
    }

    public final Map<String, Object> getPurpleLake() {
        return PurpleLake;
    }

    public final Map<String, Object> getReflexSilver() {
        return ReflexSilver;
    }

    public final Map<String, Object> getSanguine() {
        return Sanguine;
    }

    public final Map<String, Object> getSpringGreens() {
        return SpringGreens;
    }

    public final Map<String, Object> getSweetDream() {
        return SweetDream;
    }

    public final Map<String, Object> getUltramarine() {
        return Ultramarine;
    }

    public final Map<String, Object> getVictoriaPurple() {
        return VictoriaPurple;
    }

    public final Map<String, Object> getWroughtIron() {
        return WroughtIron;
    }

    public final Map<String, Object> lemonDrizzleColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#FB872B", "#D9E021");
    }

    public final Map<String, Object> linearGradient(AALinearGradientDirection aALinearGradientDirection, String string2, String string3) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        k.x.c.i.e((Object)string2, (String)"startColor");
        k.x.c.i.e((Object)string3, (String)"endColor");
        Object[] arrobject = new Object[2];
        Object[] arrobject2 = new Object[]{0, string2};
        arrobject[0] = arrobject2;
        Object[] arrobject3 = new Object[]{1, string3};
        arrobject[1] = arrobject3;
        return this.linearGradient(aALinearGradientDirection, arrobject);
    }

    public final Map<String, Object> linearGradient(AALinearGradientDirection aALinearGradientDirection, Object[] arrobject) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        k.x.c.i.e((Object)arrobject, (String)"stopsArr");
        k.i[] arri = new k.i[]{new k.i((Object)"linearGradient", this.linearGradientMap(aALinearGradientDirection)), new k.i((Object)"stops", (Object)arrobject)};
        return i.H((k.i[])arri);
    }

    public final Map<String, Object> linearGradient(String string2, String string3) {
        k.x.c.i.e((Object)string2, (String)"startColor");
        k.x.c.i.e((Object)string3, (String)"endColor");
        return this.linearGradient(AALinearGradientDirection.ToTop, string2, string3);
    }

    public final Map<String, Object> lusciousLimeColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#009245", "#FCEE21");
    }

    public final Map<String, Object> mysticMauveColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#B066FE", "#63E2FF");
    }

    public final Map<String, Object> neonGlowColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#00FFA1", "#00FFFF");
    }

    public final Map<String, Object> newLeafColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#00537E", "#3AA17E");
    }

    public final Map<String, Object> oceanBlueColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#2E3192", "#1BFFFF");
    }

    public final Map<String, Object> pinkSugarColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#D74177", "#FFE98A");
    }

    public final Map<String, Object> pixieDustColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#D585FF", "#00FFEE");
    }

    public final Map<String, Object> purpleLakeColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#662D8C", "#ED1E79");
    }

    public final Map<String, Object> reflexSilverColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#808080", "#E6E6E6");
    }

    public final Map<String, Object> sanguineColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#D4145A", "#FBB03B");
    }

    public final Map<String, Object> springGreensColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#009E00", "#FFFF96");
    }

    public final Map<String, Object> sweetDreamColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#3A3897", "#A3A1FF");
    }

    public final Map<String, Object> ultramarineColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#00A8C5", "#FFFF7E");
    }

    public final Map<String, Object> victoriaPurpleColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#312A6C", "#852D91");
    }

    public final Map<String, Object> wroughtIronColor(AALinearGradientDirection aALinearGradientDirection) {
        k.x.c.i.e((Object)((Object)aALinearGradientDirection), (String)"direction");
        return this.linearGradient(aALinearGradientDirection, "#333333", "#5A5454");
    }
}

