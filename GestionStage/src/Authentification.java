import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Authentification {

    private String nameUser;
    private String wordPass;
    private JFrame frame;
    private JPanel jPane;
    private JTextField username,password;
    private JLabel labUsername,labPassword;

    private List<Stage> offres = new ArrayList();



    public Authentification(String nameUser, String wordPass) throws IOException {
        this.nameUser = nameUser;
        this.wordPass = wordPass;
        initialise(nameUser, wordPass);
    }

    private void initialise(String nameUser, String wordPass) {

//*********************************************************************
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 700);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Connexion");


        //***************************************************
        username = new JTextField();
        username.setBounds(399, 345, 200, 26);
        frame.getContentPane().add(username);
        username.setColumns(10);

        password = new JTextField();
        password.setBounds(399, 380, 200, 26);
        frame.getContentPane().add(password);
        password.setColumns(10);

        labUsername = new JLabel("Username :");
        labUsername.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
        labUsername.setBounds(326, 350, 74, 14);
        frame.getContentPane().add(labUsername);

        labPassword = new JLabel("Password :");
        labPassword.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
        labPassword.setBounds(326, 385, 74, 14);
        frame.getContentPane().add(labPassword);
        //*****************************************************

        JButton btnCon = new JButton("Se Connecter");
        btnCon.setBounds(348, 450, 200, 31);
        frame.getContentPane().add(btnCon);
        
        btnCon.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String usernameSaisie = username.getText().toString();
                String passwordSaisie = password.getText().toString();


                Encadrant e1 = new Encadrant("Dhekra");
                Encadrant e2 = new Encadrant("Julien");
                Encadrant e3 = new Encadrant("Sayous");
                Encadrant e4 = new Encadrant("Jean");
                Encadrant e5 = new Encadrant("Paul");

               // ConventionDeStage c1 = new ConventionDeStage(e1,,);

                EntrepriseAcceuil ea1 = new EntrepriseAcceuil("Bouygues", e1);
                EntrepriseAcceuil ea2 = new EntrepriseAcceuil("Bouygues", e2);
                EntrepriseAcceuil ea3 = new EntrepriseAcceuil("Bouygues", e3);
                EntrepriseAcceuil ea4 = new EntrepriseAcceuil("Bouygues", e4);
                EntrepriseAcceuil ea5 = new EntrepriseAcceuil("Bouygues", e5);
                Stage s1 = new Stage(ea1, "Conception et implémentation application Gestion de Stage", "Véllizy 2", "Moyenne", 600, "+Angular, etc...");
                Stage s2 = new Stage(ea2, "Conception et implémentation application Gestion des marchées publiques", "Villejuif", "A terme", 500, "+Jhipster, etc...");
                Stage s3 = new Stage(ea3, "Conception et implémentation Gestion mairie", "Versailles", "Moyenne", 300, "+Vue.js, etc...");
                Stage s4 = new Stage(ea4, "Administration, réseau et base de donnée", "Guyancourt", "A terme", 300, "+VirtualBox, etc...");
                Stage s5 = new Stage(ea5, "Conception et implémentation application Gestion de vol", "Lille", "Moyenne", 450, "+Angular, etc...");
                Stage s6 = new Stage(ea5, "Développeur Suport", "Lyon", "A terme", 500, "+Gestion Projet, etc...");
                Stage s7 = new Stage(ea4, "Développeur Frontend avec React", "Distantiel", "Moyenne", 400, "+React, etc...");
                Stage s8 = new Stage(ea3, "Développeur Backend avec Jhipster", "Montigny Bretoneux", "A terme", 600, "+Angular, etc...");
                Stage s9 = new Stage(ea2, "Développeur FullStack", "Bois d'arcy", "Moyenne", 400, "+Python, etc...");
                Stage s10 = new Stage(ea1, "Développeur Python", "Plaiisir Grignon", "A terme", 500, "+Python, etc...");
                offres.add(s1);offres.add(s2);offres.add(s3);offres.add(s4);offres.add(s5);offres.add(s6);offres.add(s7);offres.add(s8);offres.add(s9);offres.add(s10);

                String[] optionsToChoose = {
                        "Stage chez "+s1.getEntreprise().getNom()+" - Sujet : "+s1.getSujetPropose()+" -- à "+s1.getLieuExecution()+" / "+s1.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s2.getEntreprise().getNom()+" - Sujet : "+s2.getSujetPropose()+" -- à "+s2.getLieuExecution()+" / "+s2.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s3.getEntreprise().getNom()+" - Sujet : "+s3.getSujetPropose()+" -- à "+s3.getLieuExecution()+" / "+s3.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s4.getEntreprise().getNom()+" - Sujet : "+s4.getSujetPropose()+" -- à "+s4.getLieuExecution()+" / "+s4.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s5.getEntreprise().getNom()+" - Sujet : "+s5.getSujetPropose()+" -- à "+s5.getLieuExecution()+" / "+s5.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s6.getEntreprise().getNom()+" - Sujet : "+s6.getSujetPropose()+" -- à "+s6.getLieuExecution()+" / "+s6.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s7.getEntreprise().getNom()+" - Sujet : "+s7.getSujetPropose()+" -- à "+s7.getLieuExecution()+" / "+s7.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s8.getEntreprise().getNom()+" - Sujet : "+s8.getSujetPropose()+" -- à "+s8.getLieuExecution()+" / "+s8.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s9.getEntreprise().getNom()+" - Sujet : "+s9.getSujetPropose()+" -- à "+s9.getLieuExecution()+" / "+s9.getMontantPrevisionnel()+" euros",
                        "Stage chez "+s10.getEntreprise().getNom()+" - Sujet : "+s10.getSujetPropose()+" -- à "+s10.getLieuExecution()+" / "+s10.getMontantPrevisionnel()+" euros"
                };
                if (nameUser.equalsIgnoreCase("eleve") && wordPass.equalsIgnoreCase(passwordSaisie)) {

                    JFrame jFrame = new JFrame();
                    jFrame.setTitle("Choix Stage");
                    jFrame.setBounds(100, 100, 900, 700);
                    JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
                    jComboBox.setBounds(100, 300, 700, 30);



                    JLabel labStage = new JLabel("                                                            Merci de Choisir ton Stage");
                    labStage.setBounds(195,200,500,61);
                    labStage.setOpaque(true);
                    labStage.setBackground(Color.WHITE);

                    JLabel jLabel = new JLabel();
                    jLabel.setBounds(90, 100, 400, 100);

                    jLabel.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\imaStage.jpg"));
                    jLabel.setBounds(0,0,900,700);

                    JButton jButton = new JButton("Choisir");
                    jButton.setBounds(400, 340, 90, 40);



                    jFrame.add(jButton);
                    jFrame.add(jComboBox);
                    jFrame.add(labStage);
                    jFrame.add(jLabel);

                    jFrame.setLayout(null);
                    jFrame.setVisible(true);

                    jButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int index = 0;
                            String text;
                            for(int i=0;i<optionsToChoose.length;i++){
                                if(optionsToChoose[i] == jComboBox.getItemAt(jComboBox.getSelectedIndex())){
                                    index = i;
                                }
                            }
                            offres.get(index).setEstChoisit(true);

                            /*
                            if(offres.get(index).getEstChoisit()==true){
                                text = "true";
                                jLabel.setText(text);
                            }
                            */
                        }
                    });
                        //JOptionPane.showMessageDialog(null, "Connexion réussi");
                }else if(nameUser.equalsIgnoreCase("entreprise") && wordPass.equalsIgnoreCase(passwordSaisie)) {

                    String[] stageChoisit = new String[10];

                    for(int i=0;i<offres.size();i++){
                        if(offres.get(i).getEstChoisit()==true){
                            stageChoisit[i] = "Stage chez "+offres.get(i).getEntreprise().getNom()+" - Sujet : "+offres.get(i).getSujetPropose()+" -- à "+offres.get(i).getLieuExecution()+" / "+offres.get(i).getMontantPrevisionnel()+" euros";
                        }
                    }
                    JFrame jFrame = new JFrame();
                    jFrame.setTitle("Valider Stage");
                    jFrame.setBounds(100, 100, 900, 700);
                    JComboBox<String> jComboBox = new JComboBox<>(stageChoisit);
                    jComboBox.setBounds(100, 300, 700, 30);



                    JLabel labStage = new JLabel("                                            Merci de choisir le stage à valider en appuyant sur 'Signer convention'");
                    labStage.setBounds(195,200,500,61);
                    labStage.setOpaque(true);
                    labStage.setBackground(Color.WHITE);

                    JLabel jLabel = new JLabel();
                    jLabel.setBounds(90, 100, 400, 100);

                    jLabel.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\imaStage.jpg"));
                    jLabel.setBounds(0,0,900,700);

                    JButton jButton = new JButton("Signer convention");
                    jButton.setBounds(380, 340, 110, 40);



                    jFrame.add(jButton);
                    jFrame.add(jComboBox);
                    jFrame.add(labStage);
                    jFrame.add(jLabel);

                    jFrame.setLayout(null);
                    jFrame.setVisible(true);

                    jButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int index = 0;
                            String text;
                            for(int i=0;i<optionsToChoose.length;i++){
                                if(optionsToChoose[i] == jComboBox.getItemAt(jComboBox.getSelectedIndex())){
                                    index = i;
                                }
                            }
                            offres.get(index).setEstChoisit(true);

                            /*
                            if(offres.get(index).getEstChoisit()==true){
                                text = "true";
                                jLabel.setText(text);
                            }
                            */
                        }
                    });
                }
                else
                    JOptionPane.showMessageDialog(null, "erreur de connexion");
            }
        });
               
                

        JLabel jLabel1 = new JLabel();
        jLabel1.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\monCompte.png"));
        jLabel1.setBounds(250,0,400,150);
        frame.getContentPane().add(jLabel1);

        JLabel jLabel2 = new JLabel();
        jLabel2.setIcon(new ImageIcon("C:\\GestionDeStage\\GestionStage\\src\\image\\conn.png"));
        jLabel2.setBounds(270,235,460,360);
        frame.getContentPane().add(jLabel2);



        frame.setVisible(true);

    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getWordPass() {
        return wordPass;
    }

    public void setWordPass(String wordPass) {
        this.wordPass = wordPass;
    }
}
