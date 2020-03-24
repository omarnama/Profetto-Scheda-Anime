package it.jac.javadb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animation")
public class Animation {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;

		@Column(name = "tit_ani", length = 25)
		private String titAni;
		
		@Column(name = "tit_ani_jap", length = 25)
		private String titAniJ;
		
		@Column(name = "naz_ani", length = 15)
		private String nazAni;
		
		@Column(name = "categ_Ani", length = 45)
		private String categ;
		
		@Column(name = "gen_ani", length = 20)
		private String genAni;
		
		@Column(name = "year_ani")
		private Date yearAni;
		
		@Column(name = "from_ani")
		private Date fromAni;
		
		@Column(name = "seas_ani", length = 25)
		private String seasAni;
		
		@Column(name = "ep_ani")
		private int epAni;
		
		@Column(name = "state_aniJ", length = 10)
		private String stateAniJ;
		
		@Column(name = "state_ani", length = 10)
		private String stateAni;
		
		@Column(name = "dub_ani", length = 20)
		private String dubAni;

		@Column(name = "creation_time")
		private Date creationTime;
		
		@Column(name = "creation_user")
		private String creationUser;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getCateg() {
			return categ;
		}

		public void setCateg(String categ) {
			this.categ = categ;
		}

		public String getGenAni() {
			return genAni;
		}

		public void setGenAni(String genAni) {
			this.genAni = genAni;
		}

		public Date getYearAni() {
			return yearAni;
		}

		public void setYearAni(Date yearAni) {
			this.yearAni = yearAni;
		}

		public Date getFromAni() {
			return fromAni;
		}

		public void setFromAni(Date fromAni) {
			this.fromAni = fromAni;
		}

		public String getSeasAni() {
			return seasAni;
		}

		public void setSeasAni(String seasAni) {
			this.seasAni = seasAni;
		}

		public int getEpAni() {
			return epAni;
		}

		public void setEpAni(int epAni) {
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

		public String getCreationUser() {
			return creationUser;
		}

		public void setCreationUser(String creationUser) {
			this.creationUser = creationUser;
		}

		@Override
		public String toString() {
			return "Animation [id=" + id + ", titAni=" + titAni + ", titAniJ=" + titAniJ + ", nazAni=" + nazAni
					+ ", categ=" + categ + ", genAni=" + genAni + ", yearAni=" + yearAni + ", fromAni=" + fromAni
					+ ", seasAni=" + seasAni + ", epAni=" + epAni + ", stateAniJ=" + stateAniJ + ", stateAni="
					+ stateAni + ", dubAni=" + dubAni + ", creationTime=" + creationTime + ", creationUser="
					+ creationUser + "]";
		}
		
}



//Come era all'inizio

/*
public class Animation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "cod_ani", length = 45)
	private String codDoc;

	@Column(name = "desc_ani", length = 45)
	private String descDoc;

	@Column(name = "data_ani")
	private Date dataDoc;

	@Column(name = "tipo_doc", length = 45)
	private String tipoDoc;
	
	@Column(name = "num_ep")
	private Integer numPagine;

	@Column(name = "creation_time")
	private Date creationTime;
	
	@Column(name = "creation_user")
	private String creationUser;
}
*/