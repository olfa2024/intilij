package com.example.pfe.PrayerTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrayerTimeService {


    @Autowired
    private PrayerTimeRepository prayerTimeRepository;

    public List<PrayerTime> getAllPrayerTimes() {
        return prayerTimeRepository.findAll();
    }

    public PrayerTime savePrayerTime(PrayerTime prayerTime) {
        return prayerTimeRepository.save(prayerTime);
    }
}
