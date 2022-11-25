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
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class ChairController {

    AdminService adminService;

    ChairController(AdminService adminService) {
        this.adminService = adminService;
    }
    @GetMapping("/chairs")
    public Iterable<ChairResponse> getTablePlan() {
        return this.adminService.findAllChairs();
    }
}
