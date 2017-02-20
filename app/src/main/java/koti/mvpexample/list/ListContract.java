package koti.mvpexample.list;

import android.view.View;

import koti.mvpexample.BasePresenter;
import koti.mvpexample.BaseView;

/**
 * Created by User on 2/20/2017.
 */

public interface ListContract {
    interface View extends BaseView{
        void showData(String data);
    }
    interface Presenter extends BasePresenter<View>{
        void loadData();

    }
}
