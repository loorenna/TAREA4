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
    public void mostrarDescuento(){
        if (tipoDeSeguroMedico.equals("Basico")){
            System.out.println("Tiene un descuento del 10%");
        } else if (tipoDeSeguroMedico.equals("Premium")) {
            System.out.println("Tiene un descuento del 20%");
        } else if (tipoDeSeguroMedico.equals("Sin seguro")) {
            System.out.println("No aplica descuento");
        }
    }
    public  void  calcularCostoTotal(){
        if (tipoDeSeguroMedico.equals("Basico")){
            costoTotal = costoDeConsulta - (costoDeConsulta * 0.10);
        } else if (tipoDeSeguroMedico.equals("Premium")) {
            costoTotal = costoDeConsulta - (costoDeConsulta * 0.20);
        } else if (tipoDeSeguroMedico.equals("Sin seguro")) {
            costoTotal = costoDeConsulta;
        }
    }
    public  double getCostoTotal(){
        return costoTotal;
    }
    public  void  clasificarPaciente(){
        if (nivelDePrioridadMedica==1){
            System.out.println("Clasificación: Prioridad baja");
        } else if (nivelDePrioridadMedica==2 || nivelDePrioridadMedica==3) {
            System.out.println("Clasificación: Prioridad media");
        } else if (nivelDePrioridadMedica==4 || nivelDePrioridadMedica==5) {
            System.out.println("Clasificación: Alta prioridad");
        }
    }
    public  void  generalMensaje(){
        if (nivelDePrioridadMedica==1){
            System.out.println("Mensaje médico: Control regular");
        } else if (nivelDePrioridadMedica==2 || nivelDePrioridadMedica==3) {
            System.out.println("Mensaje médico: Seguimiento necesario");
        } else if (nivelDePrioridadMedica==4 || nivelDePrioridadMedica==5) {
            System.out.println("Mensaje médico: Atención inmediata requerida");
        }
    }
    public void mostrarInfo(){
        System.out.println("Nombre completo: "+nombreCompleto);
        System.out.println("Número de identificación: "+numeroDeIdentificacion);
        System.out.println("Edad: "+edad);
    }




}
