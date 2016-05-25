/*
UNIANDES - PUYO
Sistema de facturacion 2016
OCTAVO SEMESTRE
wilmer yacelga
23/05/2016 
 */

package Entidades;

/**
 *m
 * @author Pollo
 */
public class clsProducto {
    
    private int _id;
    private String _nombre;
    private String _descripcion;
     private int _stock;
     private float pvp; //precio de venta al publico
     private float pcp; //precio de compra al proveedor
     private float _sinIva;

    public clsProducto(int _id, String _nombre, String _descripcion, int _stock, float pvp, float pcp, float _sinIva) {
        this._id = _id;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._stock = _stock;
        this.pvp = pvp;
        this.pcp = pcp;
        this._sinIva = _sinIva;
    }
   
     public clsProducto() {
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String Descripcion() {
        return _descripcion;
    }

    public void Descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public int Stock() {
        return _stock;
    }

    public void Stock(int _stock) {
        this._stock = _stock;
    }

    public float Pvp() {
        return pvp;
    }

    public void Pvp(float pvp) {
        this.pvp = pvp;
    }

    public float Pcp() {
        return pcp;
    }

    public void Pcp(float pcp) {
        this.pcp = pcp;
    }

    public float SinIva() {
        return _sinIva;
    }

    public void SinIva(float _sinIva) {
        this._sinIva = _sinIva;
    }

   
     
     
}
