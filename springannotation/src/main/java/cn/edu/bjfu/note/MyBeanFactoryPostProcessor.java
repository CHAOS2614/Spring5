package cn.edu.bjfu.note;

/**
 * BeanPostProcessor:bean后置处理器，bean创建对象初始化前后进行拦截工作的
 *
 * @see <a href="https://www.bilibili.com/video/BV1gW411W7wy?p=39">BeanFactoryPostProcessor</a>
 * beanFactory的后置处理器;
 *      在BeanFactory标准初始化之后调用，来定制和修改BeanFactory的内容
 *      所有的bean定义已经保存加载到BeanFactory，但是bean的实例还未创建
 *
 *  BeanFactoryPostProcessor原理
 *  (1) IoC容器创建对象
 *  (2) invokeBeanFactoryPostProcessor(beanFactory)
 *          如何找到所有的BeanFactoryPostProcessor并执行他们的方法;
 *              a.直接在beanFactory中找到所有类型是BeanFactoryPostProcessor的组件，并执行他们的方法
 *              b.在初始化创建其他组件前面执行
 *
 * @see <a href="https://www.bilibili.com/video/BV1gW411W7wy?p=40">
 *     BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor:</a>
 *          postProcessBeanDefinitionRegistry
 *
 * @see <a href="https://www.bilibili.com/video/BV1gW411W7wy?p=41">ApplicationListener:监听容器中发布的事件</a>
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
public class MyBeanFactoryPostProcessor {
}
