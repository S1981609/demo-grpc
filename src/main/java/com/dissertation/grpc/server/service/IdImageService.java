package com.dissertation.grpc.server.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dissertation.grpc.server.entity.IdImages;
import com.dissertation.grpc.server.repository.IDImagesRepository;



@Service
public class IdImageService {

	@Autowired
	IDImagesRepository repo;

	public Optional<IdImages> saveImageFile(int id, MultipartFile file) {
		IdImages idImageEntityObject=new IdImages();
		byte[] byteObjects;
		try {
			byteObjects = new byte[file.getBytes().length];
			 int i = 0;
			for (byte b : file.getBytes()){
			    byteObjects[i++] = b;
			}
			idImageEntityObject.setId(id);
			idImageEntityObject.setImage(byteObjects);
			repo.saveAndFlush(idImageEntityObject);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		Optional<IdImages> idImageEntityObjectResponse = repo.findById(id);

		return idImageEntityObjectResponse;

	    
	}
	
}
