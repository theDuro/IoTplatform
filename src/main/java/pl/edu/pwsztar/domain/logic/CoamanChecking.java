package pl.edu.pwsztar.domain.logic;

import pl.edu.pwsztar.domain.dto.CreateComandDto;

public class CoamanChecking {
public static boolean check(CreateComandDto createComandDto){
    if(createComandDto.getEnginePower()<0 || createComandDto.getEnginePower()>20){
        return false;
    }
    if(createComandDto.getLedFrequency()<0 || createComandDto.getLedFrequency()>20){
        return false;
    }
    if(createComandDto.getLedLimitedValue()<-20 || createComandDto.getLedLimitedValue()>20){
        return false;
    }


  return true;
}

}
