/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package k.b0.x.b.x0.m.p1;

public class p {
    public static /* synthetic */ void a(int n2) {
        Object[] arrobject = new Object[3];
        switch (n2) {
            default: {
                arrobject[0] = "a";
                break;
            }
            case 9: {
                arrobject[0] = "typeProjection";
                break;
            }
            case 8: {
                arrobject[0] = "type";
                break;
            }
            case 6: 
            case 11: {
                arrobject[0] = "supertype";
                break;
            }
            case 5: 
            case 10: {
                arrobject[0] = "subtype";
                break;
            }
            case 2: 
            case 7: {
                arrobject[0] = "typeCheckingProcedure";
                break;
            }
            case 1: 
            case 4: {
                arrobject[0] = "b";
            }
        }
        arrobject[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (n2) {
            default: {
                arrobject[2] = "assertEqualTypes";
                break;
            }
            case 10: 
            case 11: {
                arrobject[2] = "noCorrespondingSupertype";
                break;
            }
            case 8: 
            case 9: {
                arrobject[2] = "capture";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                arrobject[2] = "assertSubtype";
                break;
            }
            case 3: 
            case 4: {
                arrobject[2] = "assertEqualTypeConstructors";
            }
        }
        throw new IllegalArgumentException(String.format((String)"Argument for @NotNull parameter '%s' of %s.%s must not be null", (Object[])arrobject));
    }
}

