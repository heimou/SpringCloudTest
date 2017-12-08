package com.ideal.pojo;

/**
 * @author liyujie
 * @Description: UserDo 测试类
 * @date 2017/12/8 9:37
 */
public class UserDo {

    private  int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
