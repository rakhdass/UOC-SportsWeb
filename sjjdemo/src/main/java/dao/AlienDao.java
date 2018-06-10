package dao;

import model.Alien;

public class AlienDao {
 public Alien getAlien(int aid) {
	 Alien a= new Alien();
	 a.setAid(10);
	 a.setAname("rakhi");
	 a.setTech("java");
	 return a;
	 
 }
}
