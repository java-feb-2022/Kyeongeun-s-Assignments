package com.domitory.controlleres;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.domitory.models.Dormitory;
import com.domitory.models.Student;
import com.domitory.services.DormitoryService;
import com.domitory.services.StudentService;

@Controller
public class MainController {

	private final DormitoryService dormService;
	private final StudentService studentService;
	
	
	
	public MainController(DormitoryService dormService, StudentService studentService) {
		this.dormService = dormService;
		this.studentService = studentService;
	}



	@GetMapping("/")
	public String index(Model model) {
		List<Dormitory> dorms = dormService.allDorms();
		model.addAttribute("dorms", dorms);
		return "index.jsp";
	}
	@GetMapping("/dorms/new")
	public String newDorm(Model model) {
		model.addAttribute("dorm", new Dormitory());
		return "newDorm.jsp";
	}
	@GetMapping("/dorms/create")

	public String create(@RequestParam(value="name") String dorm_name) {
		Dormitory dorm = dormService.createDormitory(new Dormitory(dorm_name));
		return "redirect:/dorms/" + dorm.getId();
	}
	@PostMapping("/dorms/createpost")
	public String createPost(@RequestParam(value="name") String dorm_name) {
		Dormitory dorm = dormService.createDormitory(new Dormitory(dorm_name));
		return "redirect:/dorms/" + dorm.getId();
	}
	
	@GetMapping("/student/create")
	public String createStudent(@RequestParam(value="first_name") String f_name, @RequestParam(value="last_name") String l_name) {
		studentService.createStudent(new Student(f_name, l_name));
		return "redirect:/";
	}
	@GetMapping("/dorms/{id}/add")
	@PostMapping("/dorms/{id}/add")
	public String addStudent(@PathVariable Long id, @RequestParam(value="student") Long student_id) {
		Dormitory dorm = dormService.findById(id);
		Student s = studentService.findById(student_id);
		dormService.addStudent(dorm, s);
		return "redirect:/dorms/" + id;
	}
	@GetMapping("/dorms/{id}/remove")
	@PostMapping("/dorms/{id}/remove")
	public String removeStudent(@PathVariable Long id, @RequestParam(value="student") Long student_id) {
		Dormitory dorm = dormService.findById(id);
		Student s = studentService.findById(student_id);
		dormService.removeStudent(s);
		return "redirect:/dorms/" +id;
	}
	@GetMapping("/dorms/{id}")
	public String show(@PathVariable Long id, Model model) {
		Dormitory dorm = dormService.findById(id);
		List<Student> students = studentService.findByDormIsNull();
		model.addAttribute("students", students);
		model.addAttribute("dorm", dorm);
		return "dorm.jsp";
	}
	@GetMapping("/student/new")
	public String newStudent(Model model) {
		model.addAttribute("student", new Student());
		return "newStudent.jsp";
	}
	@PostMapping("/student/new/process")
	public String createStudent(@ModelAttribute Student student) {
		studentService.createStudent(student);
		return "redirect:/";
	}

}
