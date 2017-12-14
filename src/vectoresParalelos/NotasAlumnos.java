package vectoresParalelos;
import java.util.Scanner;
public class NotasAlumnos
{
	private Scanner teclado;
	private String nombres[];
	private int notas[];
	
	public NotasAlumnos() 
	{
		teclado = new Scanner(System.in);
		nombres = new String[3];
		notas = new int[3];
		for(int i=0; i<notas.length;i++)
		{
			System.out.print("Escribe nombre del alumno: ");
			nombres[i] = teclado.next();
			System.out.print("Escribe la nota: ");
			notas[i] = teclado.nextInt();
		}
	}
	/**
	 * ordena los nombres y las notas de mayor a menor
	 */
	public void ordenar() 
	{
		for(int j=0;j<notas.length;j++) 
		{
			for(int k=0;k<notas.length-1-j;k++) 
			{
				if(notas[k]<notas[k+1]) 
				{
					int auxnota;
					auxnota=notas[k];
					notas[k]=notas[k+1];
					notas[k+1]=auxnota;
					String auxnom;
					auxnom=nombres[k];
					nombres[k]=nombres[k+1];
					nombres[k+1]=auxnom;
				}
			}
		}
	}
	public void imprimir() 
	{
		for(int i=0;i<notas.length;i++) 
		{
			System.out.println(nombres[i] + " - " + notas[i]);
		}
	}
	public static void main(String[]args) 
	{
		NotasAlumnos notasAlumnos = new NotasAlumnos();
		notasAlumnos.ordenar();
		notasAlumnos.imprimir();
	}
}