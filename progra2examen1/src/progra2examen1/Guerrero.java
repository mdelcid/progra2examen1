package progra2examen1;

public class Guerrero extends Personaje
{
	Guerrero(int vida, int ataque) 
	{
		super(vida, ataque);
		
	}

	void poderEspecial()
	{

		this.vida = (vida/2);
		this.ataque = (ataque*2);
	}

}
