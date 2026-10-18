import org.example.EroeNonIdoneoException;
import org.example.Reclutatore;

void main(){
    Reclutatore reclutatore = new Reclutatore();
    int difficolta = 75;

    for(int i = 0; i < 5; i++){
        try {
            IO.println("Recluta n " + (i + 1) + " : ");
            reclutatore.recluta(difficolta);
        }catch(EroeNonIdoneoException e){
            IO.println("Scartato: " + e.getMessage());
        }
    }

}
