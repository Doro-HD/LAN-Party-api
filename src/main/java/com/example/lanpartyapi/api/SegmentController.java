package com.example.lanpartyapi.api;

import com.example.lanpartyapi.dto.ChairResponse;
import com.example.lanpartyapi.dto.DeskResponse;
import com.example.lanpartyapi.dto.SegmentResponse;
import com.example.lanpartyapi.dto.TablePlanResponse;
import com.example.lanpartyapi.entity.Chair;
import com.example.lanpartyapi.entity.Desk;
import com.example.lanpartyapi.entity.Segment;
import com.example.lanpartyapi.entity.TablePlan;
import com.example.lanpartyapi.service.AdminService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class SegmentController {

    AdminService adminService;

    SegmentController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/segments")
    public List<SegmentResponse> getSegments() {
        return this.adminService.findAllSegments();
    }


    @GetMapping("/segmentsfromtableplan")
    public List<SegmentResponse> getSegmentsFromTablePlan(@RequestParam int id) {
        return this.adminService.getSegmentFromTablePlan(id);
    }

    @PostMapping("/createsegment")
    public void createSegmentsFromTablePlan(@RequestParam int id){
        this.adminService.createSegmentFromTablePlan(id);
    }

}
