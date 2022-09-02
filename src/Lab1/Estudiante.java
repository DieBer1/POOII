package Lab1;
import Lab1.Carrera;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Estudiante 
{
    private int cantidad;
    private Carrera carrera;
    private int cod[], sem[], nCre[];
    private String nom[], ape[];

    public Estudiante()
    {
        
    }

    public Estudiante(int cantidad, Carrera carrera, int[] cod, int[] sem, int[] nCre, String[] nom, String[] ape) {
        this.cantidad = cantidad;
        this.carrera = carrera;
        this.cod = cod;
        this.sem = sem;
        this.nCre = nCre;
        this.nom = nom;
        this.ape = ape;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int[] getCod() {
        return cod;
    }

    public void setCod(int[] cod) {
        this.cod = cod;
    }

    public int[] getSem() {
        return sem;
    }

    public void setSem(int[] sem) {
        this.sem = sem;
    }

    public int[] getnCre() {
        return nCre;
    }

    public void setnCre(int[] nCre) {
        this.nCre = nCre;
    }

    public String[] getNom() {
        return nom;
    }

    public void setNom(String[] nom) {
        this.nom = nom;
    }

    public String[] getApe() {
        return ape;
    }

    public void setApe(String[] ape) {
        this.ape = ape;
    }
    
    
    public void determinarCreditos()
    {
        Carrera c = new Carrera();
        for(int i=1;i<cantidad;i++)
        {
            double minimo= c.cCre[i]*0.90;
            if(nCre[i]>minimo)
            {
            System.out.println("Estudiante "+nom[i]+" ya puede matricular proyecto de grado");
            }
        }
    }
    public void leerEstudiantes()
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de estudiantes a analizar");
        cantidad = leer.nextInt();
        System.out.println("Ingrese los datos de los usuarios");
        for(int i=0;i<cantidad;i++)
        {
            System.out.println("Digite el codigo del estudiante "+i);
            cod[i]=leer.nextInt();
            System.out.println("Digite el nombre del estudiante "+i);
            nom[i]=leer.nextLine();
            System.out.println("Digite el apellido del estudiante "+i);
            ape[i]=leer.nextLine();
            System.out.println("Digite el semestre actual del estudiante "+i);
            sem[i]=leer.nextInt();
            System.out.println("Digite el numero de creditos actual del estudiante "+i);
            nCre[i]=leer.nextInt();
        }
    }
}
