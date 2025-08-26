class Twitter {
    private static int timestamp = 0;
    private static class Tweet{
        int id;
        int ts;
        Tweet next;
        Tweet(int id, int ts,Tweet next){
            this.id = id;
            this.ts = ts;
            this.next = next;
        }
    }

    private Map<Integer, Set<Integer>> following = new HashMap<>();;
    private Map<Integer, Tweet> userTweets = new HashMap<>();

    public Twitter() { }
    
    // append the new post in front of the existing userTweets
    public void postTweet(int userId, int tweetId) {
        Tweet head = userTweets.get(userId);
        Tweet newTweet = new Tweet(tweetId, ++timestamp, head);
        userTweets.put(userId, newTweet);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        following.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> b.ts - a.ts);

        for (int followee : following.get(userId)) {
            Tweet t = userTweets.get(followee);
            if (t != null) pq.offer(t);
        }

         List<Integer> feed = new ArrayList<>(10);
        while (!pq.isEmpty() && feed.size() < 10) {
            Tweet cur = pq.poll();
            feed.add(cur.id);
            if (cur.next != null) pq.offer(cur.next); 
        }
        return feed;
    }
    

    public void follow(int followerId, int followeeId) {
    following.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followerId == followeeId){
            return;
        }
        Set<Integer> set = following.get(followerId);
        if(set != null)  set.remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
