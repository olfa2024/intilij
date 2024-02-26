package com.example.pfe.PrayerTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prayer-times")
public class PrayerTimeController {


    @Autowired
    private PrayerTimeService prayerTimeService;

    @GetMapping
    public List<PrayerTime> getAllPrayerTimes() {
        return prayerTimeService.getAllPrayerTimes();
    }

    @PostMapping
    public PrayerTime addPrayerTime(@RequestBody PrayerTime prayerTime) {
        return prayerTimeService.savePrayerTime(prayerTime);
    }


}