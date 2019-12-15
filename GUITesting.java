package SwingGUITeting;


import com.tulskiy.keymaster.x11.X11;
import org.python.indexer.ast.NKeyword;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.event.KeyEvent;

class GUITesting{

    //private Patt
    public static void main(String[] args) {
        String labelContent="No found";
        System.out.println("Execution started.......");
        Pattern dosa=new Pattern("D:\\Sickuli\\DosaF.png");
        Screen screen=new Screen();
        try {
           // screen.wait()
            /*screen.wait("D:\\Sickuli\\SubmitButton.png",5).keyDown(KeyEvent.VK_TAB);
            screen.wait("D:\\Sickuli\\SubmitButton.png",5).keyUp(KeyEvent.VK_TAB);*/

            screen.click("D:\\Sickuli\\\\application.png");
            screen.type("D:\\Sickuli\\UserNameTextField","UserName");

            screen.type("D:\\Sickuli\\TextfieldButton","shreeya");
           // screen.wait("D:\\Sickuli\\Textfield",5).type("Shreeya");Shreeya
            screen.click("D:\\Sickuli\\SubmitButton.png",2);
            System.out.println("Location : "+ screen.getTopLeft());
            System.out.println("Screen"+screen.getLastScreenImageFromScreen());
            System.out.println("Match or not : "+ screen.findText("nothing entered"));
            screen.click("D:\\Sickuli\\PanipuriDropDown.png");

           // screen.dragDrop("D:\\Sickuli\\PanipuriDropDown.png","D:\\Sickuli\\DosaOption.png");
            screen.click(dosa.similar((float) 0.90));
           /* screen.*/
                   /* labelContent=screen.wait("D:\\Sickuli\\Label.png").getText();*/
           /* System.out.println("Lable content  : "+labelContent);*/
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
            System.out.println("Element not found......");
        }

    }
}