package com.example.demodeploy.echo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DumyService {
    @Autowired
    private DumyRepository dumyRepository;

    public List<DumyDto> getAllDumy() {
        List<Dumy> dumies = dumyRepository.findAll();
        List<DumyDto> dumyDtos = new ArrayList<DumyDto>();
        for (Dumy dumy : dumies) {
            dumyDtos.add( DumyDto.builder()
                    .id(dumy.getId())
                    .msg(dumy.getMsg())
                    .build() );
        }
        return dumyDtos;
    }
}