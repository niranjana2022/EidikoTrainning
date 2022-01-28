package com.eidiko.niranjana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="emptabdata")
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer eId;
		
		private String eName;
		private String eAddrs;
		public Integer geteId() {
			return eId;
		}
		public void seteId(Integer eId) {
			this.eId = eId;
		}
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		public String geteAddrs() {
			return eAddrs;
		}
		public void seteAddrs(String eAddrs) {
			this.eAddrs = eAddrs;
		}
		@Override
		public String toString() {
			return "Employee [eId=" + eId + ", eName=" + eName + ", eAddrs=" + eAddrs + "]";
		}
		
		
}
