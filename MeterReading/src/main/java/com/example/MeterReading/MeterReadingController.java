package com.example.MeterReading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@Controller
public class MeterReadingController {

    @Autowired
    private MeterReadingRepository meterReadingRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/save-meter-reading-page")
    public String showSaveMeterReadingPage() {
        return "save_meter_reading";
    }

    @PostMapping("/save-meter-reading")
    public String saveMeterReading(@RequestParam String reading, Model model) {
        MeterReading meterReading = new MeterReading(reading, new Date());
        meterReadingRepository.save(meterReading);
        model.addAttribute("success", "Meter reading saved successfully!");
        return "redirect:/save-meter-reading-success";
    }

    @GetMapping("/save-meter-reading-success")
    public String showSaveMeterReadingSuccessPage(Model model) {
        return "save_meter_reading_success";
    }

    @GetMapping("/latest-nonzero-meter-reading-page")
    public String showLatestNonZeroMeterReadingPage(Model model) {
        MeterReading latestNonZeroReading = meterReadingRepository.findTopByReadingIsNotAndReadingIsNotNullOrderByTimeDesc("0");
        model.addAttribute("latestNonZeroReading", latestNonZeroReading);
        return "latest_nonzero_meter_reading";
    }
}
