package com.wustor.ordermodule;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wustor.basemodule.APath;
import com.wustor.basemodule.BaseActivity;

@Route(path = APath.ORDER_MAIN)
public class OrderActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_order;
    }

    @Override
    protected void initView() {
        setTitle("订单");

    }
}
