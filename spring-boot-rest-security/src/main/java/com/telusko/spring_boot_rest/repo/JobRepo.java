package com.telusko.spring_boot_rest.repo;

import com.telusko.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String keyword1);
}

//@Repository
//public class JobRepo {
//
//    // ArrayList to store JobPost objects
//    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//
//            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//
//
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//                    List.of("HTML", "CSS", "JavaScript", "React")),
//
//
//            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                    List.of("Python", "Machine Learning", "Data Analysis")),
//
//
//            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//                    List.of("Networking", "Cisco", "Routing", "Switching")),
//
//
//            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//                    List.of("iOS Development", "Android Development", "Mobile App"))
//    ));
//
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJob(JobPost job){
//        jobs.add(job);
//        System.out.println(job);
//    }
//
//    public JobPost getJob(int postId) {
//        for (JobPost job : jobs) {
//            if (job.getPostId() == postId) {
//                return job;
//            }
//        }
//        return null; // or throw an exception if not found
//    }
//
//    public JobPost updateJob(JobPost jobPost) {
//        for (int i = 0; i < jobs.size(); i++) {
//            if (jobs.get(i).getPostId() == jobPost.getPostId()) {
//                jobs.set(i, jobPost);
//                return jobPost;
//            }
//        }
//        return null; // or throw an exception if not found
//    }
//
//    public String deleteJob(int jobPostId) {
//        String returnStatement="Job with id "+jobPostId+" not found!";
//        for(int i=0; i<jobs.size(); i++){
//
//            if(jobs.get(i).getPostId()==jobPostId){
//                jobs.remove(jobs.get(i));
//                 returnStatement = "Job with id "+jobPostId+" deleted successfully!";
//            }
//        }
//        return returnStatement;
//    }
//}
