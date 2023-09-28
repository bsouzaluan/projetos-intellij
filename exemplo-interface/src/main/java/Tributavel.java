public interface Tributavel {

    //Atributos são sempre constantes
    //mesmo sem o satic final (implicito)
    static final  double taxaFixa = 3.1;
     double getValorTributo();

     default  void calcularTributoAnual(){

         //esse metodo tem 200 linhas
         System.out.println("Padrão para qualquer classe");
     }
//     private analisarCalculoMensal(){
//
//         return 10.3;
//     }

}
