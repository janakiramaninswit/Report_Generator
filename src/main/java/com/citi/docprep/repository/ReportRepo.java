package com.citi.docprep.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citi.docprep.model.ReportModel;

@Repository
public interface ReportRepo extends CrudRepository<ReportModel, Long> {
    List<ReportModel> findByTeamId(long teamId);
}

