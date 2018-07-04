package com.wusicheng.e18_adapter_pattern.old;

/**
 * @author wsc
 * @date 2018/7/4
 * @description
 */

public class Main {
    public static void main(String[] args) {
        ITypeC typeC = new TypeCImpl();
        typeC.quickFilling();

        IMicroUsb microUsb = new MicroUsbImpl();
        microUsb.slowFilling();
    }
}
