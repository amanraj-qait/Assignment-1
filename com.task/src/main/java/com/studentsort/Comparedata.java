package com.studentsort;

@SuppressWarnings("rawtypes")
public class Comparedata implements Comparable {
	int id1;  
	String Stname;  
	double cgpamarks;  
	/**
	 * Initializing global variables 
	 * @param id1
	 * @param Stname
	 * @param cgpamarks
	 */
	Comparedata(int id1,String Stname,double cgpamarks){  
	this.id1=id1;  
	this.Stname=Stname;  
	this.cgpamarks=cgpamarks;  
	}
	/**
	 * get student object by id
	 * @return id1
	 */
	int getId()
	{
		return id1;
	}
	/**
	 * get student object by name
	 * @return Stname
	 */
	String getName()
	{
		return Stname;
	}
	/**
	 * get student object by cgpa
	 * @return cgpamarks
	 */
	double getCgpa()
	{
		return cgpamarks;
	}
	/**
	 * Compare the values of student cgpa
	 * Compare the values of student name
	 * Compare the values of student id
	 * @return Object o
	 */
    public int compareTo(Object o)
    {   
    	Comparedata s=(Comparedata)o;   
    	if(cgpamarks==s.cgpamarks){  
    		if(Stname.equals(s.Stname))
    		{  
    			return id1-s.id1;      
    			}
    		else{         
    				return Stname.compareTo(s.Stname);   
    				}       
    		}
    	else{      
    					if(s.cgpamarks>cgpamarks)  
    						return 1;     
    					else             
    						return -1;    
    					}   
    	}
}
