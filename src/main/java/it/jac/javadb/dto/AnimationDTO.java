package it.jac.javadb.dto;

import java.util.Date;

public class AnimationDTO {
	private String idAni;
	
	private String titAni;
	
	private String titAniJ;
	
	private String nazAni;
	
	private String categAni;
	
	private String genAni;
	
	private String yearAni;
	
	private String fromAni;
	
	private String seasAni;
	
	private String epAni;
	
	private String stateAniJ;
	
	private String stateAni;
	
	private String dubAni;
	
	private Date creationTime;

	public String getIdAni() {
		return idAni;
	}

	public void setIdAni(String idAni) {
		this.idAni = idAni;
	}

	public String getTitAni() {
		return titAni;
	}

	public void setTitAni(String titAni) {
		this.titAni = titAni;
	}

	public String getTitAniJ() {
		return titAniJ;
	}

	public void setTitAniJ(String titAniJ) {
		this.titAniJ = titAniJ;
	}

	public String getNazAni() {
		return nazAni;
	}

	public void setNazAni(String nazAni) {
		this.nazAni = nazAni;
	}

	public String getCategAni() {
		return categAni;
	}

	public void setCategAni(String categAni) {
		this.categAni = categAni;
	}

	public String getGenAni() {
		return genAni;
	}

	public void setGenAni(String genAni) {
		this.genAni = genAni;
	}

	public String getYearAni() {
		return yearAni;
	}

	public void setYearAni(String yearAni) {
		this.yearAni = yearAni;
	}

	public String getFromAni() {
		return fromAni;
	}

	public void setFromAni(String fromAni) {
		this.fromAni = fromAni;
	}

	public String getSeasAni() {
		return seasAni;
	}

	public void setSeasAni(String seasAni) {
		this.seasAni = seasAni;
	}

	public String getEpAni() {
		return epAni;
	}

	public void setEpAni(String epAni) {
		this.epAni = epAni;
	}

	public String getStateAniJ() {
		return stateAniJ;
	}

	public void setStateAniJ(String stateAniJ) {
		this.stateAniJ = stateAniJ;
	}

	public String getStateAni() {
		return stateAni;
	}

	public void setStateAni(String stateAni) {
		this.stateAni = stateAni;
	}

	public String getDubAni() {
		return dubAni;
	}

	public void setDubAni(String dubAni) {
		this.dubAni = dubAni;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "AnimationDTO [idAni=" + idAni + ", titAni=" + titAni + ", titAniJ=" + titAniJ + ", nazAni=" + nazAni
				+ ", categAni=" + categAni + ", genAni=" + genAni + ", yearAni=" + yearAni + ", fromAni=" + fromAni
				+ ", seasAni=" + seasAni + ", epAni=" + epAni + ", stateAniJ=" + stateAniJ + ", stateAni=" + stateAni
				+ ", dubAni=" + dubAni + ", creationTime=" + creationTime + "]";
	}
}

