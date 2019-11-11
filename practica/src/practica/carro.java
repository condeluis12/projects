package practica;

public class carro {
public static final double  PI=31416;	
private String matricula;
private String placas;
private String marca;
private String modelo;
private String color;
private String tarifa;
public carro(String matricula,
String placas,
String marca,
String modelo,
String color,
String tarifa) {
	
	this.matricula = matricula;
	this.placas = placas;
	this.marca = marca;
	this.modelo = modelo;
	this.color =color;
	this.tarifa = tarifa;
}
public String getmatricula() {
	return this.matricula;
}
public String getplacas()
{
	return this.placas;
}
public String getmarca() {
	return this.marca;
}
public String getmodelo() {
	return this.modelo;	
}
public String getcolor() 
{	return this.color;
}

public String gettarifa() {
	return this.tarifa;
}
public String settarifa(String tarifa) {
	return this.tarifa=tarifa;
	
}
}

