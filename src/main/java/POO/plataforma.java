package POO;

public class plataforma {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_paltaforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;


    public plataforma() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_paltaforma = 500;
    }

    public String getDatosGenrales() {
        return "the platform has " + ruedas + " ruedas. large " + largo / 1000 + " metros witch a ancho from " + ancho + "CM with  peso from " + peso_paltaforma + "KG";
    }

    public String getRuedas() {
        return "el coche tiene: " + ruedas;
    }
    public void setRuedas(int ruedas){
        this.ruedas=ruedas;
    }

    public void setColor(String color_coche) {
        color = color_coche;
    }

    public String getColor() {
        return "el color del coche es: " + color;
    }

    public void setAsientos_cuero(String asientos_cuero) {
        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else
            this.asientos_cuero = false;
    }

    public String getAsientosCuero() {
        if (asientos_cuero == true) {
            return "el coche tiene asientos de cuero";
        } else
            return "el coche tiene asientos de serie";
    }

    public void setClimatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }

    public String getCimatizador() {
        if (asientos_cuero == true) {
            return "el coche tiene climatizador";
        } else
            return "el coche tiene aire acondicionado";
        }

        public String getSetPesoTotal(){
            int pesoCarroceria = 500;
            if(asientos_cuero){
                peso_total=peso_paltaforma+50;
            }
            if(climatizador){
                peso_total=peso_total+20;
            }
            return "el peso total de la plataforma es: "+(peso_total+motor)+"KG";
        }

        public int getPrecioPlataforma(){
            int preciFinal=1000;
            if (asientos_cuero){
                preciFinal+=2000;
            }
            if (climatizador){
                preciFinal+=1500;
            }
            return preciFinal;
        }

    }