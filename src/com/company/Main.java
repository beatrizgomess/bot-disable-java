package com.company;

import com.company.disable.DisablePC;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            new DisablePC(new Robot());
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
