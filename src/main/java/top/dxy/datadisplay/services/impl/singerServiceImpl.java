package top.dxy.datadisplay.services.impl;

import top.dxy.datadisplay.dao.singerDao;
import top.dxy.datadisplay.domain.singerDO;
import top.dxy.datadisplay.services.singerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class singerServiceImpl implements singerService {

  @Autowired
  private singerDao singerDao;

  /**
   *
   * @return
   */
  @Override
  public List<singerDO> listsinger() {
    return singerDao.listsinger();
  }
}
