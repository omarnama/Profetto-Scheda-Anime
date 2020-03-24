package it.jac.javadb.dto;

import java.util.Date;

public class DocumentoDTO {

	private String idDoc;
	
	private String codDoc;

	private String descDoc;

	private Date dataDoc;

	private String tipoDoc;

	private Integer numPagine;
	
	private Date creationTime;

	public String getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(String idDoc) {
		this.idDoc = idDoc;
	}

	public String getCodDoc() {
		return codDoc;
	}

	public void setCodDoc(String codDoc) {
		this.codDoc = codDoc;
	}

	public String getDescDoc() {
		return descDoc;
	}

	public void setDescDoc(String descDoc) {
		this.descDoc = descDoc;
	}

	public Date getDataDoc() {
		return dataDoc;
	}

	public void setDataDoc(Date dataDoc) {
		this.dataDoc = dataDoc;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public Integer getNumPagine() {
		return numPagine;
	}

	public void setNumPagine(Integer numPagine) {
		this.numPagine = numPagine;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	
}
