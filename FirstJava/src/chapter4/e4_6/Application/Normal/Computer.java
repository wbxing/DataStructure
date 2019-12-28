package chapter4.e4_6.Application.Normal;

public class Computer {
    /**
     * 插入USB设备的方法
     * @param usb USB子类对象
     */
    public void plugin(USB usb) {
        // USB 设备开始工作
        usb.start();
        // USB 设备停止工作
        usb.stop();
    }
}
