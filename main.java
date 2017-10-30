class Main {
  public static void main(String[] args) {
    
    Circulo c = new Circulo();
    c.setRaio(2);
    double area = c.getArea();
    
    System.out.println(area);
  }
}

class Figura{
  private String nome;
  
  public Figura(){
  }
  
  public void setNome(String n){
    this.nome = n;
  }
  
  public String getNome(){
    return this.nome;
  }
  
  public double getArea(){
    return 0;
  }
}

class Circulo extends Figura{
  private double raio;
  
  public double getArea(){
    return 3.14*this.raio*this.raio;
  }
  
  public void setRaio(double d){
    this.raio = d;
  }
}

class Retangulo extends Figura{
   
   public double getArea(){
    return 0;
  }
}
