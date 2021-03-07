import java.util.Scanner;

public class menu extends Estoque{
    Scanner blz = new Scanner(System.in); 
    Contador c = new Contador();
    
    int escolha = 0, qnt=0, produtoRetirar, produtoColocar, cond = 0, uoc=0;
    int tipo;
    int contVendasCaneta=0, contVendasLapis=0, contVendasPapal=0, contVendasBorracha=0;
    int contComprasCaneta=0, contComprasLapis=0, contComprasPapal=0, contComprasBorracha=0;
    
public void opcoes(){
            System.out.println("SEJA BEM VINDO");
            System.out.println("1-COMPRAR");
            System.out.println("2-VENDER");
            System.out.println("3-QUANTIDADE DE ESTOQUE");
            System.out.println("4-LUCRO ATUAL");
            System.out.println("5-SAIR DO PROGRAMA");
            
            escolha = blz.nextInt();
        }
          
    void menu() {   
        while (cond < 1) {
            opcoes();
            switch (escolha) {

                case 1:
                    exibirProdutos(escolha);
                    produtoColocar = blz.nextInt();
                    
                    System.out.println("unidades ou caixas? 1-unidades || 2-caixas");
                    uoc = blz.nextInt();
                    switch (produtoColocar) {
                        case 1:
                            if(uoc == 1){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                            }if(uoc == 2){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                                qnt=qnt*10;
                            }
                            adcCaneta(caneta, qnt);
                            tipo=1;
                            c.contCompras(tipo, qnt);
                            break;
                        case 2:
                            if(uoc == 1){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                            }if(uoc == 2){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                                qnt=qnt*12;
                            }                                                      
                            adcLapis(lapis, qnt);
                            tipo=2;
                            c.contCompras(tipo, qnt);
                            break;
                        case 3:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            papal = papal + qnt;
                            tipo=3;
                            c.contCompras(tipo, qnt);
                            break;
                        case 4:
                            if(uoc == 1){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                            }if(uoc == 2){
                                vendOuComp(escolha);
                                qnt = blz.nextInt();
                                qnt=qnt*6;
                            }
                            adcBorracha(borracha, qnt);
                            tipo=4;
                            c.contCompras(tipo, qnt);
                            break;
                    }        
                    break;
                case 2:
                    exibirProdutos(escolha);
                    this.produtoRetirar = blz.nextInt();
                    switch (produtoRetirar) {
                        case 1:
                        //fazer pra vender tbm em caixas
                            System.out.println(escolha);
                            qnt = blz.nextInt();
                            vendeCaneta(caneta, qnt);
                            tipo=1;
                            c.contVendas(tipo, qnt);
                            break;
                        case 2:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            tipo=2;
                            vendeLapis(lapis, qnt);
                            c.contVendas(tipo, qnt);
                            break;
                        case 3:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            papal = papal - qnt;
                            tipo=3;
                            c.contVendas(tipo, qnt);
                            break;
                        case 4:
                            vendOuComp(escolha);
                            qnt = blz.nextInt();
                            vendeBorracha(borracha, qnt);
                            tipo=4;
                            c.contVendas(tipo, qnt);
                            break;
                    }
                    break;
                case 3:
                    exibirProdutos(escolha);
                    break;

                    case 4:
                    c.lucro();
                    break;
                case 5:
                    cond = 2;
                    break;

            }
        }
    }
}
