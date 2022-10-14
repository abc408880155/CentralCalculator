package reconstitution;

import javax.swing.*;
import java.awt.*;

/*
    复溶计算器：
        计算公式：Volume (to add to vial) = Mass (in vial) ÷ Desired Reconstitution Concentration

 */
public class Reconstitution extends JFrame {
    JLabel labelVolume;
    JLabel labelMass;
    JLabel labelDesire;

    JTextField textVolume;
    JTextField textMass;
    JTextField textDesire;
    JComboBox comboBoxVolume;
    JComboBox comboBoxMass;
    JComboBox comboBoxDesire;

    String[] volume = {"µL","ml"};
    String[] mass = {"µg","ng","mg"};
    String[] Desire = {"µg/ml","ng/ml","mg/ml"};

    public Reconstitution() {
        super("复溶计算器");
        Container c = getContentPane();
        setLayout(new FlowLayout());

        labelVolume = new JLabel("体积(加到每管)");
        labelMass = new JLabel("质量(每管)");
        labelDesire = new JLabel("需要的浓度");

        textVolume = new JTextField("",5);
        textMass = new JTextField("",5);
        textDesire = new JTextField("",5);

        comboBoxVolume = new JComboBox(volume);
        comboBoxMass = new JComboBox(mass);
        comboBoxDesire = new JComboBox(Desire);

        //将各个组件添加到面板
        c.add(labelVolume);
        c.add(labelMass);
        c.add(labelDesire);
        c.add(textVolume);
        c.add(comboBoxVolume);
        c.add(textMass);
        c.add(comboBoxMass);
        c.add(textDesire);
        c.add(comboBoxDesire);


    }

    //初试化窗体的init方法
    public static void init(JFrame jFrame, int width, int height){
        jFrame.setSize(width,height);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        init(new Reconstitution(),400,250);
    }
}
