public class Tabuada{
  public static void main(String[] arg){
    for(int multiplicador=1; multiplicador<=10; multiplicador ++){
      for(int numero = 0; numero<=10; numero++){
        System.out.print(multiplicador * numero);
        System.out.print(" ");
      }
    }System.out.println();
  }
}
