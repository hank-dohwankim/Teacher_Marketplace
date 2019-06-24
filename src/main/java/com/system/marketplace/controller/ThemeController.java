package com.system.marketplace.controller;

import com.system.marketplace.domain.Theme;
import com.system.marketplace.service.ThemeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import java.util.ArrayList;

//아래의 Class 를 controller 로 모듈화 시키는 Tag
@Controller
public class ThemeController {

    @Resource
    // name 으로 DI 를 가능케 한다. Bean 을 생성하며 singleton 이 자동으로 적용된다.
    // 객체 생성 없이 getThemeService()를 호출할 수 있다.
    //@Autowired
    ThemeService themeService;

    /**
     * 메뉴 목록 jsp
     * @param model
     * @return
     */

    @RequestMapping(value = "/theme.do", method = RequestMethod.GET)
    // '/theme' 라는 요청이 들어왔을 때 'themeList' method 를 실행한다
    // public String themeList(Model, model, HttpServletRequest request){
    public String themeList(ModelMap model) {
        /*Theme 클래스의 'ModelMap model' -> themeList() method 실행 후
         View 에서 활용되는 데이터 담고 있는 object*/

        /*Theme class 속성을 갖는 themeList 라는 command object 를 생성,
        이 object 에 getter 로 받은 Theme class 의 variable 들을
        themeList 를 통해 themeService 로 전달한다. 그러면
        view, controller 에서 themeList.theme_name 등으로 객체의 data 를 가져와서 사용할 수 있다.
        Spring container 가 위 기능이 동작하도록 지원한다.
        */

        /* 개발자는 Model object 에 데이터를 담아 DispatcherServlet 에 전달한다.
            DispatcherServlet 에 전달된 Model 데이터는 View 에서 가공되어 client 에게
            응답처리된다.
         */


        /*@ModelAttribute 를 사용하면 command object(여기서는 themeList)
         의 이름을 변경할 수 있고, 이렇게 변경된 이름은 view 에서 command object 를참조할 때 사용된다.
        public String themeRemove(@ModelAttribueAttribute('theme') Member member)
        */
        ArrayList<Theme> themeList = themeService.themeList(); //== (theme.getThemeName(),,,,);
        model.addAttribute("themeList", themeList);
        /*addAttribute 속성을 추가해주는 method.
          ThemeService class 의 themeList 객체의 속성을 주입한다.
         */

        return "themeList";
        /* mvc-config.xml 의 코드에서 '.jsp' 와 return 값 "themeList" 가 합쳐져 응답해주는
        view 페이지 주소를 나타낸다. 'themeList.jsp'
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/"/>
        <property name="suffix" value=".jsp"/>
        </bean>
         */
    }

    /**
     * 메뉴 목록 api
     * @return
     */
    @RequestMapping(value = "/themes")
    public ResponseEntity<ArrayList<Theme>> themeList2() {
        ArrayList<Theme> themeList = themeService.themeList();
        return new ResponseEntity<ArrayList<Theme>>(themeList, HttpStatus.ACCEPTED);
    }

    // 메뉴 1건 조회 시
    //themes?id=1
    //themes/1
    @RequestMapping(value = "/themes/{theme_id}")
    public ResponseEntity<Theme> themeDetail(@PathVariable("theme_id") int theme_id) {
        Theme theme = themeService.findById(theme_id);
        return new ResponseEntity<>(theme, HttpStatus.ACCEPTED);
    }


    // 메뉴 등록
    // formdata submit => @ModelAttribute Theme themeData
    // json => @RequestBody Theme themeData 테이터의 흐름
    @RequestMapping(value = "/themes", method = RequestMethod.POST)
    public ResponseEntity<Theme> themePost(@ModelAttribute Theme themeData) {
        int affected = themeService.post(themeData);
        return new ResponseEntity<>(new Theme(), HttpStatus.ACCEPTED);
    }


    // 수정
    @RequestMapping(value = "/themes/{theme_id}", method = RequestMethod.PUT)
    public ResponseEntity<Theme> themePut(@RequestBody Theme themeData) {
        int affected = themeService.put(themeData);
        return new ResponseEntity<>(new Theme(), HttpStatus.ACCEPTED);
    }

    // 삭제
    @RequestMapping(value = "/themes/{theme_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Theme> themeDelete(@PathVariable("theme_id") int theme_id) {
        int affected = themeService.delete(theme_id);
        return new ResponseEntity<>(new Theme(), HttpStatus.ACCEPTED);
    }
}

