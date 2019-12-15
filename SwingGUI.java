package SwingGUI;

// Java program to create a blank text
// field of definite number of columns.
import java.awt.event.*;
import javax.swing.*;
class SwingGUI extends JFrame implements ActionListener {
    // JTextField
    static JTextField t,t1;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    // label to display text
    static JLabel l,l1;

    // default constructor
    SwingGUI()
    {

    }
    String [] foodArray={"Samosa","Dosa","Panipuri"};
     JComboBox foodComboBox=new JComboBox(foodArray);
    JLabel foodDetailLabel=new JLabel();

    public void function(){
        foodComboBox.setSelectedIndex(2);
        foodComboBox.addActionListener(this);
        // create a new frame to store text field and button
        f = new JFrame("textfield");

        // create a label to display text
        l = new JLabel("nothing entered");
        l1=new JLabel("UserName");

        // create a new button
        b = new JButton("submit");

        // create a object of the text class


        // addActionListener to button


        // create a object of JTextField with 16 columns
        t = new JTextField(16);
        t1 = new JTextField(16);

        // create a panel to add buttons and textfield
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(l1);
        p.add(t);
        p.add(t1);
        p.add(b);
        p.add(l);
        p.add(foodComboBox);
        p.add(foodDetailLabel);


        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.show();
    }

    public static void main(String[] args) {
        SwingGUI te = new SwingGUI();
        te.function();
        b.addActionListener(te);
    }

    /*// if the vutton is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // set the text of the label to the text of the field
            l.setText(t.getText());

            // set the text of field to blank
            t.setText("  ");
        }
    }*/

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==foodComboBox){
            JComboBox cb=(JComboBox)e.getSource();
            String foodItem=(String)cb.getSelectedItem();
            if(foodItem.equalsIgnoreCase("Samosa"))
                foodDetailLabel.setText("Samosa price is 15Rs. It is ymmm!!");
            else if(foodItem.equalsIgnoreCase("Dosa"))
                foodDetailLabel.setText("Dosa price is 25Rs. It is crispy!!");
            else if(foodItem.equalsIgnoreCase("Panipuri"))
                foodDetailLabel.setText("Dosa price is 18Rs. It is spicy!!");
            else
                foodDetailLabel.setText("Select Something yar!!!!!!!!!!!!!!");
        }
    }
}

