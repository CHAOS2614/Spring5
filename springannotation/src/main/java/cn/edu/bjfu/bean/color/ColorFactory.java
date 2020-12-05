package cn.edu.bjfu.bean.color;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class ColorFactory implements FactoryBean<Color> {

    /**
     *
     * @return 一个Color对象，将这个对象添加到容器中
     */
    @Override
    public Color getObject() {
        System.out.println("ColorFactory--->\t调用了getObject()方法");
        return new Color();
    }

    /**
     * @return 对象类型
     */
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * @return 是否是单例
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
