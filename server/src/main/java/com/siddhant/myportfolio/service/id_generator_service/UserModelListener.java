package com.siddhant.myportfolio.service.id_generator_service;

import com.siddhant.myportfolio.data.User;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Service;

@Service
public class UserModelListener extends AbstractMongoEventListener<User> {

    private final SequenceGeneratorService sequenceGenerator;

    public UserModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<User> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(User.SEQUENCE_NAME));
        }
    }
}
