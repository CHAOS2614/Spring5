package cn.edu.bjfu.condition;

import cn.edu.bjfu.bean.color.Blue;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义逻辑返回需要导入的组件
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class MyImportSelector implements ImportSelector {

    /**
     * @param importingClassMetadata 当前标注@Import注解的类的所有注解信息
     * @return 导入到容器中的组件全类名
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"cn.edu.bjfu.bean.color.Red","cn.edu.bjfu.bean.color.Blue"};
    }
}
