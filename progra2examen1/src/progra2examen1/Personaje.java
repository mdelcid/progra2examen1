package progra2examen1;

public class Personaje 
{
	protected int vida;
	protected int ataque;
	static int personajes_creados;
	
	Personaje(int vida, int ataque)
	{
		this.vida = vida;
		this.ataque = ataque;		
	}
	
	int getVida()
	{
		return vida;
	}
	
	int getAtaque()
	{
		return ataque;
	}
	
	void setVida(int vida)
	{
		this.vida = vida;
	}
	
	void setAtaque(int ataque)
	{
		this.ataque = ataque;
	}
	
	void poderEspecial()
	{
		
	}
	
	class Guerrero extends Personaje
	{

		Guerrero(int vida, int ataque) 
		{
			super(vida, ataque);
			
		}
		
		void poderEspecial()
		{
			this.vida = (vida/2);
			this.ataque = (ataque*2);
			//vida = 10;
			//ataque = 20;
		}
		
	}
	
	class Tanque extends Personaje
	{

		Tanque(int vida, int ataque) 
		{
			super(vida, ataque);
			
		}
		
		void poderEspecial()
		{
			
		}
		}
		
		
	
	
	


	public static void main(String[] args) 
	{
		
		
	}

}
