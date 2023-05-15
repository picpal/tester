package com.picpal.tester.api.prepare.service;

import com.picpal.tester.api.prepare.model.PrepareEntity;
import com.picpal.tester.api.prepare.model.PrepareRequest;
import com.picpal.tester.api.prepare.model.PrepareResponse;
import com.picpal.tester.api.prepare.repository.PrepareRepository;
import com.picpal.tester.exception.TesterException;
import com.picpal.tester.exception.TesterExceptionCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PrepareService {
    private final PrepareRepository prepareRepository;


    /**
     * 연동준비
     * id를 기준으로 조회 후 조회된 값을 반환
     * @
     */
    public PrepareResponse prepare(PrepareRequest prepareRequest) throws Exception {
        Integer id = prepareRequest.getId();
        PrepareEntity prepare = prepareRepository.findById(id)
                .orElseThrow(() -> new TesterException(TesterExceptionCode.NOT_FOUND_DATA));

        PrepareResponse response = PrepareResponse.builder()
                .ci(prepare.getCi())
                .build();

        return response;
    }

}
