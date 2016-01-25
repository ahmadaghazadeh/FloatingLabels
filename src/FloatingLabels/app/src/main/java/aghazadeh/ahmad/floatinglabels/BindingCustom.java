package aghazadeh.ahmad.floatinglabels;

import android.databinding.BindingAdapter;

import android.support.design.widget.TextInputLayout;


/**
 * Created by 890683 on 1/24/2016.
 */
public class BindingCustom {

    @BindingAdapter({ "errorText"})
    public static void setError(TextInputLayout view,  String error) {
        view.setError(error);
    }
}
