package cn.echean.blog.service;

import cn.echean.blog.entities.nodeentitis.OneCentence;
import cn.echean.blog.repository.OneCentenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: McEchean
 * @Date: 2018/9/28 13:21
 * @Description:
 */

@Service
public class OneCentenceService {

    @Autowired
    OneCentenceRepository oneCentenceRepository;

    public OneCentence getOneCentence() {
        return oneCentenceRepository.getOneCentenceSortByDate();
    }
}
