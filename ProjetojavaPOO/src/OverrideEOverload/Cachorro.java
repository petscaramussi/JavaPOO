package OverrideEOverload;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("au au au");
    }
    

    public void reagir(boolean dono){
        if(dono  == true){
            System.out.println("abanar e latir");
        }else{
            System.out.println("ignorar");
        }
    }

    public void reagir(int hora, int minuto){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("ignorar");
        }else{
            System.out.println("abanar e latir");
        }
    }
}
