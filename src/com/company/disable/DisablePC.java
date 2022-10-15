package com.company.disable;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DisablePC {
    private final short DELAY = 100;
    private Robot robot;


    public DisablePC(Robot robot){
        this.robot = robot;
        this.desligar();
    }

    public void desligar(){
        this.openExecute();
        robot.delay(3000);
        this.executDisable();
    }

    private void openExecute(){
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
    }
    private void executDisable(){
        robot.keyPress(KeyEvent.VK_S);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_H);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_H);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_U);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_U);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_T);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_T);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_D);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_D);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_O);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_W);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_W);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_N);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_MINUS);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_S);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_MINUS);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_T);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_T);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_SPACE);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_0);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_0);
        robot.delay(this.DELAY);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(this.DELAY);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(this.DELAY);
    }

}
