import java.util.Scanner;
public class Ejercicio2 {
    public  static  void  main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre completo: ");
        String nombreCompleto= sc.nextLine();
        System.out.println("Ingrese el número de identificación: ");
        int numeroDeIdentificacion= sc.nextInt();
        System.out.println("Ingrese la edad: ");
        int edad=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el tipo de seguro médico (Basico - Premium - Sin seguro): ");
        String tipoDeSeguroMedico=sc.nextLine();
        System.out.println("Ingrese el costo de consulta: ");
        double costoDeConsulta=sc.nextDouble();
        System.out.println("Ingrese el número de consultas realizadas: ");
        int numeroDeConsultasRealizadas=sc.nextInt();
        System.out.println("Ingrese el nivel de prioridad médica(1 al 5): ");
        int nivelDePrioridadMedica=sc.nextInt();

        Paciente p1=new Paciente(nombreCompleto,numeroDeIdentificacion,edad);
        p1.setTipoDeSeguroMedico(tipoDeSeguroMedico);
        p1.setCostoDeConsulta(costoDeConsulta);
        p1.setNumeroDeConsultasRealizadas(numeroDeConsultasRealizadas);
        p1.setNivelDePrioridadMedica(nivelDePrioridadMedica);

        System.out.println("----------------REPORTE PACIENTE------------------");
        p1.mostrarInfo();
        System.out.println("Tipo de seguro médico: "+p1.getTipoDeSeguroMedico());
        System.out.println("Costo de consulta: $"+p1.getCostoDeConsulta());
        System.out.println("Número de consultas realizadas: "+p1.getNumeroDeConsultasRealizadas());
        System.out.println("Nivel de prioridad médica: "+p1.getNivelDePrioridadMedica());
        System.out.println("--------------------------------------------------");
        p1.mostrarDescuento();
        p1.calcularCostoTotal();
        System.out.println("Costo total: $"+p1.getCostoTotal());
        p1.clasificarPaciente();
        p1.generalMensaje();


    }
}
