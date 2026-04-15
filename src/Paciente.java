public class Paciente {
    public String nombreCompleto;
    public int numeroDeIdentificacion;
    private String tipoDeSeguroMedico;
    public int edad;
    private double costoDeConsulta;
    private int numeroDeConsultasRealizadas;
    private int nivelDePrioridadMedica;
    private double costoTotal;
    public Paciente(String nombreCompleto,int numeroDeIdentificacion,int edad){
        this.nombreCompleto=nombreCompleto;
        this.numeroDeIdentificacion=numeroDeIdentificacion;
        if (edad>0) {
            this.edad = edad;
        }else {
            System.out.println("Edad inválida");
        }
    }
    public void setTipoDeSeguroMedico(String tipoDeSeguroMedico){
        this.tipoDeSeguroMedico=tipoDeSeguroMedico;
    }
    public String getTipoDeSeguroMedico(){
        return tipoDeSeguroMedico;
    }
    public void setCostoDeConsulta(double costoDeConsulta){
        if (costoDeConsulta>0) {
            this.costoDeConsulta = costoDeConsulta;
        }else {
            System.out.println("Costo inválido");
        }
    }
    public double getCostoDeConsulta(){
        return costoDeConsulta;
    }
    public  void  setNumeroDeConsultasRealizadas(int numeroDeConsultasRealizadas){
        if (numeroDeConsultasRealizadas>=0) {
            this.numeroDeConsultasRealizadas = numeroDeConsultasRealizadas;
        }else {
            System.out.println("Número invalido");
        }
    }
    public  int getNumeroDeConsultasRealizadas(){
        return numeroDeConsultasRealizadas;
    }
    public  void  setNivelDePrioridadMedica(int nivelDePrioridadMedica){
        if (nivelDePrioridadMedica>=1 && nivelDePrioridadMedica<=5) {
            this.nivelDePrioridadMedica = nivelDePrioridadMedica;
        }else {
            System.out.println("Nivel inválido");
        }
    }
    public int getNivelDePrioridadMedica(){

        return nivelDePrioridadMedica;
    }



}
