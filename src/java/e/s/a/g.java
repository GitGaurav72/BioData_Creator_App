/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  com.yalantis.ucrop.UCropActivity
 *  com.yalantis.ucrop.view.GestureCropImageView
 *  e.s.a.m.a
 *  java.lang.Object
 */
package e.s.a;

import android.graphics.RectF;
import com.yalantis.ucrop.UCropActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import e.s.a.m.a;

public class g
implements HorizontalProgressWheelView.a {
    public final /* synthetic */ UCropActivity a;

    public g(UCropActivity uCropActivity) {
        this.a = uCropActivity;
    }

    @Override
    public void a() {
        this.a.x.setImageToWrapCropBounds(true);
    }

    @Override
    public void b(float f2, float f3) {
        if (f2 > 0.0f) {
            GestureCropImageView gestureCropImageView = this.a.x;
            gestureCropImageView.l(gestureCropImageView.getCurrentScale() + f2 * ((this.a.x.getMaxScale() - this.a.x.getMinScale()) / 15000.0f), gestureCropImageView.z.centerX(), gestureCropImageView.z.centerY());
            return;
        }
        GestureCropImageView gestureCropImageView = this.a.x;
        float f4 = gestureCropImageView.getCurrentScale() + f2 * ((this.a.x.getMaxScale() - this.a.x.getMinScale()) / 15000.0f);
        float f5 = gestureCropImageView.z.centerX();
        float f6 = gestureCropImageView.z.centerY();
        if (f4 >= gestureCropImageView.getMinScale()) {
            gestureCropImageView.f(f4 / gestureCropImageView.getCurrentScale(), f5, f6);
        }
    }

    @Override
    public void c() {
        this.a.x.i();
    }
}

