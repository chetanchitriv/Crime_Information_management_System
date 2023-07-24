package Dao;

import java.util.List;

import Dto.VictimCrimeDTO;
import Exception.VictimException;

public interface VictimDAO {
	public List<VictimCrimeDTO> getVictimsOfCrime(int crimeId) throws VictimException;

}
