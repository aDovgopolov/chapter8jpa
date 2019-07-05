package com.apress.prospring5.ch8.jpaFirstPart.config;

import com.apress.prospring5.ch8.entities.SingerAudit;
import com.apress.prospring5.ch8.repos.SingerAuditRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.GregorianCalendar;

public class DBInitializer {
    private Logger logger = LoggerFactory.getLogger(DBInitializer.class);

    //@Autowired
    SingerAuditRepository singerRepository;

    //@PostConstruct
    public void initDB(){
        logger.info("Starting database initialization...");

        SingerAudit singer = new SingerAudit();
        singer.setFirstName("John");
        singer.setLastName("Mayer");
        singer.setBirthDate(new Date(
                (new GregorianCalendar(1977, 9, 16)).getTime().getTime()));

        singerRepository.save(singer);

        singer = new SingerAudit();
        singer.setFirstName("Eric");
        singer.setLastName("Clapton");
        singer.setBirthDate(new Date(
                (new GregorianCalendar(1945, 2, 30)).getTime().getTime()));

        singerRepository.save(singer);

        singer = new SingerAudit();
        singer.setFirstName("John");
        singer.setLastName("Butler");
        singer.setBirthDate(new Date(
                (new GregorianCalendar(1975, 3, 1)).getTime().getTime()));

        singerRepository.save(singer);
        logger.info("Database initialization finished.");
    }

}

//@Service
//public class DBInitializer {
//    private Logger logger = LoggerFactory.getLogger(DBInitializer.class);
//
//    @Autowired SingerRepository singerRepository;
//    @Autowired InstrumentRepository instrumentRepository;
//
//    @PostConstruct
//    public void initDB(){
//        logger.info("Starting database initialization...");
//
//        Instrument guitar = new Instrument();
//        guitar.setInstrumentId("Guitar");
//        instrumentRepository.save(guitar);
//
//        Instrument piano = new Instrument();
//        piano.setInstrumentId("Piano");
//        instrumentRepository.save(piano);
//
//        Instrument voice = new Instrument();
//        voice.setInstrumentId("Voice");
//        instrumentRepository.save(voice);
//
//        Singer singer = new Singer();
//        singer.setFirstName("John");
//        singer.setLastName("Mayer");
//        singer.setBirthDate(new Date(
//                (new GregorianCalendar(1977, 9, 16)).getTime().getTime()));
//        singer.addInstrument(guitar);
//        singer.addInstrument(piano);
//
//        Album album1 = new Album();
//        album1.setTitle("The Search For Everything");
//        album1.setReleaseDate(new java.sql.Date(
//                (new GregorianCalendar(2017, 0, 20)).getTime().getTime()));
//        singer.addAlbum(album1);
//
//        Album album2 = new Album();
//        album2.setTitle("Battle Studies");
//        album2.setReleaseDate(new java.sql.Date(
//                (new GregorianCalendar(2009, 10, 17)).getTime().getTime()));
//        singer.addAlbum(album2);
//
//        singerRepository.save(singer);
//
//        singer = new Singer();
//        singer.setFirstName("Eric");
//        singer.setLastName("Clapton");
//        singer.setBirthDate(new Date(
//                (new GregorianCalendar(1945, 2, 30)).getTime().getTime()));
//        singer.addInstrument(guitar);
//
//        Album album = new Album();
//        album.setTitle("From The Cradle");
//        album.setReleaseDate(new java.sql.Date(
//                (new GregorianCalendar(1994, 8, 13)).getTime().getTime()));
//        singer.addAlbum(album);
//
//        singerRepository.save(singer);
//
//        singer = new Singer();
//        singer.setFirstName("John");
//        singer.setLastName("Butler");
//        singer.setBirthDate(new Date(
//                (new GregorianCalendar(1975, 3, 1)).getTime().getTime()));
//        singer.addInstrument(guitar);
//
//        singerRepository.save(singer);
//        logger.info("Database initialization finished.");
//    }
//
//}
