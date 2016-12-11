
public class Fraction {									// Fraction class
	
	private int numerator;
	private int denominator;
	
	public Fraction()									// constructor
	{
		numerator = 1;
		denominator = 1;
	}
	
	public Fraction(int n)								// constructor with int as an argument
	{
		numerator=n;
		denominator=1;
	}
	
	public Fraction (int n,int d)						// constructor with int , int as an argument	
	{
		numerator = n;
		denominator = d;
	}
	
	public void setNumerator(int n)						// Numerator setter 
	{
		numerator = n;
	}
	
	public void setDenominator(int d) throws DenominatorException			// Throwing Exception
	{
		if(d!=0)
			denominator = d;
		else
			throw new DenominatorException("Denominator cannot be zero");
		
	}
	
	public void setFraction(int n,int d)					// setter fraction
	{
		numerator = n;
		denominator = d;

	}
	
	public int getNumerator()								// Numerator getter
	{
		return numerator;
	}
	
	public int getDenominator()								// Denominator getter
	{
		return denominator;
	}
	
	public Fraction inverse()								// Function for inverse
	{
		return new Fraction(this.denominator,this.numerator);
	}
	
	public Fraction add(Fraction f)							// Function for Addition
	{
		if(this.denominator==f.denominator)
		{
			int num = this.numerator + f.numerator;
			return new Fraction(num,this.denominator);
		}
		
		else
		{
			int den=this.denominator*f.denominator;
			int num = (this.numerator*f.denominator)+(f.numerator*this.denominator);
			return new Fraction(num,den);
		}
		
	}
	
	public Fraction subtract(Fraction f)					// Function for Subtraction
	{
		if(this.denominator==f.denominator)
		{
			int num = this.numerator - f.numerator;
			return new Fraction(num,this.denominator);
		}
		
		else
		{
			int den=this.denominator*f.denominator;
			int num = (this.numerator*f.denominator)-(f.numerator*this.denominator);
			return new Fraction(num,den);
		}
	}
	
	public Fraction multiply(Fraction f)						// Function for multiplication	
	{
		int n = this.numerator*f.numerator;
		int d = this.denominator*f.denominator;
		return new Fraction(n,d);
	}
	
	public Fraction divide(Fraction f)							// Function for divide
	{
		Fraction mul = this.multiply(f.inverse());
		return mul;
	}
}
