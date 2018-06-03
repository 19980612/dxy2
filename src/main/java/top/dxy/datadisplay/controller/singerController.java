package top.dxy.datadisplay.controller;

import top.dxy.datadisplay.domain.singerDO;
import top.dxy.datadisplay.services.singerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 学生信息列表
 * controller层
 *
 * @author WarMj
 * @date 2018-05-16
 */
@Controller
@RequestMapping("singer")
public class singerController {

  private final singerService singerService;

  public singerController(singerService singerService) {
    this.singerService = singerService;

  }

  /**
   * @return
   */
  @GetMapping("listsinger")
  @ResponseBody
  public List<singerDO> listsinger() {
    return singerService.listsinger();
  }

}
