package com.wg.whitegift.controller;

import com.wg.whitegift.repository.MyPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PolicyController {

    @Autowired
    MyPolicyRepository repository;
    @GetMapping("/policy")
//    public MyPolicy getPolicy(@PathVariable("id")Integer id){
//        MyPolicy policy = repository.findMyPolicyById(id);
//        return policy;
//    }
//
//    public MyPolicy insertPolicy(MyPolicy policy){
//        MyPolicy save = repository.save(policy);
//        return policy;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//
//    public String getPolicyList(ModelMap map) {
//
//        map.addAttribute("policyList", repository.findAll());
//
//        return "policyList";
//    }
//
//
//    @RequestMapping(value = "/create", method = RequestMethod.GET)
//
//    public String createPolicyForm(ModelMap map) {
//
//        map.addAttribute("policy", new MyPolicy());
//
//        map.addAttribute("action", "create");
//
//        return "policyForm";
//
//    }
//
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//
//    public String postPolicy(@ModelAttribute MyPolicy policy) {
//
//        repository.save(policy);
//
//        return "redirect:/policy/";
//
//    }
//
//
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
//
//    public String getPolicy(@PathVariable Long id, ModelMap map) {
//
//        map.addAttribute("policy", repository.findById(id));
//
//        map.addAttribute("action", "update");
//
//        return "policyForm";
//
//    }
//
//
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//
//    public String putUser(@ModelAttribute MyPolicy policy) {
//
//        repository.save(policy);
//
//        return "redirect:/policy/";
//
//    }
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//
//    public String deletePolicy(@PathVariable Long id) {
//
//        repository.deleteById(id);
//
//        return "redirect:/policy/";
//
//    }
public String listPolicy(Model model) {
    model.addAttribute("policyList", repository.findAll());
    return "homePage";
}


}
