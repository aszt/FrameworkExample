package com.fin.service.impl;

import com.fin.dao.SequenceMapper;
import com.fin.pojo.Sequence;
import com.fin.service.ISequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sequenceService")
public class SequenceServiceImpl implements ISequenceService {

    @Autowired
    private SequenceMapper sequenceDao;

    public int insert(Sequence sequence) {
        sequenceDao.insert(sequence);
        return sequence.getSequenceid();
    }

    @Override
    public int getSequence() {
        Sequence sequence = new Sequence();
        return insert(sequence);
    }
}
