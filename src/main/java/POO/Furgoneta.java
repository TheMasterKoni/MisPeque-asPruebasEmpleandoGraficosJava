package POO;

public class Furgoneta extends plataforma{
    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int capacidad_carga,int plazas_extra){
        super();//llama a la clase padre

        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }

    public String dimeDatosFurgoneta(){
        return "la capacidad de carga es: "+capacidad_carga+" y las plazas son: "+plazas_extra;
    }



}
