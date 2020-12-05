package cn.edu.bjfu.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class PersonCondition implements Condition {

    /**
     *
     * @param context 判断条件能使用的上下文(环境)
     * @param metadata ？
     * @return 判断结果
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String osName = context.getEnvironment().getProperty("os.name");
        System.out.println(osName);
        return osName.contains("Windows");
    }
}
