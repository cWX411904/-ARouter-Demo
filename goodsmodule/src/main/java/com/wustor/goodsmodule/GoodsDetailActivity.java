package com.wustor.goodsmodule;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wustor.basemodule.APath;
import com.wustor.basemodule.BaseActivity;
import com.wustor.basemodule.CommonUtils;
import com.wustor.basemodule.carts.CartModuleService;


@Route(path = APath.GOODS_DETAIL)
public class GoodsDetailActivity extends BaseActivity {

    private TextView tvModule;
    private Button btnButton;
    private Button btnCall;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_goods_detail;
    }

    @Override
    protected void initView() {
        setTitle("商品详情");
        tvModule = findViewById(R.id.tv_module);
        btnButton = findViewById(R.id.btn_jump);
        tvModule.setText("GoodsModule");
        btnButton.setText("跳转到购物车");
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ReflectUtils.startActivityWithName(mContext, "com.wustor.cartmodule.CartActivity");
                ARouter.getInstance().build(APath.CARTS_ACTIVITY).navigation();
            }
        });
        btnCall = findViewById(R.id.btn_call);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                CartModuleService moduleCall = (CartModuleService) ReflectUtils.getModuleCall("com.wustor.cartmodule.CartServiceImpl");
                CartModuleService cartModuleService = (CartModuleService) ARouter.getInstance().build(APath.CARTS_SERVICE).navigation();
                if (cartModuleService != null) {
                    cartModuleService.init(mContext);
                    cartModuleService.getCartAmount();
                } else {
                    CommonUtils.showToast(mContext, "业务组件单独调试不应该跟其他业务Module产生交互，如果你依然想要在运行期依赖其它组件，那么请参考MainModule");
                }

            }
        });


    }
}
