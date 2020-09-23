package com.iappium.page.element;


import com.iappium.basepage.BaseApp;
import com.iappium.page.data.MiniParamsData;
import io.appium.java_client.android.AndroidDriver;
import lombok.extern.slf4j.Slf4j;

/**
 * 元素层
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/8/4 14:31
 */
@Slf4j
public class EnterMiniElemnt {
    BaseApp baseApp = new BaseApp();
    //调取baseAPP下滑手势方法
    public void swipToDown(AndroidDriver driver){
        baseApp.swipeToDown(driver);
    }
    //调用baseApp点击方法
    public void tap(AndroidDriver driver){
        //点击具体坐标
        baseApp.taptest(driver, MiniParamsData.X,MiniParamsData.Y);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 执行adb命令tap点击、text输入
     * */
    public void adbInput() {
        baseApp.adbInput(MiniParamsData.ADBIPUT);
    }
}