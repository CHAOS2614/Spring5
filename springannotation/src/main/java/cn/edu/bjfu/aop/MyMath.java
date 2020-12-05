package cn.edu.bjfu.aop;

import org.springframework.stereotype.Service;

/**
 * @author Chao Huaiyu
 * @date 2020/12/5
 */
@Service
public class MyMath {

    public int div(int i,int j){
        System.out.println("MyMath\t--->\t开始除法计算···");
        return i/j;
    }
}
