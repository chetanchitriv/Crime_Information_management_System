package Dao;

import java.util.List;

import Bean.Criminal;
import Exception.CriminalException;
import Dto.CriminalArrestedBeforeDTO;
import Dto.CriminalCrimeDTO;

public interface CriminalDAO {
	public List<Criminal> getAllCriminals() throws CriminalException;
	
	public List<CriminalArrestedBeforeDTO> getCriminalsArrestedBefore() throws CriminalException;
	
	public List<CriminalCrimeDTO> getCriminalsForCrime(int crimeId) throws CriminalException;
	
	public int addACriminal(Criminal criminal) throws CriminalException;

}
