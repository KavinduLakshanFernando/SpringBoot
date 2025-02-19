package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;

public interface DI {

    @Autowired
    void injection(Aggrement aggrement);
}
