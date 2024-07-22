package repository;

import collection.PaymentInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepository extends MongoRepository<PaymentInfo, String> {
}
