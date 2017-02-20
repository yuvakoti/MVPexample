package koti.mvpexample;

/**
 * Created by User on 2/20/2017.
 */

public interface BaseView {
    void showProgress();
    void hideProgress();
    void showError(String error);
}
