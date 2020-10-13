package com.tang.design.interfaceisolation.template;

/**
 * @Classname DataParser
 * @Description [ 数据解析 ]
 * @Author Tang
 * @Date 2020/10/10 14:08
 * @Created by ASUS
 */
public abstract class AbstractDataParser {

    /***
     * @methodName doParser
     * @description [ 开始解析 ]
     * @date 2020/10/10 14:12
     * @param []
     * @return
     **/
    public void doParser() {
        readFile();
        parser();
        printData();
    }

    /**
     * 解析方法
     */
    protected abstract void parser();

    /**
     * 读取文件
     */
    protected abstract void readFile();

    /**
     * 打印数据
     */
    protected abstract void printData();

}