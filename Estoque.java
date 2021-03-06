import javax.swing.JOptionPane;
import java.util.Scanner;

public class Estoque {
        double valorTotalDeProdutos=71.3;
        
        int caneta = 120;
        int lapis = 24;
        int papal = 5;
        int borracha = 6;
        
        double valorCaneta =0.50;
        double valorLapis = 0.40;
        double valorPapal = 0.10;
        double valorBorracha = 0.20;
        
        double valorTotalCaneta=60;
        double valorTotalLapis=9.6;
        double valorTotalPapal=0.5;
        double valorTotalBorracha=1.2;
    
    public void EstoqueAtual() {
        int canetaA = caneta;
        int lapisA = lapis;
        int papalA = papal ;
        int borrachaA = borracha;
    }
    
    void calculaLucro(int valor){
        switch(valor){
        case 1:
        break;
        }
    }
    
    
    public void MostrarEstoque() {
        JOptionPane.showMessageDialog(null,"Mostrar estoque em Unidade ou Caixas ?\n1 - UND.\n2 - Caixas.");
        Scanner in = new Scanner (System.in);
        int op = in.nextInt();
        if (op == 1) {
            JOptionPane.showMessageDialog(null,"há " + caneta + " Canetas no estoque\n" + "há "+ lapis + " lapis no estoque\n" + "há "+ papal + " papals no estoque\n" + "há "+ borracha + " borrachas no estoque");
        }
        else {
            JOptionPane.showMessageDialog(null,"há " + caneta/12 + " caixas de canetas no estoque\n" + "há "+ lapis/12 + " caixas de lapis no estoque\n" + "há "+ papal + "caixas de papals no estoque\n" + "há "+ borracha/6 + " caixas de borrachas no estoque");
        }
    }
    
    void mostrarLucro(){
            JOptionPane.showMessageDialog(null,"canetas " + caneta + "\n" + "lapis "+ lapis + "\n" + "papal "+ papal + "\n" + "borracha "+ borracha);
        
    }
    }
    
}