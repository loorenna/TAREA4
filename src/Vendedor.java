public class Vendedor {
    public String nombre;
    public String area;
	private double montoVendido;
    private double porcentajeDeComisión;
    public int cumplimientoDeMeta;
    private double comision;
    private double ingresoTotal;

    public Vendedor (String nombre,String area,int cumplimientoDeMeta){
        this.nombre=nombre;
        this.area=area;
        this.cumplimientoDeMeta=cumplimientoDeMeta;

    }
    public double getMontoVendido(){
        return montoVendido;
    }
    public  void setMontoVendido(double montoVendido){
        if(montoVendido>=0){
            this.montoVendido=montoVendido;
        }else {
            System.out.println("Monto inválido");
        }
    }
    public double getPorcentajeDeComisión(){
        return porcentajeDeComisión;
    }
    public  void setPorcentajeDeComisión(double porcentajeDeComisión){
        if (porcentajeDeComisión>0){
            this.porcentajeDeComisión=porcentajeDeComisión;

        }else {
            System.out.println("Porcerntaje inválido");
        }
    }
    public void informacionVendedor(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Área: "+area);
        System.out.println("Cumplimiento de meta: "+cumplimientoDeMeta);
    }
    public  void calcularComisión(){
        comision= montoVendido*(porcentajeDeComisión/100);
    }
    public double getComision(){
        return comision;
    }


}
