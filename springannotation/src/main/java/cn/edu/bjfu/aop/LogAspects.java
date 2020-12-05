package cn.edu.bjfu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * JoinPoint一定要放在参数列表的第一位
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int cn.edu.bjfu.aop.MyMath.div(int, int))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void startLog(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "准备运行，参数列表是\t--->\t{" + Arrays.asList(joinPoint.getArgs()) + "}");
    }

    @After("pointCut()")
    public void endLog(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "运行结束.");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void returnLog(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + "正常运行，结果是\t--->\t{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void exceptionLog(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getSignature().getName() + "运行异常，异常信息\t--->\t{"+ exception +"}");
    }
}
