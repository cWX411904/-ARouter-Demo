package com.wustor.cartmodule;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wustor.basemodule.APath;
import com.wustor.basemodule.CommonUtils;
import com.wustor.basemodule.carts.CartModuleService;

/**
 * author chmyy
 * created on 2018/1/21
 * email fat_chao@163.com.
 */

@Route(path = APath.CARTS_SERVICE)
public class CartServiceImpl implements CartModuleService {
    private Context context;

    @Override
    public void getCartAmount() {
        //TODO 此处应该为异步操作，如果需要获取网络数据，则需要开启线程，拿到数据之后再回调数据给调用者
        CommonUtils.showToast(context, " 购物车没有商品");

    }

    @Override
    public void init(Context context) {
        this.context = context;
    }
}
