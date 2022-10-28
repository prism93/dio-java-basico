public class Operadores {
    public static void main(String[] args){

        int numero = 5;
        // x incremento
        //numero = numero +1;

        //System.out.println(++ numero);
        System.out.println(--numero);
        System.out.println(numero);

        boolean variavel = true;
        //System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);

        //<Expressão Condicional> ? <Caso condição seja true> : 
        //<Caso condição seja false>
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);

        //comparação objetos ou textos

        String nomeUm = "Pri";
        String nomeDois = new String("Pri");
        
        System.out.println(nomeUm.equals(nomeDois));


        // operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }





    }
    
    
}
