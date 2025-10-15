package com.example.springmavenpostgres;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
class ProfileSpecificService {

}
