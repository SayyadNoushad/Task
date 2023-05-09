package com.emp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emp8")
public class Employee 
{
	
	
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emp_id_seq", initialValue=1, allocationSize=1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	
	
	private String ename;
	
	private String job;
	
	private Float sal;
	
	
	private Integer  depno;

}
