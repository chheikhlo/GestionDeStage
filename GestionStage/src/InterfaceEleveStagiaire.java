import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InterfaceEleveStagiaire extends JFrame{

    JFrame frame;
    List<Stage> offres = new ArrayList();

    public InterfaceEleveStagiaire(List<Stage> listeOffres) throws IOException {
        this.offres = listeOffres;
        initialise(listeOffres);

    }


    private void initialise(List<Stage> listOffre) {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 700);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Choix Offres");


        //***************************************************

        JButton btnCon = new JButton("Se Connecter");
        btnCon.setBounds(348, 450, 200, 31);
        frame.getContentPane().add(btnCon);

        btnCon.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        /*
        JLabel jLabel2 = new JLabel();
        jLabel2.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\conn.png"));
        jLabel2.setBounds(270,235,460,360);
        frame.getContentPane().add(jLabel2);
        */


        frame.setVisible(true);

    }

    public List<Stage> getOffres() {
        return offres;
    }

    public void setOffres(List<Stage> offres) {
        this.offres = offres;
    }
}
