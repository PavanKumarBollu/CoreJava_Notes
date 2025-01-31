class Enums3
{
	enum Months
	{
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
		public int monthId;
		Months()
		{
			//System.out.println("Enums Constructor");// called 12 time at this case
		}

		public static int getMonthId(Months m)
		{
			switch(m)
			{
				case JAN:
					return 1;
				case FEB:
					return 2;
				case MAR:
					return 3;
				case APR:
					return 4;
				case MAY:
					return 5;
				case JUN:
					return 6;
				case JUL:
					return 7;
				case AUG:
					return 8;
				case SEP:
					return 9;
				case OCT:
					return 10;
				case NOV:
					return 11;
				case DEC:
					return 12;
				
			}
			return 0;
		}

		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Months.getMonthId(Months.DEC));
	}
}
