package com.taotao.portal.controller;
import com.taotao.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Author: zhihu
 * Description:
 * Date: Create in 20:56 2018/2/10
 */
@Controller
public class IndexController {

        @Autowired
        private ContentService contentService;

        @RequestMapping("/index")
        public String showIndex(Model model) {
                String adJson = contentService.getContentList();
                model.addAttribute("ad1", adJson);

                return "index";
        }

        @RequestMapping(value="/httpclient/post", method= RequestMethod.POST,
                produces= MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
        @ResponseBody
        public String testPost(String username, String password) {
                String result = "username:" + username + "\tpassword:" + password;
                System.out.println(result);
                return "username:" + username + ",password:" + password;
        }
}
