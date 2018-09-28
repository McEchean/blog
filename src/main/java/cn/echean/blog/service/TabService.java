package cn.echean.blog.service;

import cn.echean.blog.entities.nodeentitis.TabEntity;
import cn.echean.blog.repository.TabEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TabService {
    private final TabEntityRepository tabEntityRepository;

    public TabService(TabEntityRepository tabEntityRepository) {
        this.tabEntityRepository = tabEntityRepository;
    }

    @Transactional(rollbackFor = {})
    public TabEntity createTab(TabEntity tabEntity) {
        return tabEntityRepository.save(tabEntity);
    }

    @Transactional(readOnly = false)
    public TabEntity getTabEntityByName(String name) {
        return tabEntityRepository.findByName(name);
    }
}
