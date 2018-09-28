package cn.echean.blog.service;

import cn.echean.blog.entities.relationshipentitis.rTabEntity;
import cn.echean.blog.repository.RTabRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RTabService {
    private final RTabRepository rTabRepository;

    public RTabService(RTabRepository rTabRepository) {
        this.rTabRepository = rTabRepository;
    }

    @Transactional(rollbackFor = {})
    public rTabEntity createRTab(rTabEntity r) {
        return rTabRepository.save(r);
    }
}
