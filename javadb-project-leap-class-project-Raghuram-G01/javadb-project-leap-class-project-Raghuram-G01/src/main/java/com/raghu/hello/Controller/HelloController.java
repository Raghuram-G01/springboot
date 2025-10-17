// package com.raghu.hello.Controller;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// // This annotation indicates that this class is a REST controller get method
// public class HelloController {

//     @GetMapping("/hello")
//     // This annotation maps HTTP GET requests to the sayHello method
//     public String sayHello() {
//         return "Hello Raghuram!";
//     }
// }

// // code to multiply this 2 numbers

// // package com.raghu.hello;

// // import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.RequestParam;
// // import org.springframework.web.bind.annotation.RestController;

// // @RestController
// // public class HelloController {

// //     @GetMapping("/hello")
// //     public int add(@RequestParam int num1, @RequestParam int num2) {
// //         return num1 + num2;
// //     }
// // }

// // code to square of number

// // package com.raghu.hello;

// // import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.RequestParam;
// // import org.springframework.web.bind.annotation.RestController;

// // @RestController
// // public class HelloController {
// // @GetMapping("/hello")
// // public int square(@RequestParam int num) {
// //     return num * num;
// // }
// // }

// // !Day 2

// // package com.raghu.hello.Controller;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.RestController;

// // import com.raghu.hello.Service.HelloService;

// // import org.springframework.web.bind.annotation.RequestParam;

// // @RestController
// // public class HelloController {

// //     @Autowired
// //     private HelloService helloService;

// //     @GetMapping("/hello")
// //     public String sayHello() {
// //         return helloService.sayHello();
// //     }

// //     @GetMapping("/hello/ragu") // ! Define a GET endpoint at /path
// //     public String getMethodName(@RequestParam String param) {
// //         return helloService.getMethodName(param); // ! Call the service method with the provided parameter
// //     }

// // }
