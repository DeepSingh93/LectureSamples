package com.example.designpatterns.behavioural.Visitor;

import java.util.ArrayList;

// This class is the class that manages the object structure, it is responsible
// for enumerating the objects in the structure, and doing the work of having
// visitors visit all of the objects in the structure.
public class Hospital
{
	ArrayList<IPatient> patients;
	
	public Hospital()
	{
		patients = new ArrayList<IPatient>();
		patients.add(new BrokenArmPatient());
		patients.add(new BrokenArmPatient());
		patients.add(new BrokenArmPatient());
		patients.add(new CancerPatient());
		patients.add(new CancerPatient());
		patients.add(new CancerPatient());
		patients.add(new CancerPatient());
		VisitAllPatients();
	}
	
	// This method just makes a doctor and sends the doctor to visit all the
	// patients, but the visitor could be passed IN to this method (dependency injection).
	private void VisitAllPatients()
	{
		Doctor doctor = new Doctor();
		for (int i = 0; i < patients.size(); i++)
		{
			patients.get(i).Accept(doctor);
		}
	}
}