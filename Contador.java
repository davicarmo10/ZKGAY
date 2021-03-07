public class Contador extends Estoque
{
        double valorCaneta = 0.50;
        double valorLapis = 0.40;
        double valorPapal = 1;
        double valorBorracha = 0.20;
        
        double valorCompraCaneta = 0.25;
        double valorCompraLapis = 0.20;
        double valorCompraPapal = 0.50;
        double valorCompraBorracha = 0.10;
        
        double lucro;
        double compras;
        double valorTP=75.8;
        
        public void contVendas(double produto, int numeroDeProdutos){
            if(produto==1){
                this.lucro+=valorCaneta*numeroDeProdutos;
            }
            if(produto==2){
                this.lucro+=valorLapis*numeroDeProdutos;
            }
            if(produto==3){
                this.lucro+=valorPapal*numeroDeProdutos;
            }
            if(produto==4){
                this.lucro+=valorBorracha*numeroDeProdutos;
            }
    }
    
    public void contCompras(double produto, int numeroDeProdutos){
            if(produto==1){
                this.compras-=valorCaneta*numeroDeProdutos;
            }
            if(produto==2){
                this.compras-=valorLapis*numeroDeProdutos;
            }
            if(produto==3){
                this.compras-=valorPapal*numeroDeProdutos;
            }
            if(produto==4){
                this.compras-=valorBorracha*numeroDeProdutos;
            }
    }
    
    public void lucro(){
        double lucroFinal;
        lucroFinal = (this.lucro)-(this.compras);
        System.out.println("o lucro foi de: "+lucroFinal);
    }
    }