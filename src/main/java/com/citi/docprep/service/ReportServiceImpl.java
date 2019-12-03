package com.citi.docprep.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.docprep.model.ReportModel;
import com.citi.docprep.repository.ReportRepo;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepo reportRepository;
   
    public List<String> getAllTeamPlayers(long teamId) {
        List<String> result = new ArrayList<String>();
        List<ReportModel> players = reportRepository.findByTeamId(teamId);
        for (ReportModel player : players) {
            //result.add(player.getName());
        }
        return result;
    }
}
