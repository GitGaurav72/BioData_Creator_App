/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.yalantis.ucrop.UCropActivity
 *  com.yalantis.ucrop.view.GestureCropImageView
 *  java.lang.Object
 */
package e.s.a;

import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;

public class d
implements HorizontalProgressWheelView.a {
    public final /* synthetic */ UCropActivity a;

    public d(UCropActivity uCropActivity) {
        this.a = uCropActivity;
    }

    @Override
    public void a() {
        this.a.x.setImageToWrapCropBounds(true);
    }

    @Override
    public void b(float f2, float f3) {
        this.a.x.k(f2 / 42.0f);
    }

    @Override
    public void c() {
        this.a.x.i();
    }
}

