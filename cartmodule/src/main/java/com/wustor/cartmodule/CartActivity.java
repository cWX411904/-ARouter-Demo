package com.wustor.cartmodule;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wustor.basemodule.APath;
import com.wustor.basemodule.BaseActivity;

@Route(path = APath.CARTS_ACTIVITY)
public class CartActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_cart;
    }

    @Override
    protected void initView() {
        setTitle("购物车");
    }

}
