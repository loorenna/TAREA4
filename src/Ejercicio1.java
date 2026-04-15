public class Ejercicio1 {
    public  static  void  main(String[] args){
        Vendedor v1=new Vendedor("Andrea López","Tecnología",92);
        v1.setMontoVendido(2850.75);
        v1.setPorcentajeDeComisión(8);
        v1.informacionVendedor();
        System.out.println("Monto vendido: $"+v1.getMontoVendido());
        System.out.println("Porcentaje de comisión: "+v1.getPorcentajeDeComisión()+"%");
        System.out.println("-----------------------------------------------");
        v1.calcularComisión();
        v1.calcularIngresoTotal();
        System.out.println("Comisión: $"+v1.getComision());
        System.out.println("Ingreso total: $"+v1.getIngresoTotal());
        System.out.println("Estado de cumplimiento: "+v1.mostrarEstadoDeCumplimiento());
        v1.mostrarDesempeño();

    }
}
