
package com.proyectoposnet.tiendas_de_electronica;

public class Tiendas_de_electronica {

    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        cargarEmpresa(empresa);
    }
    
    private static void cargarEmpresa(Empresa empresa){
        Sucursal suc1 = new Sucursal("Sucursal A");
        Sucursal suc2 = new Sucursal("Sucursal B");
        
        suc1.agregarDispositivo(new Dispositivo("AA123", 12400, TipoDispositivo.COMPUTADORA));
        suc1.agregarDispositivo(new Dispositivo("JF323", 10000, TipoDispositivo.TELEFONO));
        
        suc2.agregarDispositivo(new Dispositivo("AJJ23", 11200, TipoDispositivo.TABLET));
        suc2.agregarDispositivo(new Dispositivo("LLA123", 15400, TipoDispositivo.TABLET));
        suc2.agregarDispositivo(new Dispositivo("BGD2223", 20400, TipoDispositivo.TELEFONO));
        
        empresa.agregarSucursal(suc1);
        empresa.agregarSucursal(suc2);
        
        empresa.listarDispositivos();
        
        for(Dispositivo d: empresa.dispositivosPorTipo(TipoDispositivo.TELEFONO)){
            System.out.println(d);
        }
        
    }
    
}
