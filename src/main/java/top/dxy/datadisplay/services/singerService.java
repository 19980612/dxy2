package top.dxy.datadisplay.services;

import top.dxy.datadisplay.domain.singerDO;

import java.util.List;

/**
 * 学生信息列表
 * service层
 *
 * @author WarMj
 * @date 2018-05-16
 */
public interface singerService {
  List<singerDO> listsinger();
}
