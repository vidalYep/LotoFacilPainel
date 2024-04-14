import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painel extends JFrame implements ActionListener {

    // DECLARANDO OS BOTOES
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;

    public Painel() {

        // CRIANDO E NOMEANDO OS BOTOES
        botao1 = new JButton("Apostar de 0 a 100");
        botao2 = new JButton("Apostar de A a Z");
        botao3 = new JButton("Apostar par ou impar");

        // PASSANDO OS PARAMENTROS DE MEDIDA E POSICAO DOS BOTOES
        botao1.setBounds(200, 100, 200, 50);
        botao2.setBounds(200, 200, 200, 50);
        botao3.setBounds(200, 300, 200, 50);

        // ADICIONANDO OS LISTENERS DE AÇÃO AOS BOTOES
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);

        // TITULO DO FORMULARIO
        setTitle("LotoFacil");
        // LARGURA E ALTURA DO FORMULARIO
        setSize(600, 500);
        setVisible(true);
        // O PROGRAMA PARA DE EXECUTAR ASSIM QUE EH FECHADO O FORMULARIO
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // CENTRALIZA O FORMULARIO NO MEIO DA TELA
        setLocationRelativeTo(null);
        // NAO EH POSSIVEL REDEMENSINAR O FORMULARIO
        setResizable(false);
        // ADICIONAR O PARAMENTRO NULL PARA O BOTAO NAO BUGAR
        setLayout(null);

        //ADICIONANDO OS BOTOES NO FORMULARIO
        add(botao1);
        add(botao2);
        add(botao3);

    }

    // METODO PARA LIDAR COM EVENTOS DE ACAO DOS BOTOES
    public void actionPerformed(ActionEvent e) {

        switch(e.getActionCommand()) {
            case "Apostar de 0 a 100":
                apostar0a100();
                break;
            case "Apostar de A a Z":
                apostarAaZ();
                break;
            case "Apostar par ou impar":
                apostarpareimpar();
                break;
        }
    }

    // EVENTOS PARA OS TIPO DE APOSTA
    private void apostar0a100(){
        //VALIDACAO DO VALOR DIGITADO
        // TRY CATCH PARA RETORNAR UMA MENSAGEM DE ERRO CASO FOR DIGITADO ALGO DIFERENTE DE NUMERO
        try {

            String aposta = JOptionPane.showInputDialog(null, "Digite um numero entre 0 e 100:");
            int valor = Integer.parseInt(aposta);
            //GERA UM NÚMERO ALEATORIO DE 0 A 100
            Random gerador = new Random();
            int aleatorio = gerador.nextInt(101);

            if (valor >= 0 && valor <= 100) {

                if (valor == aleatorio) {
                    JOptionPane.showMessageDialog(null, "Parabéns! O número sorteado foi o mesmo que vc escolheu!");
                }else{
                    JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + aleatorio);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido! O número digitado não esta entre 0 e 100");
            }
        }
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O valor digitado para essa aposta está inválido");
        }
    }

    private void apostarAaZ(){

        String aposta = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z:");
        char LetraPremiada = 'S';

        //VERIFICAR SE O CARACTERE DIGITADO É UMA LETRA
        if (aposta != null && aposta.length() == 1 && Character.isLetter(aposta.charAt(0))) {
            char letra_aposta = Character.toUpperCase(aposta.charAt(0));

            if(letra_aposta == LetraPremiada){
                JOptionPane.showMessageDialog(null,"Parabéns! A letra sorteado foi a mesma que vc escolheu!");
            }else{
                JOptionPane.showMessageDialog(null,"Não foi dessa vez. A letra premiada era: "+ LetraPremiada);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Aposta Inválida.");
        }


    }

    private void apostarpareimpar(){
        //VALIDACAO DO VALOR DIGITADO
        // TRY CATCH PARA RETORNAR UMA MENSAGEM DE ERRO CASO FOR DIGITADO ALGO DIFERENTE DE NUMERO
        try {
            String aposta = JOptionPane.showInputDialog(null, "Digite um numero par ou impar:");
            int valor = Integer.parseInt(aposta);

            if(valor % 2 == 0){
                JOptionPane.showMessageDialog(null, "Parabéns! Foi sorteado todos os numeros pares!");
            }else{
                JOptionPane.showMessageDialog(null, "Que pena! Foi sorteado apenas numero pares!");
            }
        }
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O valor digitado para essa aposta está inválido");
        }
    }

    public static void main (String[]args){
        new Painel();
    }

}