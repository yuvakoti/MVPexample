package koti.mvpexample.ui.details;

import android.view.View;

import koti.mvpexample.BasePresenter;
import koti.mvpexample.BaseView;

/**
 * Created by User on 2/20/2017.
 */

public interface DetailsContract {
    interface View extends BaseView {
        void showImage();
        void showPhone();
    }

    interface presenter extends BasePresenter<View> {
        void loadinfo();
    }

}
