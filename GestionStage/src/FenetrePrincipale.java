import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class FenetrePrincipale extends JFrame{



    private JFrame frame;
    private JPanel jPane;
    private JLabel jLabel;

    public FenetrePrincipale() throws IOException {
        initialise();
    }

    private void initialise() throws IOException {

        frame = new JFrame();
        jLabel = new JLabel();
        frame.setBounds(100,100,900,700);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Utilisateur");


        JButton btnDir = new JButton("DIRECTEUR");
        JLabel labDir = new JLabel("     DIRECTEUR");
        btnDir.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\direction.png"));
        btnDir.setBounds(98,220,200,200);
        labDir.setOpaque(true);
        labDir.setBackground(Color.WHITE);
        labDir.setBounds(147,425,100,31);

        btnDir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();

                    try {
                        Authentification auth = new Authentification("Directeur","Directeur");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    ;
                }
            }
        ) ;

        frame.getContentPane().add(labDir);
        frame.getContentPane().add(btnDir);

        JButton btnEnt = new JButton("ENTREPRISE");
        JLabel labDir1 = new JLabel("     ENTREPRISE");
        btnEnt.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\entreprise.png"));
        btnEnt.setBounds(348,220,200,200);
        labDir1.setOpaque(true);
        labDir1.setBackground(Color.WHITE);
        labDir1.setBounds(395,425,100,31);
        btnEnt.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     frame.dispose();

                     try {
                         Authentification auth = new Authentification("Entreprise","Entreprise");
                     } catch (IOException ex) {
                         throw new RuntimeException(ex);
                     }

                     ;
                 }
             }
        ) ;
        frame.getContentPane().add(labDir1);
        frame.getContentPane().add(btnEnt);

        JButton btnEle = new JButton("ELEVE");
        JLabel labDir2 = new JLabel("           ELEVE");
        btnEle.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\etudiant.png"));
        labDir2.setBounds(647,425,100,31);
        labDir2.setOpaque(true);
        labDir2.setBackground(Color.WHITE);
        btnEle.setBounds(598,220,200,200);
        btnEle.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 frame.dispose();

                 try {
                     Authentification auth = new Authentification("Eleve","Eleve");
                 } catch (IOException ex) {
                     throw new RuntimeException(ex);
                 }

                 ;
             }
         }
        ) ;
        frame.getContentPane().add(labDir2);
        frame.getContentPane().add(btnEle);

        JLabel jLabel1 = new JLabel();
        jLabel1.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\convention.jpg"));
        jLabel1.setBounds(0,0,900,700);
        frame.getContentPane().add(jLabel1);


        frame.setVisible(true);

    }
}
