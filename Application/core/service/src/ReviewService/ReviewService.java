package ReviewService;


import ReviewModel.Review;
import Review.ReviewRepository;

import java.util.List;
import java.util.UUID;

public interface ReviewService {

    static void save(Review review){
        Review.save.accept (review);
    }

    static Review findById(UUID id){
        return Review.findById.apply (id);
    }

    static List<Review> findAll(){
      return Review.findAll.get ();
    }

    static void delete(UUID id){
      Review.deleteById.accept (id);
    }

    static void update(UUID id , Review review){
      Review.updateById.accept (id , review);
    }

    Long countAll = Review.countAll.get ();

}
