public class ifElse{
  public static void main(String[] arg){
    int idade = 15;
    int quantidadePessoas = 2;
    if(idade>=18){
      System.out.print("You're an adult!");
    }else if(idade<18 && quantidadePessoas >1){
      System.out.print("You're a minor, but come in nonetheless");
    }else
      System.out.print("You're a minor!");
  }
}
