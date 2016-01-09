package cc.binyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 功能描述： www.binyan.cc网站首页Controller
 * @author 作者 Jimmy
 * @created 2015年11月21日 下午6:37:47
 * @version 1.0.0
 * @date 2015年11月21日 下午6:37:47
 */
@Controller
@RequestMapping("")
public class IndexController {

    /**
     * 首页访问url
     */
    @RequestMapping("/index.htm")
    public String index() {
        String a = ";";
        return "/ftl/index";
    }
}
