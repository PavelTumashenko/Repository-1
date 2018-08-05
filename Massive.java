package massive;

public class Massive {
	public static void main(String[] args) {
        int a;
        int b;
	}
	
	// 1 Max value
	public int arrMaxValue ()
    {
	  int mas[] = {1, 5, 7, 4, 6, 9, 0, 2};
      int a = mas[0];
	  for (int i = 0; i<mas.length; i++)
	  {
		  if (mas[i]>a) {a = mas[i];};
	  }
	  return a;
    };
    
    // 2 Array sorting
    public int[] arrSorting ()
    {
      int a;
	  boolean b = false;
      int mas[] = {1, 5, 7, 4, 6, 9, 0, 2};
	  
	  while (b == false) {
	    int j = 0;
		for (int i = 0; i<mas.length-1; i++)
	    {
	       if (mas[i]>mas[i+1])
		   {
			 a = mas[i+1];
			 mas[i+1]=mas[i];
		     mas[i] = a;
		     j++;
		   }
	    } 
	    if (j == 0) {b = true;}
	  }
	  
	 return mas;
    };
 
    // 3 Reverse order
    public int[] reverseOrder ()
    {
      int mas[] = {1, 5, 7, 4, 6, 9, 0, 2};
      int a, j, l;
      j = mas.length-1;
      if (mas.length%2 == 0) {l = mas.length/2;} else {l = mas.length%2 + 1;}
	  for (int i = 0; i<l; i++)
	    {
	       a = mas[i];
	       mas[i] = mas[j];
	       mas[j] = a;
	       j--;
	    
	    }

	 return mas;
    };
    
    // 4 Calculator
    public double calculator (int a, int b, String act)
    {
    	double result = 0;
    	if (act == "/")  {result = a / b;} else
        if (act == "*") {result = a * b;} else
        if (act == "+") {result = a + b;} else
        if (act == "-") {result = a - b;}
    	
    	return result;
    }
    
    /* 5 Tic-tac-toe
    public static int ticTacToe(int a)
    {
    	int f = 0;
    	//int a = a;
    	String mas[] = {};
    	mas[a] = "x";
    	int s = 0;
    	for (int i = 0; i < 9; i++) {
    		if ((mas[i]!="x") && (mas[i]!="o") && (s == 0)) {mas[i] = "o"; s = 1;} else
    	    if ((mas[i]!="x") && (mas[i]!="o")) {mas[i] = "x"; s = 0;}
    	    if ((i == 2) | (i == 5)) {System.out.println(mas[i]);} else
    	    {System.out.print(mas[i] + " ");}
    	}
 
    	return f;
        } */
    
}