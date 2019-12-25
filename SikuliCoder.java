package Utile;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.event.KeyEvent;

public class SikuliCoder {

    private Pattern element;
    Screen screen;

    public SikuliCoder(){
        screen =new Screen();
    }

    public void sikuliType(String elementName,String massage){

            element = new Pattern("D:\\springData\\SikuliJarExperiment\\src\\main\\resources\\ScreenShort\\" + elementName + ".png");
        try {
            screen.type(element, massage);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }
    public void sikuliTypeEnter(String elementName,String massage){

        element = new Pattern("D:\\springData\\SikuliJarExperiment\\src\\main\\resources\\ScreenShort\\" + elementName + ".png");
        try {
            screen.type(element, massage);
            screen.keyDown(KeyEvent.VK_ENTER);
            screen.keyUp(KeyEvent.VK_ENTER);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }

    public void sikuliTypeWithTab(String elementName,String massage,int noTab){
        System.out.println("noTab : "+noTab);
        int tabNoTime=0;
        element = new Pattern("D:\\springData\\SikuliJarExperiment\\src\\main\\resources\\ScreenShort\\" + elementName + ".png");
        try {
            screen.click(element);
            do{
                tabNoTime++;
                System.out.println("TabNoTime : "+tabNoTime);
                screen.keyDown(KeyEvent.VK_TAB);
                screen.keyUp(KeyEvent.VK_TAB);
            }while(tabNoTime!=noTab);
            screen.type(massage);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }
    public void sikuliDoubleClickThenType(String elementName,String massage) {

        element = new Pattern("D:\\springData\\SikuliJarExperiment\\src\\main\\resources\\ScreenShort\\" + elementName + ".png");
        try {
            screen.doubleClick(element);
            screen.keyDown(KeyEvent.VK_DELETE);
            screen.keyUp(KeyEvent.VK_DELETE);
            screen.type(element,massage);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

    }
    public void dropDownElement(String elementName,String option) throws FindFailed {
        element = new Pattern("D:\\springData\\SikuliJarExperiment\\src\\main\\resources\\ScreenShort\\" + elementName + ".png");
        // Creating array of string length
        char[] ch = new char[option.length()];
        screen.click(element);
        // Copy character by character into array
        for (int i = 0; i < option.length(); i++) {
            ch[i] = option.charAt(i);
            if(ch[i]==' ')
                continue;
            screen.keyDown(Key.CTRL);
            screen.keyUp(Key.CTRL);
            screen.keyDown(Character.toString(ch[i]));
            screen.keyUp(Character.toString(ch[i]));
        }
        screen.click();
        // Printing content of array

    }

}
