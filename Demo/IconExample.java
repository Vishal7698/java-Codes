import java.awt.*;     
class IconExample {     
IconExample(){     
Frame f=new Frame();     
Image icon = Toolkit.getDefaultToolkit().getImage("don.png");    
f.setIconImage(icon);    
f.setLayout(null);     
f.setSize(400,400);     
f.setVisible(true);     
}     
public static void main(String args[]){     
new IconExample();     
}     
}    
