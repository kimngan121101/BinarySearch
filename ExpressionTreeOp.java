public class ExpressionTreeOp 
{
    private int termType;
    private char operator;
    private int value;
    private char variable;

    public ExpressionTreeOp(int type, char op, int val, char var) 
    {
        termType = type;
        operator = op;
        value = val;
        variable = var;
    }

    public boolean isOperator() 
    {
        return (termType == 1);
    }
    public boolean isVariable() 
    {
        return (termType == 2);
    }
    public char getOperator() 
    {
        return operator;
    }
    public char getVariable() {
    	return variable;
    }
    public void setVariable(int var) {
    	value = var;
    }
    public int getValue() 
    {
        return value;
    }
    
    public String toString()
    {
        if (termType == 2) 
            return variable + "" ;
        if (termType == 1) 
            return operator + "";
        else
            return value + "";
    }
}
    

