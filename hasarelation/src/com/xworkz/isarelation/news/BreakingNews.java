package com.xworkz.isarelation.news;

    public class BreakingNews extends News {
        public BreakingNews() {
            super();
            System.out.println("BreakingNews constructor is running");
        }

        public void alertPublic() {
            System.out.println("BreakingNews: Sending urgent alerts...");
        }

        public void liveCoverage() {
            System.out.println("BreakingNews: Providing live coverage...");
        }

        public void factCheck() {
            System.out.println("BreakingNews: Verifying information...");
        }

        public void interviewExperts() {
            System.out.println("BreakingNews: Interviewing subject experts...");
        }

        public void socialMediaUpdates() {
            System.out.println("BreakingNews: Posting updates on social media...");
        }
    }

