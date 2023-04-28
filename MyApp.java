import javax.swing.JFrame;

public class MyApp {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10,10,700,600); // kích thước cửa sổ
        obj.setTitle("BrickBreaker");
        obj.setResizable(false); //Vô hiệu hóa khả năng điều chỉnh kích thước của cửa sổ
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
    
}