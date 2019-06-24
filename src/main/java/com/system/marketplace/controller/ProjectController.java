package com.system.marketplace.controller;

import com.system.marketplace.domain.Project;
import com.system.marketplace.domain.Proposal;
import com.system.marketplace.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller//아래의 Class 를 controller 로 모듈화 시키는 Tag
public class ProjectController {

    @Resource
    ProjectService projectService;



    /**
     * 제안 목록 jsp
     * @param model
     * @return
     */
        @RequestMapping(value = "/project.do", method = RequestMethod.GET)
    // '/Project' 라는 요청이 들어왔을 때 'ProjectList' method 를 실행한다
    public String projectList(ModelMap model) {
        //JSP에서 객체를 쓰기 위해 model로 projectList를 넘겨준다
        /*'ModelMap model' -> ProjectList() method 실행 후
         View 에서 활용되는 데이터 담고 있는 object*/

        /* 개발자는 Model object 에 데이터를 담아서 DispatcherServlet 에 전달한다.
            DispatcherServlet 에 전달된 Model 데이터는 View 에서 가공되어 client 에게
            응답처리된다.
         */
        model.addAttribute("projectList");

        /*addAttribute 속성을 추가해주는 method.
          ProjectService class 의 ProjectList 객체의 속성을 주입한다.
         */

        return "projectList";
        /* mvc-config.xml 의 코드에서 '.jsp' 와 return 값 "ProjectList" 가 합쳐져 응답해주는
        view 페이지 주소를 나타낸다. 'ProjectList.jsp'
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/"/>
        <property name="suffix" value=".jsp"/>
        </bean>
         */
    }

    @RequestMapping(value = "/ledge.do", method = RequestMethod.GET)
    // '/Project' 라는 요청이 들어왔을 때 'ProjectList' method 를 실행한다
    public String ledgeList(ModelMap model) {
        //JSP에서 객체를 쓰기 위해 model로 projectList를 넘겨준다
        /*'ModelMap model' -> ProjectList() method 실행 후
         View 에서 활용되는 데이터 담고 있는 object*/

        /* 개발자는 Model object 에 데이터를 담아서 DispatcherServlet 에 전달한다.
            DispatcherServlet 에 전달된 Model 데이터는 View 에서 가공되어 client 에게
            응답처리된다.
         */
        ArrayList<Project> ledgeList = projectService.projectList();
        model.addAttribute("projectList", ledgeList);

        /*addAttribute 속성을 추가해주는 method.
          ProjectService class 의 ProjectList 객체의 속성을 주입한다.
         */

        return "ledgeList";
        /* mvc-config.xml 의 코드에서 '.jsp' 와 return 값 "ProjectList" 가 합쳐져 응답해주는
        view 페이지 주소를 나타낸다. 'ProjectList.jsp'
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/"/>
        <property name="suffix" value=".jsp"/>
        </bean>
         */
    }

    /**
     * 제안 목록 api
     * @return
     */
    @RequestMapping(value = "/projects")
    public ResponseEntity<ArrayList<Project>> projectList2() {
        //JSON으로 출력하기 위한 작업
        ArrayList<Project> Projectlist = projectService.projectList();
        return new ResponseEntity<ArrayList<Project>>(Projectlist, HttpStatus.ACCEPTED);
    }

    // 제안 1건 조회 시
    //Projects?id=1
    //Projects/1
    @RequestMapping(value = "/projects/{project_id}")
    public ResponseEntity<Project> ProjectDetail(@PathVariable("project_id") int project_id) {
        Project Project = projectService.findById(project_id);
        return new ResponseEntity<>(Project, HttpStatus.ACCEPTED);
    }


    // 제안 등록
    // formdata submit => @ModelAttribute Project Projectdata
    // json => @RequestBody Project Projectdata 테이터의 흐름
    @RequestMapping(value = "/projects", method = RequestMethod.POST)
    public ResponseEntity<Project> ProjectPost(@RequestBody Proposal proposal) {

//        int affected = projectService.post(projectData);
        return new ResponseEntity<>(new Project(), HttpStatus.ACCEPTED);
    }


    // 수정
    @RequestMapping(value = "/projects/{project_id}", method = RequestMethod.GET)
    public ResponseEntity<Project> ProjectPut(@PathVariable("project_id")int project_id,
    		@RequestParam(value="cooking_status")String cooking_status) {
    	Map<String, Object> m = new HashMap<>();
    	m.put("project_detail_id", project_id);
    	m.put("cooking_status", cooking_status);
        int affected = projectService.put(m);
        return new ResponseEntity<>(new Project(), HttpStatus.ACCEPTED);
    }

    // 삭제
    @RequestMapping(value = "/projects/{project_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Project> ProjectDelete(@PathVariable("project_id") int project_id) {
        int affected = projectService.delete(project_id);
        return new ResponseEntity<>(new Project(), HttpStatus.ACCEPTED);
    }
}
