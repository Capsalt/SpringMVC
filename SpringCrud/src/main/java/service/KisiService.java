package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import model.Kisi;
import repository.KisiRepository;

@Service
public class KisiService {
	
	public static KisiRepository kisiRepository;
	
	@Autowired
	public KisiService(KisiRepository kisiRepository) {
		
		KisiService.kisiRepository = kisiRepository;
		
	}
	
	public List<Kisi> tumKisileriGetir(){
		
		return kisiRepository.findAll();
	}
	
	public Kisi kisiEkle(Kisi kisi) {
		return kisiRepository.save(kisi);
	}

	public String idKisiSil(Integer id) {
		
		if (kisiRepository.findById(id)==null ) {
			throw new EmptyResultDataAccessException(id);
		
		}
		
		kisiRepository.deleteById(id);
		
		return id+"kişi silindi";
	}
	
	public Kisi kisiGuncelle(Kisi guncelKisi) {
		
		return kisiRepository.save(guncelKisi);
	
	}
	
	public Kisi idKisiGuncelle(Integer id, Kisi updateKisi) {
		Kisi eskiKisi = kisiRepository.findById(id).orElseThrow(()->new IllegalStateException(id+ "kişi bulunamadı"));
		
		if (updateKisi.getAd()!=null) {
			eskiKisi.setAd(updateKisi.getAd());
		}
		if (updateKisi.getSoyad()!=null) {
			eskiKisi.setSoyad(updateKisi.getSoyad());
		}
		if (updateKisi.getYas() != 0) {
			eskiKisi.setYas(updateKisi.getYas());
		}
		if (updateKisi.getAd()!=null) {
			eskiKisi.setAd(updateKisi.getAd());
		}
		
		return kisiRepository.save(eskiKisi);
	}
}
