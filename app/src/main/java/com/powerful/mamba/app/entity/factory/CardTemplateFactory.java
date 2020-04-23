package com.powerful.mamba.app.entity.factory;

/**
 * <请描述这个类是干什么的>
 * Created by WangWB on 2020/3/2 12:22.
 * Email:634051075@qq.com
 */
public class CardTemplateFactory extends TemplateFactory {

    @Override
    public Template createTemplate() {
        return new CardTemplate();
    }
}
