package com.ideal.test.webClient.Utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * @author liyujie
 * @Description:  对操作spring applicationcontext提供基本封装  方便使用
 * @date 2017/10/15 18:46
 */
@Component
public class SpringBeanManagerUtils implements ApplicationContextAware, DisposableBean {
    /**
     * spring bean上下文
     *
     */
    private static ApplicationContext applicationContext;

    /**
     * 根据名称 获取bean
     *
     * @param name 注册的bean名称
     * @return T
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBeanByName(String name) {
        checkApplicationContext();
        return (T) applicationContext.getBean(name);
    }

    /**
     * 根据类型 获取bean
     *
     * @param clazz 注册bean的类型
     * @return T
     */
    public static <T> T getBeanByType(Class<T> clazz) {
        checkApplicationContext();
        return applicationContext.getBean(clazz);
    }


    /**
     * 获取application中所有注册的bean 列表
     *
     * @return String[]
     */
    public static String[] getBeanDefinitionNames() {
        checkApplicationContext();
        return applicationContext.getBeanDefinitionNames();
    }

    /**
     * 统计application中所有bean的数量
     *
     * @return Integer
     */
    public static Integer getBeanDefinitionCount() {
        checkApplicationContext();
        return applicationContext.getBeanDefinitionCount();
    }

    /**
     * 根据注解获取 beanNameList
     *
     * @param annotation
     * @return String[]
     */
    public static String[] getBeanNameListByAnnotation(Class<? extends Annotation> annotation) {
        checkApplicationContext();
        return applicationContext.getBeanNamesForAnnotation(annotation);
    }

    /**
     * 根据bean类型获取所有的bean
     *
     * @param clazz
     * @return String[]
     */
    public static String[] getBeanNamesForType(Class clazz) {
        checkApplicationContext();
        return applicationContext.getBeanNamesForType(clazz);
    }

    /**
     * 根据类型 获取 所有这个类型的bean  map 键为bean名字  值为注册的bean
     *
     * @param clazz
     * @return Map
     */
    public static <T> Map<String, T> getBeansOfType(Class<T> clazz) {
        checkApplicationContext();
        return applicationContext.getBeansOfType(clazz);
    }


    /**
     * 检测applicationcontext是否可用
     *
     *
     */
    private static void checkApplicationContext() {
        if (applicationContext == null) {
            throw new RuntimeException("spring applicationContext is null !!!");
        }
    }


    /**
     * 销毁方法
     * @throws Exception
     */
    public void destroy() throws Exception {
        this.applicationContext = null;
    }

    /**
     * 设置上下文
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
