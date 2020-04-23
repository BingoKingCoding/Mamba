package com.powerful.mamba.app.entity.factory;

/**
 * <无卡订单小票>
 * Created by WangWB on 2020/3/2 12:13.
 * Email:634051075@qq.com
 */
public class NoCardTemplateFactory extends TemplateFactory {

    @Override
    public Template createTemplate() {
        return new NoCardTemplate();
    }
}
