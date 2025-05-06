import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona{
    private int dni, edad;
    
    private double peso, altura;
    private String nombre, apellido;
    
    private LocalDate nacimiento;
    
    private char sexo;
    
    public Persona(int dni){
        this(dni, "N", "N", "01/01/2000", 'F', 1, 1, 25);
    }
    public Persona(int dni, String nombre, String apellido){
        this(dni, nombre, apellido, "01/01/2000", 'F', 1, 1, 25);
    }
    public Persona(int dni, String nombre, String apellido, String nacimiento){
        this(dni, nombre, apellido, nacimiento, 'F', 1, 1, 25);
    }
    public Persona(int dni, String nombre, String apellido, String nacimiento, char sexo){
        this(dni, nombre, apellido, nacimiento, sexo, 1, 1, 25);
    }
    public Persona(int dni, String nombre, String apellido, String nacimiento, char sexo, double peso){
        this(dni, nombre, apellido, nacimiento, sexo, peso, 1, 25);
    }
    public Persona(int dni, String nombre, String apellido, String nacimiento, char sexo, double peso, double altura, int edad){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = LocalDate.parse(nacimiento, formatter);
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getNacimiento() {
        return this.nacimiento;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public char getSexo() {
        return this.sexo;
    }

    public int getEdad(){
        return this.edad;
    }




    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }


    public double masaCorporal(){
        return this.peso / (this.altura*this.altura);
    }

    public boolean enForma(){
        double masac = masaCorporal();
        
        return (18.5 <= masac && masac <=25);
    }


    public boolean esCumpleanos(){
        LocalDate hoy = LocalDate.now();
        return (hoy.getDayOfMonth() == this.nacimiento.getDayOfMonth() && hoy.getMonth() == this.nacimiento.getMonth());
    }
    
    public int edadReal(){
        LocalDate hoy = LocalDate.now();

        Period periodo = Period.between(this.nacimiento, hoy);

        return periodo.getYears();    
    }

    public boolean esMayor(){
        return(18 <= edadReal());
    }

    public boolean esVotante(){
        return (16 <= edadReal());
    }

    public boolean esCoherente(){
        return (edadReal() == edad);
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("dni=").append(dni);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append(", edad=").append(edad);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", nacimiento=").append(nacimiento);
        sb.append(", sexo=").append(sexo);
        sb.append('}');
        return sb.toString();
    }




}