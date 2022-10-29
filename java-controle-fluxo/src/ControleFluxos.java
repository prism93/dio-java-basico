public class ControleFluxos {
    public static void main(String[] args){

      
        int mes = 01;

        if (mes == 01){
            System.out.println("É o meu aniversário");
        }else{
            System.out.println("Não é meu aniversário");
        } 

       ferias();
        

    } 
    
    private static void ferias(){

        int mes = 07;

        switch (mes){ 
            case 01:
            case 07:
            case 12:
                System.out.println("Férias");
                break;
            default:
                System.out.println("Não estou de férias");
                break;
        }

    }
}
