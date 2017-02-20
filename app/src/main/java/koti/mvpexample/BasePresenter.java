package koti.mvpexample;

/**
 * Created by User on 2/20/2017.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);

    void detachView();
}
