package ReviewService;


import ReviewModel.Review;
import ReviewRepository.ReviewRepository;

import java.util.List;
import java.util.UUID;

public interface ReviewService {

    static void save(Review review){
        ReviewRepository.save.accept (review);
    }

    static Review findById(UUID id){
        return ReviewRepository.findById.apply (id);
    }

    static List<Review> findAll(){
      return ReviewRepository.findAll.get ();
    }

    static void delete(UUID id){
      ReviewRepository.deleteById.accept (id);
    }

    static void update(UUID id , Review review){
      ReviewRepository.updateById.accept (id , review);
    }

    Long countAll = ReviewRepository.countAll.get ();

}
