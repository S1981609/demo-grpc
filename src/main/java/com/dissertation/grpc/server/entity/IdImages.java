package com.dissertation.grpc.server.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
@Entity
@Table(name = "id_images", schema="public")
public class IdImages {
	
		@Id
		@Column(name = "id")
		Integer id;
		@Column(name = "image")
		@Lob
		@Type(type = "org.hibernate.type.BinaryType")
		byte[] image;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public byte[] getImage() {
			return image;
		}
		public void setImage(byte[] image) {
			this.image = image;
		}
		@Override
		public String toString() {
			return "IdImages [id=" + id + ", image=" + Arrays.toString(image) + "]";
		}
		
}
