import javax.swing.JFrame;
/**
 *
 * @author Bagus Perdana
 */
public class frameutama extends JFrame  {
 public frameutama()
 {
     this.setSize(200,200);
     this.setLocation(200, 200);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 public void tampil()
 {
     this.setVisible(true);
 }
 
 public void tampil(String nama)
 {
     this.setTitle(nama);
     this.setVisible(true);
 }        
}
