package com.wustor.usermodule;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wustor.basemodule.APath;
import com.wustor.basemodule.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = APath.USER_MINE)
public class MineFragment extends BaseFragment {
    private TextView tvModule;
    private Button btnButton;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected View initView(View parent) {
        tvModule = parent.findViewById(R.id.tv_module);
        btnButton = parent.findViewById(R.id.btn_jump);
        tvModule.setText("用户中心\nUserModule");
        btnButton.setText("跳转订单");
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ReflectUtils.startActivityWithName(mContext, "com.wustor.ordermodule.OrderActivity");
                ARouter.getInstance().build(APath.ORDER_MAIN).navigation();
            }
        });
        return parent;
    }

}
