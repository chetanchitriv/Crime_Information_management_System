package Dao;

import java.util.List;

import Bean.Crime;
import Dto.*;
import Exception.CrimeException;

public interface CrimeDAO {
	public List<CrimeDTO> getAllCrimes() throws CrimeException;
	
	public List<CrimeInPoliceStationDTO> getAllCrimesForAPoliceStation(String psName) throws CrimeException;
	
	public List<CrimeCriminalDTO> getCrimesOfACriminal(String criminalName) throws CrimeException;
	
	public List<CrimeDTO> getAllCrimesOnStatus(String status) throws CrimeException;
	
	public List<CrimeDTO> getAllCrimesForCurrentMonth() throws CrimeException;
	
	public int addACrime(Crime crime) throws CrimeException;
	
	public int updateACrimeStatus(int crimeid, String status) throws CrimeException;
	
	public int assignCrimeToCriminal(String criminalName, int crimeId) throws CrimeException;
	
	public int assignCrimeToVictim(String victimName, int crimeId) throws CrimeException;
}
