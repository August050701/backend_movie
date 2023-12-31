package com.test.nmt.api.showtime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.nmt.model.showTime.ShowTimeDTO;
import com.test.nmt.service.showTime.ShowTimeService;

@RestController
@RequestMapping("/api/showtime")
public class ShowTimeController {
    @Autowired
    ShowTimeService showTimeService;

    @PostMapping("/create")
    public void createShowTime(@RequestBody ShowTimeDTO showTimeDTO) {
        showTimeService.createShowTime(showTimeDTO);
    }

    @PostMapping("/update")
    public void updateShowTime(@RequestBody ShowTimeDTO showTimeDTO) {
        showTimeService.createShowTime(showTimeDTO);
    }

    @PostMapping("/delete")
    public void deleteShowTimeByID(@RequestParam(name = "id") Long id) {
        showTimeService.deleteShowTimeByID(id);
    }

    @PostMapping("/delete/movie")
    public void deleteAllShowTimeByMovieID(@RequestParam(name = "id") Long id) {
        showTimeService.deleteAllShowTimeByMovieID(id);
    }
}
