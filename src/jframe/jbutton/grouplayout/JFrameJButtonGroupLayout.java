
package jframe.jbutton.grouplayout;
import javax.swing.*;
import java.awt.*;
/**
 * 
 * @author pawelstradomski
 */

public class JFrameJButtonGroupLayout extends JFrame
{

    public JFrameJButtonGroupLayout()
    {
        super("menedzer GroupLayout");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
    }
    public void initComponent()
    {
        GroupLayout layout = new GroupLayout(getContentPane());     //przypisujemy szybke "getContentPane" do GroupLayout
        this.getContentPane().setLayout(layout);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(button1, 10, 70, 200) //x,y,z: wymiary button. x-min, y-preferowana, z-max. 
                .addGroup(layout.createParallelGroup().addComponent(button2).addComponent(button4))
                .addComponent(button3, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE) //Zamiast wartosci x,y,z mozna ustawic defaultsize,short.maxvalue
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(bAnuluj)
        );
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3))
                .addComponent(button4)
                .addContainerGap(10, Short.MAX_VALUE) //dodajemy przerwe aby przerwa miedzy pozostalymi buttonami sie rozszerzala
                .addComponent(bAnuluj)
        );
        
    }
    JButton button1 = new JButton("component1");
    JButton button2 = new JButton("component2");
    JButton button3 = new JButton("component3");
    JButton button4 = new JButton("component4");
    JButton bAnuluj = new JButton("Anuluj");
    

    
    public static void main(String[] args) {
       
        new JFrameJButtonGroupLayout().setVisible(true);
    }
    
}
