package com.shabushabu.javashop.instruments.repositories;

import java.util.List;

import com.shabushabu.javashop.instruments.model.Instrument;

public interface FindInstrumentRepository {
	 Object findInstruments();
	 Instrument findInstrumentByID(String id);
}


