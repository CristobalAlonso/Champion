package com.resilencia.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.resilencia.model.Executive_User;
import com.resilencia.repository.Executive_User_Repo;
import com.resilencia.service.IExecutive_User_Service;

@Service
public class Executive_User_Imp implements IExecutive_User_Service{
	
	@Autowired 
	private Executive_User_Repo excutiveRepo;
	
	@Override
	public boolean save(Executive_User execuive) {
		try {
			excutiveRepo.save(execuive);	
		} catch (Exception e) {
			System.out.println("Error al guardar");
		}
		return false;
	}

	@Override
	public boolean findByMailExecutiveAndPass(String email, String pass) {
		try {
			excutiveRepo.findByMailExecutiveAndPass(email, pass);
		} catch (Exception e) {
			System.out.println("Error al encontrar por mail y contraseña");
		}
		return false;
	}

	@Override
	public List<Executive_User> findAll() {
		try {
			excutiveRepo.findAll();
		} catch (Exception e) {
			System.out.println("Error al encontrar todo");
		}
		return null;
	}

	@Override
	public List<Executive_User> findById(String email) {
		try {
			excutiveRepo.findById(email);
		} catch (Exception e) {
			System.out.println("Error al encontrar por id");
		}
		return null;
	}

	@Override
	public boolean deleteById(String mail) {
		try {
			excutiveRepo.deleteById(mail);
		} catch (Exception e) {
			System.out.println("Error al borrar");
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Override
	public Ejecutivo save(Ejecutivo ejecutivo) {
		Ejecutivo eje = null;
		try{
		eje = executiveRepo.save(ejecutivo);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ejecutivo no guardado");
		}
		
		return null;
	}

	@Override
	public boolean findByMailAndPass(String mail, String contraseña) {
		Ejecutivo eje=null;
		boolean res=false;
		try {
			eje=executiveRepo.findByMailAndPass(mail, contraseña);
			if(null != eje) {
				res=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al buscar Usuario");
		}
		return res;
	}

	@Override
	public Ejecutivo findByMail(String mail) {
		Ejecutivo ejeImp=null;
		try {
			ejeImp=executiveRepo.findByMail(mail);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ejeImp;
	}

	@Override
	public List<Ejecutivo> findAll() {
		return this.executiveRepo.findAll();
	}*/
		
}
