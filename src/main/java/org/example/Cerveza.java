package org.example;
import java.time.LocalDate;
public class Cerveza {
    private Integer id;
    private String marca;
    private LocalDate fechaFabricacion;
    private LocalDate fechaVencimiento;
    private MateriasPrimas materiasPrimas;
    private Integer cantidadEstablecida;
    private Integer cantidadReal;

    private static final Integer CANTIDAD_MENOR_QUE_ESPECIFICADA = -1;
    private static final Integer CANTIDADES_IGUALES = 0;
    private static final Integer CANTIDAD_MAYOR_QUE_ESPECIFICADA = 1;

    public Cerveza(String marca, LocalDate fechaFabricacion, LocalDate fechaVencimiento, MateriasPrimas materiasPrimas,
                   Integer cantidadEstablecida, Integer cantidadReal) {
        this.id = generarID();
        this.marca = marca;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.materiasPrimas = materiasPrimas;
        this.cantidadEstablecida = cantidadEstablecida;
        this.cantidadReal = cantidadReal;
    }

    Cerveza(){
        this.id = generarID();
        this.marca = null;
        this.fechaFabricacion = LocalDate.now();
        this.fechaVencimiento = LocalDate.now();
        this.materiasPrimas = MateriasPrimas.C;
        this.cantidadEstablecida = 0;
        this.cantidadReal = 0;
    }

    private Integer generarID() {
        int inicio = 0;
        int fin = 8000;
        return (int)(Math.random() * ((fin - inicio) + 1)) + inicio;
    }

    Cerveza(String marca, MateriasPrimas materiaPrima, Integer cantidadReal){
        this.id = generarID();
        this.marca = marca;
        this.fechaFabricacion = LocalDate.now();
        this.fechaVencimiento = LocalDate.now();
        this.materiasPrimas = materiaPrima;
        this.cantidadReal = cantidadReal;
        this.cantidadEstablecida = 0;
    }

    public Integer calcularCantidad(){
        if (this.cantidadEstablecida>this.cantidadReal)
        {
            System.out.println("Cantidad Real menor que la especificada");
            return CANTIDAD_MENOR_QUE_ESPECIFICADA;
        }
        if (this.cantidadEstablecida<this.cantidadReal){
            System.out.println("Cantidad Real mayor que la especificada");
            return CANTIDAD_MAYOR_QUE_ESPECIFICADA;
        }
        System.out.println("Cantidad Real igual que la especificada");
        return CANTIDADES_IGUALES;
    }
    public Boolean estaVencida(){
        return fechaFabricacion.isAfter(fechaVencimiento);
    }

//    private void comprobarMateriaPrima(MateriasPrimas materiaPrima){
//        for (MateriasPrimas m : MateriasPrimas.values()){
//            if (materiaPrima.equals(m)){
//                this.materiasPrimas = materiaPrima;
//                return;
//                }
//            }
//        this.materiasPrimas = MateriasPrimas.C;
//        }
    @Override
    public String toString() {
        return "Cerveza{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fechaVencimiento=" + fechaVencimiento +
                ", materiasPrimas=" + materiasPrimas +
                ", cantidadEstablecida=" + cantidadEstablecida +
                ", cantidadReal=" + cantidadReal +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public MateriasPrimas getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setMateriasPrimas(MateriasPrimas materiasPrima) {this.materiasPrimas = materiasPrima;
    }

    public Integer getCantidadEstablecida() {
        return cantidadEstablecida;
    }

    public void setCantidadEstablecida(Integer cantidadEstablecida) {
        this.cantidadEstablecida = cantidadEstablecida;
    }

    public Integer getCantidadReal() {
        return cantidadReal;
    }

    public void setCantidadReal(Integer cantidadReal) {
        this.cantidadReal = cantidadReal;
    }
}
