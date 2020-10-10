package com.tang.design.interfaceisolation.template;

/**
 * @Classname ExcelDataParser
 * @Description [ EXCEL 解析 ]
 * @Author Tang
 * @Date 2020/10/10 14:12
 * @Created by ASUS
 */
public class ExcelDataParser extends AbstractDataParser{

    @Override
    public void parser() {
        System.out.println( "具体的操作..." );
    }

    @Override
    public void readFile() {
    }

    @Override
    public void printData() {
    }
}