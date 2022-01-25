package edu.mum.cs.cs425.studentmgmt.service.Impl;

import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;
import edu.mum.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements TranscriptService {
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Override
    public Transcript save(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }
}
